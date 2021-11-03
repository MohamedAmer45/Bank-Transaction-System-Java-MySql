/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.transaction.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class DBConnector {
   public static Connection getConnection() throws SQLException{
       
        Connection dbConnection = DriverManager.getConnection("jdbc:mysql://localhost/bank transaction system", "root", "root123");
        
        
        return dbConnection;
   } 
}
