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
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;


public class Query2Controller implements Initializable {

    @FXML
    private AnchorPane Query2Pane;
    @FXML
    private Label Query2TableLable;
    @FXML
    private VBox Query2VBox;
    @FXML
    private TableColumn<Query2, Integer> Query2ATMID;
    @FXML
    private TableView<Query2> Query2Table;
    @FXML
    private TableColumn<Query2, Integer> Query2TransactionID;
    @FXML
    private TableColumn<Query2, Float> Query2TransactionAmount;
    @FXML
    private TableColumn<Query2, Date> Query2TransactionDate;

    /**
     * Initializes the controller class.
     */
    ObservableList<Query2> oblist = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            Connection connection = DBConnector.getConnection();
            ResultSet rs = connection.createStatement().executeQuery("SELECT Transaction_ID ,Transaction_Amount,Transaction_Date,ATM_ID\n"
                    + "FROM Transactionn\n"
                    + "WHERE     Transaction_Type='Withdraw'\n"
                    + "ORDER BY Transaction_Date DESC, Transaction_Amount DESC");
            while (rs.next()) {
                oblist.add(new Query2(rs.getInt("Transaction_ID"), rs.getFloat("Transaction_Amount"), rs.getDate("Transaction_Date"), rs.getInt("ATM_ID")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ATMTableController.class.getName()).log(Level.SEVERE, null, ex);
        }

        Query2TransactionID.setCellValueFactory(new PropertyValueFactory<>("TransactionID"));
        Query2TransactionAmount.setCellValueFactory(new PropertyValueFactory<>("TransactionAmount"));
        Query2TransactionDate.setCellValueFactory(new PropertyValueFactory<>("TransactionDate"));
        Query2ATMID.setCellValueFactory(new PropertyValueFactory<>("ATMID"));
        Query2Table.setItems(oblist);

    }

}
