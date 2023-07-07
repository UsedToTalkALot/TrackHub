package controller;

import model.registerModel;
import database.MyConnection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.*;
import javax.swing.JOptionPane;

public class registerController {
    private Connection conn;
    PreparedStatement pst;
    registerModel model;
    registration view;

    public registerController(registration view) {
        this.view = view;
        view.addRegister(new RegisterListener());
    }

    class RegisterListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                model = view.getDataFromModel();
                if (validateFields(model)) {
                    if (userRegister(model)) {
                        //view.showMessage("Successfully data inserted");
                    } else {
                        //view.showMessage("Not entered");
                    }
                } else {
                    view.showMessage("Please fill in all the fields");
                }
            } catch (Exception e1) {
                System.out.println("Error: " + e1.getMessage());
            }
        }
    }

    public boolean validateFields(registerModel user) {
        // Validate if any field is empty
        return !user.getUsername().isEmpty() &&
                !user.getPhonenumber().isEmpty() &&
                !user.getEmail().isEmpty() &&
                !user.getSetpassword().isEmpty() &&
                !user.getRetypepassword().isEmpty() &&
                !user.getSecurityquestion().equals("Security Questions") &&
                !user.getAnswer().isEmpty();
    }

    public boolean userRegister(registerModel user) throws Exception {
    boolean success = false;
    try {
        conn = MyConnection.dbConnect();
        Statement stmt = conn.createStatement();

        String checkQuery = "SELECT * FROM register WHERE NUMBER = '" + user.getPhonenumber() + "'";
        ResultSet resultSet = stmt.executeQuery(checkQuery);

        if (resultSet.next()) {
            // Number is already registered
            JOptionPane.showMessageDialog(null, "Number is already registered", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Number is not registered, proceed with account creation
            String sql = "INSERT INTO register (USERNAME, NUMBER, EMAIL, PASSWORD, CONFIRM_PASSWORD, SECURITYQUESTION, ANSWER) VALUES (?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, user.getUsername());
            pst.setString(2, user.getPhonenumber());
            pst.setString(3, user.getEmail());
            pst.setString(4, user.getSetpassword());
            pst.setString(5, user.getRetypepassword());
            pst.setString(6, user.getSecurityquestion());
            pst.setString(7, user.getAnswer());
            pst.executeUpdate();

            System.out.println("Data Inserted");
            JOptionPane.showMessageDialog(null, "Data registered successfully");

            success = true;
        }
    } finally {
        if (conn != null) {
            conn.close(); // Close the database connection in the finally block
        }
    }
    
    return success;
}
    
    
    

}
