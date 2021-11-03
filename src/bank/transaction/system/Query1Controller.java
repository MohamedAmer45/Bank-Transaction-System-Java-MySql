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
public class Query1Controller implements Initializable {

    @FXML
    private AnchorPane Query1Pane;
    @FXML
    private Label Query1TableLable;
    @FXML
    private VBox Query1VBox;
    @FXML
    private TableView<Query1> Query1Table;
    @FXML
    private TableColumn<Query1, Integer> Query1AccountNo;
    @FXML
    private TableColumn<Query1, String> Query1Name;
    @FXML
    private TableColumn<Query1, Float> Query1Balance;

    ObservableList<Query1> oblist = FXCollections.observableArrayList();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            Connection connection = DBConnector.getConnection();
            ResultSet rs = connection.createStatement().executeQuery("select Account_No,Account_Name,Balance\n" +
"from account\n" +
"where Balance > (select AVG(Balance) from Account)\n" +
"order by Balance desc");
            while(rs.next()) {
                oblist.add(new Query1(rs.getInt("Account_No"), rs.getString("Account_Name"), rs.getFloat("Balance")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ATMTableController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        Query1AccountNo.setCellValueFactory(new PropertyValueFactory<>("AccountNo"));
        Query1Name.setCellValueFactory(new PropertyValueFactory<>("Name"));
        Query1Balance.setCellValueFactory(new PropertyValueFactory<>("Balance"));
        Query1Table.setItems(oblist);
    
}
}