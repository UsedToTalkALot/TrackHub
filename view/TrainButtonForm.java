/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.*;

import controller.RemoveTrainController;
import java.awt.Color;
import java.awt.Cursor;
import controller.DatabaseHandler;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.jar.Attributes;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author USER
 */
public class TrainButtonForm extends javax.swing.JFrame {

   
    public TrainButtonForm() {
        initComponents();
        setSize(1920, 1200);
        this.setLocationRelativeTo(null);
        //hide add part
        addDate.setVisible(false);
        addTrain.setVisible(false);
        addTime.setVisible(false);
        addRoute.setVisible(false);
        addMeal.setVisible(false);
        addPriceA.setVisible(false);
        addPriceB.setVisible(false);
        addButton.setVisible(false);
        addPart.setVisible(false);

        //hide remove part
        removePart.setVisible(false);
        removeDate.setVisible(false);
        removeTrain.setVisible(false);
        
        setTitle("Trackhub: Train Page");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/thulologo.png")));

    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        DateLabel = new javax.swing.JLabel();
        Date_field = new javax.swing.JTextField();
        NameLabel = new javax.swing.JLabel();
        Name1 = new javax.swing.JTextField();
        Name2 = new javax.swing.JTextField();
        Name3 = new javax.swing.JTextField();
        Name4 = new javax.swing.JTextField();
        Name5 = new javax.swing.JTextField();
        Name6 = new javax.swing.JTextField();
        RouteLabel = new javax.swing.JLabel();
        Route1 = new javax.swing.JTextField();
        Route2 = new javax.swing.JTextField();
        Route3 = new javax.swing.JTextField();
        Route4 = new javax.swing.JTextField();
        Route5 = new javax.swing.JTextField();
        Route6 = new javax.swing.JTextField();
        TimeLabel = new javax.swing.JLabel();
        Time1 = new javax.swing.JTextField();
        Time2 = new javax.swing.JTextField();
        Time3 = new javax.swing.JTextField();
        Time4 = new javax.swing.JTextField();
        Time5 = new javax.swing.JTextField();
        Time6 = new javax.swing.JTextField();
        SeatsLabel = new javax.swing.JLabel();
        Seat1 = new javax.swing.JTextField();
        Seat2 = new javax.swing.JTextField();
        Seat3 = new javax.swing.JTextField();
        Seat4 = new javax.swing.JTextField();
        Seat5 = new javax.swing.JTextField();
        Seat6 = new javax.swing.JTextField();
        rectanglularField = new javax.swing.JLabel();
        search_btn = new javax.swing.JLabel();
        Oval1 = new javax.swing.JLabel();
        lblTrackHub = new javax.swing.JLabel();
        tableBack = new javax.swing.JLabel();
        lblTrains = new javax.swing.JLabel();
        lblBooking = new javax.swing.JLabel();
        lblTickets = new javax.swing.JLabel();
        btnTrain = new javax.swing.JButton();
        btnCustomer = new javax.swing.JButton();
        btnBooking = new javax.swing.JButton();
        btnTickets = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        Oval = new javax.swing.JLabel();
        addButton = new javax.swing.JLabel();
        addLabel = new javax.swing.JLabel();
        removeLabel = new javax.swing.JLabel();
        addOrRemove = new javax.swing.JLabel();
        addDate = new javax.swing.JTextField();
        addTrain = new javax.swing.JTextField();
        addTime = new javax.swing.JTextField();
        addRoute = new javax.swing.JTextField();
        addMeal = new javax.swing.JTextField();
        addPriceA = new javax.swing.JTextField();
        addPriceB = new javax.swing.JTextField();
        addPart = new javax.swing.JLabel();
        removeDate = new javax.swing.JTextField();
        removeTrain = new javax.swing.JTextField();
        removeButton = new javax.swing.JLabel();
        removePart = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1920, 1200));
        jPanel1.setMinimumSize(new java.awt.Dimension(1920, 1200));
        jPanel1.setLayout(null);

        DateLabel.setFont(new java.awt.Font("Georgia", 0, 32)); // NOI18N
        DateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DateLabel.setText("Date:");
        DateLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        DateLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(DateLabel);
        DateLabel.setBounds(510, 140, 135, 41);

        Date_field.setBackground(new java.awt.Color(195, 228, 232));
        Date_field.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        Date_field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Date_field.setText("YYYY/MM/DD");
        Date_field.setBorder(null);
        Date_field.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Date_fieldMouseClicked(evt);
            }
        });
        Date_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Date_fieldActionPerformed(evt);
            }
        });
        jPanel1.add(Date_field);
        Date_field.setBounds(710, 140, 340, 40);

        NameLabel.setFont(new java.awt.Font("Georgia", 0, 32)); // NOI18N
        NameLabel.setForeground(new java.awt.Color(255, 255, 255));
        NameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NameLabel.setText("Name");
        NameLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        NameLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(NameLabel);
        NameLabel.setBounds(510, 350, 135, 41);

        Name1.setEditable(false);
        Name1.setBackground(new java.awt.Color(71, 154, 239));
        Name1.setFont(new java.awt.Font("Georgia", 0, 28)); // NOI18N
        Name1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Name1.setBorder(null);
        Name1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Name1MouseEntered(evt);
            }
        });
        Name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Name1ActionPerformed(evt);
            }
        });
        jPanel1.add(Name1);
        Name1.setBounds(510, 460, 150, 50);

        Name2.setEditable(false);
        Name2.setBackground(new java.awt.Color(71, 154, 239));
        Name2.setFont(new java.awt.Font("Georgia", 0, 28)); // NOI18N
        Name2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Name2.setBorder(null);
        Name2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Name2MouseEntered(evt);
            }
        });
        Name2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Name2ActionPerformed(evt);
            }
        });
        jPanel1.add(Name2);
        Name2.setBounds(510, 540, 150, 50);

        Name3.setEditable(false);
        Name3.setBackground(new java.awt.Color(71, 154, 239));
        Name3.setFont(new java.awt.Font("Georgia", 0, 28)); // NOI18N
        Name3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Name3.setBorder(null);
        Name3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Name3MouseEntered(evt);
            }
        });
        Name3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Name3ActionPerformed(evt);
            }
        });
        jPanel1.add(Name3);
        Name3.setBounds(510, 610, 150, 50);

        Name4.setEditable(false);
        Name4.setBackground(new java.awt.Color(71, 154, 239));
        Name4.setFont(new java.awt.Font("Georgia", 0, 28)); // NOI18N
        Name4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Name4.setBorder(null);
        Name4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Name4MouseEntered(evt);
            }
        });
        Name4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Name4ActionPerformed(evt);
            }
        });
        jPanel1.add(Name4);
        Name4.setBounds(510, 690, 150, 50);

        Name5.setEditable(false);
        Name5.setBackground(new java.awt.Color(71, 154, 239));
        Name5.setFont(new java.awt.Font("Georgia", 0, 28)); // NOI18N
        Name5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Name5.setBorder(null);
        Name5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Name5MouseEntered(evt);
            }
        });
        Name5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Name5ActionPerformed(evt);
            }
        });
        jPanel1.add(Name5);
        Name5.setBounds(510, 770, 150, 50);

        Name6.setEditable(false);
        Name6.setBackground(new java.awt.Color(71, 154, 239));
        Name6.setFont(new java.awt.Font("Georgia", 0, 28)); // NOI18N
        Name6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Name6.setBorder(null);
        Name6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Name6MouseEntered(evt);
            }
        });
        Name6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Name6ActionPerformed(evt);
            }
        });
        jPanel1.add(Name6);
        Name6.setBounds(510, 850, 150, 50);

        RouteLabel.setFont(new java.awt.Font("Georgia", 0, 32)); // NOI18N
        RouteLabel.setForeground(new java.awt.Color(255, 255, 255));
        RouteLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RouteLabel.setText("Route");
        RouteLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        RouteLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(RouteLabel);
        RouteLabel.setBounds(700, 330, 191, 84);

        Route1.setEditable(false);
        Route1.setBackground(new java.awt.Color(71, 154, 239));
        Route1.setFont(new java.awt.Font("Georgia", 0, 28)); // NOI18N
        Route1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Route1.setBorder(null);
        Route1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Route1MouseEntered(evt);
            }
        });
        Route1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Route1ActionPerformed(evt);
            }
        });
        jPanel1.add(Route1);
        Route1.setBounds(720, 460, 150, 50);

        Route2.setEditable(false);
        Route2.setBackground(new java.awt.Color(71, 154, 239));
        Route2.setFont(new java.awt.Font("Georgia", 0, 28)); // NOI18N
        Route2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Route2.setBorder(null);
        Route2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Route2MouseEntered(evt);
            }
        });
        Route2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Route2ActionPerformed(evt);
            }
        });
        jPanel1.add(Route2);
        Route2.setBounds(720, 540, 150, 50);

        Route3.setEditable(false);
        Route3.setBackground(new java.awt.Color(71, 154, 239));
        Route3.setFont(new java.awt.Font("Georgia", 0, 28)); // NOI18N
        Route3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Route3.setBorder(null);
        Route3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Route3MouseEntered(evt);
            }
        });
        Route3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Route3ActionPerformed(evt);
            }
        });
        jPanel1.add(Route3);
        Route3.setBounds(720, 610, 150, 50);

        Route4.setEditable(false);
        Route4.setBackground(new java.awt.Color(71, 154, 239));
        Route4.setFont(new java.awt.Font("Georgia", 0, 28)); // NOI18N
        Route4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Route4.setBorder(null);
        Route4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Route4MouseEntered(evt);
            }
        });
        Route4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Route4ActionPerformed(evt);
            }
        });
        jPanel1.add(Route4);
        Route4.setBounds(720, 690, 150, 50);

        Route5.setEditable(false);
        Route5.setBackground(new java.awt.Color(71, 154, 239));
        Route5.setFont(new java.awt.Font("Georgia", 0, 28)); // NOI18N
        Route5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Route5.setBorder(null);
        Route5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Route5MouseEntered(evt);
            }
        });
        Route5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Route5ActionPerformed(evt);
            }
        });
        jPanel1.add(Route5);
        Route5.setBounds(720, 770, 150, 50);

        Route6.setEditable(false);
        Route6.setBackground(new java.awt.Color(71, 154, 239));
        Route6.setFont(new java.awt.Font("Georgia", 0, 28)); // NOI18N
        Route6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Route6.setBorder(null);
        Route6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Route6MouseEntered(evt);
            }
        });
        Route6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Route6ActionPerformed(evt);
            }
        });
        jPanel1.add(Route6);
        Route6.setBounds(720, 850, 150, 50);

        TimeLabel.setFont(new java.awt.Font("Georgia", 0, 32)); // NOI18N
        TimeLabel.setForeground(new java.awt.Color(255, 255, 255));
        TimeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TimeLabel.setText("Time");
        TimeLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TimeLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(TimeLabel);
        TimeLabel.setBounds(940, 350, 135, 41);

        Time1.setEditable(false);
        Time1.setBackground(new java.awt.Color(71, 154, 239));
        Time1.setFont(new java.awt.Font("Georgia", 0, 28)); // NOI18N
        Time1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Time1.setBorder(null);
        Time1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Time1MouseEntered(evt);
            }
        });
        Time1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Time1ActionPerformed(evt);
            }
        });
        jPanel1.add(Time1);
        Time1.setBounds(930, 460, 150, 50);

        Time2.setEditable(false);
        Time2.setBackground(new java.awt.Color(71, 154, 239));
        Time2.setFont(new java.awt.Font("Georgia", 0, 28)); // NOI18N
        Time2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Time2.setBorder(null);
        Time2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Time2MouseEntered(evt);
            }
        });
        Time2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Time2ActionPerformed(evt);
            }
        });
        jPanel1.add(Time2);
        Time2.setBounds(930, 540, 150, 50);

        Time3.setEditable(false);
        Time3.setBackground(new java.awt.Color(71, 154, 239));
        Time3.setFont(new java.awt.Font("Georgia", 0, 28)); // NOI18N
        Time3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Time3.setBorder(null);
        Time3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Time3MouseEntered(evt);
            }
        });
        Time3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Time3ActionPerformed(evt);
            }
        });
        jPanel1.add(Time3);
        Time3.setBounds(930, 610, 150, 50);

        Time4.setEditable(false);
        Time4.setBackground(new java.awt.Color(71, 154, 239));
        Time4.setFont(new java.awt.Font("Georgia", 0, 28)); // NOI18N
        Time4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Time4.setBorder(null);
        Time4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Time4MouseEntered(evt);
            }
        });
        Time4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Time4ActionPerformed(evt);
            }
        });
        jPanel1.add(Time4);
        Time4.setBounds(930, 690, 150, 50);

        Time5.setEditable(false);
        Time5.setBackground(new java.awt.Color(71, 154, 239));
        Time5.setFont(new java.awt.Font("Georgia", 0, 28)); // NOI18N
        Time5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Time5.setBorder(null);
        Time5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Time5MouseEntered(evt);
            }
        });
        Time5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Time5ActionPerformed(evt);
            }
        });
        jPanel1.add(Time5);
        Time5.setBounds(930, 770, 150, 50);

        Time6.setEditable(false);
        Time6.setBackground(new java.awt.Color(71, 154, 239));
        Time6.setFont(new java.awt.Font("Georgia", 0, 28)); // NOI18N
        Time6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Time6.setBorder(null);
        Time6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Time6MouseEntered(evt);
            }
        });
        Time6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Time6ActionPerformed(evt);
            }
        });
        jPanel1.add(Time6);
        Time6.setBounds(930, 850, 150, 50);

        SeatsLabel.setFont(new java.awt.Font("Georgia", 0, 32)); // NOI18N
        SeatsLabel.setForeground(new java.awt.Color(255, 255, 255));
        SeatsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SeatsLabel.setText("Seats Left");
        SeatsLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SeatsLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(SeatsLabel);
        SeatsLabel.setBounds(1140, 350, 140, 41);

        Seat1.setEditable(false);
        Seat1.setBackground(new java.awt.Color(71, 154, 239));
        Seat1.setFont(new java.awt.Font("Georgia", 0, 28)); // NOI18N
        Seat1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Seat1.setBorder(null);
        Seat1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Seat1MouseEntered(evt);
            }
        });
        Seat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seat1ActionPerformed(evt);
            }
        });
        jPanel1.add(Seat1);
        Seat1.setBounds(1140, 460, 150, 50);

        Seat2.setEditable(false);
        Seat2.setBackground(new java.awt.Color(71, 154, 239));
        Seat2.setFont(new java.awt.Font("Georgia", 0, 28)); // NOI18N
        Seat2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Seat2.setBorder(null);
        Seat2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Seat2MouseEntered(evt);
            }
        });
        Seat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seat2ActionPerformed(evt);
            }
        });
        jPanel1.add(Seat2);
        Seat2.setBounds(1140, 540, 150, 50);

        Seat3.setEditable(false);
        Seat3.setBackground(new java.awt.Color(71, 154, 239));
        Seat3.setFont(new java.awt.Font("Georgia", 0, 28)); // NOI18N
        Seat3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Seat3.setBorder(null);
        Seat3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Seat3MouseEntered(evt);
            }
        });
        Seat3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seat3ActionPerformed(evt);
            }
        });
        jPanel1.add(Seat3);
        Seat3.setBounds(1140, 610, 150, 50);

        Seat4.setEditable(false);
        Seat4.setBackground(new java.awt.Color(71, 154, 239));
        Seat4.setFont(new java.awt.Font("Georgia", 0, 28)); // NOI18N
        Seat4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Seat4.setBorder(null);
        Seat4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Seat4MouseEntered(evt);
            }
        });
        Seat4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seat4ActionPerformed(evt);
            }
        });
        jPanel1.add(Seat4);
        Seat4.setBounds(1140, 690, 150, 50);

        Seat5.setEditable(false);
        Seat5.setBackground(new java.awt.Color(71, 154, 239));
        Seat5.setFont(new java.awt.Font("Georgia", 0, 28)); // NOI18N
        Seat5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Seat5.setBorder(null);
        Seat5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Seat5MouseEntered(evt);
            }
        });
        Seat5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seat5ActionPerformed(evt);
            }
        });
        jPanel1.add(Seat5);
        Seat5.setBounds(1140, 770, 150, 50);

        Seat6.setEditable(false);
        Seat6.setBackground(new java.awt.Color(71, 154, 239));
        Seat6.setFont(new java.awt.Font("Georgia", 0, 28)); // NOI18N
        Seat6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Seat6.setBorder(null);
        Seat6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Seat6MouseEntered(evt);
            }
        });
        Seat6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seat6ActionPerformed(evt);
            }
        });
        jPanel1.add(Seat6);
        Seat6.setBounds(1140, 850, 150, 50);

        rectanglularField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(rectanglularField);
        rectanglularField.setBounds(690, 130, 440, 60);

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
        search_btn.setBounds(1125, 140, 93, 46);

        Oval1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/UpperRect.png"))); // NOI18N
        Oval1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(Oval1);
        Oval1.setBounds(450, 84, 878, 171);

        lblTrackHub.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTrackHub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Frame.png"))); // NOI18N
        jPanel1.add(lblTrackHub);
        lblTrackHub.setBounds(50, 40, 260, 150);

        tableBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/table.png"))); // NOI18N
        tableBack.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(tableBack);
        tableBack.setBounds(450, 305, 878, 633);

        lblTrains.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTrains.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/material-symbols_train-rounded.png"))); // NOI18N
        jPanel1.add(lblTrains);
        lblTrains.setBounds(40, 450, 80, 80);

        lblBooking.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBooking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tabler_brand-booking (1).png"))); // NOI18N
        jPanel1.add(lblBooking);
        lblBooking.setBounds(40, 610, 80, 80);

        lblTickets.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTickets.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dashicons_tickets-alt.png"))); // NOI18N
        jPanel1.add(lblTickets);
        lblTickets.setBounds(45, 780, 80, 70);

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
        });
        jPanel1.add(btnTrain);
        btnTrain.setBounds(130, 470, 120, 50);

        btnCustomer.setBackground(new java.awt.Color(42, 134, 251));
        btnCustomer.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        btnCustomer.setForeground(new java.awt.Color(255, 255, 255));
        btnCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/c.png"))); // NOI18N
        btnCustomer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnCustomer.setBorderPainted(false);
        btnCustomer.setContentAreaFilled(false);
        btnCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCustomerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCustomerMouseExited(evt);
            }
        });
        btnCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerActionPerformed(evt);
            }
        });
        jPanel1.add(btnCustomer);
        btnCustomer.setBounds(70, 260, 210, 110);

        btnBooking.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        btnBooking.setForeground(new java.awt.Color(5, 51, 111));
        btnBooking.setText("BOOKING");
        btnBooking.setBorder(null);
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
        btnBooking.setBounds(130, 620, 160, 60);

        btnTickets.setBackground(new java.awt.Color(42, 134, 251));
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
        btnTickets.setBounds(130, 790, 140, 60);

        btnExit.setBackground(new java.awt.Color(42, 134, 251));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/material-symbols_logout-rounded.png"))); // NOI18N
        btnExit.setBorder(null);
        btnExit.setBorderPainted(false);
        btnExit.setContentAreaFilled(false);
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
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
        btnExit.setBounds(120, 950, 110, 90);

        Oval.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(Oval);
        Oval.setBounds(450, 84, 878, 171);

        addButton.setFont(new java.awt.Font("Georgia", 0, 32)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addButtonMouseEntered(evt);
            }
        });
        jPanel1.add(addButton);
        addButton.setBounds(1490, 850, 230, 60);

        addLabel.setFont(new java.awt.Font("Georgia", 0, 32)); // NOI18N
        addLabel.setForeground(new java.awt.Color(255, 255, 255));
        addLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addLabel.setText("Add");
        addLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addLabelMouseEntered(evt);
            }
        });
        jPanel1.add(addLabel);
        addLabel.setBounds(1397, 129, 200, 80);

        removeLabel.setFont(new java.awt.Font("Georgia", 0, 32)); // NOI18N
        removeLabel.setForeground(new java.awt.Color(255, 255, 255));
        removeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        removeLabel.setText("Remove");
        removeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                removeLabelMouseEntered(evt);
            }
        });
        jPanel1.add(removeLabel);
        removeLabel.setBounds(1650, 131, 190, 80);

        addOrRemove.setFont(new java.awt.Font("Georgia", 0, 32)); // NOI18N
        addOrRemove.setForeground(new java.awt.Color(255, 255, 255));
        addOrRemove.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addOrRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/smallOval.png"))); // NOI18N
        jPanel1.add(addOrRemove);
        addOrRemove.setBounds(1340, 84, 550, 171);

        addDate.setBackground(new java.awt.Color(71, 154, 239));
        addDate.setFont(new java.awt.Font("Georgia", 0, 28)); // NOI18N
        addDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        addDate.setBorder(null);
        addDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addDateMouseEntered(evt);
            }
        });
        addDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDateActionPerformed(evt);
            }
        });
        jPanel1.add(addDate);
        addDate.setBounds(1620, 350, 200, 50);

        addTrain.setBackground(new java.awt.Color(71, 154, 239));
        addTrain.setFont(new java.awt.Font("Georgia", 0, 28)); // NOI18N
        addTrain.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        addTrain.setBorder(null);
        addTrain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addTrainMouseEntered(evt);
            }
        });
        addTrain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTrainActionPerformed(evt);
            }
        });
        jPanel1.add(addTrain);
        addTrain.setBounds(1630, 430, 200, 50);

        addTime.setBackground(new java.awt.Color(71, 154, 239));
        addTime.setFont(new java.awt.Font("Georgia", 0, 28)); // NOI18N
        addTime.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        addTime.setBorder(null);
        addTime.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addTimeMouseEntered(evt);
            }
        });
        addTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTimeActionPerformed(evt);
            }
        });
        jPanel1.add(addTime);
        addTime.setBounds(1630, 510, 190, 50);

        addRoute.setBackground(new java.awt.Color(71, 154, 239));
        addRoute.setFont(new java.awt.Font("Georgia", 0, 28)); // NOI18N
        addRoute.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        addRoute.setBorder(null);
        addRoute.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addRouteMouseEntered(evt);
            }
        });
        addRoute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRouteActionPerformed(evt);
            }
        });
        jPanel1.add(addRoute);
        addRoute.setBounds(1620, 590, 190, 50);

        addMeal.setBackground(new java.awt.Color(71, 154, 239));
        addMeal.setFont(new java.awt.Font("Georgia", 0, 28)); // NOI18N
        addMeal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        addMeal.setBorder(null);
        addMeal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMealMouseEntered(evt);
            }
        });
        addMeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMealActionPerformed(evt);
            }
        });
        jPanel1.add(addMeal);
        addMeal.setBounds(1630, 670, 180, 50);

        addPriceA.setBackground(new java.awt.Color(71, 154, 239));
        addPriceA.setFont(new java.awt.Font("Georgia", 0, 28)); // NOI18N
        addPriceA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        addPriceA.setBorder(null);
        addPriceA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addPriceAMouseEntered(evt);
            }
        });
        addPriceA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPriceAActionPerformed(evt);
            }
        });
        jPanel1.add(addPriceA);
        addPriceA.setBounds(1620, 760, 60, 50);

        addPriceB.setBackground(new java.awt.Color(71, 154, 239));
        addPriceB.setFont(new java.awt.Font("Georgia", 0, 28)); // NOI18N
        addPriceB.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        addPriceB.setBorder(null);
        addPriceB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addPriceBMouseEntered(evt);
            }
        });
        addPriceB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPriceBActionPerformed(evt);
            }
        });
        jPanel1.add(addPriceB);
        addPriceB.setBounds(1750, 760, 60, 50);

        addPart.setFont(new java.awt.Font("Georgia", 0, 32)); // NOI18N
        addPart.setForeground(new java.awt.Color(255, 255, 255));
        addPart.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addPart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/addRectangle.png"))); // NOI18N
        jPanel1.add(addPart);
        addPart.setBounds(1350, 300, 530, 633);

        removeDate.setBackground(new java.awt.Color(71, 154, 239));
        removeDate.setFont(new java.awt.Font("Georgia", 0, 28)); // NOI18N
        removeDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        removeDate.setBorder(null);
        removeDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                removeDateMouseEntered(evt);
            }
        });
        removeDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeDateActionPerformed(evt);
            }
        });
        jPanel1.add(removeDate);
        removeDate.setBounds(1610, 400, 190, 50);

        removeTrain.setBackground(new java.awt.Color(71, 154, 239));
        removeTrain.setFont(new java.awt.Font("Georgia", 0, 28)); // NOI18N
        removeTrain.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        removeTrain.setBorder(null);
        removeTrain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                removeTrainMouseEntered(evt);
            }
        });
        removeTrain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeTrainActionPerformed(evt);
            }
        });
        jPanel1.add(removeTrain);
        removeTrain.setBounds(1615, 530, 190, 50);

        removeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                removeButtonMouseEntered(evt);
            }
        });
        jPanel1.add(removeButton);
        removeButton.setBounds(1517, 676, 220, 50);

        removePart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/removeRectangle.png"))); // NOI18N
        jPanel1.add(removePart);
        removePart.setBounds(1371, 305, 483, 424);

        background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BlueGreen.png"))); // NOI18N
        jPanel1.add(background);
        background.setBounds(366, 0, 1554, 1080);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1920, 1130);

        setSize(new java.awt.Dimension(1936, 1088));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        login s = new login();
        s.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookingActionPerformed
        BookingButtonForm b = new BookingButtonForm();
        b.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnBookingActionPerformed

    private void btnBookingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBookingMouseEntered
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        btnBooking.setCursor(cursor);

    }//GEN-LAST:event_btnBookingMouseEntered

    private void btnBookingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBookingMouseExited

        btnBooking.setBackground(new java.awt.Color(42, 134, 251));
        btnBooking.setContentAreaFilled(false);
    }//GEN-LAST:event_btnBookingMouseExited

    private void btnTicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTicketsActionPerformed
        // TODO add your handling code here:
        TicketButtonForm t = new TicketButtonForm();
        t.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnTicketsActionPerformed

    private void btnCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerActionPerformed
        // TODO add your handling code here:
        dashboard db = new dashboard();
        db.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCustomerActionPerformed

    private void btnCustomerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCustomerMouseExited


    }//GEN-LAST:event_btnCustomerMouseExited

    private void btnCustomerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCustomerMouseEntered
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        btnCustomer.setCursor(cursor);
    }//GEN-LAST:event_btnCustomerMouseEntered

    private void btnTicketsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTicketsMouseEntered
        // TODO add your handling code here:
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        btnTickets.setCursor(cursor);

    }//GEN-LAST:event_btnTicketsMouseEntered

    private void btnTicketsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTicketsMouseExited

        btnTickets.setBackground(new java.awt.Color(42, 134, 251));
        btnTickets.setContentAreaFilled(false);
    }//GEN-LAST:event_btnTicketsMouseExited

    private void btnTrainMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrainMouseEntered
        // TODO add your handling code here:
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        btnTrain.setCursor(cursor);
    }//GEN-LAST:event_btnTrainMouseEntered

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        // TODO add your handling code here:
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        btnExit.setCursor(cursor);
    }//GEN-LAST:event_btnExitMouseEntered

    private void Date_fieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Date_fieldMouseClicked
        // TODO add your handling code here:
        Date_field.setText("");

    }//GEN-LAST:event_Date_fieldMouseClicked

    private void Date_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Date_fieldActionPerformed
        // TODO add your handling code here:
        Date_field.setVisible(false);
    }//GEN-LAST:event_Date_fieldActionPerformed

    private void search_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_btnMouseClicked
        // first empty out the fields
        Name1.setText("");
        Name2.setText("");
        Name3.setText("");
        Name4.setText("");
        Name5.setText("");
        Name6.setText("");

        Route1.setText("");
        Route2.setText("");
        Route3.setText("");
        Route4.setText("");
        Route5.setText("");
        Route6.setText("");

        Time1.setText("");
        Time2.setText("");
        Time3.setText("");
        Time4.setText("");
        Time5.setText("");
        Time6.setText("");

        Seat1.setText("");
        Seat2.setText("");
        Seat3.setText("");
        Seat4.setText("");
        Seat5.setText("");
        Seat6.setText("");

        String inputDate = Date_field.getText();

        if (inputDate.equals("YYYY/MM/DD") || inputDate.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter a date", "Enter Date", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
                LocalDate dateObj = LocalDate.parse(inputDate, formatter);
                LocalDate minDate = LocalDate.of(2023, 1, 1);
                LocalDate maxDate = LocalDate.now().plusMonths(2);

                if (dateObj.isBefore(minDate) || dateObj.isAfter(maxDate)) {
                    JOptionPane.showMessageDialog(null, "The given date is out of range (2023/01/01 - today + 2 months)", "Out Of Range", JOptionPane.WARNING_MESSAGE);
                } else {
                    DatabaseHandler databaseHandler = new DatabaseHandler(); // Handle exception appropriately
                    List<String> fetchedData = databaseHandler.fetchData(inputDate);
                    if (!fetchedData.isEmpty()) {
                        // Populate the GUI components with fetched data
                        
                        try {
                            String sit = "";
                            Name1.setText(fetchedData.get(0));
                            Route1.setText(fetchedData.get(1));
                            Time1.setText(fetchedData.get(2));
                            sit = fetchedData.get(3) + "/" + fetchedData.get(4);
                            Seat1.setText(sit);
                            
                            Name2.setText(fetchedData.get(5));
                            Route2.setText(fetchedData.get(6));
                            Time2.setText(fetchedData.get(7));
                            sit = fetchedData.get(8) + "/" + fetchedData.get(9);
                            Seat2.setText(sit);
                            
                            Name3.setText(fetchedData.get(10));
                            Route3.setText(fetchedData.get(11));
                            Time3.setText(fetchedData.get(12));
                            sit = fetchedData.get(13) + "/" + fetchedData.get(14);
                            Seat3.setText(sit);
                            
                            Name4.setText(fetchedData.get(5));
                            Route4.setText(fetchedData.get(16));
                            Time4.setText(fetchedData.get(17));
                            sit = fetchedData.get(18) + "/" + fetchedData.get(19);
                            Seat4.setText(sit);
                            
                            Name5.setText(fetchedData.get(20));
                            Route5.setText(fetchedData.get(21));
                            Time5.setText(fetchedData.get(22));
                            sit = fetchedData.get(23) + "/" + fetchedData.get(24);
                            Seat5.setText(sit);
                            
                            Name6.setText(fetchedData.get(25));
                            Route6.setText(fetchedData.get(26));
                            Time6.setText(fetchedData.get(27));
                            sit = fetchedData.get(28) + "/" + fetchedData.get(29);
                            Seat6.setText(sit);
                        } catch (IndexOutOfBoundsException e) {
                        }
                    } else {
                        System.out.println("No data found for the specified date.");
                        JOptionPane.showMessageDialog(null, "Can't find train on the given date", "No Train", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            } catch (DateTimeParseException e) {
                JOptionPane.showMessageDialog(null, "Make sure the date is in yyyy/MM/dd format", "Format error", JOptionPane.WARNING_MESSAGE);
            }
        }


    }//GEN-LAST:event_search_btnMouseClicked

    private void search_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_btnMouseEntered
        // TODO add your handling code here:
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR); 
        search_btn.setCursor(cursor);
    }//GEN-LAST:event_search_btnMouseEntered

    private void Name1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Name1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Name1MouseEntered

    private void Name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Name1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Name1ActionPerformed

    private void Name2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Name2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Name2MouseEntered

    private void Name2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Name2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Name2ActionPerformed

    private void Name3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Name3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Name3MouseEntered

    private void Name3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Name3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Name3ActionPerformed

    private void Name4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Name4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Name4MouseEntered

    private void Name4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Name4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Name4ActionPerformed

    private void Name5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Name5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Name5MouseEntered

    private void Name5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Name5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Name5ActionPerformed

    private void Name6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Name6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Name6MouseEntered

    private void Name6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Name6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Name6ActionPerformed

    private void Route1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Route1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Route1MouseEntered

    private void Route1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Route1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Route1ActionPerformed

    private void Route2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Route2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Route2MouseEntered

    private void Route2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Route2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Route2ActionPerformed

    private void Route3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Route3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Route3MouseEntered

    private void Route3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Route3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Route3ActionPerformed

    private void Route4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Route4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Route4MouseEntered

    private void Route4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Route4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Route4ActionPerformed

    private void Route5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Route5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Route5MouseEntered

    private void Route5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Route5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Route5ActionPerformed

    private void Route6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Route6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Route6MouseEntered

    private void Route6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Route6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Route6ActionPerformed

    private void Time1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Time1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Time1MouseEntered

    private void Time1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Time1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Time1ActionPerformed

    private void Time2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Time2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Time2MouseEntered

    private void Time2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Time2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Time2ActionPerformed

    private void Time3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Time3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Time3MouseEntered

    private void Time3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Time3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Time3ActionPerformed

    private void Time4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Time4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Time4MouseEntered

    private void Time4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Time4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Time4ActionPerformed

    private void Time5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Time5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Time5MouseEntered

    private void Time5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Time5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Time5ActionPerformed

    private void Time6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Time6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Time6MouseEntered

    private void Time6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Time6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Time6ActionPerformed

    private void Seat1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Seat1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Seat1MouseEntered

    private void Seat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seat1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Seat1ActionPerformed

    private void Seat2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Seat2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Seat2MouseEntered

    private void Seat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seat2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Seat2ActionPerformed

    private void Seat3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Seat3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Seat3MouseEntered

    private void Seat3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seat3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Seat3ActionPerformed

    private void Seat4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Seat4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Seat4MouseEntered

    private void Seat4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seat4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Seat4ActionPerformed

    private void Seat5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Seat5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Seat5MouseEntered

    private void Seat5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seat5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Seat5ActionPerformed

    private void Seat6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Seat6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Seat6MouseEntered

    private void Seat6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seat6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Seat6ActionPerformed

    private void addDateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addDateMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_addDateMouseEntered

    private void addDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addDateActionPerformed

    private void addPriceBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPriceBMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_addPriceBMouseEntered

    private void addPriceBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPriceBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addPriceBActionPerformed

    private void addButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseEntered
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        addButton.setCursor(cursor);
    }//GEN-LAST:event_addButtonMouseEntered

    private void addLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addLabelMouseClicked
        // TODO add your handling code here:
        //hide remove
        removePart.setVisible(false);
        removeDate.setVisible(false);
        removeTrain.setVisible(false);

        //Shows its component
        addDate.setVisible(true);
        addTrain.setVisible(true);
        addTime.setVisible(true);
        addMeal.setVisible(true);

        addPriceA.setVisible(true);
        addPriceB.setVisible(true);
        addButton.setVisible(true);
        addPart.setVisible(true);
        addRoute.setVisible(true);

        //to clear the fields
        addDate.setText("");
        addTrain.setText("");
        addTime.setText("");
        addRoute.setText("");
        addMeal.setText("");

        addPriceA.setText("");
        addPriceB.setText("");
    }//GEN-LAST:event_addLabelMouseClicked

    private void removeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeLabelMouseClicked
        // TODO add your handling code here:
        addDate.setVisible(false);
        addTrain.setVisible(false);
        addTime.setVisible(false);
        addMeal.setVisible(false);

        addPriceA.setVisible(false);
        addPriceB.setVisible(false);
        addButton.setVisible(false);
        addPart.setVisible(false);
        addRoute.setVisible(false);

        //show its components
        removePart.setVisible(true);
        removeDate.setVisible(true);
        removeTrain.setVisible(true);

        String removeDate1 = removeDate.getText();
        String removeTrain1 = removeTrain.getText();
        System.out.println(removeDate.getText());

        RemoveTrainController controller = new RemoveTrainController();

        controller.removeTrain(removeDate1, removeTrain1);
    }//GEN-LAST:event_removeLabelMouseClicked

    private void addTrainMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addTrainMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_addTrainMouseEntered

    private void addTrainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTrainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addTrainActionPerformed

    private void addTimeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addTimeMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_addTimeMouseEntered

    private void addTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addTimeActionPerformed

    private void addPriceAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPriceAMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_addPriceAMouseEntered

    private void addPriceAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPriceAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addPriceAActionPerformed

    private void addLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addLabelMouseEntered
        // TODO add your handling code here:
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        addLabel.setCursor(cursor);

    }//GEN-LAST:event_addLabelMouseEntered

    private void removeLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeLabelMouseEntered
        // TODO add your handling code here:
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        removeLabel.setCursor(cursor);
    }//GEN-LAST:event_removeLabelMouseEntered

    private void removeDateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeDateMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_removeDateMouseEntered

    private void removeDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_removeDateActionPerformed

    private void removeTrainMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeTrainMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_removeTrainMouseEntered

    private void removeTrainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeTrainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_removeTrainActionPerformed

    private void removeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeButtonMouseEntered
        // TODO add your handling code here:
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        removeButton.setCursor(cursor);
    }//GEN-LAST:event_removeButtonMouseEntered

    private void addRouteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addRouteMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_addRouteMouseEntered

    private void addRouteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRouteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addRouteActionPerformed

    private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseClicked
        // TODO add your handling code here:

        String addDate1 = addDate.getText();
        String addTrain1 = addTrain.getText();
        String addTime1 = addTime.getText();
        String addRoute1 = addRoute.getText();
        String addMeal1 = addMeal.getText();
        int addPriceA1 = Integer.parseInt(addPriceA.getText());
        int addPriceB1 = Integer.parseInt(addPriceB.getText());

// Date validation: Check if the input date is within 2 months of today's date
        LocalDate currentDate = LocalDate.now();
        LocalDate inputDate = LocalDate.parse(addDate1, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        LocalDate maxDate = currentDate.plusMonths(2);

        if (inputDate.isBefore(currentDate) || inputDate.isAfter(maxDate)) {
            JOptionPane.showMessageDialog(null, "Please enter a date within 2 months of today's date",
                    "Invalid Date", JOptionPane.WARNING_MESSAGE);
        } 
        else {
            // Time validation: Check if the input time has round-up minutes (00, 15, 30, 45)

            LocalTime inputTime = LocalTime.parse(addTime1, DateTimeFormatter.ofPattern("HH:mm"));
            int minute = inputTime.getMinute();

            if (minute % 15 != 0) {
                
                JOptionPane.showMessageDialog(null, "Please enter a time with round-up minutes (00, 15, 30, 45)",
                        "Invalid Time", JOptionPane.WARNING_MESSAGE);
            } 
            else {
                // Instantiate the AddTrainController class
                AddTrainController controller = new AddTrainController();

                // Call the addTrainData method to pass the data
                controller.addTrainData(addDate1, addTrain1, addTime1, addRoute1, addMeal1, addPriceA1, addPriceB1);

                JOptionPane.showMessageDialog(null, "Data Successfully Added", "Data Added", JOptionPane.INFORMATION_MESSAGE);
                //clear the fields
                addDate.setText("");
                addTrain.setText("");
                addTime.setText("");
                addRoute.setText("");
                addMeal.setText("");

                addPriceA.setText("");
                addPriceB.setText("");
            }
        }


    }//GEN-LAST:event_addButtonMouseClicked

    private void removeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeButtonMouseClicked
        // TODO add your handling code here:

        String removeDate1 = removeDate.getText();
        String removeTrain1 = removeTrain.getText();

        // Instantiate the RemoveTrainController class
        RemoveTrainController controller = new RemoveTrainController();

        // Call the removeTrainData method to delete the row
        controller.removeTrain(removeDate1, removeTrain1);

        JOptionPane.showMessageDialog(null, "Data Successfully Deleted", "Data Deleted", JOptionPane.WARNING_MESSAGE);
        removeDate.setText("");
        removeTrain.setText("");
    }//GEN-LAST:event_removeButtonMouseClicked

    private void addMealMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMealMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_addMealMouseEntered

    private void addMealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMealActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addMealActionPerformed

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
            java.util.logging.Logger.getLogger(TrainButtonForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrainButtonForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrainButtonForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrainButtonForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrainButtonForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DateLabel;
    private javax.swing.JTextField Date_field;
    private javax.swing.JTextField Name1;
    private javax.swing.JTextField Name2;
    private javax.swing.JTextField Name3;
    private javax.swing.JTextField Name4;
    private javax.swing.JTextField Name5;
    private javax.swing.JTextField Name6;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel Oval;
    private javax.swing.JLabel Oval1;
    private javax.swing.JTextField Route1;
    private javax.swing.JTextField Route2;
    private javax.swing.JTextField Route3;
    private javax.swing.JTextField Route4;
    private javax.swing.JTextField Route5;
    private javax.swing.JTextField Route6;
    private javax.swing.JLabel RouteLabel;
    private javax.swing.JTextField Seat1;
    private javax.swing.JTextField Seat2;
    private javax.swing.JTextField Seat3;
    private javax.swing.JTextField Seat4;
    private javax.swing.JTextField Seat5;
    private javax.swing.JTextField Seat6;
    private javax.swing.JLabel SeatsLabel;
    private javax.swing.JTextField Time1;
    private javax.swing.JTextField Time2;
    private javax.swing.JTextField Time3;
    private javax.swing.JTextField Time4;
    private javax.swing.JTextField Time5;
    private javax.swing.JTextField Time6;
    private javax.swing.JLabel TimeLabel;
    private javax.swing.JLabel addButton;
    private javax.swing.JTextField addDate;
    private javax.swing.JLabel addLabel;
    private javax.swing.JTextField addMeal;
    private javax.swing.JLabel addOrRemove;
    private javax.swing.JLabel addPart;
    private javax.swing.JTextField addPriceA;
    private javax.swing.JTextField addPriceB;
    private javax.swing.JTextField addRoute;
    private javax.swing.JTextField addTime;
    private javax.swing.JTextField addTrain;
    private javax.swing.JLabel background;
    private javax.swing.JButton btnBooking;
    private javax.swing.JButton btnCustomer;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnTickets;
    private javax.swing.JButton btnTrain;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBooking;
    private javax.swing.JLabel lblTickets;
    private javax.swing.JLabel lblTrackHub;
    private javax.swing.JLabel lblTrains;
    private javax.swing.JLabel rectanglularField;
    private javax.swing.JLabel removeButton;
    private javax.swing.JTextField removeDate;
    private javax.swing.JLabel removeLabel;
    private javax.swing.JLabel removePart;
    private javax.swing.JTextField removeTrain;
    private javax.swing.JLabel search_btn;
    private javax.swing.JLabel tableBack;
    // End of variables declaration//GEN-END:variables
}
