package dao;

import database.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ResetDAO {
    private Connection conn;

    public ResetDAO() {
        conn = MyConnection.dbConnect();
    }

   
    public boolean checkNumberInDatabase(String NUMBER) {
        String query = "SELECT COUNT(*) FROM register WHERE NUMBER = ?";
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            pst = conn.prepareStatement(query);
            pst.setString(1, NUMBER);
            rs = pst.executeQuery();
            if (rs.next()) {
                int count = rs.getInt(1);
                return count > 0;
            }
        } catch (SQLException e) {
        } finally {
            closeResultSet(rs);
            closePreparedStatement(pst);
        }
        return false;
    }

 
    public String getSecurityQuestionFromDatabase(String NUMBER) {
        String query = "SELECT SECURITYQUESTION FROM register WHERE NUMBER = ?";
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            pst = conn.prepareStatement(query);
            pst.setString(1, NUMBER);
            rs = pst.executeQuery();
            if (rs.next()) {
                return rs.getString("SECURITYQUESTION");
            }
        } catch (SQLException e) {
        } finally {
            closeResultSet(rs);
            closePreparedStatement(pst);
        }
        return null;
    }
 
    public boolean checkAnswerInDatabase(String number, String securityQuestion, String answer) {
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            pst = conn.prepareStatement("SELECT answer FROM register WHERE NUMBER = ? AND SECURITYQUESTION = ?");
            pst.setString(1, number);
            pst.setString(2, securityQuestion);

            rs = pst.executeQuery();
            if (rs.next()) {
                String storedAnswer = rs.getString("answer");
                return storedAnswer.equals(answer);
            }
        } catch (SQLException e) {
        } finally {
            closeResultSet(rs);
            closePreparedStatement(pst);
        }

        return false;
    }

    public boolean updatePasswordInDatabase(String NUMBER, String newPassword) {
        PreparedStatement pst = null;

        try {
            pst = conn.prepareStatement("UPDATE register SET password = ? WHERE NUMBER = ?");
            pst.setString(1, newPassword);
            pst.setString(2, NUMBER);

            int rowsAffected = pst.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
        } finally {
            closePreparedStatement(pst);
        }

        return false;
    }

 
    private void closeResultSet(ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
        }
    }

  
    private void closePreparedStatement(PreparedStatement pst) {
        try {
            if (pst != null) {
                pst.close();
            }
        } catch (SQLException e) {
        }
    }
}
