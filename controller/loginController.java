

package controller;

import view.login;
import view.dashboard;
import javax.swing.JOptionPane;
import dao.loginDAO;

public class loginController {
    private loginDAO dao;

    public loginController() {
        dao = new loginDAO();
    }
//    String dash;
    public void loginUser(String username, String password, login loginForm) {
//        dash = username;
//        System.out.println(dash);
        if ("USERNAME".equals(username)) {
            JOptionPane.showMessageDialog(null, "ENTER THE USERNAME");
        } else {
            try {
                String storedPassword = dao.getPasswordByUsername(username);

                if (storedPassword != null) {
                    if (password.equals(storedPassword)) {
                        
                        // Login successful
                        new login().setVisible(false);
                        dashboard dashboardView = new dashboard();
                        dashboardView.setVisible(true);
                        loginForm.dispose();
                    } else {
                        // Incorrect password
                        JOptionPane.showMessageDialog(null, "Incorrect password");
                    }
                } else {
                    // User does not exist
                    JOptionPane.showMessageDialog(null, "User does not exist");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
   

    
    public void clearTable() {

        loginDAO ld = new loginDAO();
        ld.clearTable();

    }
    
    public void fillUser(String user,String email,  String pass, String ques, String ans) {
        loginDAO ld = new loginDAO();
        ld.fillUser(user,email,  pass, ques,  ans);
        
    }
    
    public void retrive(String name){
        loginDAO ld = new loginDAO();
        ld.retrive( name);
        
    }
    }

