package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class trainController {
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/trackhub";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "cpktnwt";

public List<String> fetchData(String date) throws SQLException, ClassNotFoundException {
    List<String> data = new ArrayList<>();
    ResultSet rs = null;
    PreparedStatement stmt = null;
    Connection conn = null;

    try {
        Class.forName(JDBC_DRIVER);
        conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);

        String sql = "SELECT name, route, datte, time, seat1, seat2 FROM train WHERE datte = ?";
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, date);

        rs = stmt.executeQuery();

        while (rs.next()) {
            String name = rs.getString("name");
            data.add(name);
            String route = rs.getString("route");
            data.add(route);
            String time = rs.getString("time");
            data.add(time);
            String seat1 = rs.getString("seat1");
            data.add(seat1);
            String seat2 = rs.getString("seat2");
            data.add(seat2);
        }

        System.out.println(data);
    } finally {
        // Close the resources
        try {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
        }
    }

    return data;
}

}