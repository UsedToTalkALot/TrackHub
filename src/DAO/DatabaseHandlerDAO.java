package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import database.MyConnection;
import model.PassengerModel;

public class DatabaseHandlerDAO {
    public List<String> fetchData(String date) throws SQLException, ClassNotFoundException {
        List<String> data = new ArrayList<>();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Connection conn = null;

        try {
            conn = MyConnection.dbConnect();

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
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return data;
    }
     public List<PassengerModel> getAllPassengers() throws SQLException, ClassNotFoundException {
        List<PassengerModel> passengers = new ArrayList<>();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Connection conn = null;

        try {
            conn = MyConnection.dbConnect();

            String sql = "SELECT phoneNumber, passengerName, email FROM passengers";
            stmt = conn.prepareStatement(sql);

            rs = stmt.executeQuery();

            while (rs.next()) {
                String phoneNumber = rs.getString("phoneNumber");
                String passengerName = rs.getString("passengerName");
                String email = rs.getString("email");

                PassengerModel passenger = new PassengerModel();
                passenger.setPhoneNumber(phoneNumber);
                passenger.setPassengerName(passengerName);
                passenger.setEmail(email);

                passengers.add(passenger);
            }
        } finally {
            // Close the resources
            // ...
        }

        return passengers;
    }

    public void deletePassenger(String phoneNumber) throws SQLException, ClassNotFoundException {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = MyConnection.dbConnect();

            String sql = "DELETE FROM passengers WHERE phoneNumber = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, phoneNumber);

            stmt.executeUpdate();
        } finally {
            // Close the resources
            // ...
        }
    }
}
