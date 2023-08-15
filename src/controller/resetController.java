
package controller;

import dao.ResetDAO;
import view.reset;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.resetModel;

public class resetController {
    private ResetDAO dao;
    private reset view;
    private resetModel model;

    public resetController() {
        dao = new ResetDAO();
        view = new reset();
//       model= new resetModel();
        
        view.addResetButtonListener(new ResetButtonListener());
    }

    private class ResetButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Handle the reset button click event here
            String number = model.getPhonenumber();
            String securityQuestion = dao.getSecurityQuestionFromDatabase(number);

            if (securityQuestion == null) {
                JOptionPane.showMessageDialog(null, "Number does not exist!");
                return;
            }

            String answer = JOptionPane.showInputDialog(null, securityQuestion);
            if (answer == null) {
                return;
            }

            if (!dao.checkAnswerInDatabase(number, securityQuestion, answer)) {
                JOptionPane.showMessageDialog(null, "Answer is incorrect!");
                return;
            }

            String newPassword = JOptionPane.showInputDialog(null, "Enter new password:");
            if (newPassword == null) {
                return;
            }

            if (dao.updatePasswordInDatabase(number, newPassword)) {
                JOptionPane.showMessageDialog(null, "Password reset successful!");
            } else {
                JOptionPane.showMessageDialog(null, "Password reset failed!");
            }
        }
    }
}
