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
public class HNAccountTableController implements Initializable {

    @FXML
    private AnchorPane HighNetworkAccountPane;
    @FXML
    private Label HighNetworkAccountTableLable;
    @FXML
    private VBox HighNetworkAccountVBox;
    @FXML
    private TableView<HighNetworkAccount> HighNetworkAccountTable;
    @FXML
    private TableColumn<HighNetworkAccount, Integer> HighNetworkAccountNo;
    @FXML
    private TableColumn<HighNetworkAccount, Integer> BranchManagerEmployeeID;

    ObservableList<HighNetworkAccount> oblist = FXCollections.observableArrayList();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            Connection connection = DBConnector.getConnection();
            ResultSet rs = connection.createStatement().executeQuery("select * from highnetwork_account");
            while(rs.next()) {
                oblist.add(new HighNetworkAccount(rs.getInt("HighNetworkAccount_No"),rs.getInt("BranchManager_EmployeeID")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ATMTableController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        HighNetworkAccountNo.setCellValueFactory(new PropertyValueFactory<>("HighNetworkAccountNo"));
        BranchManagerEmployeeID.setCellValueFactory(new PropertyValueFactory<>("BranchManagerEmployeeID"));
        HighNetworkAccountTable.setItems(oblist);
    }     
    
}
