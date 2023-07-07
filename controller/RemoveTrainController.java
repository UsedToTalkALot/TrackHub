package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RemoveTrainController {
    // Database connection parameters
    static final String DB_URL = "jdbc:mysql://localhost/trackhub";
    static final String DB_USER = "root";
    static final String DB_PASSWORD = "cpktnwt";

    public static void removeTrainData(String removeDate, String removeTrain) {
        System.out.println(removeDate+"\n"+removeTrain);
        // Create a Connection object
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            // Create the SQL delete statement
            String sql = "DELETE FROM train WHERE datte = ? AND name = ?";

            // Create a PreparedStatement object to prevent SQL injection
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                // Set the parameter values
                pstmt.setString(1, removeDate);
                pstmt.setString(2, removeTrain);

                // Execute the SQL statement
                int rowsDeleted = pstmt.executeUpdate();

                if (rowsDeleted > 0) {
                    System.out.println("Row deleted successfully from the train table.");
                } else {
                    System.out.println("No matching rows found in the train table.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}