/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import view.reset;
import controller.resetController;

public class resetModel {
     private String  phonenumber, setpassword, retypepassword, securityquestion, answer;
     
     public resetModel(String username,String phonenumber,String email, String setpassword,String retypepassword, String securityquestion, String answer){
        
        this.phonenumber=phonenumber;
        
        this.setpassword=setpassword;
        this.retypepassword=retypepassword;
        this.securityquestion=securityquestion;
        this.answer=answer;
        
     }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
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