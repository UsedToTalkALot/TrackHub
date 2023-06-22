/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection_Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;


/**
 *
 * @author USER
 */
public class MyConnection {
    


    public static Connection dbConnect()
    {
        try
        {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ticketgenerate","root","12345");
            System.out.println("connected to database");
        return conn;
        }
        catch(Exception e)
        {
        }
        return null;
    }


}

   

