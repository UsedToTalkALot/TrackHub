package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.SQLException;

public class AddTrainController {

    // Database connection parameters
    static final String DB_URL = "jdbc:mysql://localhost/trackhub";
    static final String DB_USER = "root";
    static final String DB_PASSWORD = "cpktnwt";

    public static void addTrainData(String addDate, String addTrain, String addTime, String addRoute,
            String addMeal, int addPriceA, int addPriceB) {
        int addSeatA = 10;
        int addSeatB = 32;
        // Create a Connection object
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            // Create the SQL insert statement
            String sql = "INSERT INTO train (datte, name, time, route, seat1, seat2, meal, price1, price2) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

            // Create a PreparedStatement object to prevent SQL injection
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                // Set the parameter values
                pstmt.setString(1, addDate);
                pstmt.setString(2, addTrain);
                pstmt.setString(3, addTime);
                pstmt.setString(4, addRoute);
                pstmt.setInt(5, addSeatA);
                pstmt.setInt(6, addSeatB);
                pstmt.setString(7, addMeal);
                pstmt.setDouble(8, addPriceA);
                pstmt.setDouble(9, addPriceB);

                // Execute the SQL statement
                pstmt.executeUpdate();

                System.out.println("Data added successfully to the train table.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
