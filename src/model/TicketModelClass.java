/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author USER
 */
public class TicketModelClass {
   
    

    
    
    
    
    int arrivalTime;
    int departureTime;
    int passengerId;
   String passengerName;
   int phoneNumber; // primary key
    int seatNumber;
    String sourceDestination;
    int ticketPrice;
    int trainNumber;

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

    public int getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getSourceDestination() {
        return sourceDestination;
    }

    public void setSourceDestination(String sourceDestination) {
        this.sourceDestination = sourceDestination;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public TicketModelClass(int arrivalTime,
    int departureTime,
    int passengerId,
   String passengerName,
   int phoneNumber, // primary key
    int seatNumber,
    String sourceDestination,
    int ticketPrice,
    int trainNumber){
        this.arrivalTime=arrivalTime;
        this.departureTime=departureTime;
        this.passengerId=passengerId;
        this.passengerName=passengerName;
        this.phoneNumber=phoneNumber;
        this.seatNumber=seatNumber;
        this.sourceDestination=sourceDestination;
        this.ticketPrice=ticketPrice;
        this.trainNumber=trainNumber;
              
    }
}

