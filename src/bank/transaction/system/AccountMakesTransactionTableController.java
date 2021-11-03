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
public class AccountMakesTransactionTableController implements Initializable {

    @FXML
    private AnchorPane AccountMakesTransactionPane;
    @FXML
    private Label AccountMakesTransactionTableLable;
    @FXML
    private VBox AccountMakesTransactionVBox;
    @FXML
    private TableView<AccountMakesTransaction> AccountMakesTransactionTable;
    @FXML
    private TableColumn<AccountMakesTransaction, Integer> AccountMakesTransactionAccountNo;
    @FXML
    private TableColumn<AccountMakesTransaction, Integer> AccountMakesTransactionTransactionID;

    ObservableList<AccountMakesTransaction> oblist = FXCollections.observableArrayList();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            Connection connection = DBConnector.getConnection();
            ResultSet rs = connection.createStatement().executeQuery("select * from account_makes_transaction");
            while(rs.next()) {
                oblist.add(new AccountMakesTransaction(rs.getInt("Account_No"), rs.getInt("Transaction_ID")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ATMTableController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        AccountMakesTransactionAccountNo.setCellValueFactory(new PropertyValueFactory<>("AccountNo"));
        AccountMakesTransactionTransactionID.setCellValueFactory(new PropertyValueFactory<>("TransactionID"));
       
        
        AccountMakesTransactionTable.setItems(oblist);
    }    
    
}
