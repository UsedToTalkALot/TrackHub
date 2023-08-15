package dao;

import database.MyConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class loginDAO {
    private Connection conn;

    public loginDAO() {
        conn = MyConnection.dbConnect();
    }

    public String getPasswordByUsername(String username) throws Exception {
        String password = null;
        try (Statement stmt = conn.createStatement()) {
            String sql = "SELECT * FROM register WHERE USERNAME='" + username + "'";
            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next()) {
                password = rs.getString("password");
            }
        }
        return password;
    }

    public void closeConnection() throws Exception {
        if (conn != null) {
            conn.close();
        }
    }
}
