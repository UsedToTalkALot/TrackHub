/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import view.report;

/**
 *
 * @author saroj
 */
public class reportModel {
     private String date, passenger_no, no_of_tickets, seat_class, price;
     public reportModel(String date,String passenger_no,String no_of_tickets, String seat_class,String price){
        
        this.date=date;
        this.passenger_no=passenger_no;
        this.no_of_tickets=no_of_tickets;
        this.seat_class=seat_class;
        this.price=price;
        
     }

    public reportModel(String toString, String passengerNumber, int numberOfTickets, String seatClass, double price) {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPassenger_no() {
        return passenger_no;
    }

    public void setPassenger_no(String passenger_no) {
        this.passenger_no = passenger_no;
    }

    public String getNo_of_tickets() {
        return no_of_tickets;
    }

    public void setNo_of_tickets(String no_of_tickets) {
        this.no_of_tickets = no_of_tickets;
    }

    public String getSeat_class() {
        return seat_class;
    }

    public void setSeat_class(String seat_class) {
        this.seat_class = seat_class;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    
}
