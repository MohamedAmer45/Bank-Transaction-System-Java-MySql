/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.transaction.system;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author moham
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button Account;
    @FXML
    private Button Currency;
    @FXML
    private Button AccountMakesTransaction;
    @FXML
    private Button ATM;
    @FXML
    private Button Branch;
    @FXML
    private Button BranchManager;
    @FXML
    private Button EliteAccount;
    @FXML
    private Button Employee;
    @FXML
    private Button HNAccount;
    @FXML
    private Button SeniorBanker;
    @FXML
    private Button Trnasaction;
    @FXML
    private Button AccountUsesATM;
    @FXML
    private Label TitleLable;
    @FXML
    private Label QueriesLable;
    
   

    @FXML
    private void Account(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AccountTable.fxml"));
            Parent root1;
            root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.setTitle("Account");
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't Load New Window");
        }
    }
    @FXML
    private void ATM(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader1 = new FXMLLoader(getClass().getResource("ATMTable.fxml"));
            Parent root2;
            root2 = (Parent) fxmlLoader1.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root2));
            stage.setTitle("ATM");
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't Load New Window");
        }
    }
    @FXML
    private void Branch(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader2 = new FXMLLoader(getClass().getResource("BranchTable.fxml"));
            Parent root3;
            root3 = (Parent) fxmlLoader2.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root3));
            stage.setTitle("Branch");
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't Load New Window");
        }
    }
    @FXML
    private void BranchManager(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader3 = new FXMLLoader(getClass().getResource("BranchManagerTable.fxml"));
            Parent root4;
            root4 = (Parent) fxmlLoader3.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root4));
            stage.setTitle("Branch Manager");
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't Load New Window");
        }
    }
    @FXML
    private void Currency(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader4 = new FXMLLoader(getClass().getResource("CurrencyTable.fxml"));
            Parent root5;
            root5 = (Parent) fxmlLoader4.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root5));
            stage.setTitle("Currency");
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't Load New Window");
        }
    }
    @FXML
    private void EliteAccount(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader5 = new FXMLLoader(getClass().getResource("EliteAccountTable.fxml"));
            Parent root6;
            root6 = (Parent) fxmlLoader5.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root6));
            stage.setTitle("Elite Account");
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't Load New Window");
        }
    }
    @FXML
    private void Employee(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader6 = new FXMLLoader(getClass().getResource("Employee.fxml"));
            Parent root7;
            root7 = (Parent) fxmlLoader6.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root7));
            stage.setTitle("Employee");
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't Load New Window");
        }
    }
    @FXML
    private void HNAccount(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader7 = new FXMLLoader(getClass().getResource("HNAccountTable.fxml"));
            Parent root8;
            root8 = (Parent) fxmlLoader7.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root8));
            stage.setTitle("HighNetwork Account");
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't Load New Window");
        }
    }
    @FXML
    private void SeniorBanker(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader8 = new FXMLLoader(getClass().getResource("SeniorBankerTable.fxml"));
            Parent root9;
            root9 = (Parent) fxmlLoader8.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root9));
            stage.setTitle("Senior Banker");
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't Load New Window");
        }
    }
    @FXML
    private void Transaction(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader9 = new FXMLLoader(getClass().getResource("TransactionTable.fxml"));
            Parent root10;
            root10 = (Parent) fxmlLoader9.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root10));
            stage.setTitle("Transaction");
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't Load New Window");
        }
    }
    @FXML
    private void AccountMakesTransaction(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader10 = new FXMLLoader(getClass().getResource("AccountMakesTransactionTable.fxml"));
            Parent root11;
            root11 = (Parent) fxmlLoader10.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root11));
            stage.setTitle("Account Makes Transaction");
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't Load New Window");
        }
    }
    @FXML
    private void AccountUsesATM(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader11 = new FXMLLoader(getClass().getResource("AccountUsesATMTable.fxml"));
            Parent root12;
            root12 = (Parent) fxmlLoader11.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root12));
            stage.setTitle("Account Uses ATM");
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't Load New Window");
        }
    }
    @FXML
    private void Query1(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader12 = new FXMLLoader(getClass().getResource("Query1.fxml"));
            Parent root13;
            root13 = (Parent) fxmlLoader12.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root13));
            stage.setTitle("Above Average Account Balances");
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't Load New Window");
        }
    }
    @FXML
    private void Query2(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader13 = new FXMLLoader(getClass().getResource("Query2.fxml"));
            Parent root14;
            root14 = (Parent) fxmlLoader13.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root14));
            stage.setTitle("ATM Transactions In Ascending Order of Amount");
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't Load New Window");
        }
    }
    @FXML
    private void Query3(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader14 = new FXMLLoader(getClass().getResource("Query3.fxml"));
            Parent root15;
            root15 = (Parent) fxmlLoader14.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root15));
            stage.setTitle("Elite Accounts And Their Senior Banker");
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't Load New Window");
        }
    }
    private void Query4(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader15 = new FXMLLoader(getClass().getResource("Query4.fxml"));
            Parent root16;
            root16 = (Parent) fxmlLoader15.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root16));
            stage.setTitle("Query 4");
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't Load New Window");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
