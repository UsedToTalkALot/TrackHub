/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Toolkit;

/**
 *
 * @author saroj
 */
public class dash extends javax.swing.JFrame {

 
    public dash() {
        initComponents();
        setTitle("Welcome to Trackhub");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/thulologo.png")));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_time = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        png_train = new javax.swing.JLabel();
        png_logo = new javax.swing.JLabel();
        png_rectangle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(42, 134, 251));
        jPanel1.setLayout(null);

        jButton1.setBackground(new java.awt.Color(0, 153, 0));
        jButton1.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("START");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(617, 810, 200, 59);

        jLabel5.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(42, 134, 251));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("digitally in 21st century");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel5);
        jLabel5.setBounds(850, 690, 260, 28);

        jLabel4.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(42, 134, 251));
        jLabel4.setText("lets live a digital life and connect ");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(860, 650, 450, 40);

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(42, 134, 251));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Solving the paper generated problem,");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(850, 620, 410, 28);

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(42, 134, 251));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("A Secure Boarding Pass");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(830, 520, 297, 31);

        lbl_time.setFont(new java.awt.Font("Georgia", 0, 48)); // NOI18N
        lbl_time.setForeground(new java.awt.Color(42, 134, 251));
        lbl_time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_time.setText("Save Time!  ");
        lbl_time.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbl_time);
        lbl_time.setBounds(820, 330, 310, 60);

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(42, 134, 251));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Book Tickets!");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(820, 390, 340, 60);

        png_train.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        png_train.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/train.png"))); // NOI18N
        jPanel1.add(png_train);
        png_train.setBounds(180, 270, 529, 500);

        png_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        png_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.png"))); // NOI18N
        png_logo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(png_logo);
        png_logo.setBounds(620, 58, 200, 200);

        png_rectangle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        png_rectangle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/rectangle.png"))); // NOI18N
        png_rectangle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(png_rectangle);
        png_rectangle.setBounds(169, 158, 1101, 734);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1440, 1024);

        setSize(new java.awt.Dimension(1456, 1032));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        login s= new login();
        s.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButton1ActionPerformed

 
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
            java.util.logging.Logger.getLogger(dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_time;
    private javax.swing.JLabel png_logo;
    private javax.swing.JLabel png_rectangle;
    private javax.swing.JLabel png_train;
    // End of variables declaration//GEN-END:variables
}
