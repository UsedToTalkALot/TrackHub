/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Collections;
import dao.DatabaseHandlerDAO;
import java.util.List;
import model.PassengerModel;
import java.sql.SQLException;

/**
 *
 * @author saroj
 */
public class UserController {
    private DatabaseHandlerDAO databaseHandler;

    public UserController() {
        databaseHandler = new DatabaseHandlerDAO();
    }

   public List<PassengerModel> getAllPassengers() throws ClassNotFoundException {
        try {
            return databaseHandler.getAllPassengers();
        } catch (SQLException ex) {
            ex.printStackTrace();
            // Handle the exception here
            return Collections.emptyList(); // Return an empty list or handle it in another way
        }
    }

    public void deletePassenger(String phoneNumber) {
        try {
            databaseHandler.deletePassenger(phoneNumber);
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
            // Handle the exception here
        }
    }
}