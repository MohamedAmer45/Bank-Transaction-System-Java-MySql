
package bank.transaction.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class BankTransactionSystem extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.setTitle("Bank Transaction System");
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
    
}
