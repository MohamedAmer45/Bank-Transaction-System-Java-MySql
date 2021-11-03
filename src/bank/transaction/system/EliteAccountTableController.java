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
public class EliteAccountTableController implements Initializable {

    @FXML
    private AnchorPane EliteAccountPane;
    @FXML
    private Label EliteAccountTableLable;
    @FXML
    private VBox EliteAccountVBox;
    @FXML
    private TableView<EliteAccount> EliteAccountTable;
    @FXML
    private TableColumn<EliteAccount, Integer> EliteAccountNo;
    @FXML
    private TableColumn<EliteAccount, Integer> EliteAccountSeniorBankerEmployeeID;

   ObservableList<EliteAccount> oblist = FXCollections.observableArrayList();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            Connection connection = DBConnector.getConnection();
            ResultSet rs = connection.createStatement().executeQuery("select * from elite_account");
            while(rs.next()) {
                oblist.add(new EliteAccount(rs.getInt("EliteAccount_No"), rs.getInt("SeniorBanker_EmployeeID")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ATMTableController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        EliteAccountNo.setCellValueFactory(new PropertyValueFactory<>("EliteAccountNo"));
        EliteAccountSeniorBankerEmployeeID.setCellValueFactory(new PropertyValueFactory<>("SeniorBankerEmployeeNo"));
        EliteAccountTable.setItems(oblist);
    }      
    
}
