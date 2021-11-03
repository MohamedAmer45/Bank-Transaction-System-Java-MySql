/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.transaction.system;

import java.net.URL;
import java.sql.Connection;
import java.sql.Date;
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


public class TransactionTableController implements Initializable {

    @FXML
    private AnchorPane TransactionPane;
    @FXML
    private Label TransactionTableLable;
    @FXML
    private VBox TransactionVBox;
    @FXML
    private TableView<Transaction> TransactionTable;
    @FXML
    private TableColumn<Transaction, Integer> TransactionID;
    @FXML
    private TableColumn<Transaction, String> TransactionType;
    @FXML
    private TableColumn<Transaction, Float> TransactionAmount;
    @FXML
    private TableColumn<Transaction, Float> TransactionTime;
    @FXML
    private TableColumn<Transaction, Date> TransactionDate;
    @FXML
    private TableColumn<Transaction, Integer> ATMID;

    ObservableList<Transaction> oblist = FXCollections.observableArrayList();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            Connection connection = DBConnector.getConnection();
            ResultSet rs = connection.createStatement().executeQuery("select * from transactionn");
            while(rs.next()) {
                oblist.add(new Transaction(rs.getInt("Transaction_ID"),rs.getString("Transaction_Type"), rs.getFloat("Transaction_Amount"), rs.getFloat("Transaction_Time"), rs.getDate("Transaction_Date"), rs.getInt("ATM_ID")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ATMTableController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        TransactionID.setCellValueFactory(new PropertyValueFactory<>("TransactionID"));
        TransactionType.setCellValueFactory(new PropertyValueFactory<>("TransactionType"));
        TransactionAmount.setCellValueFactory(new PropertyValueFactory<>("TransactionAmount"));
        TransactionTime.setCellValueFactory(new PropertyValueFactory<>("TransactionTime"));
        TransactionDate.setCellValueFactory(new PropertyValueFactory<>("TransactionDate"));
        ATMID.setCellValueFactory(new PropertyValueFactory<>("ATMID"));
        TransactionTable.setItems(oblist);
    }        
    
}
