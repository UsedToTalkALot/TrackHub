package controller;

import model.*;
import view.*;
import database.MyConnection;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class loginController {
    public void loginUser(String username, String password,login loginform) {
        if ("USERNAME".equals(username)) {
            JOptionPane.showMessageDialog(null, "ENTER THE USERNAME");
        } else {
            try {
                Connection conn = MyConnection.dbConnect();
                Statement stmt = conn.createStatement();
                String sql = "SELECT * FROM register WHERE USERNAME='" + username + "'";
                ResultSet rs = stmt.executeQuery(sql);

                if (rs.next()) {
                    String storedPassword = rs.getString("password");
                    if (password.equals(storedPassword)) {
                        // Login successful
                        //JOptionPane.showMessageDialog(null, "Login successful");
                        // Add your code for the actions to perform after successful login
                        // Open the dashboard view
                        new login().setVisible(false);
                       
                        dashboard dashboardView = new dashboard();
                        dashboardView.setVisible(true);
                        loginform.dispose();
                        
                    } else {
                        // Incorrect password
                        JOptionPane.showMessageDialog(null, "Incorrect password");
                    }
                } else {
                    // User does not exist
                    JOptionPane.showMessageDialog(null, "User does not exist");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
