
package controller;

import dao.searchDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import dao.trainDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class searchController {
    private final searchDAO dao;
   

    public searchController() {
        dao = new searchDAO();
    }

    public List<String> fetchTrainData(String date,String name) {
        try {
            List<String> data = new ArrayList<>();
            
            data = dao.fetchTrainData(date,name);
            System.out.println(data);
            
            return data;
        } catch (SQLException ex) {
            Logger.getLogger(searchController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(searchController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public List<String> searchCustomer() throws SQLException, ClassNotFoundException{
        List<String> data = new ArrayList<>();
        data = dao.searchCustomer();
        return data;
    }
    public void addSelectedSeat(String name, String date, String SelectedSeat) {
        dao.addSelectedSeat(name, date, SelectedSeat);
    }

    public void addToDatabase(String time, String phoneNumber, String route, String name, String date, int ticketPrice) {
        dao.AddToDatabase(time, phoneNumber, route, name, date, ticketPrice);
        
    }

    public void creditA(String phoneNumber,String Name, String Date) {
        dao.creditA(phoneNumber);
        dao.seatLeftA(Name, Date);
    }

    public void creditB(String phoneNumber,String Name, String Date) {
        dao.creditB(phoneNumber);
        dao.seatLeftB(Name, Date);
    }

    public List<String> bookingData(String code) throws ClassNotFoundException, SQLException {
        List<String> data = new ArrayList<>();

        data = dao.bookingData(code);
        System.out.println(data);

        return data;
    }

    public String getCredit(String phoneNumber) throws ClassNotFoundException, SQLException {
        String credit = "";

        credit = dao.getCredit(phoneNumber);

        return credit;
    }

    public void minusCreditA(String phoneNumber) {
        dao.minusCreditA(phoneNumber);
    }

    public void minusCreditB(String phoneNumber) {
        dao.minusCreditB(phoneNumber);
    }
    public List<String> fillColor(String date, String train) throws SQLException, ClassNotFoundException {
        return(dao.fillColor(date, train));
    }
}

