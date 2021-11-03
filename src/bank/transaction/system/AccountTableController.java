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

/**
 * FXML Controller class
 *
 * @author moham
 */
public class AccountTableController implements Initializable {

    @FXML
    private AnchorPane AccountPane;
    @FXML
    private Label AccountTableLable;
    @FXML
    private VBox AccountVBox;
    @FXML
    private TableView<Account> AccountTable;
    @FXML
    private TableColumn<Account, Integer> AccountNo;
    @FXML
    private TableColumn<Account, Date> DateCreated;
    @FXML
    private TableColumn<Account, String> Name;
    @FXML
    private TableColumn<Account, Float> Balance;
    @FXML
    private TableColumn<Account, Integer> AccountBranchID;
    
    

    ObservableList<Account> oblist = FXCollections.observableArrayList();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            Connection connection = DBConnector.getConnection();
            ResultSet rs = connection.createStatement().executeQuery("select * from account");
            while(rs.next()) {
                oblist.add(new Account(rs.getInt("Account_No"), rs.getDate("Account_Date"), rs.getString("Account_Name"), rs.getFloat("Balance"), rs.getInt("Branch_ID")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ATMTableController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        AccountNo.setCellValueFactory(new PropertyValueFactory<>("AccountNo"));
        DateCreated.setCellValueFactory(new PropertyValueFactory<>("AccountDate"));
        Name.setCellValueFactory(new PropertyValueFactory<>("AccountName"));
        Balance.setCellValueFactory(new PropertyValueFactory<>("Balance"));
        AccountBranchID.setCellValueFactory(new PropertyValueFactory<>("BranchID"));
        AccountTable.setItems(oblist);
    }    
    
}
