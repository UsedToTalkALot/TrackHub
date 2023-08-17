package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import database.MyConnection;

public class RemoveTrainDAO {
    public boolean removeTrainData(String removeDate, String removeTrain) {
        boolean success = false;

      
        try (Connection conn = MyConnection.dbConnect()) {
           
            String sql = "DELETE FROM train WHERE datte = ? AND name = ?";

       
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
                pstmt.setString(1, removeDate);
                pstmt.setString(2, removeTrain);

                 
                int rowsDeleted = pstmt.executeUpdate();

                if (rowsDeleted > 0) {
                    System.out.println("Row deleted successfully from the train table.");
                    success = true;
                } else {
                    System.out.println("No matching rows found in the train table.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return success;
    }
}
