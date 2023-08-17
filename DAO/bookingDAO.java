package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import database.MyConnection;

public class bookingDAO {

    public void insertData(String time, String phoneNumber, String route, String name, String date, int ticketPrice, String seat, String code, String meal) throws ClassNotFoundException {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = MyConnection.dbConnect();

            String sql = "INSERT INTO booking (time, phonenumber, route, name, datte, ticketprice, seat, code, meal) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, time);
            pstmt.setString(2, phoneNumber);
            pstmt.setString(3, route);
            pstmt.setString(4, name);
            pstmt.setString(5, date);
            pstmt.setInt(6, ticketPrice);
            pstmt.setString(7, seat);
            pstmt.setString(8, code);
            pstmt.setString(9, meal);

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Data inserted successfully!");
            } else {
                System.out.println("Data insertion failed!");
            }
        } catch (SQLException ex) {
            System.err.println("Error inserting data: " + ex.getMessage());
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.err.println("Error closing resources: " + ex.getMessage());
            }
        }
    }

    public void recordTransaction(String phoneNumber, String date, int ticketPrice, String cllass) throws ClassNotFoundException {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = MyConnection.dbConnect();

            String sql = "INSERT INTO transaction (date, passenger_no, class, price) VALUES (?, ?, ?, ?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, date);
            pstmt.setString(2, phoneNumber);
            pstmt.setString(3, cllass);

            pstmt.setInt(4, ticketPrice);

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Data inserted successfully!");
            } else {
                System.out.println("Data insertion failed!");
            }
        } catch (SQLException ex) {
            System.err.println("Error inserting data: " + ex.getMessage());
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.err.println("Error closing resources: " + ex.getMessage());
            }
        }
    }

    public void deleteCustomer(String phoneNumber) {
        System.out.println(phoneNumber);

        try (Connection conn = MyConnection.dbConnect(); PreparedStatement pst = conn.prepareStatement("DELETE FROM customer WHERE phonenumber = ?")) {

            pst.setString(1, phoneNumber);
            pst.executeUpdate();
            conn.commit();

        } catch (SQLException e) {
            System.out.println("Error deleting customer: " + e.getMessage());
        }

    }
}
