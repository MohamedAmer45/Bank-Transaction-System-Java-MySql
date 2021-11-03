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
public class EmployeeController implements Initializable {

    @FXML
    private AnchorPane EmployeePane;
    @FXML
    private Label EmployeeLable;
    @FXML
    private VBox EmployeeVBox;
    @FXML
    private TableView<Employee> EmployeeTable;
    @FXML
    private TableColumn<Employee, Integer> EmployeeID;
    @FXML
    private TableColumn<Employee, String> EmployeeName;
    @FXML
    private TableColumn<Employee, Integer> EmployeeBranchID;

    ObservableList<Employee> oblist = FXCollections.observableArrayList();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            Connection connection = DBConnector.getConnection();
            ResultSet rs = connection.createStatement().executeQuery("select * from employee");
            while(rs.next()) {
                oblist.add(new Employee(rs.getInt("Employee_ID"), rs.getString("Employee_Name"), rs.getInt("Branch_ID")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ATMTableController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        EmployeeID.setCellValueFactory(new PropertyValueFactory<>("EmployeeID"));
        EmployeeName.setCellValueFactory(new PropertyValueFactory<>("EmployeeName"));
        EmployeeBranchID.setCellValueFactory(new PropertyValueFactory<>("BranchID"));
        EmployeeTable.setItems(oblist);
    }    
    
}
