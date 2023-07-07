package controller;

import database.MyConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class searchController {
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/trackhub";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "cpktnwt";

public List<String> fetchData(String date,String time1) throws SQLException, ClassNotFoundException {
    List<String> data = new ArrayList<>();
    ResultSet rs = null;
    PreparedStatement stmt = null;
    Connection conn = null;

    try {
        Class.forName(JDBC_DRIVER);
        conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);

        String sql = "SELECT route, time, meal,price1,price2 FROM train WHERE datte = ? and name =?";
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, date);
        stmt.setString(2,time1);

        rs = stmt.executeQuery();

        while (rs.next()) {
            
            String route = rs.getString("route");
            data.add(route);
            String time = rs.getString("time");
            data.add(time);
            String meal = rs.getString("meal");
            data.add(meal);
            String price1 = rs.getString("price1");
            data.add(price1);
            String price2 = rs.getString("price2");
            data.add(price2);
        }

        System.out.println(data);
    } finally {
        // Close the resources
        try {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
        }
    }

    return data;
}

public void CreditA(String phonenumber) {
    try {
        Connection conn = MyConnection.dbConnect();
        String sql = "UPDATE customer SET credit = credit + ? WHERE phonenumber =?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        
        pstmt.setInt(1, 100);
        pstmt.setString(2, phonenumber);
        
        int rowsUpdated = pstmt.executeUpdate();
        if (rowsUpdated > 0) {
            System.out.println("Credit updated successfully.");
        } else {
            System.out.println("No rows updated.");
        }
        System.out.println(pstmt.toString());  // Print the executed SQL statement
System.out.println("Phone Number: " + phonenumber);  // Print the phone number value

        pstmt.close();
        conn.close();
    } catch (SQLException ex) {
        Logger.getLogger(searchController.class.getName()).log(Level.SEVERE, null, ex);
    }
}
public void CreditB(String phonenumber) {
    try {
        Connection conn = MyConnection.dbConnect();
        String sql = "UPDATE customer SET credit = credit + ? WHERE phonenumber =?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        
        pstmt.setInt(1, 75);
        pstmt.setString(2, phonenumber);
        
        int rowsUpdated = pstmt.executeUpdate();
        if (rowsUpdated > 0) {
            System.out.println("Credit updated successfully.");
        } else {
            System.out.println("No rows updated.");
        }
        System.out.println(pstmt.toString());  // Print the executed SQL statement
System.out.println("Phone Number: " + phonenumber);  // Print the phone number value

        pstmt.close();
        conn.close();
    } catch (SQLException ex) {
        Logger.getLogger(searchController.class.getName()).log(Level.SEVERE, null, ex);
    }
}

}
