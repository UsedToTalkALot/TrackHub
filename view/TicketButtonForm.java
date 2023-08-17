package view;

import controller.bookingController;
import controller.searchController;
//import DAO.DAO_PROJECT;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.print.PrinterException;

import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import java.util.Date;

import javax.swing.table.DefaultTableModel;

import model.TicketModelClass;
import controller.searchController;
import database.MyConnection;
import java.awt.Toolkit;
import java.util.Arrays;

//import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import view.BookingButtonForm;
import view.TicketPrint;
import view.TrainButtonForm;
import view.dashboard;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//import javax.swing.JButton;

public class TicketButtonForm extends javax.swing.JFrame {

//   private ArrayList<String> selectedSeats = new ArrayList<>();
//   Set<String> selectedSeats;
    TicketModelClass myModel;

    ArrayList<String> classA = new ArrayList<>(Arrays.asList("AC1", "AC2", "AC3", "AC4", "AC5", "AC6", "AC7", "AC8", "AC9", "AC10"));

//       TicketButtonForm myView;
    Connection conn = null;
//    Statement stm=null;
//    ResultSet rs=null;
    PreparedStatement pstmt = null;

    private int selectedSeatCount = 0;
    DefaultTableModel dtm = null;
//private TicketPrint ticketPrintForm;

    // Constructor and other methods
    // ActionListener for jButton1
//private String seatNumber0,seatNumber1;
    /**
     * Creates new form TicketButtonForm
     */
    private String priceA = "";
    private String priceB = "";
    private String mealA = "";
    private String mealB = "no meal";
    private String SelectedSeat = "";

    public TicketButtonForm() {

//        this.selectedSeats = new HashSet<>();
//       TicketModelClass myModel = new TicketModelClass();
        initComponents();
        lblSeat.setVisible(false);
        lblSeat1.setVisible(false);
        lblClassA.setVisible(false);
        lblClassB.setVisible(false);
        lblSeat.setVisible(false);
        A1.setVisible(false);
        A2.setVisible(false);
        A3.setVisible(false);
        A4.setVisible(false);
        A5.setVisible(false);
        A6.setVisible(false);
        B1.setVisible(false);
        B2.setVisible(false);
        B3.setVisible(false);
        B4.setVisible(false);
        B5.setVisible(false);
        B6.setVisible(false);
        A8.setVisible(false);
        B7.setVisible(false);
        B8.setVisible(false);
        C1.setVisible(false);
        C2.setVisible(false);
        C5.setVisible(false);
        C4.setVisible(false);
        A7.setVisible(false);
        C6.setVisible(false);
        C7.setVisible(false);
        C8.setVisible(false);
        D1.setVisible(false);
        D2.setVisible(false);
        D4.setVisible(false);
        C3.setVisible(false);
        D5.setVisible(false);
        D6.setVisible(false);
        D8.setVisible(false);
        D3.setVisible(false);
        D7.setVisible(false);
        AC1.setVisible(false);
        AC2.setVisible(false);
        AC3.setVisible(false);
        AC4.setVisible(false);
        AC5.setVisible(false);
        AC6.setVisible(false);
        AC8.setVisible(false);
        AC7.setVisible(false);
        AC10.setVisible(false);
        AC9.setVisible(false);


        setSize(1920, 1200);
        this.setLocationRelativeTo(null);
        
        setTitle("Trackhub: Ticket page");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/thulologo.png")));

    }
  

    public TicketModelClass getData() throws ParseException {
        String timeString = txtMeal.getText();
        DateFormat dateFormat = new SimpleDateFormat("H:mm");
        Date time = dateFormat.parse(timeString);

        int arrivalTime = Integer.parseInt(txtMeal.getText());
        int departureTime = Integer.parseInt(txtTime.getText());

        int phoneNumber = Integer.parseInt(txtPhoneNumber.getText());
        String seatNumber = (String) btnClassA.getText();

        String source = (String) txtRoute.getText();
        String destination = (String) txtTrain.getText();
        String train = (String) txtTrain.getText();

        Date datee = new Date();
        int ticketPrice = Integer.parseInt(txtTicketPrice.getText());
        int jbutton1 = Integer.parseInt(A1.getText());
        int jbutton2 = Integer.parseInt(A2.getText());
        int jbutton3 = Integer.parseInt(A3.getText());
        int jbutton4 = Integer.parseInt(A4.getText());
        int jbutton5 = Integer.parseInt(A5.getText());
        int jbutton6 = Integer.parseInt(A6.getText());
        int jbutton7 = Integer.parseInt(B1.getText());
        int jbutton8 = Integer.parseInt(B2.getText());
        int jbutton9 = Integer.parseInt(B3.getText());
        int jbutton10 = Integer.parseInt(B4.getText());
        int jbutton11 = Integer.parseInt(B5.getText());
        int jbutton12 = Integer.parseInt(B6.getText());
        int jbutton13 = Integer.parseInt(A8.getText());
        int jbutton14 = Integer.parseInt(B7.getText());
        int jbutton15 = Integer.parseInt(B8.getText());
        int jbutton16 = Integer.parseInt(C1.getText());
        int jbutton17 = Integer.parseInt(C2.getText());
        int jbutton18 = Integer.parseInt(C5.getText());
        int jbutton19 = Integer.parseInt(C4.getText());
        int jbutton20 = Integer.parseInt(A7.getText());
        int jbutton21 = Integer.parseInt(C6.getText());
        int jbutton22 = Integer.parseInt(C7.getText());
        int jbutton23 = Integer.parseInt(C8.getText());
        int jbutton24 = Integer.parseInt(D1.getText());
        int jbutton25 = Integer.parseInt(D2.getText());
        int jbutton26 = Integer.parseInt(D4.getText());
        int jbutton27 = Integer.parseInt(C3.getText());
        int jbutton28 = Integer.parseInt(D5.getText());
        int jbutton29 = Integer.parseInt(D6.getText());
        int jbutton30 = Integer.parseInt(D8.getText());
        int jbutton31 = Integer.parseInt(D3.getText());
        int jbutton32 = Integer.parseInt(D7.getText());
        int jbutton33 = Integer.parseInt(AC1.getText());
        int jbutton34 = Integer.parseInt(AC2.getText());
        int jbutton35 = Integer.parseInt(AC3.getText());
        int jbutton36 = Integer.parseInt(AC4.getText());
        int jbutton37 = Integer.parseInt(AC5.getText());
        int jbutton38 = Integer.parseInt(AC6.getText());
        int jbutton39 = Integer.parseInt(AC8.getText());
        int jbutton40 = Integer.parseInt(AC7.getText());
        int jbutton41 = Integer.parseInt(AC10.getText());
        int jbutton42 = Integer.parseInt(AC9.getText());
        String seatNumber2 = (String) btnClassB.getText();

        myModel = new TicketModelClass(arrivalTime, departureTime, phoneNumber, seatNumber, source, destination, train, datee, ticketPrice, jbutton1, jbutton2, jbutton3, jbutton4, jbutton5, jbutton6, jbutton7, jbutton8, jbutton9, jbutton10, jbutton11, jbutton12, jbutton13, jbutton14, jbutton15, jbutton16, jbutton17, jbutton18, jbutton19, jbutton20, jbutton21, jbutton22, jbutton23, jbutton24, jbutton25, jbutton26, jbutton27, jbutton28, jbutton29, jbutton30, jbutton31, jbutton32, seatNumber2, jbutton33, jbutton34, jbutton35, jbutton36, jbutton37, jbutton38, jbutton39, jbutton40, jbutton41, jbutton42);
        return myModel;

    }

    public void showMessageBox(String msg) {
        JOptionPane.showMessageDialog(this, msg);

    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtCode = new javax.swing.JTextField();
        search_btn3 = new javax.swing.JLabel();
        A1 = new javax.swing.JButton();
        A2 = new javax.swing.JButton();
        A3 = new javax.swing.JButton();
        A4 = new javax.swing.JButton();
        A5 = new javax.swing.JButton();
        A6 = new javax.swing.JButton();
        A7 = new javax.swing.JButton();
        A8 = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        lblBook = new javax.swing.JLabel();
        C1 = new javax.swing.JButton();
        C2 = new javax.swing.JButton();
        C3 = new javax.swing.JButton();
        C5 = new javax.swing.JButton();
        C4 = new javax.swing.JButton();
        C6 = new javax.swing.JButton();
        C7 = new javax.swing.JButton();
        C8 = new javax.swing.JButton();
        D1 = new javax.swing.JButton();
        D2 = new javax.swing.JButton();
        D4 = new javax.swing.JButton();
        D5 = new javax.swing.JButton();
        D6 = new javax.swing.JButton();
        D8 = new javax.swing.JButton();
        D3 = new javax.swing.JButton();
        D7 = new javax.swing.JButton();
        btnClassB = new javax.swing.JButton();
        lblClassA = new javax.swing.JLabel();
        btnClassA = new javax.swing.JButton();
        lblSeat = new javax.swing.JLabel();
        txtRoute = new javax.swing.JTextField();
        lblClassB = new javax.swing.JLabel();
        AC9 = new javax.swing.JButton();
        AC10 = new javax.swing.JButton();
        AC7 = new javax.swing.JButton();
        AC8 = new javax.swing.JButton();
        AC6 = new javax.swing.JButton();
        AC5 = new javax.swing.JButton();
        AC4 = new javax.swing.JButton();
        AC3 = new javax.swing.JButton();
        AC2 = new javax.swing.JButton();
        AC1 = new javax.swing.JButton();
        lblSeat1 = new javax.swing.JLabel();
        lblChooseClass = new javax.swing.JLabel();
        lblTrainNumber = new javax.swing.JLabel();
        btnGenerateTicket = new javax.swing.JButton();
        txtTicketPrice = new javax.swing.JTextField();
        txtMeal = new javax.swing.JTextField();
        lblSourceDestination = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        lblArrivalTime = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblDepartureTime = new javax.swing.JLabel();
        txtTrain = new javax.swing.JTextField();
        txtTime = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        lblPhoneNumber = new javax.swing.JLabel();
        lblTicketPrice = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        search_btn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblTrain = new javax.swing.JLabel();
        btnTrain = new javax.swing.JButton();
        lblBookings = new javax.swing.JLabel();
        btnBooking = new javax.swing.JButton();
        lblTicekts = new javax.swing.JLabel();
        btnTicekts = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lblTrains = new javax.swing.JLabel();
        btnUser = new javax.swing.JButton();
        lblGreenBlueFrame = new javax.swing.JLabel();
        txtDate1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTrain1 = new javax.swing.JTextField();
        lblTrainNumber1 = new javax.swing.JLabel();
        lblDate1 = new javax.swing.JLabel();
        search_btn1 = new javax.swing.JLabel();
        txtPhoneNumber1 = new javax.swing.JTextField();
        lblPhoneNumber1 = new javax.swing.JLabel();
        txtMeal1 = new javax.swing.JTextField();
        lblArrivalTime1 = new javax.swing.JLabel();
        txtRoute1 = new javax.swing.JTextField();
        lblSourceDestination1 = new javax.swing.JLabel();
        txtTicketPrice1 = new javax.swing.JTextField();
        lblTicketPrice1 = new javax.swing.JLabel();
        btnGenerateTicket1 = new javax.swing.JButton();
        btnReset1 = new javax.swing.JButton();
        txtTime1 = new javax.swing.JTextField();
        lblDepartureTime1 = new javax.swing.JLabel();
        btnClassA1 = new javax.swing.JButton();
        lblChooseClass1 = new javax.swing.JLabel();
        lblClassA1 = new javax.swing.JLabel();
        A9 = new javax.swing.JButton();
        lblSeat2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblClassB1 = new javax.swing.JLabel();
        btnClassB1 = new javax.swing.JButton();
        btnReset2 = new javax.swing.JButton();
        lblClassA2 = new javax.swing.JLabel();
        btnReset3 = new javax.swing.JButton();
        btnGenerateTicket2 = new javax.swing.JButton();
        txtDate2 = new javax.swing.JTextField();
        lblChooseClass2 = new javax.swing.JLabel();
        lblDepartureTime2 = new javax.swing.JLabel();
        lblSourceDestination2 = new javax.swing.JLabel();
        btnClassA2 = new javax.swing.JButton();
        btnClassB3 = new javax.swing.JButton();
        txtRoute2 = new javax.swing.JTextField();
        txtMeal2 = new javax.swing.JTextField();
        lblDate2 = new javax.swing.JLabel();
        lblChooseClass3 = new javax.swing.JLabel();
        search_btn2 = new javax.swing.JLabel();
        lblSeat3 = new javax.swing.JLabel();
        lblClassA3 = new javax.swing.JLabel();
        txtTime2 = new javax.swing.JTextField();
        lblPhoneNumber2 = new javax.swing.JLabel();
        txtPhoneNumber2 = new javax.swing.JTextField();
        lblClassB2 = new javax.swing.JLabel();
        lblSourceDestination3 = new javax.swing.JLabel();
        btnGenerateTicket3 = new javax.swing.JButton();
        txtTrain2 = new javax.swing.JTextField();
        txtTicketPrice2 = new javax.swing.JTextField();
        txtTicketPrice3 = new javax.swing.JTextField();
        lblClassB3 = new javax.swing.JLabel();
        lblArrivalTime2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblTrainNumber2 = new javax.swing.JLabel();
        lblTicketPrice2 = new javax.swing.JLabel();
        btnClassA3 = new javax.swing.JButton();
        txtMeal3 = new javax.swing.JTextField();
        lblTrainNumber3 = new javax.swing.JLabel();
        txtRoute3 = new javax.swing.JTextField();
        lblArrivalTime3 = new javax.swing.JLabel();
        txtDate3 = new javax.swing.JTextField();
        lblDate3 = new javax.swing.JLabel();
        lblDepartureTime3 = new javax.swing.JLabel();
        txtPhoneNumber3 = new javax.swing.JTextField();
        txtTrain3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1920, 1200));
        jPanel1.setMinimumSize(new java.awt.Dimension(1920, 1200));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1200));
        jPanel1.setLayout(null);

        txtCode.setBackground(new java.awt.Color(195, 228, 232));
        txtCode.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        txtCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodeActionPerformed(evt);
            }
        });
        jPanel1.add(txtCode);
        txtCode.setBounds(630, 810, 370, 50);

        search_btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ImageSearchButton.png"))); // NOI18N
        search_btn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search_btn3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                search_btn3MouseEntered(evt);
            }
        });
        jPanel1.add(search_btn3);
        search_btn3.setBounds(1070, 810, 93, 46);

        A1.setBackground(new java.awt.Color(102, 255, 102));
        A1.setText("  A1");
        A1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A1MouseClicked(evt);
            }
        });
        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ActionPerformed(evt);
            }
        });
        jPanel1.add(A1);
        A1.setBounds(1410, 580, 80, 40);

        A2.setBackground(new java.awt.Color(102, 255, 102));
        A2.setText("A2");
        A2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A2MouseClicked(evt);
            }
        });
        A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A2ActionPerformed(evt);
            }
        });
        jPanel1.add(A2);
        A2.setBounds(1490, 580, 80, 40);

        A3.setBackground(new java.awt.Color(102, 255, 102));
        A3.setText("A3");
        A3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A3MouseClicked(evt);
            }
        });
        A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A3ActionPerformed(evt);
            }
        });
        jPanel1.add(A3);
        A3.setBounds(1410, 640, 80, 40);

        A4.setBackground(new java.awt.Color(102, 255, 102));
        A4.setText("A4");
        A4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A4ActionPerformed(evt);
            }
        });
        jPanel1.add(A4);
        A4.setBounds(1490, 640, 80, 40);

        A5.setBackground(new java.awt.Color(102, 255, 102));
        A5.setText("A5");
        A5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A5ActionPerformed(evt);
            }
        });
        jPanel1.add(A5);
        A5.setBounds(1410, 700, 80, 40);

        A6.setBackground(new java.awt.Color(102, 255, 102));
        A6.setText("A6");
        A6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A6ActionPerformed(evt);
            }
        });
        jPanel1.add(A6);
        A6.setBounds(1490, 700, 80, 40);

        A7.setBackground(new java.awt.Color(102, 255, 102));
        A7.setText("A7");
        A7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A7MouseClicked(evt);
            }
        });
        A7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A7ActionPerformed(evt);
            }
        });
        jPanel1.add(A7);
        A7.setBounds(1410, 760, 80, 40);

        A8.setBackground(new java.awt.Color(102, 255, 102));
        A8.setText("A8");
        A8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A8MouseClicked(evt);
            }
        });
        A8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A8ActionPerformed(evt);
            }
        });
        jPanel1.add(A8);
        A8.setBounds(1490, 760, 80, 40);

        btnReset.setBackground(new java.awt.Color(5, 77, 170));
        btnReset.setFont(new java.awt.Font("Georgia", 1, 21)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("RESET");
        btnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnResetMouseEntered(evt);
            }
        });
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel1.add(btnReset);
        btnReset.setBounds(870, 590, 230, 50);

        B6.setBackground(new java.awt.Color(102, 255, 102));
        B6.setText("B6");
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });
        jPanel1.add(B6);
        B6.setBounds(1760, 700, 80, 40);

        B5.setBackground(new java.awt.Color(102, 255, 102));
        B5.setText("B5");
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });
        jPanel1.add(B5);
        B5.setBounds(1680, 700, 80, 40);

        B4.setBackground(new java.awt.Color(102, 255, 102));
        B4.setText("B4");
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });
        jPanel1.add(B4);
        B4.setBounds(1760, 640, 80, 40);

        B3.setBackground(new java.awt.Color(102, 255, 102));
        B3.setText("B3");
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });
        jPanel1.add(B3);
        B3.setBounds(1680, 640, 80, 40);

        B2.setBackground(new java.awt.Color(102, 255, 102));
        B2.setText("B2");
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });
        jPanel1.add(B2);
        B2.setBounds(1760, 580, 80, 40);

        B1.setBackground(new java.awt.Color(102, 255, 102));
        B1.setText("B1");
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });
        jPanel1.add(B1);
        B1.setBounds(1680, 580, 80, 40);

        B7.setBackground(new java.awt.Color(102, 255, 102));
        B7.setText("B7");
        B7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B7MouseClicked(evt);
            }
        });
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });
        jPanel1.add(B7);
        B7.setBounds(1680, 760, 80, 40);

        B8.setBackground(new java.awt.Color(102, 255, 102));
        B8.setText("B8");
        B8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B8MouseClicked(evt);
            }
        });
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });
        jPanel1.add(B8);
        B8.setBounds(1760, 760, 80, 40);

        lblBook.setFont(new java.awt.Font("Arial", 1, 27)); // NOI18N
        lblBook.setText("Booking Code?");
        jPanel1.add(lblBook);
        lblBook.setBounds(740, 740, 220, 30);

        C1.setBackground(new java.awt.Color(102, 255, 102));
        C1.setText("C1");
        C1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C1MouseClicked(evt);
            }
        });
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });
        jPanel1.add(C1);
        C1.setBounds(1410, 840, 80, 40);

        C2.setBackground(new java.awt.Color(102, 255, 102));
        C2.setText("C2");
        C2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C2MouseClicked(evt);
            }
        });
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });
        jPanel1.add(C2);
        C2.setBounds(1490, 840, 80, 40);

        C3.setBackground(new java.awt.Color(102, 255, 102));
        C3.setText("C3");
        C3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C3MouseClicked(evt);
            }
        });
        C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3ActionPerformed(evt);
            }
        });
        jPanel1.add(C3);
        C3.setBounds(1410, 900, 80, 40);

        C5.setBackground(new java.awt.Color(102, 255, 102));
        C5.setText("C5");
        C5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C5MouseClicked(evt);
            }
        });
        C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C5ActionPerformed(evt);
            }
        });
        jPanel1.add(C5);
        C5.setBounds(1410, 960, 80, 40);

        C4.setBackground(new java.awt.Color(102, 255, 102));
        C4.setText("C4");
        C4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C4MouseClicked(evt);
            }
        });
        C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C4ActionPerformed(evt);
            }
        });
        jPanel1.add(C4);
        C4.setBounds(1490, 900, 80, 40);

        C6.setBackground(new java.awt.Color(102, 255, 102));
        C6.setText("C6");
        C6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C6MouseClicked(evt);
            }
        });
        C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C6ActionPerformed(evt);
            }
        });
        jPanel1.add(C6);
        C6.setBounds(1490, 960, 80, 40);

        C7.setBackground(new java.awt.Color(102, 255, 102));
        C7.setText("C7");
        C7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C7MouseClicked(evt);
            }
        });
        C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C7ActionPerformed(evt);
            }
        });
        jPanel1.add(C7);
        C7.setBounds(1410, 1020, 80, 40);

        C8.setBackground(new java.awt.Color(102, 255, 102));
        C8.setText("C8");
        C8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C8MouseClicked(evt);
            }
        });
        C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C8ActionPerformed(evt);
            }
        });
        jPanel1.add(C8);
        C8.setBounds(1490, 1020, 80, 40);

        D1.setBackground(new java.awt.Color(102, 255, 102));
        D1.setText("D1");
        D1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D1MouseClicked(evt);
            }
        });
        D1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D1ActionPerformed(evt);
            }
        });
        jPanel1.add(D1);
        D1.setBounds(1680, 840, 80, 40);

        D2.setBackground(new java.awt.Color(102, 255, 102));
        D2.setText("D2");
        D2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D2MouseClicked(evt);
            }
        });
        D2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D2ActionPerformed(evt);
            }
        });
        jPanel1.add(D2);
        D2.setBounds(1760, 840, 80, 40);

        D4.setBackground(new java.awt.Color(102, 255, 102));
        D4.setText("D4");
        D4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D4MouseClicked(evt);
            }
        });
        D4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D4ActionPerformed(evt);
            }
        });
        jPanel1.add(D4);
        D4.setBounds(1760, 900, 80, 40);

        D5.setBackground(new java.awt.Color(102, 255, 102));
        D5.setText("D5");
        D5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D5MouseClicked(evt);
            }
        });
        D5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D5ActionPerformed(evt);
            }
        });
        jPanel1.add(D5);
        D5.setBounds(1680, 960, 80, 40);

        D6.setBackground(new java.awt.Color(102, 255, 102));
        D6.setText("D6");
        D6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D6MouseClicked(evt);
            }
        });
        D6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D6ActionPerformed(evt);
            }
        });
        jPanel1.add(D6);
        D6.setBounds(1760, 960, 80, 40);

        D8.setBackground(new java.awt.Color(102, 255, 102));
        D8.setText("D8");
        D8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D8MouseClicked(evt);
            }
        });
        D8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D8ActionPerformed(evt);
            }
        });
        jPanel1.add(D8);
        D8.setBounds(1760, 1020, 80, 40);

        D3.setBackground(new java.awt.Color(102, 255, 102));
        D3.setText("D3");
        D3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D3MouseClicked(evt);
            }
        });
        D3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D3ActionPerformed(evt);
            }
        });
        jPanel1.add(D3);
        D3.setBounds(1680, 900, 80, 40);

        D7.setBackground(new java.awt.Color(102, 255, 102));
        D7.setText("D7");
        D7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D7MouseClicked(evt);
            }
        });
        D7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D7ActionPerformed(evt);
            }
        });
        jPanel1.add(D7);
        D7.setBounds(1680, 1020, 80, 40);

        btnClassB.setBackground(new java.awt.Color(51, 102, 255));
        btnClassB.setFont(new java.awt.Font("Georgia", 0, 20)); // NOI18N
        btnClassB.setText("Class B");
        btnClassB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClassBMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClassBMouseEntered(evt);
            }
        });
        btnClassB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClassBActionPerformed(evt);
            }
        });
        jPanel1.add(btnClassB);
        btnClassB.setBounds(1630, 320, 130, 40);

        lblClassA.setFont(new java.awt.Font("Arial", 1, 27)); // NOI18N
        lblClassA.setText("Class B");
        jPanel1.add(lblClassA);
        lblClassA.setBounds(1570, 520, 120, 30);

        btnClassA.setBackground(new java.awt.Color(51, 102, 255));
        btnClassA.setFont(new java.awt.Font("Georgia", 0, 20)); // NOI18N
        btnClassA.setText("Class A");
        btnClassA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClassAMouseEntered(evt);
            }
        });
        btnClassA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClassAActionPerformed(evt);
            }
        });
        jPanel1.add(btnClassA);
        btnClassA.setBounds(1440, 320, 130, 40);

        lblSeat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/seatrec.png"))); // NOI18N
        jPanel1.add(lblSeat);
        lblSeat.setBounds(1370, 460, 500, 640);

        txtRoute.setEditable(false);
        txtRoute.setBackground(new java.awt.Color(195, 228, 232));
        txtRoute.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        txtRoute.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtRoute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRouteActionPerformed(evt);
            }
        });
        jPanel1.add(txtRoute);
        txtRoute.setBounds(550, 510, 230, 50);

        lblClassB.setFont(new java.awt.Font("Arial", 1, 27)); // NOI18N
        lblClassB.setText("Class A");
        jPanel1.add(lblClassB);
        lblClassB.setBounds(1550, 520, 120, 30);

        AC9.setBackground(new java.awt.Color(102, 255, 102));
        AC9.setText("AC9");
        AC9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AC9MouseClicked(evt);
            }
        });
        AC9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AC9ActionPerformed(evt);
            }
        });
        jPanel1.add(AC9);
        AC9.setBounds(1420, 1000, 100, 50);

        AC10.setBackground(new java.awt.Color(102, 255, 102));
        AC10.setText("AC10");
        AC10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AC10MouseClicked(evt);
            }
        });
        AC10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AC10ActionPerformed(evt);
            }
        });
        jPanel1.add(AC10);
        AC10.setBounds(1720, 1000, 100, 50);

        AC7.setBackground(new java.awt.Color(102, 255, 102));
        AC7.setText("AC7");
        AC7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AC7MouseClicked(evt);
            }
        });
        AC7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AC7ActionPerformed(evt);
            }
        });
        jPanel1.add(AC7);
        AC7.setBounds(1420, 900, 100, 50);

        AC8.setBackground(new java.awt.Color(102, 255, 102));
        AC8.setText("AC8");
        AC8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AC8MouseClicked(evt);
            }
        });
        AC8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AC8ActionPerformed(evt);
            }
        });
        jPanel1.add(AC8);
        AC8.setBounds(1720, 900, 100, 50);

        AC6.setBackground(new java.awt.Color(102, 255, 102));
        AC6.setText("AC6");
        AC6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AC6MouseClicked(evt);
            }
        });
        AC6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AC6ActionPerformed(evt);
            }
        });
        jPanel1.add(AC6);
        AC6.setBounds(1720, 790, 100, 50);

        AC5.setBackground(new java.awt.Color(102, 255, 102));
        AC5.setText("AC5");
        AC5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AC5MouseClicked(evt);
            }
        });
        AC5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AC5ActionPerformed(evt);
            }
        });
        jPanel1.add(AC5);
        AC5.setBounds(1420, 790, 100, 50);

        AC4.setBackground(new java.awt.Color(102, 255, 102));
        AC4.setText("AC4");
        AC4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AC4MouseClicked(evt);
            }
        });
        AC4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AC4ActionPerformed(evt);
            }
        });
        jPanel1.add(AC4);
        AC4.setBounds(1720, 680, 100, 50);

        AC3.setBackground(new java.awt.Color(102, 255, 102));
        AC3.setText("AC3");
        AC3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AC3MouseClicked(evt);
            }
        });
        AC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AC3ActionPerformed(evt);
            }
        });
        jPanel1.add(AC3);
        AC3.setBounds(1420, 680, 100, 50);

        AC2.setBackground(new java.awt.Color(102, 255, 102));
        AC2.setText("AC2");
        AC2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AC2MouseClicked(evt);
            }
        });
        AC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AC2ActionPerformed(evt);
            }
        });
        jPanel1.add(AC2);
        AC2.setBounds(1720, 580, 100, 50);

        AC1.setBackground(new java.awt.Color(102, 255, 102));
        AC1.setText("AC1");
        AC1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AC1MouseClicked(evt);
            }
        });
        AC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AC1ActionPerformed(evt);
            }
        });
        jPanel1.add(AC1);
        AC1.setBounds(1420, 580, 100, 50);

        lblSeat1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/seatrec.png"))); // NOI18N
        jPanel1.add(lblSeat1);
        lblSeat1.setBounds(1370, 460, 500, 640);

        lblChooseClass.setFont(new java.awt.Font("Georgia", 0, 27)); // NOI18N
        lblChooseClass.setText("Choose Class");
        jPanel1.add(lblChooseClass);
        lblChooseClass.setBounds(1430, 260, 180, 31);

        lblTrainNumber.setFont(new java.awt.Font("Georgia", 0, 27)); // NOI18N
        lblTrainNumber.setText("Train");
        jPanel1.add(lblTrainNumber);
        lblTrainNumber.setBounds(890, 150, 70, 40);

        btnGenerateTicket.setBackground(new java.awt.Color(5, 77, 170));
        btnGenerateTicket.setFont(new java.awt.Font("Georgia", 1, 21)); // NOI18N
        btnGenerateTicket.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerateTicket.setText("GENERATE TICKET");
        btnGenerateTicket.setBorder(null);
        btnGenerateTicket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGenerateTicketMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGenerateTicketMouseEntered(evt);
            }
        });
        btnGenerateTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateTicketActionPerformed(evt);
            }
        });
        jPanel1.add(btnGenerateTicket);
        btnGenerateTicket.setBounds(600, 590, 230, 50);

        txtTicketPrice.setEditable(false);
        txtTicketPrice.setBackground(new java.awt.Color(195, 228, 232));
        txtTicketPrice.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        txtTicketPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtTicketPrice);
        txtTicketPrice.setBounds(890, 510, 230, 50);

        txtMeal.setEditable(false);
        txtMeal.setBackground(new java.awt.Color(195, 228, 232));
        txtMeal.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        txtMeal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtMeal);
        txtMeal.setBounds(890, 360, 230, 50);

        lblSourceDestination.setFont(new java.awt.Font("Georgia", 0, 27)); // NOI18N
        lblSourceDestination.setText("Route");
        jPanel1.add(lblSourceDestination);
        lblSourceDestination.setBounds(550, 470, 240, 31);

        txtDate.setBackground(new java.awt.Color(195, 228, 232));
        txtDate.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        txtDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });
        jPanel1.add(txtDate);
        txtDate.setBounds(550, 200, 230, 50);

        lblArrivalTime.setFont(new java.awt.Font("Georgia", 0, 27)); // NOI18N
        lblArrivalTime.setText("Meal");
        jPanel1.add(lblArrivalTime);
        lblArrivalTime.setBounds(890, 320, 160, 31);

        lblDate.setFont(new java.awt.Font("Georgia", 0, 27)); // NOI18N
        lblDate.setText("Date");
        jPanel1.add(lblDate);
        lblDate.setBounds(550, 160, 70, 30);

        lblDepartureTime.setFont(new java.awt.Font("Georgia", 0, 27)); // NOI18N
        lblDepartureTime.setText("Time");
        jPanel1.add(lblDepartureTime);
        lblDepartureTime.setBounds(1430, 120, 200, 31);

        txtTrain.setBackground(new java.awt.Color(195, 228, 232));
        txtTrain.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        txtTrain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTrain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTrainActionPerformed(evt);
            }
        });
        jPanel1.add(txtTrain);
        txtTrain.setBounds(890, 200, 230, 50);

        txtTime.setEditable(false);
        txtTime.setBackground(new java.awt.Color(195, 228, 232));
        txtTime.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        txtTime.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimeActionPerformed(evt);
            }
        });
        jPanel1.add(txtTime);
        txtTime.setBounds(1430, 160, 230, 50);

        txtPhoneNumber.setBackground(new java.awt.Color(195, 228, 232));
        txtPhoneNumber.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        txtPhoneNumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumberActionPerformed(evt);
            }
        });
        jPanel1.add(txtPhoneNumber);
        txtPhoneNumber.setBounds(550, 370, 230, 50);

        lblPhoneNumber.setFont(new java.awt.Font("Georgia", 0, 27)); // NOI18N
        lblPhoneNumber.setText("Phone Number");
        jPanel1.add(lblPhoneNumber);
        lblPhoneNumber.setBounds(550, 330, 190, 30);

        lblTicketPrice.setFont(new java.awt.Font("Georgia", 0, 27)); // NOI18N
        lblTicketPrice.setText("Ticket Price");
        jPanel1.add(lblTicketPrice);
        lblTicketPrice.setBounds(890, 470, 140, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 61.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(480, 720, 781, 209);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 16.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(1370, 50, 482, 357);

        search_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ImageSearchButton.png"))); // NOI18N
        search_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                search_btnMouseEntered(evt);
            }
        });
        jPanel1.add(search_btn);
        search_btn.setBounds(1140, 200, 93, 46);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 15.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(480, 60, 781, 650);

        lblTrain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Frame.png"))); // NOI18N
        jPanel1.add(lblTrain);
        lblTrain.setBounds(60, 40, 260, 140);

        btnTrain.setBackground(new java.awt.Color(42, 134, 251));
        btnTrain.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        btnTrain.setForeground(new java.awt.Color(5, 51, 111));
        btnTrain.setText("TRAINS");
        btnTrain.setBorder(null);
        btnTrain.setBorderPainted(false);
        btnTrain.setContentAreaFilled(false);
        btnTrain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTrainMouseClicked(evt);
            }
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
        btnTrain.setBounds(130, 460, 130, 60);

        lblBookings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tabler_brand-booking (1).png"))); // NOI18N
        jPanel1.add(lblBookings);
        lblBookings.setBounds(40, 620, 80, 80);

        btnBooking.setBackground(new java.awt.Color(42, 134, 251));
        btnBooking.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        btnBooking.setForeground(new java.awt.Color(5, 51, 100));
        btnBooking.setText("BOOKING");
        btnBooking.setBorder(null);
        btnBooking.setBorderPainted(false);
        btnBooking.setContentAreaFilled(false);
        btnBooking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBookingMouseClicked(evt);
            }
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
        btnBooking.setBounds(130, 630, 160, 60);

        lblTicekts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ticketsGreen.png"))); // NOI18N
        jPanel1.add(lblTicekts);
        lblTicekts.setBounds(45, 790, 80, 80);

        btnTicekts.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        btnTicekts.setForeground(new java.awt.Color(5, 51, 100));
        btnTicekts.setText("TICKETS");
        btnTicekts.setBorder(null);
        btnTicekts.setBorderPainted(false);
        btnTicekts.setContentAreaFilled(false);
        btnTicekts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTicektsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTicektsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTicektsMouseExited(evt);
            }
        });
        btnTicekts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTicektsActionPerformed(evt);
            }
        });
        jPanel1.add(btnTicekts);
        btnTicekts.setBounds(140, 810, 140, 50);

        btnExit.setBackground(new java.awt.Color(42, 134, 251));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/material-symbols_logout-rounded.png"))); // NOI18N
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
        jPanel1.add(btnExit);
        btnExit.setBounds(130, 960, 120, 90);

        lblTrains.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/trainLabel.png"))); // NOI18N
        jPanel1.add(lblTrains);
        lblTrains.setBounds(40, 450, 80, 80);

        btnUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/c.png"))); // NOI18N
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
        btnUser.setBounds(130, 250, 130, 110);

        lblGreenBlueFrame.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGreenBlueFrame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BlueGreen.png"))); // NOI18N
        lblGreenBlueFrame.setAlignmentY(0.0F);
        lblGreenBlueFrame.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblGreenBlueFrame);
        lblGreenBlueFrame.setBounds(380, -20, 1554, 1130);

        txtDate1.setBackground(new java.awt.Color(195, 228, 232));
        txtDate1.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        txtDate1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDate1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtDate1);
        txtDate1.setBounds(550, 200, 230, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 15.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(480, 60, 781, 650);

        txtTrain1.setBackground(new java.awt.Color(195, 228, 232));
        txtTrain1.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        txtTrain1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTrain1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTrain1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtTrain1);
        txtTrain1.setBounds(890, 200, 230, 50);

        lblTrainNumber1.setFont(new java.awt.Font("Georgia", 0, 27)); // NOI18N
        lblTrainNumber1.setText("Train");
        jPanel1.add(lblTrainNumber1);
        lblTrainNumber1.setBounds(890, 150, 70, 40);

        lblDate1.setFont(new java.awt.Font("Georgia", 0, 27)); // NOI18N
        lblDate1.setText("Date");
        jPanel1.add(lblDate1);
        lblDate1.setBounds(550, 160, 70, 30);

        search_btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search_btn1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                search_btn1MouseEntered(evt);
            }
        });
        jPanel1.add(search_btn1);
        search_btn1.setBounds(1140, 200, 93, 46);

        txtPhoneNumber1.setBackground(new java.awt.Color(195, 228, 232));
        txtPhoneNumber1.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        txtPhoneNumber1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtPhoneNumber1);
        txtPhoneNumber1.setBounds(550, 370, 230, 50);

        lblPhoneNumber1.setFont(new java.awt.Font("Georgia", 0, 27)); // NOI18N
        lblPhoneNumber1.setText("Phone Number");
        jPanel1.add(lblPhoneNumber1);
        lblPhoneNumber1.setBounds(550, 330, 190, 30);

        txtMeal1.setEditable(false);
        txtMeal1.setBackground(new java.awt.Color(195, 228, 232));
        txtMeal1.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        txtMeal1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtMeal1);
        txtMeal1.setBounds(890, 360, 230, 50);

        lblArrivalTime1.setFont(new java.awt.Font("Georgia", 0, 27)); // NOI18N
        lblArrivalTime1.setText("Meal");
        jPanel1.add(lblArrivalTime1);
        lblArrivalTime1.setBounds(890, 320, 160, 31);

        txtRoute1.setEditable(false);
        txtRoute1.setBackground(new java.awt.Color(195, 228, 232));
        txtRoute1.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        txtRoute1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtRoute1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRoute1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtRoute1);
        txtRoute1.setBounds(550, 510, 230, 50);

        lblSourceDestination1.setFont(new java.awt.Font("Georgia", 0, 27)); // NOI18N
        lblSourceDestination1.setText("Route");
        jPanel1.add(lblSourceDestination1);
        lblSourceDestination1.setBounds(550, 470, 240, 31);

        txtTicketPrice1.setEditable(false);
        txtTicketPrice1.setBackground(new java.awt.Color(195, 228, 232));
        txtTicketPrice1.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        txtTicketPrice1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtTicketPrice1);
        txtTicketPrice1.setBounds(890, 510, 230, 50);

        lblTicketPrice1.setFont(new java.awt.Font("Georgia", 0, 27)); // NOI18N
        lblTicketPrice1.setText("Ticket Price");
        jPanel1.add(lblTicketPrice1);
        lblTicketPrice1.setBounds(890, 470, 140, 30);

        btnGenerateTicket1.setBackground(new java.awt.Color(5, 77, 170));
        btnGenerateTicket1.setFont(new java.awt.Font("Georgia", 1, 21)); // NOI18N
        btnGenerateTicket1.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerateTicket1.setText("GENERATE TICKET");
        btnGenerateTicket1.setBorder(null);
        btnGenerateTicket1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGenerateTicket1MouseClicked(evt);
            }
        });
        btnGenerateTicket1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateTicket1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnGenerateTicket1);
        btnGenerateTicket1.setBounds(600, 590, 230, 50);

        btnReset1.setBackground(new java.awt.Color(5, 77, 170));
        btnReset1.setFont(new java.awt.Font("Georgia", 1, 21)); // NOI18N
        btnReset1.setForeground(new java.awt.Color(255, 255, 255));
        btnReset1.setText("RESET");
        btnReset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnReset1);
        btnReset1.setBounds(870, 590, 230, 50);

        txtTime1.setEditable(false);
        txtTime1.setBackground(new java.awt.Color(195, 228, 232));
        txtTime1.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        txtTime1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTime1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTime1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtTime1);
        txtTime1.setBounds(1430, 160, 230, 50);

        lblDepartureTime1.setFont(new java.awt.Font("Georgia", 0, 27)); // NOI18N
        lblDepartureTime1.setText("Time");
        jPanel1.add(lblDepartureTime1);
        lblDepartureTime1.setBounds(1430, 120, 200, 31);

        btnClassA1.setBackground(new java.awt.Color(51, 102, 255));
        btnClassA1.setFont(new java.awt.Font("Georgia", 0, 20)); // NOI18N
        btnClassA1.setText("Class A");
        btnClassA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClassA1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnClassA1);
        btnClassA1.setBounds(1440, 320, 130, 40);

        lblChooseClass1.setFont(new java.awt.Font("Georgia", 0, 27)); // NOI18N
        lblChooseClass1.setText("Choose Class");
        jPanel1.add(lblChooseClass1);
        lblChooseClass1.setBounds(1430, 260, 180, 31);

        lblClassA1.setFont(new java.awt.Font("Arial", 1, 27)); // NOI18N
        lblClassA1.setText("Class B");
        jPanel1.add(lblClassA1);
        lblClassA1.setBounds(1570, 520, 120, 30);

        A9.setBackground(new java.awt.Color(102, 255, 102));
        A9.setText("  A1");
        A9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A9MouseClicked(evt);
            }
        });
        A9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A9ActionPerformed(evt);
            }
        });
        jPanel1.add(A9);
        A9.setBounds(1410, 580, 80, 40);

        lblSeat2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/seatrec.png"))); // NOI18N
        jPanel1.add(lblSeat2);
        lblSeat2.setBounds(1370, 460, 500, 640);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 16.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(1370, 50, 482, 357);

        lblClassB1.setFont(new java.awt.Font("Arial", 1, 27)); // NOI18N
        lblClassB1.setText("Class A");
        jPanel1.add(lblClassB1);
        lblClassB1.setBounds(1550, 520, 120, 30);

        btnClassB1.setBackground(new java.awt.Color(51, 102, 255));
        btnClassB1.setFont(new java.awt.Font("Georgia", 0, 20)); // NOI18N
        btnClassB1.setText("Class B");
        btnClassB1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClassB1MouseClicked(evt);
            }
        });
        btnClassB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClassB1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnClassB1);
        btnClassB1.setBounds(1630, 320, 130, 40);

        btnReset2.setBackground(new java.awt.Color(5, 77, 170));
        btnReset2.setFont(new java.awt.Font("Georgia", 1, 21)); // NOI18N
        btnReset2.setForeground(new java.awt.Color(255, 255, 255));
        btnReset2.setText("RESET");
        btnReset2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnReset2);
        btnReset2.setBounds(870, 590, 230, 50);

        lblClassA2.setFont(new java.awt.Font("Arial", 1, 27)); // NOI18N
        lblClassA2.setText("Class B");
        jPanel1.add(lblClassA2);
        lblClassA2.setBounds(1570, 520, 120, 30);

        btnReset3.setBackground(new java.awt.Color(5, 77, 170));
        btnReset3.setFont(new java.awt.Font("Georgia", 1, 21)); // NOI18N
        btnReset3.setForeground(new java.awt.Color(255, 255, 255));
        btnReset3.setText("RESET");
        btnReset3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnReset3);
        btnReset3.setBounds(870, 590, 230, 50);

        btnGenerateTicket2.setBackground(new java.awt.Color(5, 77, 170));
        btnGenerateTicket2.setFont(new java.awt.Font("Georgia", 1, 21)); // NOI18N
        btnGenerateTicket2.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerateTicket2.setText("GENERATE TICKET");
        btnGenerateTicket2.setBorder(null);
        btnGenerateTicket2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGenerateTicket2MouseClicked(evt);
            }
        });
        btnGenerateTicket2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateTicket2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnGenerateTicket2);
        btnGenerateTicket2.setBounds(600, 590, 230, 50);

        txtDate2.setBackground(new java.awt.Color(195, 228, 232));
        txtDate2.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        txtDate2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDate2ActionPerformed(evt);
            }
        });
        jPanel1.add(txtDate2);
        txtDate2.setBounds(550, 200, 230, 50);

        lblChooseClass2.setFont(new java.awt.Font("Georgia", 0, 27)); // NOI18N
        lblChooseClass2.setText("Choose Class");
        jPanel1.add(lblChooseClass2);
        lblChooseClass2.setBounds(1430, 260, 180, 31);

        lblDepartureTime2.setFont(new java.awt.Font("Georgia", 0, 27)); // NOI18N
        lblDepartureTime2.setText("Time");
        jPanel1.add(lblDepartureTime2);
        lblDepartureTime2.setBounds(1430, 120, 200, 31);

        lblSourceDestination2.setFont(new java.awt.Font("Georgia", 0, 27)); // NOI18N
        lblSourceDestination2.setText("Route");
        jPanel1.add(lblSourceDestination2);
        lblSourceDestination2.setBounds(550, 470, 240, 31);

        btnClassA2.setBackground(new java.awt.Color(51, 102, 255));
        btnClassA2.setFont(new java.awt.Font("Georgia", 0, 20)); // NOI18N
        btnClassA2.setText("Class A");
        btnClassA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClassA2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnClassA2);
        btnClassA2.setBounds(1440, 320, 130, 40);

        btnClassB3.setBackground(new java.awt.Color(51, 102, 255));
        btnClassB3.setFont(new java.awt.Font("Georgia", 0, 20)); // NOI18N
        btnClassB3.setText("Class B");
        btnClassB3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClassB3MouseClicked(evt);
            }
        });
        btnClassB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClassB3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnClassB3);
        btnClassB3.setBounds(1630, 320, 130, 40);

        txtRoute2.setEditable(false);
        txtRoute2.setBackground(new java.awt.Color(195, 228, 232));
        txtRoute2.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        txtRoute2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtRoute2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRoute2ActionPerformed(evt);
            }
        });
        jPanel1.add(txtRoute2);
        txtRoute2.setBounds(550, 510, 230, 50);

        txtMeal2.setEditable(false);
        txtMeal2.setBackground(new java.awt.Color(195, 228, 232));
        txtMeal2.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        txtMeal2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtMeal2);
        txtMeal2.setBounds(890, 360, 230, 50);

        lblDate2.setFont(new java.awt.Font("Georgia", 0, 27)); // NOI18N
        lblDate2.setText("Date");
        jPanel1.add(lblDate2);
        lblDate2.setBounds(550, 160, 70, 30);

        lblChooseClass3.setFont(new java.awt.Font("Georgia", 0, 27)); // NOI18N
        lblChooseClass3.setText("Choose Class");
        jPanel1.add(lblChooseClass3);
        lblChooseClass3.setBounds(1430, 260, 180, 31);

        search_btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search_btn2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                search_btn2MouseEntered(evt);
            }
        });
        jPanel1.add(search_btn2);
        search_btn2.setBounds(1140, 200, 93, 46);

        lblSeat3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/seatrec.png"))); // NOI18N
        jPanel1.add(lblSeat3);
        lblSeat3.setBounds(1370, 460, 500, 640);

        lblClassA3.setFont(new java.awt.Font("Arial", 1, 27)); // NOI18N
        lblClassA3.setText("Class B");
        jPanel1.add(lblClassA3);
        lblClassA3.setBounds(1570, 520, 120, 30);

        txtTime2.setEditable(false);
        txtTime2.setBackground(new java.awt.Color(195, 228, 232));
        txtTime2.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        txtTime2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTime2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTime2ActionPerformed(evt);
            }
        });
        jPanel1.add(txtTime2);
        txtTime2.setBounds(1430, 160, 230, 50);

        lblPhoneNumber2.setFont(new java.awt.Font("Georgia", 0, 27)); // NOI18N
        lblPhoneNumber2.setText("Phone Number");
        jPanel1.add(lblPhoneNumber2);
        lblPhoneNumber2.setBounds(550, 330, 190, 30);

        txtPhoneNumber2.setBackground(new java.awt.Color(195, 228, 232));
        txtPhoneNumber2.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        txtPhoneNumber2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtPhoneNumber2);
        txtPhoneNumber2.setBounds(550, 370, 230, 50);

        lblClassB2.setFont(new java.awt.Font("Arial", 1, 27)); // NOI18N
        lblClassB2.setText("Class A");
        jPanel1.add(lblClassB2);
        lblClassB2.setBounds(1550, 520, 120, 30);

        lblSourceDestination3.setFont(new java.awt.Font("Georgia", 0, 27)); // NOI18N
        lblSourceDestination3.setText("Route");
        jPanel1.add(lblSourceDestination3);
        lblSourceDestination3.setBounds(550, 470, 240, 31);

        btnGenerateTicket3.setBackground(new java.awt.Color(5, 77, 170));
        btnGenerateTicket3.setFont(new java.awt.Font("Georgia", 1, 21)); // NOI18N
        btnGenerateTicket3.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerateTicket3.setText("GENERATE TICKET");
        btnGenerateTicket3.setBorder(null);
        btnGenerateTicket3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGenerateTicket3MouseClicked(evt);
            }
        });
        btnGenerateTicket3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateTicket3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnGenerateTicket3);
        btnGenerateTicket3.setBounds(600, 590, 230, 50);

        txtTrain2.setBackground(new java.awt.Color(195, 228, 232));
        txtTrain2.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        txtTrain2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTrain2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTrain2ActionPerformed(evt);
            }
        });
        jPanel1.add(txtTrain2);
        txtTrain2.setBounds(890, 200, 230, 50);

        txtTicketPrice2.setEditable(false);
        txtTicketPrice2.setBackground(new java.awt.Color(195, 228, 232));
        txtTicketPrice2.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        txtTicketPrice2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtTicketPrice2);
        txtTicketPrice2.setBounds(890, 510, 230, 50);

        txtTicketPrice3.setEditable(false);
        txtTicketPrice3.setBackground(new java.awt.Color(195, 228, 232));
        txtTicketPrice3.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        txtTicketPrice3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtTicketPrice3);
        txtTicketPrice3.setBounds(890, 510, 230, 50);

        lblClassB3.setFont(new java.awt.Font("Arial", 1, 27)); // NOI18N
        lblClassB3.setText("Class A");
        jPanel1.add(lblClassB3);
        lblClassB3.setBounds(1550, 520, 120, 30);

        lblArrivalTime2.setFont(new java.awt.Font("Georgia", 0, 27)); // NOI18N
        lblArrivalTime2.setText("Meal");
        jPanel1.add(lblArrivalTime2);
        lblArrivalTime2.setBounds(890, 320, 160, 31);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 15.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(480, 60, 781, 650);

        lblTrainNumber2.setFont(new java.awt.Font("Georgia", 0, 27)); // NOI18N
        lblTrainNumber2.setText("Train");
        jPanel1.add(lblTrainNumber2);
        lblTrainNumber2.setBounds(890, 150, 70, 40);

        lblTicketPrice2.setFont(new java.awt.Font("Georgia", 0, 27)); // NOI18N
        lblTicketPrice2.setText("Ticket Price");
        jPanel1.add(lblTicketPrice2);
        lblTicketPrice2.setBounds(890, 470, 140, 30);

        btnClassA3.setBackground(new java.awt.Color(51, 102, 255));
        btnClassA3.setFont(new java.awt.Font("Georgia", 0, 20)); // NOI18N
        btnClassA3.setText("Class A");
        btnClassA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClassA3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnClassA3);
        btnClassA3.setBounds(1440, 320, 130, 40);

        txtMeal3.setEditable(false);
        txtMeal3.setBackground(new java.awt.Color(195, 228, 232));
        txtMeal3.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        txtMeal3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtMeal3);
        txtMeal3.setBounds(890, 360, 230, 50);

        lblTrainNumber3.setFont(new java.awt.Font("Georgia", 0, 27)); // NOI18N
        lblTrainNumber3.setText("Train");
        jPanel1.add(lblTrainNumber3);
        lblTrainNumber3.setBounds(890, 150, 70, 40);

        txtRoute3.setEditable(false);
        txtRoute3.setBackground(new java.awt.Color(195, 228, 232));
        txtRoute3.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        txtRoute3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtRoute3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRoute3ActionPerformed(evt);
            }
        });
        jPanel1.add(txtRoute3);
        txtRoute3.setBounds(550, 510, 230, 50);

        lblArrivalTime3.setFont(new java.awt.Font("Georgia", 0, 27)); // NOI18N
        lblArrivalTime3.setText("Meal");
        jPanel1.add(lblArrivalTime3);
        lblArrivalTime3.setBounds(890, 320, 160, 31);

        txtDate3.setBackground(new java.awt.Color(195, 228, 232));
        txtDate3.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        txtDate3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDate3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDate3ActionPerformed(evt);
            }
        });
        jPanel1.add(txtDate3);
        txtDate3.setBounds(550, 200, 230, 50);

        lblDate3.setFont(new java.awt.Font("Georgia", 0, 27)); // NOI18N
        lblDate3.setText("Date");
        jPanel1.add(lblDate3);
        lblDate3.setBounds(550, 160, 70, 30);

        lblDepartureTime3.setFont(new java.awt.Font("Georgia", 0, 27)); // NOI18N
        lblDepartureTime3.setText("Time");
        jPanel1.add(lblDepartureTime3);
        lblDepartureTime3.setBounds(1430, 120, 200, 31);

        txtPhoneNumber3.setBackground(new java.awt.Color(195, 228, 232));
        txtPhoneNumber3.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        txtPhoneNumber3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtPhoneNumber3);
        txtPhoneNumber3.setBounds(550, 370, 230, 50);

        txtTrain3.setBackground(new java.awt.Color(195, 228, 232));
        txtTrain3.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        txtTrain3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTrain3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTrain3ActionPerformed(evt);
            }
        });
        jPanel1.add(txtTrain3);
        txtTrain3.setBounds(890, 200, 230, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1930, 1200);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTicektsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTicektsActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnTicektsActionPerformed

    private void btnTicektsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTicektsMouseExited
        // TODO add your handling code here:

    }//GEN-LAST:event_btnTicektsMouseExited

    private void btnTicektsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTicektsMouseEntered
        // TODO add your handling code here:
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        btnTicekts.setCursor(cursor);
    }//GEN-LAST:event_btnTicektsMouseEntered

    private void btnTrainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrainMouseClicked
        // TODO add your handling code here:


    }//GEN-LAST:event_btnTrainMouseClicked

    private void btnTrainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrainActionPerformed
        TrainButtonForm tbForm = new TrainButtonForm();
        tbForm.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnTrainActionPerformed

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

    private void btnBookingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBookingMouseExited
        // TODO add your handling code here:
        btnBooking.setBackground(new java.awt.Color(42, 134, 251));
        btnBooking.setContentAreaFilled(false);
    }//GEN-LAST:event_btnBookingMouseExited

    private void btnBookingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBookingMouseEntered
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        btnBooking.setCursor(cursor);
    }//GEN-LAST:event_btnBookingMouseEntered

    private void btnBookingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBookingMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btnBookingMouseClicked

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnExitMouseClicked

    private void btnBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookingActionPerformed
        // TODO add your handling code here:
        BookingButtonForm corm = new BookingButtonForm();
        corm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBookingActionPerformed

    private void btnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserActionPerformed
        // TODO add your handling code here:
        dashboard db = new dashboard();
        db.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnUserActionPerformed

    private void btnUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserMouseEntered
        // TODO add your handling code here:
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        btnUser.setCursor(cursor);
    }//GEN-LAST:event_btnUserMouseEntered

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        // TODO add your handling code here:
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        btnExit.setCursor(cursor);
    }//GEN-LAST:event_btnExitMouseEntered

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed
//
    private void btnGenerateTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateTicketActionPerformed
        if (txtPhoneNumber.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Phone number needed", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (SelectedSeat.equals("")) {
            JOptionPane.showMessageDialog(null, "Select a seat", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            searchController sc = new searchController();
            List<String> data = new ArrayList<>();
            try {
                data = sc.searchCustomer();
            } catch (SQLException ex) {
                Logger.getLogger(TicketButtonForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(TicketButtonForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (!data.contains(txtPhoneNumber.getText())) {
                JOptionPane.showMessageDialog(null, "This customer isn't registered yet", "New Customer?", JOptionPane.ERROR_MESSAGE);
            } else {

                try {
                    //
                    String time = txtTime.getText();
                    String phonenumber = txtPhoneNumber.getText();
                    String route = txtRoute.getText();
                    String name = txtTrain.getText();
                    String datte = txtDate.getText();
                    int ticketPrice = Integer.parseInt(txtTicketPrice.getText());
                    String seat = SelectedSeat;
                    String meal = txtMeal.getText();

                    int credit = Integer.parseInt(sc.getCredit(txtPhoneNumber.getText()));
                    System.out.println(credit);

                    //to redeem credit points
                    if (classA.contains(SelectedSeat) && credit >= 1500) {//ask to use credits(-1500)
                        int confirm = JOptionPane.showConfirmDialog(rootPane, "Pay using credit points?", "Redeem credits?", JOptionPane.YES_NO_OPTION);
                        if (confirm == JOptionPane.YES_OPTION) {
                            sc.minusCreditA(txtPhoneNumber.getText());
                        }

                    } else if (credit >= 1300) {//ask to use credit(-1300)
                        int confirm = JOptionPane.showConfirmDialog(rootPane, "Pay using credit points?", "Redeem credits?", JOptionPane.YES_NO_OPTION);
                        if (confirm == JOptionPane.YES_OPTION) {
                            sc.minusCreditB(txtPhoneNumber.getText());
                        }

                    }

                    //to give credit points 
                    if (classA.contains(SelectedSeat)) {
                        sc.creditA(phonenumber, name, datte);
                    } else {
                        sc.creditB(phonenumber, name, datte);
                    }

                    sc.addToDatabase(time, phonenumber, route, name, datte, ticketPrice);
                    sc.addSelectedSeat(name, datte, seat);

//FOR SETTINB IN TICKETPRINT
                    String price = txtTicketPrice.getText();
                    String DATE = txtDate.getText();

                    if (SelectedSeat == null) {
                        // No seat selected, display an error message
                        JOptionPane.showMessageDialog(rootPane, "Please select a seat.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    String seatNumber = SelectedSeat; 


                    TicketPrint tp = new TicketPrint();
                    tp.setTicketData(time, price, DATE, route, name, seatNumber);
                    tp.setVisible(true);
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(TicketButtonForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            String phonenumber = txtPhoneNumber.getText();
            
            String datte = txtDate.getText();
            int ticketPrice = Integer.parseInt(txtTicketPrice.getText());
            String seat = SelectedSeat;
            String cllass;
            if(SelectedSeat.contains(seat) ){
                cllass = "A";
            }
            else{
                cllass = "B";
            }
            bookingController bc = new bookingController();
            try {
                bc.recordTransaction(phonenumber, datte, ticketPrice, cllass);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(TicketButtonForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btnGenerateTicketActionPerformed


    private void btnTicektsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTicektsMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btnTicektsMouseClicked

    private void btnGenerateTicketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerateTicketMouseClicked

    }//GEN-LAST:event_btnGenerateTicketMouseClicked

    private void txtTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimeActionPerformed


    private void A1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A1MouseClicked

    }//GEN-LAST:event_A1MouseClicked


    private void A2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A2MouseClicked
        // TODO add your handling code here:


    }//GEN-LAST:event_A2MouseClicked

    private void txtRouteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRouteActionPerformed


    }//GEN-LAST:event_txtRouteActionPerformed

    private void A3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A3MouseClicked

    }//GEN-LAST:event_A3MouseClicked

    private void A4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A4ActionPerformed
        // TODO add your handling code here:

        Color backgroundColor = A4.getBackground();
        if (backgroundColor.equals(Color.RED)) {
            JOptionPane.showMessageDialog(null, "Seat not available", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            A4.setBackground(Color.yellow);
            String seatNumber = A4.getText(); 
            String confirmation4 = "Do you want to select the seat " + seatNumber;
            int confirmation5 = JOptionPane.showConfirmDialog(rootPane, confirmation4, "Seat Selection", JOptionPane.YES_NO_OPTION);
            if (confirmation5 == JOptionPane.YES_OPTION) {
                
                A4.setBackground(Color.RED);
                SelectedSeat = "A4";
                txtTicketPrice.setText(this.priceB);
                txtMeal.setText(this.mealB);

            } else {

                A4.setBackground(Color.green);
            }
        }

    }//GEN-LAST:event_A4ActionPerformed


    private void A5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A5ActionPerformed
        Color backgroundColor = A5.getBackground();
        if (backgroundColor.equals(Color.RED)) {
            JOptionPane.showMessageDialog(null, "Seat not available", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            String seatNumber = A5.getText();   
            String confirmation5 = "Do you want to select the seat " + seatNumber;
            int confirmation6 = JOptionPane.showConfirmDialog(rootPane, confirmation5, "Seat Selection", JOptionPane.YES_NO_OPTION);
            if (confirmation6 == JOptionPane.YES_OPTION) {
                  
                A5.setBackground(Color.RED);
                SelectedSeat = "A5";
                txtTicketPrice.setText(this.priceB);
                txtMeal.setText(this.mealB);

            } else {

                A5.setBackground(Color.green);
            }
        }

    }//GEN-LAST:event_A5ActionPerformed

    private void A6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A6ActionPerformed
        Color backgroundColor = A6.getBackground();
        if (backgroundColor.equals(Color.RED)) {
            JOptionPane.showMessageDialog(null, "Seat not available", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            String seatNumber = A6.getText();   
            String confirmation5 = "Do you want to select the seat " + seatNumber;
            int confirmation6 = JOptionPane.showConfirmDialog(rootPane, confirmation5, "Seat Selection", JOptionPane.YES_NO_OPTION);
            if (confirmation6 == JOptionPane.YES_OPTION) {
                  
                A6.setBackground(Color.RED);
                txtTicketPrice.setText(this.priceB);
                txtMeal.setText(this.mealB);
                SelectedSeat = "A6";

            } else {

                A6.setBackground(Color.green);
            }
        }

    }//GEN-LAST:event_A6ActionPerformed

    private void A8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_A8MouseClicked

    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ActionPerformed
        // TODO add your handling code here:
        Color backgroundColor = A1.getBackground();
        if (backgroundColor.equals(Color.RED)) {
            JOptionPane.showMessageDialog(null, "Seat not available", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            A1.setBackground(Color.yellow);
            String seatNumber = A1.getText();   
            String confirmation4 = "Do you want to select the seat " + seatNumber;
            int confirmation5 = JOptionPane.showConfirmDialog(rootPane, confirmation4, "Seat Selection", JOptionPane.YES_NO_OPTION);
            if (confirmation5 == JOptionPane.YES_OPTION) {
                  
                A1.setBackground(Color.RED);
                SelectedSeat = "A1";
                txtTicketPrice.setText(this.priceB);
                txtMeal.setText(this.mealB);

            } else {

                A1.setBackground(Color.green);
            }
        }


    }//GEN-LAST:event_A1ActionPerformed

    private void B7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_B7MouseClicked

    private void B8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_B8MouseClicked

    private void C1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_C1MouseClicked

    private void C2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_C2MouseClicked

    private void C5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_C5MouseClicked

    private void C4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_C4MouseClicked

    private void A7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_A7MouseClicked

    private void C6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_C6MouseClicked

    private void C7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_C7MouseClicked

    private void C8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_C8MouseClicked

    private void D1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_D1MouseClicked

    private void D2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_D2MouseClicked

    private void D4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_D4MouseClicked

    private void C3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_C3MouseClicked

    private void D5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_D5MouseClicked

    private void D6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_D6MouseClicked

    private void D8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_D8MouseClicked

    private void D3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_D3MouseClicked

    private void D7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_D7MouseClicked

    private void A7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A7ActionPerformed
        // TODO add your handling code here:
        Color backgroundColor = A7.getBackground();
        if (backgroundColor.equals(Color.RED)) {
            JOptionPane.showMessageDialog(null, "Seat not available", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            String seatNumber = A7.getText();   
            String confirmation5 = "Do you want to select the seat " + seatNumber;
            int confirmation6 = JOptionPane.showConfirmDialog(rootPane, confirmation5, "Seat Selection", JOptionPane.YES_NO_OPTION);
            if (confirmation6 == JOptionPane.YES_OPTION) {
                  
                A7.setBackground(Color.RED);
                txtTicketPrice.setText(this.priceB);
                txtMeal.setText(this.mealB);
                SelectedSeat = "A7";

            } else {

                A7.setBackground(Color.green);

            }

        }
    }//GEN-LAST:event_A7ActionPerformed

    private void A8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A8ActionPerformed
        // TODO add your handling code here:

        Color backgroundColor = A8.getBackground();
        if (backgroundColor.equals(Color.RED)) {
            JOptionPane.showMessageDialog(null, "Seat not available", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            String seatNumber = A8.getText();   
            String confirmation5 = "Do you want to select the seat " + seatNumber;
            int confirmation6 = JOptionPane.showConfirmDialog(rootPane, confirmation5, "Seat Selection", JOptionPane.YES_NO_OPTION);
            if (confirmation6 == JOptionPane.YES_OPTION) {
                  
                A8.setBackground(Color.RED);
                txtTicketPrice.setText(this.priceB);
                txtMeal.setText(this.mealB);
                SelectedSeat = "A8";

            } else {
                

                A8.setBackground(Color.green);
            }

        }
    }//GEN-LAST:event_A8ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        // TODO add your handling code here:
        Color backgroundColor = B1.getBackground();
        if (backgroundColor.equals(Color.RED)) {
            JOptionPane.showMessageDialog(null, "Seat not available", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            String seatNumber = B1.getText();   
            String confirmation5 = "Do you want to select the seat " + seatNumber;
            int confirmation6 = JOptionPane.showConfirmDialog(rootPane, confirmation5, "Seat Selection", JOptionPane.YES_NO_OPTION);
            if (confirmation6 == JOptionPane.YES_OPTION) {
                  
                B1.setBackground(Color.RED);
                txtTicketPrice.setText(this.priceB);
                txtMeal.setText(this.mealB);
                SelectedSeat = "B1";

            } else {
                  

                B1.setBackground(Color.green);
            }

        }
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        // TODO add your handling code here:
        Color backgroundColor = B2.getBackground();
        if (backgroundColor.equals(Color.RED)) {
            JOptionPane.showMessageDialog(null, "Seat not available", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            String seatNumber = B2.getText();   
            String confirmation5 = "Do you want to select the seat " + seatNumber;
            int confirmation6 = JOptionPane.showConfirmDialog(rootPane, confirmation5, "Seat Selection", JOptionPane.YES_NO_OPTION);
            if (confirmation6 == JOptionPane.YES_OPTION) {
                  
                B2.setBackground(Color.RED);
                txtTicketPrice.setText(this.priceB);
                txtMeal.setText(this.mealB);
                SelectedSeat = "B2";

            } else {
                  

                B2.setBackground(Color.green);
            }
        }

    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        // TODO add your handling code here:
        Color backgroundColor = B3.getBackground();
        if (backgroundColor.equals(Color.RED)) {
            JOptionPane.showMessageDialog(null, "Seat not available", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            String seatNumber = B3.getText();   
            String confirmation5 = "Do you want to select the seat " + seatNumber;
            int confirmation6 = JOptionPane.showConfirmDialog(rootPane, confirmation5, "Seat Selection", JOptionPane.YES_NO_OPTION);
            if (confirmation6 == JOptionPane.YES_OPTION) {
                  
                B3.setBackground(Color.RED);
                txtTicketPrice.setText(this.priceB);
                txtMeal.setText(this.mealB);
                SelectedSeat = "B3";

            } else {
                B3.setBackground(Color.green);
            }

        }
    }//GEN-LAST:event_B3ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        // TODO add your handling code here:
        Color backgroundColor = B5.getBackground();
        if (backgroundColor.equals(Color.RED)) {
            JOptionPane.showMessageDialog(null, "Seat not available", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            String seatNumber = B5.getText();   
            String confirmation5 = "Do you want to select the seat " + seatNumber;
            int confirmation6 = JOptionPane.showConfirmDialog(rootPane, confirmation5, "Seat Selection", JOptionPane.YES_NO_OPTION);
            if (confirmation6 == JOptionPane.YES_OPTION) {
                  
                B5.setBackground(Color.RED);
                txtTicketPrice.setText(this.priceB);
                txtMeal.setText(this.mealB);
                SelectedSeat = "B5";

            } else {

                B5.setBackground(Color.green);
            }
        }

    }//GEN-LAST:event_B5ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
        // TODO add your handling code here:
        Color backgroundColor = B7.getBackground();
        if (backgroundColor.equals(Color.RED)) {
            JOptionPane.showMessageDialog(null, "Seat not available", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            String seatNumber = B7.getText();   
            String confirmation5 = "Do you want to select the seat " + seatNumber;
            int confirmation6 = JOptionPane.showConfirmDialog(rootPane, confirmation5, "Seat Selection", JOptionPane.YES_NO_OPTION);
            if (confirmation6 == JOptionPane.YES_OPTION) {
                  
                B7.setBackground(Color.RED);
                txtTicketPrice.setText(this.priceB);
                txtMeal.setText(this.mealB);
                SelectedSeat = "B7";

            } else {
                B7.setBackground(Color.green);
            }
        }
    }//GEN-LAST:event_B7ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        Color backgroundColor = B4.getBackground();
        if (backgroundColor.equals(Color.RED)) {
            JOptionPane.showMessageDialog(null, "Seat not available", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            String seatNumber = B4.getText();
            String confirmation5 = "Do you want to select the seat " + seatNumber;
            int confirmation6 = JOptionPane.showConfirmDialog(rootPane, confirmation5, "Seat Selection", JOptionPane.YES_NO_OPTION);
            if (confirmation6 == JOptionPane.YES_OPTION) {
                  
                B4.setBackground(Color.RED);
                txtTicketPrice.setText(this.priceB);
                txtMeal.setText(this.mealB);
                SelectedSeat = "B4";

            } else {

                B4.setBackground(Color.green);
            }
        }
    }//GEN-LAST:event_B4ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        Color backgroundColor = B6.getBackground();
        if (backgroundColor.equals(Color.RED)) {
            JOptionPane.showMessageDialog(null, "Seat not available", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            String seatNumber = B6.getText();   
            String confirmation5 = "Do you want to select the seat " + seatNumber;
            int confirmation6 = JOptionPane.showConfirmDialog(rootPane, confirmation5, "Seat Selection", JOptionPane.YES_NO_OPTION);
            if (confirmation6 == JOptionPane.YES_OPTION) {
                  
                B6.setBackground(Color.RED);
                txtTicketPrice.setText(this.priceB);
                txtMeal.setText(this.mealB);
                SelectedSeat = "B6";

            } else {
                B6.setBackground(Color.green);
            }
        }

    }//GEN-LAST:event_B6ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        // TODO add your handling code here:
        Color backgroundColor = B8.getBackground();
        if (backgroundColor.equals(Color.RED)) {
            JOptionPane.showMessageDialog(null, "Seat not available", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            String seatNumber = B8.getText();   
            String confirmation5 = "Do you want to select the seat " + seatNumber;
            int confirmation6 = JOptionPane.showConfirmDialog(rootPane, confirmation5, "Seat Selection", JOptionPane.YES_NO_OPTION);
            if (confirmation6 == JOptionPane.YES_OPTION) {
                  
                B8.setBackground(Color.RED);
                txtTicketPrice.setText(this.priceB);
                txtMeal.setText(this.mealB);
                SelectedSeat = "B8";

            } else {

                B8.setBackground(Color.green);
            }

        }
    }//GEN-LAST:event_B8ActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        Color backgroundColor = C1.getBackground();
        if (backgroundColor.equals(Color.RED)) {
            JOptionPane.showMessageDialog(null, "Seat not available", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            String seatNumber = C1.getText();   
            String confirmation5 = "Do you want to select the seat " + seatNumber;
            int confirmation6 = JOptionPane.showConfirmDialog(rootPane, confirmation5, "Seat Selection", JOptionPane.YES_NO_OPTION);
            if (confirmation6 == JOptionPane.YES_OPTION) {
                  
                C1.setBackground(Color.RED);
                txtTicketPrice.setText(this.priceB);
                txtMeal.setText(this.mealB);
                SelectedSeat = "C1";

            } else {
                C1.setBackground(Color.green);
            }

        }
    }//GEN-LAST:event_C1ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
        Color backgroundColor = C2.getBackground();
        if (backgroundColor.equals(Color.RED)) {
            JOptionPane.showMessageDialog(null, "Seat not available", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            String seatNumber = C2.getText();   
            String confirmation5 = "Do you want to select the seat " + seatNumber;
            int confirmation6 = JOptionPane.showConfirmDialog(rootPane, confirmation5, "Seat Selection", JOptionPane.YES_NO_OPTION);
            if (confirmation6 == JOptionPane.YES_OPTION) {
                  
                C2.setBackground(Color.RED);
                txtTicketPrice.setText(this.priceB);
                txtMeal.setText(this.mealB);
                SelectedSeat = "C2";

            } else {
                C2.setBackground(Color.green);
            }
        }
    }//GEN-LAST:event_C2ActionPerformed

    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C3ActionPerformed
        Color backgroundColor = C3.getBackground();
        if (backgroundColor.equals(Color.RED)) {
            JOptionPane.showMessageDialog(null, "Seat not available", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            String seatNumber = C3.getText();   
            String confirmation5 = "Do you want to select the seat " + seatNumber;
            int confirmation6 = JOptionPane.showConfirmDialog(rootPane, confirmation5, "Seat Selection", JOptionPane.YES_NO_OPTION);
            if (confirmation6 == JOptionPane.YES_OPTION) {
                  
                C3.setBackground(Color.RED);
                txtTicketPrice.setText(this.priceB);
                txtMeal.setText(this.mealB);
                SelectedSeat = "C3";

            } else {

                C3.setBackground(Color.green);
            }
        }
    }//GEN-LAST:event_C3ActionPerformed

    private void C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C4ActionPerformed
        Color backgroundColor = C4.getBackground();
        if (backgroundColor.equals(Color.RED)) {
            JOptionPane.showMessageDialog(null, "Seat not available", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            String seatNumber = C4.getText();   
            String confirmation5 = "Do you want to select the seat " + seatNumber;
            int confirmation6 = JOptionPane.showConfirmDialog(rootPane, confirmation5, "Seat Selection", JOptionPane.YES_NO_OPTION);
            if (confirmation6 == JOptionPane.YES_OPTION) {
                  
                C4.setBackground(Color.RED);
                txtTicketPrice.setText(this.priceB);
                txtMeal.setText(this.mealB);
                SelectedSeat = "C4";

            } else {
                C4.setBackground(Color.green);
            }
        }

    }//GEN-LAST:event_C4ActionPerformed

    private void C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C5ActionPerformed
        Color backgroundColor = C5.getBackground();
        if (backgroundColor.equals(Color.RED)) {
            JOptionPane.showMessageDialog(null, "Seat not available", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            String seatNumber = C5.getText();   
            String confirmation5 = "Do you want to select the seat " + seatNumber;
            int confirmation6 = JOptionPane.showConfirmDialog(rootPane, confirmation5, "Seat Selection", JOptionPane.YES_NO_OPTION);
            if (confirmation6 == JOptionPane.YES_OPTION) {
                  
                C5.setBackground(Color.RED);
                txtTicketPrice.setText(this.priceB);
                txtMeal.setText(this.mealB);
                SelectedSeat = "C5";

            } else {
                C5.setBackground(Color.green);
            }
        }

    }//GEN-LAST:event_C5ActionPerformed

    private void C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C6ActionPerformed
        Color backgroundColor = C6.getBackground();
        if (backgroundColor.equals(Color.RED)) {
            JOptionPane.showMessageDialog(null, "Seat not available", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            String seatNumber = C6.getText();   
            String confirmation5 = "Do you want to select the seat " + seatNumber;
            int confirmation6 = JOptionPane.showConfirmDialog(rootPane, confirmation5, "Seat Selection", JOptionPane.YES_NO_OPTION);
            if (confirmation6 == JOptionPane.YES_OPTION) {
                  
                C6.setBackground(Color.RED);
                txtTicketPrice.setText(this.priceB);
                txtMeal.setText(this.mealB);
                SelectedSeat = "C6";

            } else {
                C6.setBackground(Color.green);
            }
        }

    }//GEN-LAST:event_C6ActionPerformed

    private void C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C7ActionPerformed
        Color backgroundColor = C7.getBackground();
        if (backgroundColor.equals(Color.RED)) {
            JOptionPane.showMessageDialog(null, "Seat not available", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            String seatNumber = C7.getText();   
            String confirmation5 = "Do you want to select the seat " + seatNumber;
            int confirmation6 = JOptionPane.showConfirmDialog(rootPane, confirmation5, "Seat Selection", JOptionPane.YES_NO_OPTION);
            if (confirmation6 == JOptionPane.YES_OPTION) {
                  
                C7.setBackground(Color.RED);
                txtTicketPrice.setText(this.priceB);
                txtMeal.setText(this.mealB);
                SelectedSeat = "C7";

            } else {
                C7.setBackground(Color.green);
                txtTicketPrice.setText(this.priceB);
                txtMeal.setText(this.mealB);
            }

        }
    }//GEN-LAST:event_C7ActionPerformed

    private void C8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C8ActionPerformed
        Color backgroundColor = C8.getBackground();
        if (backgroundColor.equals(Color.RED)) {
            JOptionPane.showMessageDialog(null, "Seat not available", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            String seatNumber = C8.getText();   
            String confirmation5 = "Do you want to select the seat " + seatNumber;
            int confirmation6 = JOptionPane.showConfirmDialog(rootPane, confirmation5, "Seat Selection", JOptionPane.YES_NO_OPTION);
            if (confirmation6 == JOptionPane.YES_OPTION) {
                  
                C8.setBackground(Color.RED);
                txtTicketPrice.setText(this.priceB);
                txtMeal.setText(this.mealB);
                SelectedSeat = "C8";

            } else {
                C8.setBackground(Color.green);
            }

        }
    }//GEN-LAST:event_C8ActionPerformed

    private void D1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D1ActionPerformed
        Color backgroundColor = D1.getBackground();
        if (backgroundColor.equals(Color.RED)) {
            JOptionPane.showMessageDialog(null, "Seat not available", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            String seatNumber = D1.getText();   
            String confirmation5 = "Do you want to select the seat " + seatNumber;
            int confirmation6 = JOptionPane.showConfirmDialog(rootPane, confirmation5, "Seat Selection", JOptionPane.YES_NO_OPTION);
            if (confirmation6 == JOptionPane.YES_OPTION) {
                  
                D1.setBackground(Color.RED);
                txtTicketPrice.setText(this.priceB);
                txtMeal.setText(this.mealB);
                SelectedSeat = "D1";
            } else {
                D1.setBackground(Color.green);
            }
        }
    }//GEN-LAST:event_D1ActionPerformed

    private void D2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D2ActionPerformed
        Color backgroundColor = D2.getBackground();
        if (backgroundColor.equals(Color.RED)) {
            JOptionPane.showMessageDialog(null, "Seat not available", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            String seatNumber = D2.getText();   
            String confirmation5 = "Do you want to select the seat " + seatNumber;
            int confirmation6 = JOptionPane.showConfirmDialog(rootPane, confirmation5, "Seat Selection", JOptionPane.YES_NO_OPTION);
            if (confirmation6 == JOptionPane.YES_OPTION) {
                  
                D2.setBackground(Color.RED);
                txtTicketPrice.setText(this.priceB);
                txtMeal.setText(this.mealB);
                SelectedSeat = "D2";
            } else {
                D2.setBackground(Color.green);
            }
        }

    }//GEN-LAST:event_D2ActionPerformed

    private void D3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D3ActionPerformed
        Color backgroundColor = D3.getBackground();
        if (backgroundColor.equals(Color.RED)) {
            JOptionPane.showMessageDialog(null, "Seat not available", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            String seatNumber = D3.getText();   
            String confirmation5 = "Do you want to select the seat " + seatNumber;
            int confirmation6 = JOptionPane.showConfirmDialog(rootPane, confirmation5, "Seat Selection", JOptionPane.YES_NO_OPTION);
            if (confirmation6 == JOptionPane.YES_OPTION) {
                  
                D3.setBackground(Color.RED);
                txtTicketPrice.setText(this.priceB);
                txtMeal.setText(this.mealB);
                SelectedSeat = "D3";
            } else {
                D3.setBackground(Color.green);
            }

        }
    }//GEN-LAST:event_D3ActionPerformed

    private void D4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D4ActionPerformed
        Color backgroundColor = D4.getBackground();
        if (backgroundColor.equals(Color.RED)) {
            JOptionPane.showMessageDialog(null, "Seat not available", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            String seatNumber = D4.getText();   
            String confirmation5 = "Do you want to select the seat " + seatNumber;
            int confirmation6 = JOptionPane.showConfirmDialog(rootPane, confirmation5, "Seat Selection", JOptionPane.YES_NO_OPTION);
            if (confirmation6 == JOptionPane.YES_OPTION) {
                  
                D4.setBackground(Color.RED);
                txtTicketPrice.setText(this.priceB);
                txtMeal.setText(this.mealB);
                SelectedSeat = "D4";
            } else {
                D4.setBackground(Color.green);
            }
        }

    }//GEN-LAST:event_D4ActionPerformed

    private void D5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D5ActionPerformed
        Color backgroundColor = D5.getBackground();
        if (backgroundColor.equals(Color.RED)) {
            JOptionPane.showMessageDialog(null, "Seat not available", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            String seatNumber = D5.getText();   
            String confirmation5 = "Do you want to select the seat " + seatNumber;
            int confirmation6 = JOptionPane.showConfirmDialog(rootPane, confirmation5, "Seat Selection", JOptionPane.YES_NO_OPTION);
            if (confirmation6 == JOptionPane.YES_OPTION) {
                  
                D5.setBackground(Color.RED);
                txtTicketPrice.setText(this.priceB);
                txtMeal.setText(this.mealB);
                SelectedSeat = "D5";
            } else {
                D5.setBackground(Color.green);
            }
        }
    }//GEN-LAST:event_D5ActionPerformed

    private void D6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D6ActionPerformed
        Color backgroundColor = D6.getBackground();
        if (backgroundColor.equals(Color.RED)) {
            JOptionPane.showMessageDialog(null, "Seat not available", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            String seatNumber = D6.getText();   
            String confirmation5 = "Do you want to select the seat " + seatNumber;
            int confirmation6 = JOptionPane.showConfirmDialog(rootPane, confirmation5, "Seat Selection", JOptionPane.YES_NO_OPTION);
            if (confirmation6 == JOptionPane.YES_OPTION) {
                  
                D6.setBackground(Color.RED);
                txtTicketPrice.setText(this.priceB);
                txtMeal.setText(this.mealB);
                SelectedSeat = "D6";
            } else {
                D6.setBackground(Color.green);
            }
        }

    }//GEN-LAST:event_D6ActionPerformed

    private void D7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D7ActionPerformed
        Color backgroundColor = D7.getBackground();
        if (backgroundColor.equals(Color.RED)) {
            JOptionPane.showMessageDialog(null, "Seat not available", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            String seatNumber = D7.getText();   
            String confirmation5 = "Do you want to select the seat " + seatNumber;
            int confirmation6 = JOptionPane.showConfirmDialog(rootPane, confirmation5, "Seat Selection", JOptionPane.YES_NO_OPTION);
            if (confirmation6 == JOptionPane.YES_OPTION) {
                  
                D7.setBackground(Color.RED);
                txtTicketPrice.setText(this.priceB);
                txtMeal.setText(this.mealB);
                SelectedSeat = "D7";
            } else {
                D7.setBackground(Color.green);
            }
        }

    }//GEN-LAST:event_D7ActionPerformed

    private void D8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D8ActionPerformed
        Color backgroundColor = D8.getBackground();
        if (backgroundColor.equals(Color.RED)) {
            JOptionPane.showMessageDialog(null, "Seat not available", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            String seatNumber = D8.getText();   
            String confirmation5 = "Do you want to select the seat " + seatNumber;
            int confirmation6 = JOptionPane.showConfirmDialog(rootPane, confirmation5, "Seat Selection", JOptionPane.YES_NO_OPTION);
            if (confirmation6 == JOptionPane.YES_OPTION) {
                  
                D8.setBackground(Color.RED);
                txtTicketPrice.setText(this.priceB);
                txtMeal.setText(this.mealB);
                SelectedSeat = "D8";
            } else {
                D8.setBackground(Color.green);
            }

        }
    }//GEN-LAST:event_D8ActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed

        txtMeal.setText("");
        txtTime.setText("");
        txtPhoneNumber.setText("");
        txtDate.setText("");
        txtRoute.setText("");
        txtTrain.setText("");

        txtTicketPrice.setText("");

        A1.setBackground(Color.GREEN);
        A2.setBackground(Color.GREEN);
        A3.setBackground(Color.GREEN);
        A4.setBackground(Color.GREEN);
        A5.setBackground(Color.GREEN);
        A6.setBackground(Color.GREEN);
        B1.setBackground(Color.GREEN);
        B2.setBackground(Color.GREEN);
        B3.setBackground(Color.GREEN);
        B4.setBackground(Color.GREEN);
        B5.setBackground(Color.GREEN);
        B6.setBackground(Color.GREEN);
        A8.setBackground(Color.GREEN);
        B7.setBackground(Color.GREEN);
        B8.setBackground(Color.GREEN);
        C1.setBackground(Color.GREEN);
        C2.setBackground(Color.GREEN);
        C5.setBackground(Color.GREEN);
        C4.setBackground(Color.GREEN);
        A7.setBackground(Color.GREEN);
        C6.setBackground(Color.GREEN);
        C7.setBackground(Color.GREEN);
        C8.setBackground(Color.GREEN);
        D1.setBackground(Color.GREEN);
        D2.setBackground(Color.GREEN);
        D4.setBackground(Color.GREEN);
        C3.setBackground(Color.GREEN);
        D5.setBackground(Color.GREEN);
        D6.setBackground(Color.GREEN);
        D8.setBackground(Color.GREEN);
        D3.setBackground(Color.GREEN);
        D7.setBackground(Color.GREEN);
        AC1.setBackground(Color.GREEN);
        AC2.setBackground(Color.GREEN);
        AC3.setBackground(Color.GREEN);
        AC4.setBackground(Color.GREEN);
        AC5.setBackground(Color.GREEN);
        AC6.setBackground(Color.GREEN);
        AC8.setBackground(Color.GREEN);
        AC7.setBackground(Color.GREEN);
        AC10.setBackground(Color.GREEN);
        AC9.setBackground(Color.GREEN);

    }//GEN-LAST:event_btnResetActionPerformed

    private void btnClassAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClassAActionPerformed
        // TODO add your handling code here:

        lblSeat.setVisible(false);
        lblClassA.setVisible(false);
        lblSeat.setVisible(false);
        A1.setVisible(false);
        A2.setVisible(false);
        A3.setVisible(false);
        A4.setVisible(false);
        A5.setVisible(false);
        A6.setVisible(false);
        B1.setVisible(false);
        B2.setVisible(false);
        B3.setVisible(false);
        B4.setVisible(false);
        B5.setVisible(false);
        B6.setVisible(false);
        A8.setVisible(false);
        B7.setVisible(false);
        B8.setVisible(false);
        C1.setVisible(false);
        C2.setVisible(false);
        C5.setVisible(false);
        C4.setVisible(false);
        A7.setVisible(false);
        C6.setVisible(false);
        C7.setVisible(false);
        C8.setVisible(false);
        D1.setVisible(false);
        D2.setVisible(false);
        D4.setVisible(false);
        C3.setVisible(false);
        D5.setVisible(false);
        D6.setVisible(false);
        D8.setVisible(false);
        D3.setVisible(false);
        D7.setVisible(false);

        lblSeat1.setVisible(true);
        lblClassB.setVisible(true);
        AC1.setVisible(true);
        AC2.setVisible(true);
        AC3.setVisible(true);
        AC4.setVisible(true);
        AC5.setVisible(true);
        AC6.setVisible(true);
        AC8.setVisible(true);
        AC7.setVisible(true);
        AC10.setVisible(true);
        AC9.setVisible(true);

        lblClassA.setVisible(false);
        A1.setVisible(false);
        A2.setVisible(false);
        A3.setVisible(false);
        A4.setVisible(false);
        A5.setVisible(false);
        A6.setVisible(false);
        A7.setVisible(false);
        A8.setVisible(false);

        B1.setVisible(false);
        B2.setVisible(false);
        B3.setVisible(false);
        B4.setVisible(false);
        B5.setVisible(false);
        B6.setVisible(false);
        B7.setVisible(false);
        B8.setVisible(false);

        C1.setVisible(false);
        C2.setVisible(false);
        C3.setVisible(false);
        C4.setVisible(false);
        C5.setVisible(false);
        C6.setVisible(false);
        C7.setVisible(false);
        C8.setVisible(false);

        D1.setVisible(false);
        D2.setVisible(false);
        D3.setVisible(false);
        D4.setVisible(false);
        D5.setVisible(false);
        D6.setVisible(false);
        D7.setVisible(false);
        D8.setVisible(false);
    }//GEN-LAST:event_btnClassAActionPerformed

    private void btnClassBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClassBActionPerformed
        // TODO add your handling code here:
        lblSeat1.hide();
        lblSeat.show();
        lblClassB.hide();
        A1.show();
        lblClassA.show();
        A2.show();
        A3.show();
        A4.show();
        A5.show();
        A6.show();
        B1.show();
        B2.show();
        B3.show();
        B4.show();
        B5.show();
        B6.show();
        A8.show();
        B7.show();
        B8.show();
        C1.show();
        C2.show();
        C5.show();
        C4.show();
        A7.show();
        C6.show();
        C7.show();
        C8.show();
        D1.show();
        D2.show();
        D4.show();
        C3.show();
        D5.show();
        D6.show();
        D8.show();
        D3.show();
        D7.show();
        AC1.hide();
        AC2.hide();
        AC3.hide();
        AC4.hide();
        AC5.hide();
        AC6.hide();
        AC8.hide();
        AC7.hide();
        AC10.hide();
        AC9.hide();
    }//GEN-LAST:event_btnClassBActionPerformed

    private void btnClassBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClassBMouseClicked

    }//GEN-LAST:event_btnClassBMouseClicked

    private void AC1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AC1MouseClicked
        Color backgroundColor = AC1.getBackground();
        if (backgroundColor.equals(Color.RED)) {
            JOptionPane.showMessageDialog(null, "Seat not available", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            AC1.setBackground(Color.yellow);
            String seatNumber = AC1.getText();   
            String confirmation4 = "Do you want to select the seat " + seatNumber;
            int confirmation5 = JOptionPane.showConfirmDialog(rootPane, confirmation4, "Seat Selection", JOptionPane.YES_NO_OPTION);
            if (confirmation5 == JOptionPane.YES_OPTION) {
                  
                AC1.setBackground(Color.RED);
                txtTicketPrice.setText(this.priceA);
                txtMeal.setText(mealA);
                SelectedSeat = "AC1";
            } else {
                AC1.setBackground(Color.green);
            }
        }
    }//GEN-LAST:event_AC1MouseClicked

    private void AC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AC1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_AC1ActionPerformed

    private void AC2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AC2MouseClicked
        Color backgroundColor = AC2.getBackground();
        if (backgroundColor.equals(Color.RED)) {
            JOptionPane.showMessageDialog(null, "Seat not available", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            AC2.setBackground(Color.yellow);
            String seatNumber = AC2.getText();   
            String confirmation4 = "Do you want to select the seat " + seatNumber;
            int confirmation5 = JOptionPane.showConfirmDialog(rootPane, confirmation4, "Seat Selection", JOptionPane.YES_NO_OPTION);
            if (confirmation5 == JOptionPane.YES_OPTION) {
                AC2.setBackground(Color.RED);
                txtTicketPrice.setText(this.priceA);
                txtMeal.setText(mealA);
                SelectedSeat = "AC2";
            } else {
                AC2.setBackground(Color.green);
            }

        }
    }//GEN-LAST:event_AC2MouseClicked

    private void AC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AC2ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_AC2ActionPerformed

    private void AC3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AC3MouseClicked
        // TODO add your handling code here:
        Color backgroundColor = AC3.getBackground();
        if (backgroundColor.equals(Color.RED)) {
            JOptionPane.showMessageDialog(null, "Seat not available", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            AC3.setBackground(Color.yellow);
            String seatNumber = AC3.getText();   
            String confirmation4 = "Do you want to select the seat " + seatNumber;
            int confirmation5 = JOptionPane.showConfirmDialog(rootPane, confirmation4, "Seat Selection", JOptionPane.YES_NO_OPTION);
            if (confirmation5 == JOptionPane.YES_OPTION) {
                AC3.setBackground(Color.RED);
                txtTicketPrice.setText(this.priceA);
                txtMeal.setText(mealA);
                SelectedSeat = "AC3";
            } else {
                AC3.setBackground(Color.green);
            }
        }
    }//GEN-LAST:event_AC3MouseClicked

    private void AC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AC3ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_AC3ActionPerformed

    private void AC4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AC4MouseClicked
        // TODO add your handling code here:
        Color backgroundColor = AC4.getBackground();
        if (backgroundColor.equals(Color.RED)) {
            JOptionPane.showMessageDialog(null, "Seat not available", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            AC4.setBackground(Color.yellow);
            String seatNumber = AC4.getText();   
            String confirmation4 = "Do you want to select the seat " + seatNumber;
            int confirmation5 = JOptionPane.showConfirmDialog(rootPane, confirmation4, "Seat Selection", JOptionPane.YES_NO_OPTION);
            if (confirmation5 == JOptionPane.YES_OPTION) {
                AC4.setBackground(Color.RED);
                txtTicketPrice.setText(this.priceA);
                txtMeal.setText(mealA);
                SelectedSeat = "AC4";
            } else {
                AC4.setBackground(Color.green);
            }
        }
    }//GEN-LAST:event_AC4MouseClicked

    private void AC4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AC4ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_AC4ActionPerformed

    private void AC5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AC5MouseClicked
        Color backgroundColor = AC5.getBackground();
        if (backgroundColor.equals(Color.RED)) {
            JOptionPane.showMessageDialog(null, "Seat not available", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            AC5.setBackground(Color.yellow);
            String seatNumber = AC5.getText();   
            String confirmation4 = "Do you want to select the seat " + seatNumber;
            int confirmation5 = JOptionPane.showConfirmDialog(rootPane, confirmation4, "Seat Selection", JOptionPane.YES_NO_OPTION);
            if (confirmation5 == JOptionPane.YES_OPTION) {
                AC5.setBackground(Color.RED);
                txtTicketPrice.setText(this.priceA);
                txtMeal.setText(mealA);
                SelectedSeat = "AC5";
            } else {
                AC5.setBackground(Color.green);
            }
        }
    }//GEN-LAST:event_AC5MouseClicked

    private void AC5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AC5ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_AC5ActionPerformed

    private void AC6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AC6MouseClicked
        // TODO add your handling code here:
        Color backgroundColor = AC6.getBackground();
        if (backgroundColor.equals(Color.RED)) {
            JOptionPane.showMessageDialog(null, "Seat not available", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            AC6.setBackground(Color.yellow);
            String seatNumber = AC6.getText();   
            String confirmation4 = "Do you want to select the seat " + seatNumber;
            int confirmation5 = JOptionPane.showConfirmDialog(rootPane, confirmation4, "Seat Selection", JOptionPane.YES_NO_OPTION);
            if (confirmation5 == JOptionPane.YES_OPTION) {
                AC6.setBackground(Color.RED);
                txtTicketPrice.setText(this.priceA);
                txtMeal.setText(mealA);
                SelectedSeat = "AC6";

            } else {
                AC6.setBackground(Color.green);
            }
        }
    }//GEN-LAST:event_AC6MouseClicked

    private void AC6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AC6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AC6ActionPerformed

    private void AC8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AC8MouseClicked
        // TODO add your handling code here:
        Color backgroundColor = AC8.getBackground();
        if (backgroundColor.equals(Color.RED)) {
            JOptionPane.showMessageDialog(null, "Seat not available", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            AC8.setBackground(Color.yellow);
            String seatNumber = AC8.getText();   
            String confirmation4 = "Do you want to select the seat " + seatNumber;
            int confirmation5 = JOptionPane.showConfirmDialog(rootPane, confirmation4, "Seat Selection", JOptionPane.YES_NO_OPTION);
            if (confirmation5 == JOptionPane.YES_OPTION) {
                AC8.setBackground(Color.RED);
                txtTicketPrice.setText(this.priceA);
                txtMeal.setText(mealA);
                SelectedSeat = "AC8";

            } else {
                AC8.setBackground(Color.green);
            }
        }
    }//GEN-LAST:event_AC8MouseClicked

    private void AC8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AC8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AC8ActionPerformed

    private void AC7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AC7MouseClicked
        Color backgroundColor = AC7.getBackground();
        if (backgroundColor.equals(Color.RED)) {
            JOptionPane.showMessageDialog(null, "Seat not available", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            AC7.setBackground(Color.yellow);
            String seatNumber = AC7.getText();   
            String confirmation4 = "Do you want to select the seat " + seatNumber;
            int confirmation5 = JOptionPane.showConfirmDialog(rootPane, confirmation4, "Seat Selection", JOptionPane.YES_NO_OPTION);
            if (confirmation5 == JOptionPane.YES_OPTION) {
                  
                AC7.setBackground(Color.RED);
                txtTicketPrice.setText(this.priceA);
                txtMeal.setText(mealA);
                SelectedSeat = "AC7";

            } else {
                AC7.setBackground(Color.green);
            }
        }
    }//GEN-LAST:event_AC7MouseClicked

    private void AC7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AC7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AC7ActionPerformed

    private void AC9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AC9MouseClicked
        Color backgroundColor = AC9.getBackground();
        if (backgroundColor.equals(Color.RED)) {
            JOptionPane.showMessageDialog(null, "Seat not available", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            AC9.setBackground(Color.yellow);
            String seatNumber = AC9.getText();   
            String confirmation4 = "Do you want to select the seat " + seatNumber;
            int confirmation5 = JOptionPane.showConfirmDialog(rootPane, confirmation4, "Seat Selection", JOptionPane.YES_NO_OPTION);
            if (confirmation5 == JOptionPane.YES_OPTION) {
                  
                AC9.setBackground(Color.RED);
                txtTicketPrice.setText(this.priceA);
                txtMeal.setText(mealA);
                SelectedSeat = "AC9";
            } else {
                AC9.setBackground(Color.green);
            }
        }
    }//GEN-LAST:event_AC9MouseClicked

    private void AC9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AC9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AC9ActionPerformed

    private void txtTrainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTrainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTrainActionPerformed

    private void search_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_btnMouseClicked
        if (txtDate.getText().equals("") || txtTrain.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Fill both entry fields", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

            try {
                searchController sc = new searchController();
                List<String> fetchedData = sc.fetchTrainData(txtDate.getText(), txtTrain.getText());
                List<String> occupiedSeats = sc.fillColor(txtDate.getText(), txtTrain.getText());

                if (!fetchedData.isEmpty()) {

                    try {
                        txtRoute.setText(fetchedData.get(0));
                        txtTime.setText(fetchedData.get(1));
                        this.mealA = fetchedData.get(2);
                        this.priceA = fetchedData.get(3);
                        this.priceB = fetchedData.get(4);
                        if (fetchedData.get(2) == null) {
                            txtMeal.setText("No meal available");
                        }
                        //to set red color
                        if (occupiedSeats.get(0) != null && occupiedSeats.get(0).equals("1")) {
                            AC1.setBackground(Color.RED);
                        }
                        if (occupiedSeats.get(1) != null && occupiedSeats.get(1).equals("1")) {
                            AC2.setBackground(Color.RED);
                        }
                        if (occupiedSeats.get(2) != null && occupiedSeats.get(2).equals("1")) {
                            AC3.setBackground(Color.RED);
                        }
                        if (occupiedSeats.get(3) != null && occupiedSeats.get(3).equals("1")) {
                            AC4.setBackground(Color.RED);
                        }
                        if (occupiedSeats.get(4) != null && occupiedSeats.get(4).equals("1")) {
                            AC5.setBackground(Color.RED);
                        }
                        if (occupiedSeats.get(5) != null && occupiedSeats.get(5).equals("1")) {
                            AC6.setBackground(Color.RED);
                        }
                        if (occupiedSeats.get(6) != null && occupiedSeats.get(6).equals("1")) {
                            AC7.setBackground(Color.RED);
                        }
                        if (occupiedSeats.get(7) != null && occupiedSeats.get(7).equals("1")) {
                            AC8.setBackground(Color.RED);
                        }
                        if (occupiedSeats.get(8) != null && occupiedSeats.get(8).equals("1")) {
                            AC9.setBackground(Color.RED);
                        }
                        if (occupiedSeats.get(9) != null && occupiedSeats.get(9).equals("1")) {
                            AC10.setBackground(Color.RED);
                        }

                        if (occupiedSeats.get(10) != null && occupiedSeats.get(10).equals("1")) {
                            A1.setBackground(Color.RED);
                        }
                        if (occupiedSeats.get(11) != null && occupiedSeats.get(11).equals("1")) {
                            A2.setBackground(Color.RED);
                        }
                        if (occupiedSeats.get(12) != null && occupiedSeats.get(12).equals("1")) {
                            A3.setBackground(Color.RED);
                        }
                        if (occupiedSeats.get(13) != null && occupiedSeats.get(13).equals("1")) {
                            A4.setBackground(Color.RED);
                        }
                        if (occupiedSeats.get(14) != null && occupiedSeats.get(14).equals("1")) {
                            A5.setBackground(Color.RED);
                        }
                        if (occupiedSeats.get(15) != null && occupiedSeats.get(15).equals("1")) {
                            A6.setBackground(Color.RED);
                        }
                        if (occupiedSeats.get(16) != null && occupiedSeats.get(16).equals("1")) {
                            A7.setBackground(Color.RED);
                        }
                        if (occupiedSeats.get(17) != null && occupiedSeats.get(17).equals("1")) {
                            A8.setBackground(Color.RED);
                        }

                        if (occupiedSeats.get(18) != null && occupiedSeats.get(18).equals("1")) {
                            B1.setBackground(Color.RED);
                        }
                        if (occupiedSeats.get(19) != null && occupiedSeats.get(19).equals("1")) {
                            B2.setBackground(Color.RED);
                        }
                        if (occupiedSeats.get(20) != null && occupiedSeats.get(20).equals("1")) {
                            B3.setBackground(Color.RED);
                        }
                        if (occupiedSeats.get(21) != null && occupiedSeats.get(21).equals("1")) {
                            B4.setBackground(Color.RED);
                        }
                        if (occupiedSeats.get(22) != null && occupiedSeats.get(22).equals("1")) {
                            B5.setBackground(Color.RED);
                        }
                        if (occupiedSeats.get(23) != null && occupiedSeats.get(23).equals("1")) {
                            B6.setBackground(Color.RED);
                        }
                        if (occupiedSeats.get(24) != null && occupiedSeats.get(24).equals("1")) {
                            B7.setBackground(Color.RED);
                        }
                        if (occupiedSeats.get(25) != null && occupiedSeats.get(25).equals("1")) {
                            B8.setBackground(Color.RED);
                        }

                        if (occupiedSeats.get(26) != null && occupiedSeats.get(26).equals("1")) {
                            C1.setBackground(Color.RED);
                        }
                        if (occupiedSeats.get(27) != null && occupiedSeats.get(27).equals("1")) {
                            C2.setBackground(Color.RED);
                        }
                        if (occupiedSeats.get(28) != null && occupiedSeats.get(28).equals("1")) {
                            C3.setBackground(Color.RED);
                        }
                        if (occupiedSeats.get(29) != null && occupiedSeats.get(29).equals("1")) {
                            C4.setBackground(Color.RED);
                        }
                        if (occupiedSeats.get(30) != null && occupiedSeats.get(30).equals("1")) {
                            C5.setBackground(Color.RED);
                        }
                        if (occupiedSeats.get(31) != null && occupiedSeats.get(31).equals("1")) {
                            C6.setBackground(Color.RED);
                        }
                        if (occupiedSeats.get(32) != null && occupiedSeats.get(32).equals("1")) {
                            C7.setBackground(Color.RED);
                        }
                        if (occupiedSeats.get(33) != null && occupiedSeats.get(33).equals("1")) {
                            C8.setBackground(Color.RED);
                        }

                        if (occupiedSeats.get(34) != null && occupiedSeats.get(34).equals("1")) {
                            D1.setBackground(Color.RED);
                        }
                        if (occupiedSeats.get(35) != null && occupiedSeats.get(35).equals("1")) {
                            D2.setBackground(Color.RED);
                        }
                        if (occupiedSeats.get(36) != null && occupiedSeats.get(36).equals("1")) {
                            D3.setBackground(Color.RED);
                        }
                        if (occupiedSeats.get(37) != null && occupiedSeats.get(37).equals("1")) {
                            D4.setBackground(Color.RED);
                        }
                        if (occupiedSeats.get(38) != null && occupiedSeats.get(38).equals("1")) {
                            D5.setBackground(Color.RED);
                        }
                        if (occupiedSeats.get(39) != null && occupiedSeats.get(39).equals("1")) {
                            D6.setBackground(Color.RED);
                        }
                        if (occupiedSeats.get(40) != null && occupiedSeats.get(40).equals("1")) {
                            D7.setBackground(Color.RED);
                        }
                        if (occupiedSeats.get(41) != null && occupiedSeats.get(41).equals("1")) {
                            D8.setBackground(Color.RED);
                        }

                    } catch (IndexOutOfBoundsException e) {
                    }
                } else {
                    System.out.println("No data found for the specified date.");
                    JOptionPane.showMessageDialog(null, "Can't find train on the given date", "No Train", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (SQLException | ClassNotFoundException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_search_btnMouseClicked

    private void search_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_btnMouseEntered
        // TODO add your handling code here:
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR); 
        search_btn.setCursor(cursor);
    }//GEN-LAST:event_search_btnMouseEntered

    private void A2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A2ActionPerformed
        // TODO add your handling code here:
        Color backgroundColor = A2.getBackground();
        if (backgroundColor.equals(Color.RED)) {
            JOptionPane.showMessageDialog(null, "Seat not available", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            String seatNumber = A2.getText();   
            String confirmation4 = "Do you want to select the seat " + seatNumber;
            int confirmation5 = JOptionPane.showConfirmDialog(rootPane, confirmation4, "Seat Selection", JOptionPane.YES_NO_OPTION);
            if (confirmation5 == JOptionPane.YES_OPTION) {
                  
                A2.setBackground(Color.RED);
                SelectedSeat = "A2";
                txtTicketPrice.setText(this.priceB);
                txtMeal.setText(this.mealB);
            } else {
                A2.setBackground(Color.GREEN);
            }
        }


    }//GEN-LAST:event_A2ActionPerformed

    private void A3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A3ActionPerformed
        // TODO add your handling code here:
        Color backgroundColor = A3.getBackground();
        if (backgroundColor.equals(Color.RED)) {
            JOptionPane.showMessageDialog(null, "Seat not available", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            A3.setBackground(Color.yellow);
            String seatNumber = A3.getText();   
            String confirmation4 = "Do you want to select the seat " + seatNumber;
            int confirmation5 = JOptionPane.showConfirmDialog(rootPane, confirmation4, "Seat Selection", JOptionPane.YES_NO_OPTION);
            if (confirmation5 == JOptionPane.YES_OPTION) {
                  
                A3.setBackground(Color.RED);
                SelectedSeat = "A4";
                txtTicketPrice.setText(this.priceB);
                txtMeal.setText(this.mealB);

            } else {

                A3.setBackground(Color.green);
            }
        }
    }//GEN-LAST:event_A3ActionPerformed

    private void txtTrain3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTrain3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTrain3ActionPerformed

    private void txtDate3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDate3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDate3ActionPerformed

    private void txtRoute3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoute3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoute3ActionPerformed

    private void btnClassA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClassA3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClassA3ActionPerformed

    private void txtTrain2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTrain2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTrain2ActionPerformed

    private void btnGenerateTicket3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateTicket3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGenerateTicket3ActionPerformed

    private void btnGenerateTicket3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerateTicket3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGenerateTicket3MouseClicked

    private void txtTime2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTime2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTime2ActionPerformed

    private void search_btn2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_btn2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_search_btn2MouseEntered

    private void search_btn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_btn2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_search_btn2MouseClicked

    private void txtRoute2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoute2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoute2ActionPerformed

    private void btnClassB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClassB3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClassB3ActionPerformed

    private void btnClassB3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClassB3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClassB3MouseClicked

    private void btnClassA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClassA2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClassA2ActionPerformed

    private void txtDate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDate2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDate2ActionPerformed

    private void btnGenerateTicket2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateTicket2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGenerateTicket2ActionPerformed

    private void btnGenerateTicket2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerateTicket2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGenerateTicket2MouseClicked

    private void btnReset3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReset3ActionPerformed

    private void btnReset2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReset2ActionPerformed

    private void btnClassB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClassB1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClassB1ActionPerformed

    private void btnClassB1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClassB1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClassB1MouseClicked

    private void A9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A9ActionPerformed

    private void A9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_A9MouseClicked

    private void btnClassA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClassA1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClassA1ActionPerformed

    private void txtTime1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTime1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTime1ActionPerformed

    private void btnReset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReset1ActionPerformed

    private void btnGenerateTicket1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateTicket1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGenerateTicket1ActionPerformed

    private void btnGenerateTicket1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerateTicket1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGenerateTicket1MouseClicked

    private void txtRoute1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoute1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoute1ActionPerformed

    private void search_btn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_btn1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_search_btn1MouseEntered

    private void search_btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_btn1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_search_btn1MouseClicked

    private void txtTrain1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTrain1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTrain1ActionPerformed

    private void txtDate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDate1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDate1ActionPerformed

    private void txtCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodeActionPerformed

    private void search_btn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_btn3MouseClicked
        try {
            // TODO add your handling code here:
            searchController sc = new searchController(); // Handle exception appropriately
            List<String> fetchedData = sc.bookingData(txtCode.getText());
            if (!fetchedData.isEmpty()) {
                // Populate the GUI components with fetched data

                try {
                    txtRoute.setText(fetchedData.get(0));
                    txtTime.setText(fetchedData.get(1));
                    txtMeal.setText(fetchedData.get(2));
                    txtTicketPrice.setText(fetchedData.get(3));
                    txtDate.setText(fetchedData.get(4));
                    txtPhoneNumber.setText(fetchedData.get(5));
                    this.SelectedSeat = fetchedData.get(6);
                    txtTrain.setText(fetchedData.get(7));

                } catch (IndexOutOfBoundsException e) {
                }
            } else {
                System.out.println("No data found for the specified date.");
                JOptionPane.showMessageDialog(null, "Can't find train on the given date", "No Train", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TicketButtonForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TicketButtonForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_search_btn3MouseClicked

    private void search_btn3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_btn3MouseEntered
        // TODO add your handling code here:
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);   
        search_btn3.setCursor(cursor);
    }//GEN-LAST:event_search_btn3MouseEntered

    private void btnClassAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClassAMouseEntered
        // TODO add your handling code here:
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);   
        btnClassA.setCursor(cursor);
    }//GEN-LAST:event_btnClassAMouseEntered

    private void btnClassBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClassBMouseEntered
        // TODO add your handling code here:
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);   
        btnClassB.setCursor(cursor);
    }//GEN-LAST:event_btnClassBMouseEntered

    private void btnResetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseEntered
        // TODO add your handling code here:
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);   
        btnReset.setCursor(cursor);
    }//GEN-LAST:event_btnResetMouseEntered

    private void btnGenerateTicketMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerateTicketMouseEntered
        // TODO add your handling code here:
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);   
        btnGenerateTicket.setCursor(cursor);
    }//GEN-LAST:event_btnGenerateTicketMouseEntered

    private void txtPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumberActionPerformed

    private void AC10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AC10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AC10ActionPerformed

    private void AC10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AC10MouseClicked
        // TODO add your handling code here:
        Color backgroundColor = AC10.getBackground();
        if (backgroundColor.equals(Color.RED)) {
            JOptionPane.showMessageDialog(null, "Seat not available", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            AC10.setBackground(Color.yellow);
            String seatNumber = AC10.getText();   
            String confirmation4 = "Do you want to select the seat " + seatNumber;
            int confirmation5 = JOptionPane.showConfirmDialog(rootPane, confirmation4, "Seat Selection", JOptionPane.YES_NO_OPTION);
            if (confirmation5 == JOptionPane.YES_OPTION) {
                  
                AC10.setBackground(Color.RED);
                txtTicketPrice.setText(this.priceA);
                txtMeal.setText(mealA);
                SelectedSeat = "AC10";

            } else {
                AC10.setBackground(Color.green);
            }
        }
    }//GEN-LAST:event_AC10MouseClicked

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(() -> {
            new TicketButtonForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A1;
    private javax.swing.JButton A2;
    private javax.swing.JButton A3;
    private javax.swing.JButton A4;
    private javax.swing.JButton A5;
    private javax.swing.JButton A6;
    private javax.swing.JButton A7;
    private javax.swing.JButton A8;
    private javax.swing.JButton A9;
    private javax.swing.JButton AC1;
    private javax.swing.JButton AC10;
    private javax.swing.JButton AC2;
    private javax.swing.JButton AC3;
    private javax.swing.JButton AC4;
    private javax.swing.JButton AC5;
    private javax.swing.JButton AC6;
    private javax.swing.JButton AC7;
    private javax.swing.JButton AC8;
    private javax.swing.JButton AC9;
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton C1;
    private javax.swing.JButton C2;
    private javax.swing.JButton C3;
    private javax.swing.JButton C4;
    private javax.swing.JButton C5;
    private javax.swing.JButton C6;
    private javax.swing.JButton C7;
    private javax.swing.JButton C8;
    private javax.swing.JButton D1;
    private javax.swing.JButton D2;
    private javax.swing.JButton D3;
    private javax.swing.JButton D4;
    private javax.swing.JButton D5;
    private javax.swing.JButton D6;
    private javax.swing.JButton D7;
    private javax.swing.JButton D8;
    private javax.swing.JButton btnBooking;
    private javax.swing.JButton btnClassA;
    private javax.swing.JButton btnClassA1;
    private javax.swing.JButton btnClassA2;
    private javax.swing.JButton btnClassA3;
    private javax.swing.JButton btnClassB;
    private javax.swing.JButton btnClassB1;
    private javax.swing.JButton btnClassB3;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGenerateTicket;
    private javax.swing.JButton btnGenerateTicket1;
    private javax.swing.JButton btnGenerateTicket2;
    private javax.swing.JButton btnGenerateTicket3;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnReset1;
    private javax.swing.JButton btnReset2;
    private javax.swing.JButton btnReset3;
    private javax.swing.JButton btnTicekts;
    private javax.swing.JButton btnTrain;
    private javax.swing.JButton btnUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblArrivalTime;
    private javax.swing.JLabel lblArrivalTime1;
    private javax.swing.JLabel lblArrivalTime2;
    private javax.swing.JLabel lblArrivalTime3;
    private javax.swing.JLabel lblBook;
    private javax.swing.JLabel lblBookings;
    private javax.swing.JLabel lblChooseClass;
    private javax.swing.JLabel lblChooseClass1;
    private javax.swing.JLabel lblChooseClass2;
    private javax.swing.JLabel lblChooseClass3;
    private javax.swing.JLabel lblClassA;
    private javax.swing.JLabel lblClassA1;
    private javax.swing.JLabel lblClassA2;
    private javax.swing.JLabel lblClassA3;
    private javax.swing.JLabel lblClassB;
    private javax.swing.JLabel lblClassB1;
    private javax.swing.JLabel lblClassB2;
    private javax.swing.JLabel lblClassB3;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDate1;
    private javax.swing.JLabel lblDate2;
    private javax.swing.JLabel lblDate3;
    private javax.swing.JLabel lblDepartureTime;
    private javax.swing.JLabel lblDepartureTime1;
    private javax.swing.JLabel lblDepartureTime2;
    private javax.swing.JLabel lblDepartureTime3;
    private javax.swing.JLabel lblGreenBlueFrame;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblPhoneNumber1;
    private javax.swing.JLabel lblPhoneNumber2;
    private javax.swing.JLabel lblSeat;
    private javax.swing.JLabel lblSeat1;
    private javax.swing.JLabel lblSeat2;
    private javax.swing.JLabel lblSeat3;
    private javax.swing.JLabel lblSourceDestination;
    private javax.swing.JLabel lblSourceDestination1;
    private javax.swing.JLabel lblSourceDestination2;
    private javax.swing.JLabel lblSourceDestination3;
    private javax.swing.JLabel lblTicekts;
    private javax.swing.JLabel lblTicketPrice;
    private javax.swing.JLabel lblTicketPrice1;
    private javax.swing.JLabel lblTicketPrice2;
    private javax.swing.JLabel lblTrain;
    private javax.swing.JLabel lblTrainNumber;
    private javax.swing.JLabel lblTrainNumber1;
    private javax.swing.JLabel lblTrainNumber2;
    private javax.swing.JLabel lblTrainNumber3;
    private javax.swing.JLabel lblTrains;
    private javax.swing.JLabel search_btn;
    private javax.swing.JLabel search_btn1;
    private javax.swing.JLabel search_btn2;
    private javax.swing.JLabel search_btn3;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDate1;
    private javax.swing.JTextField txtDate2;
    private javax.swing.JTextField txtDate3;
    private javax.swing.JTextField txtMeal;
    private javax.swing.JTextField txtMeal1;
    private javax.swing.JTextField txtMeal2;
    private javax.swing.JTextField txtMeal3;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtPhoneNumber1;
    private javax.swing.JTextField txtPhoneNumber2;
    private javax.swing.JTextField txtPhoneNumber3;
    private javax.swing.JTextField txtRoute;
    private javax.swing.JTextField txtRoute1;
    private javax.swing.JTextField txtRoute2;
    private javax.swing.JTextField txtRoute3;
    private javax.swing.JTextField txtTicketPrice;
    private javax.swing.JTextField txtTicketPrice1;
    private javax.swing.JTextField txtTicketPrice2;
    private javax.swing.JTextField txtTicketPrice3;
    private javax.swing.JTextField txtTime;
    private javax.swing.JTextField txtTime1;
    private javax.swing.JTextField txtTime2;
    private javax.swing.JTextField txtTrain;
    private javax.swing.JTextField txtTrain1;
    private javax.swing.JTextField txtTrain2;
    private javax.swing.JTextField txtTrain3;
    // End of variables declaration//GEN-END:variables
}
