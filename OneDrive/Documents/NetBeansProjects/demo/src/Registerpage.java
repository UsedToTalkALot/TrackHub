
import demo.Myconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
 

/*

//package demo;
//import java.sql.*;
//import javax.swing.JOptionPane;
//import javax.swing.table.DefaultTableModel;

 * @author pooja
 */
public class Registerpage extends javax.swing.JFrame {Connection conn=null;
    Statement stmt=null;
    DefaultTableModel dtm=null;
    ResultSet rs = null;
    PreparedStatement pst= null;
    

    /**
     * Creates new form Registerpage
     */
    public Registerpage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        txt_ans = new javax.swing.JTextField();
        ft_dfggh = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtphonenumber = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtAdd = new javax.swing.JTextField();
        txtsetpassword = new javax.swing.JTextField();
        txtretypepassword = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        signup = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTextField1.setText("jTextField1");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo/images/Rectangle 10 (2).png"))); // NOI18N
        jLabel1.setText(" ");

        jTextField2.setText("jTextField2");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));
        jPanel2.setLayout(null);

        txt_ans.setText(" ANSWERS");
        jPanel2.add(txt_ans);
        txt_ans.setBounds(410, 190, 150, 22);

        ft_dfggh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SECURITY QUESTION", "In which city were you born?", "What is your favorite childhood book?", "What was the name of your first pet?" }));
        jPanel2.add(ft_dfggh);
        ft_dfggh.setBounds(410, 140, 150, 22);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo/images/tight-bounds (1).png"))); // NOI18N
        jLabel3.setText(" ");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(310, 20, 120, 120);

        txtphonenumber.setText("PHONE NUMBER");
        txtphonenumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtphonenumberActionPerformed(evt);
            }
        });
        jPanel2.add(txtphonenumber);
        txtphonenumber.setBounds(140, 150, 120, 22);

        txtname.setText("NAME");
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        jPanel2.add(txtname);
        txtname.setBounds(150, 120, 110, 22);

        txtEmail.setText("EMAIL");
        jPanel2.add(txtEmail);
        txtEmail.setBounds(150, 180, 120, 22);

        txtAdd.setText(" ADDRESS");
        txtAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddActionPerformed(evt);
            }
        });
        jPanel2.add(txtAdd);
        txtAdd.setBounds(260, 220, 120, 22);

        txtsetpassword.setText(" SET PASSWORD");
        jPanel2.add(txtsetpassword);
        txtsetpassword.setBounds(280, 290, 140, 22);

        txtretypepassword.setText(" RE-TYPE PASSWORD");
        jPanel2.add(txtretypepassword);
        txtretypepassword.setBounds(280, 320, 140, 22);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo/images/Rectangle 10 (2).png"))); // NOI18N
        jLabel2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel2AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel2.add(jLabel2);
        jLabel2.setBounds(100, 70, 490, 280);

        signup.setBackground(new java.awt.Color(102, 255, 102));
        signup.setText("SIGN UP");
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });
        jPanel2.add(signup);
        signup.setBounds(310, 350, 80, 23);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtphonenumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtphonenumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtphonenumberActionPerformed

    private void txtAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddActionPerformed

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
            // TODO add your handling code here:
             
         
            conn=Myconnection.dbConn();
           
        
            String username= txtname.getText();
            String phonenumber= txtphonenumber.getText();
            String email =txtEmail.getText();
            String adress= txtAdd.getText();
            String answer=txt_ans.getText();
            String securityquestion = ft_dfggh.getSelectedItem().toString();
            String setpassword=txtsetpassword.getText();
            String retypepassword= txtretypepassword.getText();
            
            
            
            
try {
    stmt = conn.createStatement();

    // Check if the number is already registered
    String checkQuery = "SELECT * FROM register WHERE NUMBER = '" + phonenumber + "'";
    ResultSet resultSet = stmt.executeQuery(checkQuery);
    if (resultSet.next()) {
        // Number is already registered
        JOptionPane.showMessageDialog(this, "Number is already registered", "Error", JOptionPane.ERROR_MESSAGE);
    } else {
        // Number is not registered, proceed with account creationDOB
        if (setpassword.equals(retypepassword)) {
            String sql = "INSERT INTO register (NUMBER, USERNAME, EMAIL, ADDRESS, PASSWORD, CONFIRM_PASSWORD, SECURITYQUESTION,ANSWER ) VALUES ('" + phonenumber + "','" + username + "','" + email + "','" + adress + "','" + setpassword + "','" + retypepassword + "','" + securityquestion + "','" + answer + "')";

            stmt.executeUpdate(sql);
            System.out.println("Data inserted");
            JOptionPane.showMessageDialog(this, "Form submitted successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
            String message = "Security Question: " + securityquestion + "\nAnswer: " + answer;
            JOptionPane.showMessageDialog(this, message, "Security Question and Answer", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "PASSWORD DOES NOT MATCH CONFIRM PASSWORD", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
} catch (Exception e) {
    System.out.println(e.getMessage());
}


                             
//                
//                


                
  
          
    }//GEN-LAST:event_signupActionPerformed

    private void jLabel2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel2AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2AncestorAdded

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
            java.util.logging.Logger.getLogger(Registerpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registerpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registerpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registerpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registerpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ft_dfggh;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton signup;
    private javax.swing.JTextField txtAdd;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txt_ans;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtphonenumber;
    private javax.swing.JTextField txtretypepassword;
    private javax.swing.JTextField txtsetpassword;
    // End of variables declaration//GEN-END:variables
}