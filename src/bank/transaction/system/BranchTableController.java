/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.transaction.system;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author moham
 */
public class BranchTableController implements Initializable {

    @FXML
    private AnchorPane BranchPane;
    @FXML
    private Label BranchTableLable;
    @FXML
    private VBox BranchVBox;
    @FXML
    private TableView<Branch> BranchTable;
    @FXML
    private TableColumn<Branch, Integer> BranchID;
    @FXML
    private TableColumn<Branch, String> BranchAddress;

    ObservableList<Branch> oblist = FXCollections.observableArrayList();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            Connection connection = DBConnector.getConnection();
            ResultSet rs = connection.createStatement().executeQuery("select * from branch");
            while(rs.next()) {
                oblist.add(new Branch(rs.getInt("Branch_ID"), rs.getString("Branch_Adress")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ATMTableController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        BranchID.setCellValueFactory(new PropertyValueFactory<>("BranchID"));
        BranchAddress.setCellValueFactory(new PropertyValueFactory<>("BranchAddress"));
        BranchTable.setItems(oblist);
    }     
    
}
