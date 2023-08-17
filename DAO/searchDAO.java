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

public class searchDAO {

    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/trackhub";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "ENTERT@1nment";

    public List<String> fetchTrainData(String date, String name) throws SQLException, ClassNotFoundException {
        List<String> data = new ArrayList<>();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);

        try {

            String sql = "SELECT route, time, meal,price1,price2 FROM train WHERE datte = ? and name =?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, date);
            stmt.setString(2, name);

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
            }
        }

        return data;
    }
    public List<String> searchCustomer() throws SQLException, ClassNotFoundException {
        List<String> data = new ArrayList<>();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);

        try {

            String sql = "SELECT phonenumber FROM customer ";
            stmt = conn.prepareStatement(sql);
            

            rs = stmt.executeQuery();

            while (rs.next()) {

                String num = rs.getString("phonenumber");
                data.add(num);
                
            }

            System.out.println(data);
        } finally {
  
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
            }
        }

        return data;
    }
    
    public void AddToDatabase(String time, String phonenumber, String route, String name, String datte, int ticketprice) {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);

            if (conn != null) {
                System.out.println("Connected to the database");
            } else {
                System.out.println("Failed to connect to the database");
                return;
            }

            String sql = "INSERT INTO tickets (time, phonenumber, route, name, datee, ticketprice) VALUES (?,?,?,?,?,?)";

            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, time);
            pstmt.setString(2, phonenumber);
            pstmt.setString(3, route);
            pstmt.setString(4, name);
            pstmt.setString(5, datte);
            pstmt.setInt(6, ticketprice);


            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Data inserted successfully");
            } else {
                System.out.println("Failed to insert data");
            }
        } catch (ClassNotFoundException | SQLException e) {
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

    public void addSelectedSeat(String name, String date, String SelectedSeat) {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);

            if (conn != null) {
                System.out.println("Connected to the database");
            } else {
                System.out.println("Failed to connect to the database");
                return;
            }

            String sql = "UPDATE seat SET " + SelectedSeat + " = ? WHERE date = ? AND name = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, 1);
            pstmt.setString(2, date);
            pstmt.setString(3, name);


            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Data inserted successfully");
            } else {
                System.out.println("Failed to insert data");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
  
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
            System.out.println(pstmt.toString()); 
            System.out.println("Phone Number: " + phoneNumber);  

            pstmt.close();
            conn.close();
        } catch (SQLException ex) {
            
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
            System.out.println(pstmt.toString());  
            System.out.println("Phone Number: " + phoneNumber);  
            pstmt.close();
            conn.close();
        } catch (SQLException ex) {
            
        }
    }

    public List<String> bookingData(String code) throws ClassNotFoundException, SQLException {
        List<String> data = new ArrayList<>();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Connection conn = null;

        try {
            conn = MyConnection.dbConnect();

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
            System.out.println(pstmt.toString());  

            pstmt.close();
            conn.close();
        } catch (SQLException ex) {
 
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
            System.out.println(pstmt.toString()); 
            System.out.println("Phone Number: " + phoneNumber);  

            pstmt.close();
            conn.close();
        } catch (SQLException ex) {

        }
    }
public void seatLeftA(String name, String date) {
        try {
            Connection conn = MyConnection.dbConnect();
            String sql = "UPDATE train SET seat1 = seat1 - ? WHERE name =? and datte";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, 1);
            pstmt.setString(2, name);
            pstmt.setString(3,date);

            int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Credit updated successfully.");
            } else {
                System.out.println("No rows updated.");
            }
            System.out.println(pstmt.toString());  
 

            pstmt.close();
            conn.close();
        } catch (SQLException ex) {
        
        }
    }
public void seatLeftB(String name, String date) {
        try {
            Connection conn = MyConnection.dbConnect();
            String sql = "UPDATE train SET seat2 = seat2 - ? WHERE name =? and datte";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, 1);
            pstmt.setString(2, name);
            pstmt.setString(3,date);

            int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Credit updated successfully.");
            } else {
                System.out.println("No rows updated.");
            }
            System.out.println(pstmt.toString());  

            pstmt.close();
            conn.close();
        } catch (SQLException ex) {
    
        }
    }
    public List<String> fillColor(String date, String train) throws SQLException, ClassNotFoundException {
        List<String> data = new ArrayList<>();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);;

        try {

            String sql = "SELECT AC1,AC2,AC3,AC4,AC5,AC6,AC7,AC8,AC9,AC10,A1,A2,A3,A4,A5,A6,A7,A8,B1,B2,B3,B4,B5,B6,B7,B8,C1,C2,C3,C4,C5,C6,C7,C8,D1,D2,D3,D4,D5,D6,D7,D8 FROM seat WHERE date = ? and name =?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, date);
            stmt.setString(2, train);

            rs = stmt.executeQuery();

            while (rs.next()) {
                String AC1 = rs.getString("AC1");
                data.add(AC1);
                String AC2 = rs.getString("AC2");
                data.add(AC2);
                String AC3 = rs.getString("AC3");
                data.add(AC3);
                String AC4 = rs.getString("AC4");
                data.add(AC4);
                String AC5 = rs.getString("AC5");
                data.add(AC5);
                String AC6 = rs.getString("AC6");
                data.add(AC6);
                String AC7 = rs.getString("AC7");
                data.add(AC7);
                String AC8 = rs.getString("AC8");
                data.add(AC8);
                String AC9 = rs.getString("AC9");
                data.add(AC9);
                String AC10 = rs.getString("AC10");
                data.add(AC10);

                String A1 = rs.getString("A1");
                data.add(A1);
                String A2 = rs.getString("A2");
                data.add(A2);
                String A3 = rs.getString("A3");
                data.add(A3);
                String A4 = rs.getString("A4");
                data.add(A4);
                String A5 = rs.getString("A5");
                data.add(A5);
                String A6 = rs.getString("A6");
                data.add(A6);
                String A7 = rs.getString("A7");
                data.add(A7);
                String A8 = rs.getString("A8");
                data.add(A8);

                String B1 = rs.getString("B1");
                data.add(B1);
                String B2 = rs.getString("B2");
                data.add(B2);
                String B3 = rs.getString("B3");
                data.add(B3);
                String B4 = rs.getString("B4");
                data.add(B4);
                String B5 = rs.getString("B5");
                data.add(B5);
                String B6 = rs.getString("B6");
                data.add(B6);
                String B7 = rs.getString("B7");
                data.add(B7);
                String B8 = rs.getString("B8");
                data.add(B8);

                String C1 = rs.getString("C1");
                data.add(C1);
                String C2 = rs.getString("C2");
                data.add(C2);
                String C3 = rs.getString("C3");
                data.add(C3);
                String C4 = rs.getString("C4");
                data.add(C4);
                String C5 = rs.getString("C5");
                data.add(C5);
                String C6 = rs.getString("C6");
                data.add(C6);
                String C7 = rs.getString("C7");
                data.add(C7);
                String C8 = rs.getString("C8");
                data.add(C8);

                String D1 = rs.getString("D1");
                data.add(D1);
                String D2 = rs.getString("D2");
                data.add(D2);
                String D3 = rs.getString("D3");
                data.add(D3);
                String D4 = rs.getString("D4");
                data.add(D4);
                String D5 = rs.getString("D5");
                data.add(D5);
                String D6 = rs.getString("D6");
                data.add(D6);
                String D7 = rs.getString("D7");
                data.add(D7);
                String D8 = rs.getString("D8");
                data.add(D8);
            }

            System.out.println(data);
        } finally {

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
            }
        }
        System.out.println(data);
        return data;
    }
}
