
package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import dao.trainDAO;

public class searchController {
    private final trainDAO dao;

    public searchController() {
        dao = new trainDAO();
    }

    public List<String> fetchData(String date) {
        try {
            List<String> data = new ArrayList<>();
            
            data = dao.fetchData(date);
            System.out.println(data);
            
            return data;
        } catch (SQLException ex) {
            Logger.getLogger(searchController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(searchController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void addToDatabase(String time, String phoneNumber, String route, String name, String date, int ticketPrice, String selectedSeat) {
        dao.addToDatabase(time, phoneNumber, route, name, date, ticketPrice, selectedSeat);
    }

    public void creditA(String phoneNumber) {
        dao.creditA(phoneNumber);
    }

    public void creditB(String phoneNumber) {
        dao.creditB(phoneNumber);
    }

    public List<String> bookingData(String code) {
        List<String> data = new ArrayList<>();

        try {
            data = dao.bookingData(code);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(searchController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(searchController.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(data);

        return data;
    }

    public String getCredit(String phoneNumber) {
        String credit = "";

        try {
            credit = dao.getCredit(phoneNumber);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(searchController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(searchController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return credit;
    }

    public void minusCreditA(String phoneNumber) {
        dao.minusCreditA(phoneNumber);
    }

    public void minusCreditB(String phoneNumber) {
        dao.minusCreditB(phoneNumber);
    }
}
