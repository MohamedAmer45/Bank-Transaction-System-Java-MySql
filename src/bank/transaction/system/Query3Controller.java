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
public class Query3Controller implements Initializable {

    @FXML
    private AnchorPane Query3Pane;
    @FXML
    private Label Query3TableLable;
    @FXML
    private VBox Query3VBox;
    @FXML
    private TableView<Query3> Query3Table;
    @FXML
    private TableColumn<Query3, Integer> Query3EliteAccountNo;
    @FXML
    private TableColumn<Query3, String> Query3EmployeeName;

    ObservableList<Query3> oblist = FXCollections.observableArrayList();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            Connection connection = DBConnector.getConnection();
            ResultSet rs = connection.createStatement().executeQuery("select EliteAccount_No,Employee_Name\n" +
"from elite_account,employee\n" +
"where elite_account.SeniorBanker_EmployeeID = employee.Employee_ID\n" +
"order by Employee_Name asc");
            while(rs.next()) {
                oblist.add(new Query3(rs.getInt("EliteAccount_No"),rs.getString("Employee_Name")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ATMTableController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        Query3EliteAccountNo.setCellValueFactory(new PropertyValueFactory<>("EliteAccountNo"));
        Query3EmployeeName.setCellValueFactory(new PropertyValueFactory<>("EmployeeName"));
        Query3Table.setItems(oblist);
    
} 
    
}
