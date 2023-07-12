package controller;

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

    public AddcustomerController(dashboard view) {
        this.view = view;
        view.addBtnAddActionListener(new AddCustomerListener());
    }

    class AddCustomerListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String customerName = view.getPassengerNameTextField().getText();
            String phoneNumber = view.getPhoneNumberTextField().getText();
            String email = view.getEmailTextField().getText();

            boolean added = addCustomer(customerName, phoneNumber, email);

            if (added) {
                showMessage("Customer added successfully");
            } else {
                showMessage("Failed to add customer");
            }
        }
    }

    public boolean validateFields(String customerName, String phoneNumber, String email) {
        return !customerName.isEmpty() &&
                !phoneNumber.isEmpty() &&
                !email.isEmpty();
    }

    public boolean addCustomer(String customerName, String phoneNumber, String email) {
        boolean success = false;

        if (!validateFields(customerName, phoneNumber, email)) {
            showMessage("Please fill in all the fields");
            return success;
        }

        try {
            conn = MyConnection.dbConnect();

            String checkQuery = "SELECT * FROM customer WHERE Phonenumber = ?";
            pst = conn.prepareStatement(checkQuery);
            pst.setString(1, phoneNumber);
            ResultSet resultSet = pst.executeQuery();

            if (resultSet.next()) {
                // Number is already registered
                showMessage("Number is already registered");
            } else {
                String sql = "INSERT INTO customer (customerName, Phonenumber, Email) VALUES (?, ?, ?)";
                pst = conn.prepareStatement(sql);
                pst.setString(1, customerName);
                pst.setString(2, phoneNumber);
                pst.setString(3, email);
                int rowsAffected = pst.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("Data Inserted");
                    success = true;
                } else {
                    System.out.println("Failed to insert data");
                }
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
        return success;
    }

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
}
