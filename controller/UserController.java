
package controller;

import java.util.Collections;
import dao.DatabaseHandlerDAO;
import java.util.List;
import model.PassengerModel;
import java.sql.SQLException;


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
   
            return Collections.emptyList(); 
        }
    }

    public void deletePassenger(String phoneNumber) {
        try {
            databaseHandler.deletePassenger(phoneNumber);
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
          
        }
    }
}