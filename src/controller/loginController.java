
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

    public void loginUser(String username, String password, login loginForm) {
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
}
