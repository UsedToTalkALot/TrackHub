/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import com.itextpdf.text.Document;
import database.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.reportModel;
import view.report;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;



public class reportController {
//     public void saveAsPDF(DefaultTableModel model, String filePath) {
//        try {
//        // Create a new document
//        Document document = new Document();
//        PdfWriter.getInstance(document, new FileOutputStream(filePath));
//        document.open();
//
//        // Create a PDF table
//        PdfPTable pdfTable = new PdfPTable(model.getColumnCount());
//
//        // Add table headers
//        for (int column = 0; column < model.getColumnCount(); column++) {
//            PdfPCell cell = new PdfPCell(new Phrase(model.getColumnName(column)));
//            pdfTable.addCell(cell);
//        }
//
//        // Add table rows
//        for (int row = 0; row < model.getRowCount(); row++) {
//            for (int column = 0; column < model.getColumnCount(); column++) {
//                PdfPCell cell = new PdfPCell(new Phrase(model.getValueAt(row, column).toString()));
//                pdfTable.addCell(cell);
//            }
//        }
//
//        // Add the table to the document
//        document.add(pdfTable);
//        document.close();
//
//        System.out.println("PDF file saved successfully.");
//    } catch (Exception e) {
//        e.printStackTrace();
//    }
//}
    
    public void saveAsPDF(DefaultTableModel model) {
    try {
        // Create a file chooser dialog
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Save PDF");
        fileChooser.setFileFilter(new FileNameExtensionFilter("PDF files", "pdf"));

        // Show the dialog and get the user's selection
        int result = fileChooser.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            // User clicked "Save" button
            String filePath = fileChooser.getSelectedFile().getAbsolutePath();

            // Add the ".pdf" extension if not already present
            if (!filePath.toLowerCase().endsWith(".pdf")) {
                filePath += ".pdf";
            }

            // Create a new document
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(filePath));
            document.open();

            // Create a PDF table
            PdfPTable pdfTable = new PdfPTable(model.getColumnCount());

            // Add table headers
            for (int column = 0; column < model.getColumnCount(); column++) {
                PdfPCell cell = new PdfPCell(new Phrase(model.getColumnName(column)));
                pdfTable.addCell(cell);
            }

            // Add table rows
            for (int row = 0; row < model.getRowCount(); row++) {
                for (int column = 0; column < model.getColumnCount(); column++) {
                    PdfPCell cell = new PdfPCell(new Phrase(model.getValueAt(row, column).toString()));
                    pdfTable.addCell(cell);
                }
            }

            // Add the table to the document
            document.add(pdfTable);
            document.close();

            System.out.println("PDF file saved successfully.");
        } else if (result == JFileChooser.CANCEL_OPTION) {
            // User clicked "Cancel" button or closed the dialog
            // Handle accordingly, e.g., display a message or perform other actions
        }
    } catch (Exception e) {
        // Handle the exception accordingly
    }
}

    
    
    
    
   

       
        public void populateTable(DefaultTableModel model) {
         try {
      reportController controller = new reportController();
        List<reportModel> reportList = getReportData();

        // Clear existing table data
//        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        // Populate table with fetched data
        for (reportModel report : reportList) {
            Object[] row = {
                report.getDate(),
                report.getPassenger_no(),
                report.getNo_of_tickets(),
                report.getSeat_class(),
                report.getPrice()
            };
            model.addRow(row);
        }
    } catch (Exception e) {
        // Print the exception details for debugging
    }
    }
    
    private Connection conn;
     
     public reportController(){
         conn= MyConnection.dbConnect();
     }
    PreparedStatement pst;
    ResultSet rs;
    
    report view;
    
     public List<reportModel> getReportData() {
        List<reportModel> reportList = new ArrayList<>();
        
        try {
            
            //System.out.println("k xa khabar ");
            String query = "SELECT * FROM TRANSACTION";
             pst = conn.prepareStatement(query);
             rs = pst.executeQuery();
            
            while (rs.next()) {
                String date = rs.getString("DATE");
                String passengerNo = rs.getString("PASSENGER_NO");
                String noOfTickets = rs.getString("NO_OF_TICKETS");
                String seatClass = rs.getString("CLASS");
                String price = rs.getString("PRICE");
                
                
            System.out.println("Date: " + date);
            System.out.println("Passenger Number: " + passengerNo);
            System.out.println("No. of Tickets: " + noOfTickets);
            System.out.println("Class: " + seatClass);
            System.out.println("Price: " + price);
            System.out.println("-----------------------------------");
                
                
                reportModel report = new reportModel(date, passengerNo, noOfTickets, seatClass, price);
               // reportModel report = new reportModel();
                //reportModel report = new reportModel(date, passengerNo, noOfTickets,seatClass, price);
                reportList.add(report);
            }
            
           conn.close();
        } catch (SQLException e) {
        }
        
        
        return reportList;
        
        
    }
    

    
    
}