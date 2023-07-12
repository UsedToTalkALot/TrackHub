package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class VisualizationDAO {
    private String url;
    private String username;
    private String password;

    public VisualizationDAO() {
        // Database connection details
        url = "jdbc:mysql://localhost:3306/trackhub";
        username = "root";
        password = "ENTERT@1nment";
    }

    public Map<String, Map<String, Integer>> getClassSalesData() throws SQLException {
        Map<String, Map<String, Integer>> classSalesMap = new HashMap<>();

        // Fetch data from the database
        String query = "SELECT date, price, class FROM transaction";
        try (Connection conn = DriverManager.getConnection(url, username, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                String date = rs.getString("date");
                int price = rs.getInt("price");
                String salesClass = rs.getString("class");

                // Calculate the month from the date
                LocalDate localDate = LocalDate.parse(date);
                String month = localDate.format(DateTimeFormatter.ofPattern("MMM yyyy"));

                // Update the class sales map
                Map<String, Integer> monthlySalesMap = classSalesMap.getOrDefault(salesClass, new HashMap<>());
                int currentMonthlySales = monthlySalesMap.getOrDefault(month, 0);
                currentMonthlySales += price;
                monthlySalesMap.put(month, currentMonthlySales);
                classSalesMap.put(salesClass, monthlySalesMap);
            }
        }

        return classSalesMap;
    }

    public Map<String, Integer> getOverallSalesData() throws SQLException {
        Map<String, Integer> overallSalesMap = new HashMap<>();

        // Fetch data from the database
        String query = "SELECT date, price FROM transaction";
        try (Connection conn = DriverManager.getConnection(url, username, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                String date = rs.getString("date");
                int price = rs.getInt("price");

                // Calculate the month from the date
                LocalDate localDate = LocalDate.parse(date);
                String month = localDate.format(DateTimeFormatter.ofPattern("MMM yyyy"));

                // Update the overall sales map
                int currentOverallSales = overallSalesMap.getOrDefault(month, 0);
                currentOverallSales += price;
                overallSalesMap.put(month, currentOverallSales);
            }
        }

        return overallSalesMap;
    }
}
