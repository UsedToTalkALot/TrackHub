/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.TicketModelClass;
import model.*;
import view.*;
import java.sql.*;
import Connection_Database.*;

/**
 *
 * @author USER
 */
public class DAO_PROJECT {
    PreparedStatement pst=null;
    Connection conn=null;
    
    public boolean checkSignUpData(TicketModelClass myModel) throws ClassNotFoundException, SQLException {
   
    
    
    try {
        conn =Connection_Database.MyConnection.dbConnect();
           
    String sql = "INSERT INTO tickets (ArrivalTime, departuretime, passengerid, passengername, phonenumber, seatnumber, sourcedestination, ticketprice, trainnumber) VALUES (" +
        myModel.getArrivalTime() + ", " +
        myModel.getDepartureTime() + ", " +
        myModel.getPassengerId() + ", '" +
        myModel.getPassengerName() + "', " +
        myModel.getPhoneNumber() + ", " +
        myModel.getSeatNumber() + ", '" +
        myModel.getSourceDestination() + "', " +
        myModel.getTicketPrice() + ", " +
        myModel.getTrainNumber() + ")";
        
    pst.executeUpdate(sql);
    
    System.out.println("Data inserted");
    JOptionPane.showMessageDialog(null, "Data inserted successfully", "tickets", JOptionPane.INFORMATION_MESSAGE);
    
    
} catch (Exception e) {
    System.out.println(e.getMessage());
}


    pst.executeUpdate();

    JOptionPane.showMessageDialog(null, "Data inserted successfully");

    return false;
}
    
}
