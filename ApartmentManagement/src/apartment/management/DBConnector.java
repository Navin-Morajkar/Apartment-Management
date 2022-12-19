/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apartment.management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Saish
 */
public class DBConnector {
    
    public static Connection getConnection() throws SQLException {
        
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/test4", "root","");
        
        return connection;
    }
}
