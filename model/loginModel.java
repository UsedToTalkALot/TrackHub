package model;

import database.MyConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import controller.loginController;
import view.*;


public class loginModel {
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    private String password;

    public loginModel(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    
        public void registerUser() {
        loginController controller = new loginController();
        //controller.loginUser(username, password);
        //controller .loginUser(username, password,loginform);
       // controller.loginUser(username, password);
    }

    
}
