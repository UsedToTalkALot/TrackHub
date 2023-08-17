/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import com.mysql.cj.xdevapi.Statement;
import java.awt.Color;
import static java.awt.Color.BLACK;
import java.awt.Cursor;
import java.sql.Connection;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import view.BookingButtonForm;
import view.TicketButtonForm;
import view.TrainButtonForm;
import database.MyConnection;
import controller.AddcustomerController;

import database.MyConnection;
import java.awt.Color;
import static java.awt.Color.BLACK;
import java.awt.Cursor;
import java.awt.event.ActionListener;

import java.sql.ResultSet;

import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.*;
import model.AddCustomerModel;
import java.sql.Connection;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
//import junit.framework.Assert;
import controller.UserController;
import controller.bookingController;
import controller.loginController;
import static java.awt.Color.BLACK;
import static java.awt.Color.GREEN;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableRowSorter;
import javax.swing.RowFilter;
import javax.swing.SwingUtilities;

/**
 *
 * @author USER
 */
public class dashboard extends javax.swing.JFrame {

    private Connection conn;
    private UserController userController;
    private DefaultTableModel tableModel;
    private List<PassengerModel> passengers;



    /**
     * Creates new form dashboard
     */
    public dashboard() {
        initComponents();

        mainolabelo.hide();
        hstry.hide();
        txt.hide();
        Tablee.setVisible(false);
        searchlabel.hide();
        jScrollPane2.hide();
        boolean False;

        showData();
        Connect();
        
        setSize(1920, 1200);
        this.setLocationRelativeTo(null);
        populateTable1();

        setTitle("Trackhub: User Page");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/thulologo.png")));
        passengerTable.setBackground(new Color(0, 0, 0, 0));
        ((DefaultTableCellRenderer) passengerTable.getDefaultRenderer(Object.class)).setBackground(new Color(0, 0, 0, 0));
        passengerTable.setGridColor(Color.BLACK);
        passengerTable.setForeground(Color.BLACK);
        jScrollPane1.setBackground(new Color(0, 0, 0, 0));
        jScrollPane1.setOpaque(false);
        passengerTable.setOpaque(false);
        ((DefaultTableCellRenderer) passengerTable.getDefaultRenderer(Object.class)).setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);

        JTableHeader tableHeader = passengerTable.getTableHeader();
        tableHeader.setBackground(new Color(0, 0, 0, 0));
        tableHeader.setForeground(Color.BLACK);
        ((DefaultTableCellRenderer) tableHeader.getDefaultRenderer()).setBackground(new Color(0, 0, 0, 0));
        passengerTable.setVisible(false);
        jPanel1.setOpaque(false);

        jScrollPane2.getViewport().setOpaque(false);

        Tablee.getTableHeader().setBackground(new Color(0, 0, 0, 0));

        jScrollPane2.getViewport().setOpaque(false);

        Tablee.getTableHeader().setBackground(new Color(0, 0, 0, 0));

    }

    private void populateTable1() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/trackhub", "root", "ENTERT@1nment");
            pst = con.prepareStatement("select * from transaction");
            rs = pst.executeQuery();
            java.sql.ResultSetMetaData rsmd = rs.getMetaData();

            int n = rsmd.getColumnCount();

            DefaultTableModel dtm = (DefaultTableModel) Tablee.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                for (int i = 1; i <= n; i++) {
                    v.add(rs.getString("ID"));
                    v.add(rs.getString("DATE"));
                    v.add(rs.getString("PASSENGER_NO"));
                    v.add(rs.getString("CLASS"));
                    v.add(rs.getString("PRICE"));
                    v.add(rs.getString("NO_OF_TICKETS"));

                }
                dtm.addRow(v);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(dashboard.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        Tablee.setBackground(new Color(0, 0, 0, 0));

        ((DefaultTableCellRenderer) Tablee.getDefaultRenderer(Object.class)).setBackground(new Color(0, 0, 0, 0));
        Tablee.setGridColor(GREEN);
        Tablee.setForeground(BLACK);
        jScrollPane1.setBackground(new Color(0, 0, 0, 0));
        jScrollPane1.setOpaque(false);
        Tablee.setOpaque(false);
        Tablee.setShowGrid(true);
        Tablee.setGridColor(Color.BLACK);
        ((DefaultTableCellRenderer) Tablee.getDefaultRenderer(Object.class)).setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        Tablee.getTableHeader().setOpaque(false);

    }
    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    public void Connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/trackhub", "root", "ENTERT@1nment");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(dashboard.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }



    private void showData() {
        ResultSet rs = null;
        PreparedStatement pst = null;
        Connection con = null;
        
        try {
            con = MyConnection.dbConnect();
            
            String query = "SELECT * FROM user";
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();

            if (rs.next()) {
                String username = rs.getString("USERNAME");
                String email = rs.getString("EMAIL");
                String password = rs.getString("PASSWORD");
                String securityQuestion = rs.getString("SECURITYQUESTION");
                String answer = rs.getString("ANSWER");

                txtuser.setText(username);
                txtemail.setText(email);
                txtpass.setText(password);
                txtsecurity.setText(securityQuestion);
                txtans.setText(answer);
            }
        } catch (SQLException ex) {
            Logger.getLogger(dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }



    public void addBtnAddActionListener(ActionListener listener) throws ClassNotFoundException {
        btn_add.addActionListener(listener);

        passengers = userController.getAllPassengers();
        populateTable();

        // Add ListSelectionListener to the passengerTable
        passengerTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                if (!event.getValueIsAdjusting()) {
                    int selectedRow = passengerTable.getSelectedRow();
                    if (selectedRow >= 0) {
                        PassengerModel selectedPassenger = passengers.get(selectedRow);
                        fillEntryFields(selectedPassenger);
                    }
                }
            }
        });

        // Add action listener to the delete button
        btnDelete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                int selectedRow = passengerTable.getSelectedRow();
                if (selectedRow >= 0) {
                    try {
                        PassengerModel selectedPassenger = passengers.get(selectedRow);
                        userController.deletePassenger(selectedPassenger.getPhoneNumber());
                        refreshTable();
                        clearEntryFields();
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(dashboard.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
    }

    private void populateTable() {
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Phone Number");
        tableModel.addColumn("Passenger Name");
        tableModel.addColumn("Email");

        for (PassengerModel passenger : passengers) {
            Object[] rowData = {passenger.getPhoneNumber(), passenger.getPassengerName(), passenger.getEmail()};
            tableModel.addRow(rowData);
        }

        passengerTable.setModel(tableModel);
    }

    private void refreshTable() throws ClassNotFoundException {
        passengers = userController.getAllPassengers();
        tableModel.setRowCount(0); // Clear existing table data

        for (PassengerModel passenger : passengers) {
            Object[] rowData = {passenger.getPhoneNumber(), passenger.getPassengerName(), passenger.getEmail()};
            tableModel.addRow(rowData);
        }

        tableModel.fireTableDataChanged();
    }

    private void fillEntryFields(PassengerModel passenger) {
        txt_phonenumber.setText(passenger.getPhoneNumber());
        txt_name.setText(passenger.getPassengerName());
        txt_email.setText(passenger.getEmail());
    }

    private void clearEntryFields() {
        txt_phonenumber.setText("");
        txt_name.setText("");
        txt_email.setText("");
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
        user = new javax.swing.JLabel();
        userr = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        emaill = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        pass = new javax.swing.JLabel();
        txtpass = new javax.swing.JTextField();
        sec = new javax.swing.JLabel();
        txtsecurity = new javax.swing.JTextField();
        anss = new javax.swing.JLabel();
        txtans = new javax.swing.JTextField();
        updatee = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        passengerTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_phonenumber = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        transs = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        btn_view = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        dashrectangleimg = new javax.swing.JLabel();
        trackhubLabel = new javax.swing.JLabel();
        btnTrain = new javax.swing.JButton();
        lblBooking = new javax.swing.JLabel();
        lblTickets = new javax.swing.JLabel();
        btnTickets = new javax.swing.JButton();
        btnBooking = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lblTrain = new javax.swing.JLabel();
        hstry = new javax.swing.JLabel();
        txt = new javax.swing.JTextField();
        searchlabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tablee = new javax.swing.JTable();
        mainolabelo = new javax.swing.JLabel();
        btnUser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");
        jPanel1.setMinimumSize(new java.awt.Dimension(1920, 1200));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setLayout(null);

        user.setFont(new java.awt.Font("Georgia", 0, 48)); // NOI18N
        user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user.setText("  User Section");
        jPanel1.add(user);
        user.setBounds(1420, 140, 293, 55);

        userr.setFont(new java.awt.Font("Georgia", 0, 26)); // NOI18N
        userr.setText("Username");
        jPanel1.add(userr);
        userr.setBounds(1510, 250, 119, 30);

        txtuser.setEditable(false);
        txtuser.setBackground(new java.awt.Color(195, 228, 232));
        txtuser.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        txtuser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtuser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuserActionPerformed(evt);
            }
        });
        jPanel1.add(txtuser);
        txtuser.setBounds(1360, 290, 420, 70);

        emaill.setFont(new java.awt.Font("Georgia", 0, 26)); // NOI18N
        emaill.setText("Email");
        jPanel1.add(emaill);
        emaill.setBounds(1540, 380, 68, 30);

        txtemail.setEditable(false);
        txtemail.setBackground(new java.awt.Color(195, 228, 232));
        txtemail.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        txtemail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtemail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        jPanel1.add(txtemail);
        txtemail.setBounds(1360, 420, 420, 70);

        pass.setFont(new java.awt.Font("Georgia", 0, 26)); // NOI18N
        pass.setText("Password");
        jPanel1.add(pass);
        pass.setBounds(1520, 540, 110, 30);

        txtpass.setBackground(new java.awt.Color(195, 228, 232));
        txtpass.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        txtpass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpassActionPerformed(evt);
            }
        });
        jPanel1.add(txtpass);
        txtpass.setBounds(1360, 580, 420, 70);

        sec.setFont(new java.awt.Font("Georgia", 0, 26)); // NOI18N
        sec.setText("Security Question");
        jPanel1.add(sec);
        sec.setBounds(1470, 670, 206, 30);

        txtsecurity.setEditable(false);
        txtsecurity.setBackground(new java.awt.Color(195, 228, 232));
        txtsecurity.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        txtsecurity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtsecurity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtsecurity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsecurityActionPerformed(evt);
            }
        });
        jPanel1.add(txtsecurity);
        txtsecurity.setBounds(1360, 710, 420, 70);

        anss.setFont(new java.awt.Font("Georgia", 0, 26)); // NOI18N
        anss.setText("Answer");
        jPanel1.add(anss);
        anss.setBounds(1530, 800, 86, 30);

        txtans.setBackground(new java.awt.Color(195, 228, 232));
        txtans.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        txtans.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtans.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(txtans);
        txtans.setBounds(1360, 840, 420, 70);

        updatee.setBackground(new java.awt.Color(0, 102, 204));
        updatee.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        updatee.setForeground(new java.awt.Color(255, 255, 255));
        updatee.setText("Update");
        updatee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateeActionPerformed(evt);
            }
        });
        jPanel1.add(updatee);
        updatee.setBounds(1430, 940, 300, 70);

        btnDelete.setBackground(new java.awt.Color(0, 102, 204));
        btnDelete.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete);
        btnDelete.setBounds(700, 570, 140, 54);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/userbg.png"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(1280, 110, 589, 910);

        passengerTable.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        passengerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "phoneNumber", "passengerName", "Email", "Merit Points"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        passengerTable.setToolTipText("");
        passengerTable.setGridColor(new java.awt.Color(0, 0, 0));
        passengerTable.setRowHeight(50);
        jScrollPane1.setViewportView(passengerTable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(500, 670, 710, 330);

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 48)); // NOI18N
        jLabel3.setText("Passenger Section");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(570, 130, 400, 60);

        jLabel4.setFont(new java.awt.Font("Georgia", 0, 26)); // NOI18N
        jLabel4.setText("Phone Number");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(670, 210, 200, 50);

        txt_phonenumber.setBackground(new java.awt.Color(195, 228, 232));
        txt_phonenumber.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        txt_phonenumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_phonenumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txt_phonenumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_phonenumberActionPerformed(evt);
            }
        });
        jPanel1.add(txt_phonenumber);
        txt_phonenumber.setBounds(560, 260, 410, 50);

        jLabel5.setFont(new java.awt.Font("Georgia", 0, 26)); // NOI18N
        jLabel5.setText("Passenger name");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(670, 320, 200, 50);

        txt_name.setBackground(new java.awt.Color(195, 228, 232));
        txt_name.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        txt_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txt_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nameActionPerformed(evt);
            }
        });
        jPanel1.add(txt_name);
        txt_name.setBounds(560, 370, 410, 50);

        jLabel8.setFont(new java.awt.Font("Georgia", 0, 26)); // NOI18N
        jLabel8.setText("Email");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(730, 440, 70, 30);

        txt_email.setBackground(new java.awt.Color(195, 228, 232));
        txt_email.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        txt_email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });
        jPanel1.add(txt_email);
        txt_email.setBounds(560, 480, 410, 50);

        transs.setBackground(new java.awt.Color(5, 51, 111));
        transs.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        transs.setForeground(new java.awt.Color(255, 255, 255));
        transs.setText("Travel History");
        transs.setBorder(null);
        transs.setBorderPainted(false);
        transs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        transs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transsActionPerformed(evt);
            }
        });
        jPanel1.add(transs);
        transs.setBounds(1060, 30, 250, 50);

        btn_add.setBackground(new java.awt.Color(0, 102, 204));
        btn_add.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        btn_add.setForeground(new java.awt.Color(255, 255, 255));
        btn_add.setText("Add ");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        jPanel1.add(btn_add);
        btn_add.setBounds(530, 570, 140, 54);

        btn_view.setBackground(new java.awt.Color(0, 102, 204));
        btn_view.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        btn_view.setForeground(new java.awt.Color(255, 255, 255));
        btn_view.setText("View");
        btn_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewActionPerformed(evt);
            }
        });
        jPanel1.add(btn_view);
        btn_view.setBounds(870, 570, 130, 54);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/psngr.png"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(470, 110, 589, 490);

        jButton1.setBackground(new java.awt.Color(5, 51, 111));
        jButton1.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("View Transactions");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(530, 30, 250, 50);

        dashrectangleimg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashrectangleimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BlueGreen.png"))); // NOI18N
        dashrectangleimg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(dashrectangleimg);
        dashrectangleimg.setBounds(366, 0, 1554, 1080);

        trackhubLabel.setBackground(new java.awt.Color(255, 51, 51));
        trackhubLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        trackhubLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Frame.png"))); // NOI18N
        jPanel1.add(trackhubLabel);
        trackhubLabel.setBounds(60, 40, 260, 160);

        btnTrain.setBackground(new java.awt.Color(42, 134, 251));
        btnTrain.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        btnTrain.setForeground(new java.awt.Color(5, 51, 111));
        btnTrain.setText("TRAINS");
        btnTrain.setBorder(null);
        btnTrain.setBorderPainted(false);
        btnTrain.setContentAreaFilled(false);
        btnTrain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTrainMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTrainMouseExited(evt);
            }
        });
        btnTrain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrainActionPerformed(evt);
            }
        });
        jPanel1.add(btnTrain);
        btnTrain.setBounds(130, 450, 150, 60);

        lblBooking.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBooking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tabler_brand-booking (1).png"))); // NOI18N
        jPanel1.add(lblBooking);
        lblBooking.setBounds(40, 610, 80, 80);

        lblTickets.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTickets.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dashicons_tickets-alt.png"))); // NOI18N
        jPanel1.add(lblTickets);
        lblTickets.setBounds(40, 780, 70, 70);

        btnTickets.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        btnTickets.setForeground(new java.awt.Color(5, 51, 111));
        btnTickets.setText("TICKETS");
        btnTickets.setBorder(null);
        btnTickets.setBorderPainted(false);
        btnTickets.setContentAreaFilled(false);
        btnTickets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTicketsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTicketsMouseExited(evt);
            }
        });
        btnTickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTicketsActionPerformed(evt);
            }
        });
        jPanel1.add(btnTickets);
        btnTickets.setBounds(140, 790, 140, 60);

        btnBooking.setBackground(new java.awt.Color(42, 134, 251));
        btnBooking.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        btnBooking.setForeground(new java.awt.Color(5, 51, 111));
        btnBooking.setText("BOOKING");
        btnBooking.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(42, 134, 251)));
        btnBooking.setBorderPainted(false);
        btnBooking.setContentAreaFilled(false);
        btnBooking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBookingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBookingMouseExited(evt);
            }
        });
        btnBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookingActionPerformed(evt);
            }
        });
        jPanel1.add(btnBooking);
        btnBooking.setBounds(140, 620, 150, 60);

        btnExit.setBackground(new java.awt.Color(42, 134, 251));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit.png"))); // NOI18N
        btnExit.setBorder(null);
        btnExit.setBorderPainted(false);
        btnExit.setContentAreaFilled(false);
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
        });
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit);
        btnExit.setBounds(110, 930, 160, 90);

        lblTrain.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTrain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/trainLabel.png"))); // NOI18N
        jPanel1.add(lblTrain);
        lblTrain.setBounds(40, 440, 80, 80);

        hstry.setFont(new java.awt.Font("Arial", 1, 64)); // NOI18N
        hstry.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hstry.setText("Travel History");
        hstry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hstryMouseClicked(evt);
            }
        });
        jPanel1.add(hstry);
        hstry.setBounds(850, 130, 500, 90);

        txt.setBackground(new java.awt.Color(195, 228, 232));
        txt.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txt.setForeground(new java.awt.Color(102, 102, 102));
        txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMouseClicked(evt);
            }
        });
        txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActionPerformed(evt);
            }
        });
        txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtKeyReleased(evt);
            }
        });
        jPanel1.add(txt);
        txt.setBounds(1200, 320, 490, 60);

        searchlabel.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        searchlabel.setText("Search Data:");
        jPanel1.add(searchlabel);
        searchlabel.setBounds(980, 330, 210, 42);

        jScrollPane2.setOpaque(false);

        Tablee.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Tablee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Date", "Passenger number", "Class", "Price", "No. of tickets"
            }
        ));
        Tablee.setOpaque(false);
        Tablee.setRowHeight(40);
        jScrollPane2.setViewportView(Tablee);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(480, 400, 1210, 500);

        mainolabelo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainolabelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/nik.png"))); // NOI18N
        mainolabelo.setMaximumSize(new java.awt.Dimension(1316, 890));
        mainolabelo.setMinimumSize(new java.awt.Dimension(1316, 890));
        mainolabelo.setPreferredSize(new java.awt.Dimension(1316, 890));
        jPanel1.add(mainolabelo);
        mainolabelo.setBounds(460, 100, 1400, 930);

        btnUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/userGreen.png"))); // NOI18N
        btnUser.setBorder(null);
        btnUser.setBorderPainted(false);
        btnUser.setContentAreaFilled(false);
        btnUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUserMouseEntered(evt);
            }
        });
        btnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserActionPerformed(evt);
            }
        });
        jPanel1.add(btnUser);
        btnUser.setBounds(100, 240, 160, 120);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1920, 1080);

        setSize(new java.awt.Dimension(1936, 1088));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTicketsActionPerformed
        // TODO add your handling code here:
        TicketButtonForm ob = new TicketButtonForm();
        ob.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnTicketsActionPerformed

    private void btnBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookingActionPerformed
        // TODO add your handling code here:
        BookingButtonForm b = new BookingButtonForm();
        b.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnBookingActionPerformed

    private void btnTrainMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrainMouseEntered
        // TODO add your handling code here:

        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        btnTrain.setCursor(cursor);


    }//GEN-LAST:event_btnTrainMouseEntered

    private void btnTrainMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrainMouseExited
        // TODO add your handling code here:
        btnTrain.setBackground(new java.awt.Color(42, 134, 251));
        btnTrain.setContentAreaFilled(false);

    }//GEN-LAST:event_btnTrainMouseExited

    private void btnBookingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBookingMouseEntered
        // TODO add your handling code here:
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        btnBooking.setCursor(cursor);

    }//GEN-LAST:event_btnBookingMouseEntered

    private void btnBookingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBookingMouseExited
        // TODO add your handling code here:

        btnBooking.setBackground(new java.awt.Color(42, 134, 251));
        btnBooking.setContentAreaFilled(false);
    }//GEN-LAST:event_btnBookingMouseExited

    private void btnTicketsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTicketsMouseEntered
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        btnTickets.setCursor(cursor);
    }//GEN-LAST:event_btnTicketsMouseEntered

    private void btnTicketsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTicketsMouseExited
        btnTickets.setBackground(new java.awt.Color(42, 134, 251));
        btnTickets.setContentAreaFilled(false);
    }//GEN-LAST:event_btnTicketsMouseExited

    private void btnTrainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrainActionPerformed
        // TODO add your handling code here:
        TrainButtonForm train = new TrainButtonForm();
        train.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnTrainActionPerformed

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        // TODO add your handling code here:
        this.dispose();


    }//GEN-LAST:event_btnExitMouseClicked

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        // TODO add your handling code here:
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        btnExit.setCursor(cursor);
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        login s = new login();
        s.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserActionPerformed

    }//GEN-LAST:event_btnUserActionPerformed

    private void btnUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserMouseEntered
        // TODO add your handling code here:
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        btnUser.setCursor(cursor);
    }//GEN-LAST:event_btnUserMouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        report s = new report();
        s.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_phonenumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_phonenumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_phonenumberActionPerformed

    private void txt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:

        String passengerName = txt_name.getText();
        String phoneNumber = txt_phonenumber.getText();
        String email = txt_email.getText();
        //        Assert.assertEquals("ram", passengerName);
//        Assert.assertEquals("9810", phoneNumber);
//        Assert.assertEquals("how@gmail.com", email);
//pass the data to the controller for further processing
        AddcustomerController controller = new AddcustomerController();
//        controller.initialize();
        controller.addCustomer(passengerName, phoneNumber, email);

    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewActionPerformed
        // TODO add your handling code here:
        passengerTable.setVisible(true);

        // Clear existing table data
        DefaultTableModel model = (DefaultTableModel) passengerTable.getModel();
        model.setRowCount(0);

        // Fetch data from the database and populate the table
        try {
          
            conn = MyConnection.dbConnect();

            java.sql.Statement stmt = conn.createStatement();
            String query = "SELECT * FROM customer";
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                String phoneNumber = rs.getString("Phonenumber");
                String customerName = rs.getString("customerName");
                String email = rs.getString("Email");
                int credit = rs.getInt("credit");

                System.out.println("Phone number" + phoneNumber);
                System.out.println("passenger name" + customerName);
                System.out.println("email" + email);
                System.out.println("meritPoints" + credit);
                // Add a new row to the table model
                model.addRow(new Object[]{phoneNumber, customerName, email, credit});
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: Failed to fetch data from the database");
        }

    }//GEN-LAST:event_btn_viewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        String phoneNumber = "";
        int selectedRow = passengerTable.getSelectedRow();
        if (selectedRow >= 0) {
            phoneNumber = (String) passengerTable.getValueAt(selectedRow, 0);

        }
        bookingController bc = new bookingController();
        bc.deleteCustomer(phoneNumber);

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void updateeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateeActionPerformed

        updatee.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));

        try {
            String USERNAME = txtuser.getText();
            String PASSWORD = txtpass.getText();
            String ANSWER = txtans.getText();

         
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/trackhub", "root", "cpktnwt");

            PreparedStatement ps = con.prepareStatement("UPDATE register SET PASSWORD = ?, ANSWER = ? WHERE USERNAME = ?");
            ps.setString(1, PASSWORD);
            ps.setString(2, ANSWER);
            ps.setString(3, USERNAME);
            int rowsUpdated = ps.executeUpdate();

            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(this, "Updated Successfully!");
            } else {
                JOptionPane.showMessageDialog(this, "Update Failed!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Database Error: " + ex.getMessage());
            Logger.getLogger(dashboard.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            Logger.getLogger(dashboard.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            updatee.setCursor(Cursor.getDefaultCursor());
        }


    }//GEN-LAST:event_updateeActionPerformed

    private void transsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transsActionPerformed
        mainolabelo.show();
        hstry.show();
        txt.show();
        Tablee.setVisible(true);
        searchlabel.show();
        jScrollPane2.show();
    }//GEN-LAST:event_transsActionPerformed

    private void hstryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hstryMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_hstryMouseClicked

    private void txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMouseClicked
        txt.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_txtMouseClicked

    private void txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtActionPerformed

    private void txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKeyReleased
        DefaultTableModel obj = (DefaultTableModel) Tablee.getModel();
        TableRowSorter<DefaultTableModel> obj1 = new TableRowSorter<>(obj);
        Tablee.setRowSorter(obj1);
        obj1.setRowFilter(RowFilter.regexFilter(txt.getText()));
    }//GEN-LAST:event_txtKeyReleased

    private void txtsecurityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsecurityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsecurityActionPerformed

    private void txtpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpassActionPerformed

    private void txtuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuserActionPerformed

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
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tablee;
    private javax.swing.JLabel anss;
    private javax.swing.JButton btnBooking;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnTickets;
    private javax.swing.JButton btnTrain;
    private javax.swing.JButton btnUser;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_view;
    private javax.swing.JLabel dashrectangleimg;
    private javax.swing.JLabel emaill;
    private javax.swing.JLabel hstry;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBooking;
    private javax.swing.JLabel lblTickets;
    private javax.swing.JLabel lblTrain;
    private javax.swing.JLabel mainolabelo;
    private javax.swing.JLabel pass;
    private javax.swing.JTable passengerTable;
    private javax.swing.JLabel searchlabel;
    private javax.swing.JLabel sec;
    private javax.swing.JLabel trackhubLabel;
    private javax.swing.JButton transs;
    private javax.swing.JTextField txt;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_phonenumber;
    private javax.swing.JTextField txtans;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtpass;
    private javax.swing.JTextField txtsecurity;
    private javax.swing.JTextField txtuser;
    private javax.swing.JButton updatee;
    private javax.swing.JLabel user;
    private javax.swing.JLabel userr;
    // End of variables declaration//GEN-END:variables
}
