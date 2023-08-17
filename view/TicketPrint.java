
package view;

import java.awt.print.PrinterException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TicketPrint extends javax.swing.JFrame {

    public TicketPrint() {
        initComponents();

        int width = 1050;  
        int height = 530;
        setSize(width, height);
        setLocationRelativeTo(null); // Deprecated
        

    }

    
    public void setTicketData(String departure, String arrival, String DATE, String from, String to, String seatNumber) {
    txtTime.setText(departure);
    txtPrice.setText(arrival);
    txtDate.setText(DATE);
    txtRoute.setText(from);
    txtTrain.setText(to);
    
    txtSeat.setText(seatNumber);

     
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txtPrice = new javax.swing.JTextField();
        txtTrain = new javax.swing.JTextField();
        txtSeat = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        txtRoute = new javax.swing.JTextField();
        txtTime = new javax.swing.JTextField();
        BtnPrint = new javax.swing.JButton();
        LBLDeparture = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();

        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(42, 134, 251));
        jPanel2.setLayout(null);

        txtPrice.setFont(new java.awt.Font("Arial", 1, 29)); // NOI18N
        txtPrice.setBorder(null);
        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });
        jPanel2.add(txtPrice);
        txtPrice.setBounds(220, 410, 170, 40);

        txtTrain.setFont(new java.awt.Font("Arial", 1, 29)); // NOI18N
        txtTrain.setBorder(null);
        jPanel2.add(txtTrain);
        txtTrain.setBounds(650, 270, 170, 40);

        txtSeat.setFont(new java.awt.Font("Arial", 1, 29)); // NOI18N
        txtSeat.setBorder(null);
        txtSeat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeatActionPerformed(evt);
            }
        });
        jPanel2.add(txtSeat);
        txtSeat.setBounds(650, 410, 170, 40);

        txtDate.setFont(new java.awt.Font("Arial", 1, 29)); // NOI18N
        txtDate.setBorder(null);
        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });
        jPanel2.add(txtDate);
        txtDate.setBounds(220, 120, 160, 40);

        txtRoute.setFont(new java.awt.Font("Arial", 1, 29)); // NOI18N
        txtRoute.setBorder(null);
        jPanel2.add(txtRoute);
        txtRoute.setBounds(220, 280, 170, 40);

        txtTime.setFont(new java.awt.Font("Arial", 1, 29)); // NOI18N
        txtTime.setBorder(null);
        jPanel2.add(txtTime);
        txtTime.setBounds(650, 120, 190, 40);

        BtnPrint.setBackground(new java.awt.Color(118, 223, 115));
        BtnPrint.setFont(new java.awt.Font("Arial", 1, 27)); // NOI18N
        BtnPrint.setForeground(new java.awt.Color(255, 255, 255));
        BtnPrint.setText("PRINT");
        BtnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPrintActionPerformed(evt);
            }
        });
        jPanel2.add(BtnPrint);
        BtnPrint.setBounds(880, 440, 120, 50);

        LBLDeparture.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        LBLDeparture.setText("TIME");
        jPanel2.add(LBLDeparture);
        LBLDeparture.setBounds(650, 70, 250, 30);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        jLabel8.setText("PRICE");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(220, 360, 180, 30);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        jLabel6.setText("SEAT NO.");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(650, 360, 130, 40);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        jLabel5.setText("DATE");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(220, 70, 80, 40);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        jLabel4.setText("TRAIN");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(650, 230, 120, 30);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        jLabel3.setText("ROUTE");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(220, 230, 120, 40);

        jLabel2.setFont(new java.awt.Font("Arial Unicode MS", 1, 36)); // NOI18N
        jLabel2.setText("Ticket");
        jLabel2.setAlignmentY(2.0F);
        jPanel2.add(jLabel2);
        jLabel2.setBounds(50, 230, 120, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Line 1.png"))); // NOI18N
        jLabel1.setAlignmentY(2.0F);
        jPanel2.add(jLabel1);
        jLabel1.setBounds(170, 20, 10, 510);

        jScrollPane1.setAlignmentY(2.0F);

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(40, 40, 970, 460);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1050, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPrintActionPerformed

        try {
            txtArea.print();
        } catch (PrinterException ex) {
            Logger.getLogger(TicketPrint.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_BtnPrintActionPerformed

    private void txtSeatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSeatActionPerformed

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicketPrint().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnPrint;
    private javax.swing.JLabel LBLDeparture;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtRoute;
    private javax.swing.JTextField txtSeat;
    private javax.swing.JTextField txtTime;
    private javax.swing.JTextField txtTrain;
    // End of variables declaration//GEN-END:variables
}
