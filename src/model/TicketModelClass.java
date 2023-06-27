/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author USER
 */
public class TicketModelClass {
   
    

    
    
    
    
    int arrivalTime;
    int departureTime;
   
   int phoneNumber; // primary key
    String seatNumber;
    String source;
            String Destination;
            String train;
             Date datee;
    int ticketPrice;
    int jbutton1;
 int jbutton2;
  int jbutton3;
   int jbutton4;
    int jbutton5;

    public int getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(int departureTime) {
        this.departureTime = departureTime;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String Destination) {
        this.Destination = Destination;
    }

    public String getTrain() {
        return train;
    }

    public void setTrain(String train) {
        this.train = train;
    }

    public Date getDatee() {
        return datee;
    }

    public void setDatee(Date datee) {
        this.datee = datee;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getJbutton1() {
        return jbutton1;
    }

    public void setJbutton1(int jbutton1) {
        this.jbutton1 = jbutton1;
    }

    public int getJbutton2() {
        return jbutton2;
    }

    public void setJbutton2(int jbutton2) {
        this.jbutton2 = jbutton2;
    }

    public int getJbutton3() {
        return jbutton3;
    }

    public void setJbutton3(int jbutton3) {
        this.jbutton3 = jbutton3;
    }

    public int getJbutton4() {
        return jbutton4;
    }

    public void setJbutton4(int jbutton4) {
        this.jbutton4 = jbutton4;
    }

    public int getJbutton5() {
        return jbutton5;
    }

    public void setJbutton5(int jbutton5) {
        this.jbutton5 = jbutton5;
    }
    
   
    public TicketModelClass(int arrivalTime, int departureTime, int phoneNumber, String seatNumber, String source, String Destination, String train, Date datee,int ticketprice,int jbutton1,int jbutton2,int jbutton3,int jbutton4,int jbutton5){
        this.arrivalTime=arrivalTime;
        this.departureTime=departureTime;
       
        this.phoneNumber=phoneNumber;
        this.seatNumber=seatNumber;
        this.source=source;
        this.Destination=Destination;
        
        this.train=train;
        this.datee=datee;
        this.ticketPrice=ticketprice;
        this.jbutton1=jbutton1;
         this.jbutton2=jbutton2;
          this.jbutton3=jbutton3;
           this.jbutton4=jbutton4;
           this.jbutton5=jbutton5;
           
    }
}

