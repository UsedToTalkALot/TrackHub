package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Connection_Database.MyConnection;
//import java.util.HashSet;
import java.util.Set;
import model.TicketModelClass;

public class DAO_PROJECT {
    Connection conn = null;
    PreparedStatement pstmt = null;

    public boolean checkSignUpData (TicketModelClass myModel))(
            String arrivalTime,
            String departure,
            String phoneNumber,
            String seatNumber,
            String source,
            String destination,
            String train,
            String date,
            String ticketPrice,
            Set<String> selectedSeats) {

        conn = MyConnection.dbConnect();
        try {
            String sql = "INSERT INTO tickets (ArrivalTime, departuretime, phonenumber, seatnumber, source, destination, train, datee, ticketprice, jbutton1, jbutton2, jbutton3, jbutton4, jbutton5) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, arrivalTime);
            pstmt.setString(2, departure);
            pstmt.setString(3, phoneNumber);
            pstmt.setString(4, seatNumber);
            pstmt.setString(5, source);
            pstmt.setString(6, destination);
            pstmt.setString(7, train);
            pstmt.setString(8, date);
            pstmt.setString(9, ticketPrice);

            // Set button text values only if the corresponding seats are selected
            if (selectedSeats.contains("jButton1")) {
                pstmt.setString(10, "jButton1");
            } else {
                pstmt.setNull(10, java.sql.Types.VARCHAR);
            }
            if (selectedSeats.contains("jButton2")) {
                pstmt.setString(11, "jButton2");
            } else {
                pstmt.setNull(11, java.sql.Types.VARCHAR);
            }
            if (selectedSeats.contains("jButton3")) {
                pstmt.setString(12, "jButton3");
            } else {
                pstmt.setNull(12, java.sql.Types.VARCHAR);
            }
            if (selectedSeats.contains("jButton4")) {
                pstmt.setString(13, "jButton4");
            } else {
                pstmt.setNull(13, java.sql.Types.VARCHAR);
            }
            if (selectedSeats.contains("jButton5")) {
                pstmt.setString(14, "jButton5");
            } else {
                pstmt.setNull(14, java.sql.Types.VARCHAR);
            }

            pstmt.executeUpdate();
            System.out.println("Data inserted");
            JOptionPane.showMessageDialog(null, "Successfully registered", "Ticket", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    