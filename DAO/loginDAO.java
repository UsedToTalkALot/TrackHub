package dao;

import controller.loginController;
import database.MyConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.dashboard;

public class loginDAO {
    private Connection conn;

    public loginDAO() {
        conn = MyConnection.dbConnect();
    }

    public String getPasswordByUsername(String username) throws Exception {
        String password = null;
        try (Statement stmt = conn.createStatement()) {
            String sql = "SELECT * FROM register WHERE USERNAME='" + username + "'";
            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next()) {
                password = rs.getString("password");
            }
        }
        return password;
    }

    public void closeConnection() throws Exception {
        if (conn != null) {
            conn.close();
        }
    }
    
    public void clearTable() {

        try (Connection conn = MyConnection.dbConnect(); PreparedStatement pst = conn.prepareStatement("DELETE FROM user")) {

            int rowsAffected = pst.executeUpdate();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
    
    public void fillUser(String user,String email,  String pass, String ques, String ans) {


        try (Connection conn = MyConnection.dbConnect()) {

            String sql = "INSERT INTO user  VALUES (?, ?, ?, ?, ?)";

        
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                // Set the parameter values
                pstmt.setString(1, user);
                pstmt.setString(2, email);
                pstmt.setString(3, pass);
                pstmt.setString(4, ques);
                pstmt.setString(5, ans);
               

                pstmt.executeUpdate();

               
            }
        } catch (SQLException e) {
        }
    }
    
    public void retrive(String name){
        
        ResultSet rs = null;
        PreparedStatement pst = null;
        Connection con = null;
        
        try {
            con = MyConnection.dbConnect();
            String query = "SELECT USERNAME, EMAIL, PASSWORD, SECURITYQUESTION, ANSWER FROM register WHERE username = ?";


            pst = con.prepareStatement(query);
            pst.setString(1, name);
            rs = pst.executeQuery();

            if (rs.next()) {
                String username = rs.getString("USERNAME");
                String email = rs.getString("EMAIL");
                String password = rs.getString("PASSWORD");
                String securityQuestion = rs.getString("SECURITYQUESTION");
                String answer = rs.getString("ANSWER");


                loginController controller = new loginController(); 
                controller.clearTable();
                controller.fillUser(username, email, password, securityQuestion, answer);

            } else {
                System.out.println("No data found for the specified username.");
            }


            rs.close();
            pst.close();
        } catch (SQLException ex) {
            Logger.getLogger(dashboard.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace(); // Print stack trace for debugging
        }
    }
}
