/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;
import model.*;
import controller.*;
import dao.ResetDAO;
import java.awt.Toolkit;
import java.awt.event.ActionListener;

/**
 *
 * @author saroj
 */
public class reset extends javax.swing.JFrame {
    
    public void addResetButtonListener(ActionListener listener) {
        btn_reset.addActionListener(listener);
    }

    resetModel model;
    resetController controller;
    ResetDAO dao;
    public reset() {
        initComponents();
        setTitle("Trackhub: Forget Password");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/thulologo.png")));

        controller = new resetController();
        dao= new ResetDAO();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_securityquestion = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        lbl_answer = new javax.swing.JLabel();
        txt_answer = new javax.swing.JTextField();
        lbl_number = new javax.swing.JLabel();
        txt_number = new javax.swing.JTextField();
        lbl_password1 = new javax.swing.JLabel();
        txt_password = new javax.swing.JTextField();
        lbl_repassword = new javax.swing.JLabel();
        txt_repassword = new javax.swing.JTextField();
        img_logo = new javax.swing.JLabel();
        img_glassrectangle = new javax.swing.JLabel();
        img_jhilimili = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        txt_securityquestion.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        txt_securityquestion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_securityquestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_securityquestionActionPerformed(evt);
            }
        });
        jPanel1.add(txt_securityquestion);
        txt_securityquestion.setBounds(780, 500, 320, 50);

        btn_search.setBackground(new java.awt.Color(0, 153, 0));
        btn_search.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        btn_search.setForeground(new java.awt.Color(255, 255, 255));
        btn_search.setText("Search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });
        jPanel1.add(btn_search);
        btn_search.setBounds(1130, 430, 90, 28);

        btn_reset.setBackground(new java.awt.Color(0, 153, 0));
        btn_reset.setFont(new java.awt.Font("Georgia", 0, 32)); // NOI18N
        btn_reset.setForeground(new java.awt.Color(255, 255, 255));
        btn_reset.setText("Reset Password");
        btn_reset.setBorder(null);
        btn_reset.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        jPanel1.add(btn_reset);
        btn_reset.setBounds(820, 910, 240, 61);

        lbl_answer.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        lbl_answer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_answer.setText("Answer");
        lbl_answer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbl_answer);
        lbl_answer.setBounds(840, 550, 210, 37);

        txt_answer.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        txt_answer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_answer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_answerActionPerformed(evt);
            }
        });
        jPanel1.add(txt_answer);
        txt_answer.setBounds(780, 590, 320, 50);

        lbl_number.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        lbl_number.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_number.setText("Phone Number");
        lbl_number.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbl_number);
        lbl_number.setBounds(840, 380, 210, 37);

        txt_number.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        txt_number.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_numberActionPerformed(evt);
            }
        });
        jPanel1.add(txt_number);
        txt_number.setBounds(780, 420, 320, 50);

        lbl_password1.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        lbl_password1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_password1.setText("Set Password");
        lbl_password1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbl_password1);
        lbl_password1.setBounds(830, 650, 230, 37);

        txt_password.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        txt_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });
        jPanel1.add(txt_password);
        txt_password.setBounds(780, 690, 320, 50);

        lbl_repassword.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        lbl_repassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_repassword.setText("Confirm Password");
        lbl_repassword.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbl_repassword);
        lbl_repassword.setBounds(810, 750, 270, 37);

        txt_repassword.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        txt_repassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_repassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_repasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txt_repassword);
        txt_repassword.setBounds(780, 790, 320, 50);

        img_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/thulologo.png"))); // NOI18N
        jPanel1.add(img_logo);
        img_logo.setBounds(820, 42, 250, 250);

        img_glassrectangle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img_glassrectangle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/glassrectangle.png"))); // NOI18N
        jPanel1.add(img_glassrectangle);
        img_glassrectangle.setBounds(225, 166, 1468, 775);

        img_jhilimili.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img_jhilimili.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/jhilimilifullpage.png"))); // NOI18N
        jPanel1.add(img_jhilimili);
        img_jhilimili.setBounds(0, 0, 1920, 1080);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1920, 1080);

        setSize(new java.awt.Dimension(1936, 1088));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_numberActionPerformed

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passwordActionPerformed

    private void txt_answerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_answerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_answerActionPerformed

    private void txt_repasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_repasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_repasswordActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        // TODO add your handling code here:
         // Check if the answer matches the question in the database
         String number = txt_number.getText();
        String securityQuestion = txt_securityquestion.getText();
        String answer = txt_answer.getText();
        String newPassword = txt_password.getText();
         
    if (dao.checkAnswerInDatabase(number, securityQuestion, answer)) {
        // Update the password with the new password provided by the user
        if (dao.updatePasswordInDatabase(number, newPassword)) {
            JOptionPane.showMessageDialog(null, "Password reset successful!");
            login s= new login();
            s.setVisible(true);
            this.hide();
        } else {
            JOptionPane.showMessageDialog(null, "Failed to update the password.");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Your answer does not match the security question.");
    }

        //registerController r=new registerController(this);

    }//GEN-LAST:event_btn_resetActionPerformed

    private void txt_securityquestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_securityquestionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_securityquestionActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
//        // TODO add your handling code here:
        String phoneNumber = txt_number.getText();
    boolean numberExists = controller.checkNumberInDatabase(phoneNumber);
    if (numberExists) {
        String securityQuestion = controller.getSecurityQuestionFromDatabase(phoneNumber);
        txt_securityquestion.setText(securityQuestion);
    } else {
        JOptionPane.showMessageDialog(this, "This number is not registered yet!");
    }

//         String phoneNumber = txt_number.getText();
//    boolean numberExists = dao.checkNumberInDatabase(phoneNumber);
//    if (numberExists) {
//        String securityQuestion = dao.getSecurityQuestionFromDatabase(phoneNumber);
//        txt_securityquestion.setText(securityQuestion);
//    } else {
//        JOptionPane.showMessageDialog(this, "This number is not registered yet!");
//    }
    }//GEN-LAST:event_btn_searchActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(reset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reset().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_search;
    private javax.swing.JLabel img_glassrectangle;
    private javax.swing.JLabel img_jhilimili;
    private javax.swing.JLabel img_logo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_answer;
    private javax.swing.JLabel lbl_number;
    private javax.swing.JLabel lbl_password1;
    private javax.swing.JLabel lbl_repassword;
    private javax.swing.JTextField txt_answer;
    private javax.swing.JTextField txt_number;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_repassword;
    private javax.swing.JTextField txt_securityquestion;
    // End of variables declaration//GEN-END:variables
}
