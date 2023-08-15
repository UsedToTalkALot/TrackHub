package dao;

import database.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.registerModel;

public class registerDAO {
    private Connection conn;

    public registerDAO() {
        conn = MyConnection.dbConnect();
    }

    public boolean userRegister(registerModel user) throws Exception {
        boolean success = false;
        try {
            Statement stmt = conn.createStatement();

            String checkQuery = "SELECT * FROM register WHERE NUMBER = '" + user.getPhonenumber() + "'";
            ResultSet resultSet = stmt.executeQuery(checkQuery);

            if (resultSet.next()) {
                // Number is already registered
                JOptionPane.showMessageDialog(null, "Number is already registered", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                // Number is not registered, proceed with aaccount creation
                String sql = "INSERT INTO register (USERNAME, NUMBER, EMAIL, PASSWORD, CONFIRM_PASSWORD, SECURITYQUESTION, ANSWER) VALUES (?,?,?,?,?,?,?)";
                PreparedStatement pst = conn.prepareStatement(sql);
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
                conn.close();
            }
        }
        return success;
    }
}
