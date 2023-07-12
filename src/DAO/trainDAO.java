package dao;

import controller.searchController;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import database.MyConnection;

public class trainDAO {
   

    public List<String> fetchData(String date) throws SQLException, ClassNotFoundException {
        List<String> data = new ArrayList<>();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Connection conn = null;

        try {
            conn = MyConnection.dbConnect();
            

            String sql = "SELECT name, route, datte, time, seat1, seat2 FROM train WHERE datte = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, date);

            rs = stmt.executeQuery();

            while (rs.next()) {
                String name = rs.getString("name");
                data.add(name);
                String route = rs.getString("route");
                data.add(route);
                String time = rs.getString("time");
                data.add(time);
                String seat1 = rs.getString("seat1");
                data.add(seat1);
                String seat2 = rs.getString("seat2");
                data.add(seat2);
            }
        } finally {
            // Close the resources
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return data;
    }
        public void addToDatabase(String time, String phoneNumber, String route, String name, String date, int ticketPrice, String selectedSeat) {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
                       conn = MyConnection.dbConnect();

            // Check if the database connection is successful
            if (conn != null) {
                System.out.println("Connected to the database");
            } else {
                System.out.println("Failed to connect to the database");
                return;
            }

            String sql = "INSERT INTO tickets (time, phonenumber, route, name, datee, ticketprice, " + selectedSeat + ") VALUES (?,?,?,?,?,?,?)";

            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, time);
            pstmt.setString(2, phoneNumber);
            pstmt.setString(3, route);
            pstmt.setString(4, name);
            pstmt.setString(5, date);
            pstmt.setInt(6, ticketPrice);
            pstmt.setInt(7, 1);

            // Execute the SQL statement to insert the data
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Data inserted successfully");
            } else {
                System.out.println("Failed to insert data");
            }
        } catch (SQLException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            // Close the resources in the reverse order of their creation
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    System.out.println("Exception: " + e.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.out.println("Exception: " + e.getMessage());
                }
            }
        }
    }

    public void creditA(String phoneNumber) {
        try {
            Connection conn = MyConnection.dbConnect();
            String sql = "UPDATE customer SET credit = credit + ? WHERE phonenumber =?";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, 100);
            pstmt.setString(2, phoneNumber);

            int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Credit updated successfully.");
            } else {
                System.out.println("No rows updated.");
            }
            System.out.println(pstmt.toString());  // Print the executed SQL statement
            System.out.println("Phone Number: " + phoneNumber);  // Print the phone number value

            pstmt.close();
            conn.close();
        } catch (SQLException ex) {
            //Logger.getLogger(searchController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void creditB(String phoneNumber) {
        try {
            Connection conn = MyConnection.dbConnect();
            String sql = "UPDATE customer SET credit = credit + ? WHERE phonenumber =?";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, 75);
            pstmt.setString(2, phoneNumber);

            int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Credit updated successfully.");
            } else {
                System.out.println("No rows updated.");
            }
            System.out.println(pstmt.toString());  // Print the executed SQL statement
            System.out.println("Phone Number: " + phoneNumber);  // Print the phone number value

            pstmt.close();
            conn.close();
        } catch (SQLException ex) {
            //Logger.getLogger(searchController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<String> bookingData(String code) throws ClassNotFoundException, SQLException {
        List<String> data = new ArrayList<>();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Connection conn = null;

        try {
            

            String sql = "SELECT route, time, meal, ticketprice, datte, phonenumber, seat, name FROM booking WHERE code =?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, code);

            rs = stmt.executeQuery();

            while (rs.next()) {
                String route = rs.getString("route");
                data.add(route);
                String time = rs.getString("time");
                data.add(time);
                String meal = rs.getString("meal");
                data.add(meal);
                String price = rs.getString("ticketprice");
                data.add(price);
                String date = rs.getString("datte");
                data.add(date);
                String number = rs.getString("phonenumber");
                data.add(number);
                String seat = rs.getString("seat");
                data.add(seat);
                String name = rs.getString("name");
                data.add(name);
            }

            System.out.println(data);
        } finally {
            // Close the resources
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return data;
    }

    public String getCredit(String phoneNumber) throws ClassNotFoundException, SQLException {
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Connection conn = null;
        String credit = "";

        try {
                        conn = MyConnection.dbConnect();

            String sql = "SELECT credit FROM customer WHERE phonenumber =?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, phoneNumber);

            rs = stmt.executeQuery();

            while (rs.next()) {
                credit = rs.getString("credit");
            }

        } finally {
            // Close the resources
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return credit;
    }

    public void minusCreditA(String phoneNumber) {
        try {
            Connection conn = MyConnection.dbConnect();
            String sql = "UPDATE customer SET credit = credit - ? WHERE phonenumber =?";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, 1500);
            pstmt.setString(2, phoneNumber);

            int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Credit updated successfully.");
            } else {
                System.out.println("No rows updated.");
            }
            System.out.println(pstmt.toString());  // Print the executed SQL statement
            // Print the phone number value

            pstmt.close();
            conn.close();
        } catch (SQLException ex) {
            //Logger.getLogger(searchController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void minusCreditB(String phoneNumber) {
        try {
            Connection conn = MyConnection.dbConnect();
            String sql = "UPDATE customer SET credit = credit - ? WHERE phonenumber =?";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, 1300);
            pstmt.setString(2, phoneNumber);

            int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Credit updated successfully.");
            } else {
                System.out.println("No rows updated.");
            }
            System.out.println(pstmt.toString());  // Print the executed SQL statement
            System.out.println("Phone Number: " + phoneNumber);  // Print the phone number value

            pstmt.close();
            conn.close();
        } catch (SQLException ex) {
           // Logger.getLogger(searchController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

