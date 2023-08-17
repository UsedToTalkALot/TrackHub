/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import view.*;
import database.*;
import controller.AddcustomerController;

/**
 *
 * @author pooja
 */
public class AddCustomerModel {
    private String customername,phonenumber,email;
    
    public AddCustomerModel(String customername, String phonenumber,String email ){
        this.customername = customername;
        
        this.phonenumber=phonenumber;
        this.email=email;
    
    }
    
    public String getPassengername(){
        return customername;
    
    
    }
    public void setPassengername(String passengername) {
        this.customername=passengername;
    
    }
    
   
    
    
    public String getPhonenumber(){
        return phonenumber;
    
    }
    public void setPhonenumber(String phonenumber){
        this.phonenumber=phonenumber;
    
    }
    
    public String getEmail(){
        return email;
    
    }
    public void setEmail(String email){
        this.email=email;
    
    }
    
}
