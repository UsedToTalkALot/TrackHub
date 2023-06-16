/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
    public static void main(String[] args) {
        // Database connection parameters
        String url = "jdbc:mysql://localhost:3306/trackhub";
        String username = "root";
        String password = "anu5688#$@";
        
        // Attempt to establish the connection
        try {
            // Step 1: Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Step 2: Establish the connection
            Connection conn = DriverManager.getConnection(url, username, password);
            
            // Connection successful
            System.out.println("Connected to the database!");
            
            // Step 3: Perform database operations (e.g., execute queries, updates, etc.)
            
            // Step 4: Close the connection
            conn.close();
            System.out.println("Connection closed!");
            
        } catch (ClassNotFoundException e) {
            // Driver not found
            System.out.println("Failed to find JDBC driver: " + e.getMessage());
        } catch (SQLException e) {
            // Database connection error
            System.out.println("Database connection error: " + e.getMessage());
        }
    }
}



 
            