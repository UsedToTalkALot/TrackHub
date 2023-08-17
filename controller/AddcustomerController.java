package controller;

import dao.AddCustomerDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import database.MyConnection;
import view.dashboard;
import view.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class AddcustomerController {
    private Connection conn;
    private PreparedStatement pst;
    private dashboard view;



    public boolean validateFields(String customerName, String phoneNumber, String email) {
        return !customerName.isEmpty() &&
                !phoneNumber.isEmpty() &&
                !email.isEmpty();
    }

    public void addCustomer(String customerName, String phoneNumber, String email) {
 

        if (!validateFields(customerName, phoneNumber, email)) {
            showMessage("Please fill in all the fields");
          
        }

        try {
            conn = MyConnection.dbConnect();

            String checkQuery = "SELECT * FROM customer WHERE Phonenumber = ?";
            pst = conn.prepareStatement(checkQuery);
            pst.setString(1, phoneNumber);
            ResultSet resultSet = pst.executeQuery();

            if (resultSet.next()) {
          
                showMessage("Number is already registered");
            } else {
                        AddCustomerDAO dao = new AddCustomerDAO();
        dao.addCustomer(customerName, phoneNumber, email);
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception ex) {
                System.out.println("Error while closing resources: " + ex.getMessage());
            }
        }
      
    }
    

    
    public void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
}
