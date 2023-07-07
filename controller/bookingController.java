/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
//import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;


/**
 *
 * @author subad
 */
public class bookingController {

    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/trackhub";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "cpktnwt";

    public void insertData(String time, String phoneNumber, String route, String name, String date, int ticketPrice, String seat, String code, String meal) throws ClassNotFoundException {
        ResultSet rs = null;
    PreparedStatement stmt = null;
    Connection conn = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = (Connection) DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            String sql = "INSERT INTO booking (time, phonenumber, route, name, datte, ticketprice, seat,code,meal) VALUES (?, ?, ?, ?, ?, ?, ?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, time);
            pstmt.setString(2, phoneNumber);
            pstmt.setString(3, route);
            pstmt.setString(4, name);
            pstmt.setString(5, date);
            pstmt.setInt(6, ticketPrice);
            pstmt.setString(7, seat);
            pstmt.setString(8,code);
            pstmt.setString(9,meal);
            

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Data inserted successfully!");
            } else {
                System.out.println("Data insertion failed!");
            }
        } catch (SQLException ex) {
            System.err.println("Error inserting data: " + ex.getMessage());
        }
    }
}
