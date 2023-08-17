/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {

    public static Connection dbConnect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/trackhub", "root", "ENTERT@1nment");
            System.out.println("Connected to the database :)");
            return conn;
        } catch (ClassNotFoundException | SQLException e) {

        }
        return null;
    }

}
