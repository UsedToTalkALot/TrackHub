
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;


import controller.registerController;
import database.*;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.*;
import model.registerModel;
//import org.junit.Assert;
public class registration extends javax.swing.JFrame {
    
    Statement stmt;
    Connection conn;
    DefaultTableModel dtm;
    ResultSet rs;
    PreparedStatement pst;
    

    /**
     * Creates new form registration
     */
    public registration() {
        initComponents();
        setTitle("Trackhub: Registration Page");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/thulologo.png")));
    }

  registerModel mymodel;
  
  public registerModel getDataFromModel(){
      mymodel=new registerModel(txt_username.getText(),txt_number.getText(), txt_email.getText(), txt_password.getText(), txt_repassword.getText(), securityquestions.getSelectedItem().toString(), txt_answer.getText());
      return mymodel;
  }
  
  public void addRegister(ActionListener log)
  {
      btn_signup.addActionListener(log);
  }
  public void showMessage(String msg){
      {
          JOptionPane.showMessageDialog(this, msg);
      }
  }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_answer = new javax.swing.JTextField();
        securityquestions = new javax.swing.JComboBox<>();
        lbl_name = new javax.swing.JLabel();
        lbl_password1 = new javax.swing.JLabel();
        lbl_email = new javax.swing.JLabel();
        lbl_number = new javax.swing.JLabel();
        lbl_repassword = new javax.swing.JLabel();
        txt_number = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_username = new javax.swing.JTextField();
        txt_password = new javax.swing.JTextField();
        txt_repassword = new javax.swing.JTextField();
        btn_already = new javax.swing.JButton();
        btn_signup = new javax.swing.JButton();
        img_logo = new javax.swing.JLabel();
        png_rectangle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(42, 134, 251));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Answer");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(640, 770, 170, 30);

        txt_answer.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        txt_answer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txt_answer);
        txt_answer.setBounds(560, 800, 320, 50);

        securityquestions.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        securityquestions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Security Questions", "In which city were you born?", "What is your favorite childhood book?", "What was the name of your pet name?", "What is your favourite color?" }));
        securityquestions.setBorder(null);
        jPanel1.add(securityquestions);
        securityquestions.setBounds(560, 710, 320, 50);

        lbl_name.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        lbl_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_name.setText("Username");
        lbl_name.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbl_name);
        lbl_name.setBounds(640, 260, 160, 28);

        lbl_password1.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        lbl_password1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_password1.setText("Set Password");
        lbl_password1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbl_password1);
        lbl_password1.setBounds(610, 520, 230, 37);

        lbl_email.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        lbl_email.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_email.setText("Email");
        lbl_email.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbl_email);
        lbl_email.setBounds(600, 430, 230, 37);

        lbl_number.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        lbl_number.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_number.setText("Phone Number");
        lbl_number.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbl_number);
        lbl_number.setBounds(610, 340, 210, 37);

        lbl_repassword.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        lbl_repassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_repassword.setText("Confirm Password");
        lbl_repassword.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbl_repassword);
        lbl_repassword.setBounds(590, 610, 270, 37);

        txt_number.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        txt_number.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_numberActionPerformed(evt);
            }
        });
        jPanel1.add(txt_number);
        txt_number.setBounds(560, 380, 320, 50);

        txt_email.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        txt_email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });
        jPanel1.add(txt_email);
        txt_email.setBounds(560, 470, 320, 50);

        txt_username.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        txt_username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });
        jPanel1.add(txt_username);
        txt_username.setBounds(560, 290, 320, 50);

        txt_password.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        txt_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });
        jPanel1.add(txt_password);
        txt_password.setBounds(560, 560, 320, 50);

        txt_repassword.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        txt_repassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txt_repassword);
        txt_repassword.setBounds(560, 650, 320, 50);

        btn_already.setBackground(new java.awt.Color(42, 134, 251));
        btn_already.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        btn_already.setForeground(new java.awt.Color(255, 255, 255));
        btn_already.setText("Already registered? click here!");
        btn_already.setBorder(null);
        btn_already.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_already.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alreadyActionPerformed(evt);
            }
        });
        jPanel1.add(btn_already);
        btn_already.setBounds(610, 940, 216, 19);

        btn_signup.setBackground(new java.awt.Color(0, 153, 0));
        btn_signup.setFont(new java.awt.Font("Georgia", 0, 32)); // NOI18N
        btn_signup.setForeground(new java.awt.Color(255, 255, 255));
        btn_signup.setText("SIGN UP");
        btn_signup.setBorder(null);
        btn_signup.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signupActionPerformed(evt);
            }
        });
        jPanel1.add(btn_signup);
        btn_signup.setBounds(615, 862, 210, 61);

        img_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.png"))); // NOI18N
        img_logo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(img_logo);
        img_logo.setBounds(620, 58, 200, 200);

        png_rectangle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        png_rectangle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/rectangle.png"))); // NOI18N
        png_rectangle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(png_rectangle);
        png_rectangle.setBounds(170, 170, 1101, 734);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1460, 1024);

        setSize(new java.awt.Dimension(1456, 1032));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signupActionPerformed
        // TODO add your handling code here:
        
        
//        Assert.assertEquals("nik", txt_username);
//        Assert.assertEquals("0000", txt_number);
//        Assert.assertEquals("nik@gmail.com", txt_email);
//        Assert.assertEquals("nik", txt_password);
//        Assert.assertEquals("nik", txt_repassword);
//        Assert.assertEquals("nik", txt_answer);
         // Assert.assertEquals("a", txt_username);
// Assert.assertEquals("1100", txt_number);
// Assert.assertEquals("nik@gmail.com", txt_email);
//  Assert.assertEquals("nik", txt_password);
//   Assert.assertEquals("nik", txt_repassword);
//   Assert.assertEquals("nik", txt_answer);



        registerController r=new registerController(this);
        JOptionPane.showMessageDialog(this, "Registration Successful!");
    
    // Close the registration page
    this.dispose();
    
    // Open the login page
    login s = new login();
    s.setVisible(true);
        
//        login lo = new login();
//        lo.setVisible(true);
     //   this.hide();
        
        
        
        
    }//GEN-LAST:event_btn_signupActionPerformed

    private void btn_alreadyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alreadyActionPerformed
        // TODO add your handling code here:
        login s= new login();
        s.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btn_alreadyActionPerformed

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passwordActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameActionPerformed

    private void txt_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_numberActionPerformed

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
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_already;
    private javax.swing.JButton btn_signup;
    private javax.swing.JLabel img_logo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_number;
    private javax.swing.JLabel lbl_password1;
    private javax.swing.JLabel lbl_repassword;
    private javax.swing.JLabel png_rectangle;
    private javax.swing.JComboBox<String> securityquestions;
    private javax.swing.JTextField txt_answer;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_number;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_repassword;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
