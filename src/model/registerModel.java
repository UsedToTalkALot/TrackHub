/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import view.*;
import database.*;
import controller.registerController;


/**
 *
 * @author saroj
 */
public class registerModel {
    private String username, phonenumber, email, setpassword, retypepassword, securityquestion, answer;


    public registerModel(String username,String phonenumber,String email, String setpassword,String retypepassword, String securityquestion, String answer){
        this.username=username;
        this.phonenumber=phonenumber;
        this.email=email;
        this.setpassword=setpassword;
        this.retypepassword=retypepassword;
        this.securityquestion=securityquestion;
        this.answer=answer;
    }
//    
       
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSetpassword() {
        return setpassword;
    }

    public void setSetpassword(String setpassword) {
        this.setpassword = setpassword;
    }

    public String getRetypepassword() {
        return retypepassword;
    }

    public void setRetypepassword(String retypepassword) {
        this.retypepassword = retypepassword;
    }
        public String getSecurityquestion() {
        return securityquestion;
    }

    public void setSecurityquestion(String securityquestion) {
        this.securityquestion = securityquestion;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
    
  
           
}
