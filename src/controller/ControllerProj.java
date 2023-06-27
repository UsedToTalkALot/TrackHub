/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import view.TicketButtonForm;
import DAO.DAO_PROJECT;


import model.*;
import view.*;



public class ControllerProj {
    
    TicketModelClass myModel;
    TicketButtonForm myView;
   
    DAO_PROJECT daoReg=new DAO_PROJECT();
    
    public ControllerProj(TicketButtonForm myView){
        this.myView=myView;
        new SignUpListener().actionPerformed();
    }
    class SignUpListener{
        public void actionPerformed(){
            try{
                myModel=myView.getData();
                if (daoReg.checkSignUpData(myModel)){
                    myView.showMessageBox("registered succesfully");
                }
                else{
                    myView.showMessageBox("error while data inserting");
                }
                
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }



}