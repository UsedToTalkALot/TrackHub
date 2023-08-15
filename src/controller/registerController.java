package controller;

import dao.registerDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.registerModel;
import view.registration;

public class registerController {
    private registerDAO dao;
    private registerModel model;
    private registration view;

    public registerController(registration view) {
        this.view = view;
        this.dao = new registerDAO();
        view.addRegister(new RegisterListener());
    }

    class RegisterListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                model = view.getDataFromModel();
                if (validateFields(model)) {
                    if (dao.userRegister(model)) {
                        //view.showMessage("Successfully data inserted");
                    } else {
                        //view.showMessage("Not entered");
                    }
                } else {
                    view.showMessage("Please fill in all the fields");
                }
            } catch (Exception e1) {
                System.out.println("Error: " + e1.getMessage());
            }
        }
    }

    public boolean validateFields(registerModel user) {
        // Validate if any field is empty
        return !user.getUsername().isEmpty() &&
                !user.getPhonenumber().isEmpty() &&
                !user.getEmail().isEmpty() &&
                !user.getSetpassword().isEmpty() &&
                !user.getRetypepassword().isEmpty() &&
                !user.getSecurityquestion().equals("Security Questions") &&
                !user.getAnswer().isEmpty();
    }
}
