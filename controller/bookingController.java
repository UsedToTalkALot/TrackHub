
package controller;

import dao.bookingDAO;

public class bookingController {
    public void insertBookingData(String time, String phoneNumber, String route, String name, String date, int ticketPrice, String seat, String code, String meal) throws ClassNotFoundException {
        bookingDAO dao = new bookingDAO();
        dao.insertData(time, phoneNumber, route, name, date, ticketPrice, seat, code, meal);
    }
    
    public void recordTransaction(String phoneNumber, String date, int ticketPrice, String cllass) throws ClassNotFoundException {
        bookingDAO dao = new bookingDAO();
        dao.recordTransaction(phoneNumber, date, ticketPrice,cllass);
    }
    
         public void deleteCustomer(String phoneNumber) {
        bookingDAO dao = new bookingDAO();
        dao.deleteCustomer(phoneNumber);
       
    }
    
}
