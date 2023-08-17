package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import database.MyConnection;

public class AddCustomerDAO {

    public void addCustomer(String customerName, String phoneNumber, String email) {

        try (Connection conn = MyConnection.dbConnect(); PreparedStatement pst = conn.prepareStatement("INSERT INTO customer(customerName, Phonenumber, Email) VALUES (?, ?, ?)")) {

            pst.setString(1, customerName);
            pst.setString(2, phoneNumber);
            pst.setString(3, email);

            int rowsAffected = pst.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Data Inserted");

            } else {
                System.out.println("Failed to insert data");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public boolean checkPhoneNumberExists(String phoneNumber) {
        try (Connection conn = MyConnection.dbConnect(); PreparedStatement pst = conn.prepareStatement("SELECT * FROM customer WHERE Phonenumber = ?")) {

            pst.setString(1, phoneNumber);
            ResultSet resultSet = pst.executeQuery();

            return resultSet.next();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return false;
    }

    

}
