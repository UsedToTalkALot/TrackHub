/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import database.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import model.loginModel;
import controller.loginController;
import javax.swing.JOptionPane;
//import junit.framework.Assert;


public class login extends javax.swing.JFrame {
//    Statement stmt;
//    Connection conn;
//    DefaultTableModel dtm;
//    ResultSet rs;
//    PreparedStatement pst;
//    private loginController controller;
    public login(){
        initComponents();
    }

   
    
   

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_password = new javax.swing.JPasswordField();
        btn_forgot = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        LBL_EMAIL = new javax.swing.JLabel();
        btn_already = new javax.swing.JButton();
        btn_signin = new javax.swing.JButton();
        txt_username = new javax.swing.JTextField();
        logo = new javax.swing.JLabel();
        rectangleimg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(42, 134, 251));
        jPanel1.setPreferredSize(new java.awt.Dimension(1440, 1024));
        jPanel1.setLayout(null);

        txt_password.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        txt_password.setForeground(new java.awt.Color(153, 153, 153));
        txt_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txt_password);
        txt_password.setBounds(550, 510, 340, 57);

        btn_forgot.setBackground(new java.awt.Color(236, 244, 255));
        btn_forgot.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        btn_forgot.setForeground(new java.awt.Color(42, 134, 251));
        btn_forgot.setText("Forgot Password?");
        btn_forgot.setBorder(null);
        btn_forgot.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_forgot.setOpaque(true);
        btn_forgot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_forgotActionPerformed(evt);
            }
        });
        jPanel1.add(btn_forgot);
        btn_forgot.setBounds(650, 750, 130, 40);

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(5, 77, 170));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Password");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(630, 470, 178, 37);

        LBL_EMAIL.setFont(new java.awt.Font("Georgia", 0, 32)); // NOI18N
        LBL_EMAIL.setForeground(new java.awt.Color(5, 77, 170));
        LBL_EMAIL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL_EMAIL.setText("Username");
        LBL_EMAIL.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(LBL_EMAIL);
        LBL_EMAIL.setBounds(650, 359, 150, 37);

        btn_already.setBackground(new java.awt.Color(236, 244, 255));
        btn_already.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        btn_already.setForeground(new java.awt.Color(42, 134, 251));
        btn_already.setText("Haven't registered yet? Click here!");
        btn_already.setBorder(null);
        btn_already.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_already.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alreadyActionPerformed(evt);
            }
        });
        jPanel1.add(btn_already);
        btn_already.setBounds(590, 700, 250, 30);

        btn_signin.setBackground(new java.awt.Color(0, 204, 51));
        btn_signin.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        btn_signin.setText("SIGN IN");
        btn_signin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_signin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signinActionPerformed(evt);
            }
        });
        jPanel1.add(btn_signin);
        btn_signin.setBounds(630, 611, 179, 61);

        txt_username.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        txt_username.setForeground(new java.awt.Color(153, 153, 153));
        txt_username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });
        jPanel1.add(txt_username);
        txt_username.setBounds(550, 400, 340, 57);

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.png"))); // NOI18N
        logo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(logo);
        logo.setBounds(620, 58, 200, 200);

        rectangleimg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rectangleimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/rectangle.png"))); // NOI18N
        rectangleimg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(rectangleimg);
        rectangleimg.setBounds(180, 180, 1101, 734);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1440, 1024);

        setSize(new java.awt.Dimension(1440, 1024));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_signinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signinActionPerformed
        // TODO add your handling code here:
       if ("EMAIL".equals(txt_username.getText())) {
    JOptionPane.showMessageDialog(rootPane, "NO FIELD CAN BE EMPTY!");
} else {
    String username = txt_username.getText();
    String password = txt_password.getText();
//    Assert.assertEquals("ram", username);
//    Assert.assertEquals("hello", password);

    loginController controller = new loginController();
    controller.loginUser(username,password,this); // Call the registerUser() method on the instance
}
        
        
        
        
        
        
//        System.out.println("login attempt");
//        if("USERNAME".equals(txt_username.getText())){
//            JOptionPane.showMessageDialog(rootPane, "ENTER THE USERNAME");
//        }
//        else{
//            try {
//    Connection conn = MyConnection.dbConnect();
//    Statement stmt = conn.createStatement();
//    String username = txt_username.getText();
//    String password = txt_password.getText();
//
//    String sql = "SELECT * FROM register WHERE username='" + username + "'";
//    ResultSet rs = stmt.executeQuery(sql);
//
//    if (rs.next()) {
//        String storedPassword = rs.getString("password");
//        if (password.equals(storedPassword)) {
//            // Login successful
//            JOptionPane.showMessageDialog(rootPane, "Login successful");
//            txt_username.setText("");
//            txt_password.setText("");
//            // Add your code for the actions to perform after successful login
//        } 
//        else {
//            // Incorrect password
//            JOptionPane.showMessageDialog(rootPane, "Incorrect password");
//        }
//    } 
//    else {
//        // User does not exist
//        JOptionPane.showMessageDialog(rootPane, "User does not exist");
//    }
//} catch (Exception e) {
//    System.out.println(e.getMessage());
//}
//        }
//        
    
        
    }//GEN-LAST:event_btn_signinActionPerformed

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameActionPerformed

    private void btn_alreadyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alreadyActionPerformed
        // TODO add your handling code here:
                registration s= new registration();
        s.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btn_alreadyActionPerformed

    private void btn_forgotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_forgotActionPerformed
        // TODO add your handling code here:
         reset r= new reset();
        r.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btn_forgotActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LBL_EMAIL;
    private javax.swing.JButton btn_already;
    private javax.swing.JButton btn_forgot;
    private javax.swing.JButton btn_signin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel rectangleimg;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables

    public void clearFields() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
