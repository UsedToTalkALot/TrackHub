package dao;

import com.itextpdf.text.Document;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import database.MyConnection;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import view.report;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import java.io.FileOutputStream;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import model.reportModel;

public class reportDAO {
    private static Connection conn;

    public reportDAO() {
        conn = MyConnection.dbConnect();
    }

    public void saveAsExcel(DefaultTableModel model) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Save as Excel");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Excel Files", "xlsx"));

        int userSelection = fileChooser.showSaveDialog(null);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            String filePath = fileChooser.getSelectedFile().getAbsolutePath() + ".xlsx";

            try {
                Workbook workbook = new XSSFWorkbook();
                Sheet sheet = workbook.createSheet("Report");

                // Create header row
                Row headerRow = sheet.createRow(0);
                for (int column = 0; column < model.getColumnCount(); column++) {
                    Cell cell = headerRow.createCell(column);
                    cell.setCellValue(model.getColumnName(column));
                }

                // Create data rows
                for (int row = 0; row < model.getRowCount(); row++) {
                    Row dataRow = sheet.createRow(row + 1);
                    for (int column = 0; column < model.getColumnCount(); column++) {
                        Cell cell = dataRow.createCell(column);
                        cell.setCellValue(model.getValueAt(row, column).toString());
                    }
                }

                // Auto-size columns
                for (int column = 0; column < model.getColumnCount(); column++) {
                    sheet.autoSizeColumn(column);
                }

                // Write the workbook to a file
                FileOutputStream fileOut = new FileOutputStream(filePath);
                workbook.write(fileOut);
                fileOut.close();

                System.out.println("Excel file saved successfully.");
            } catch (Exception e) {
                // Handle the exception accordingly
            }
        }
    }

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

    public List<reportModel> getReportData(String selectedButton) {
        List<reportModel> reportList = new ArrayList<>();

        try {
            LocalDate currentDate = LocalDate.now();
            LocalDate startDate = null;
            LocalDate endDate = currentDate;

            switch (selectedButton) {
                case "today":
                    startDate = currentDate;
                    break;
                case "thisweek":
                    startDate = currentDate.minusDays(currentDate.getDayOfWeek().getValue() - 1);
                    break;
                case "thismonth":
                    startDate = currentDate.withDayOfMonth(1);
                    break;
                case "thisyear":
                    startDate = currentDate.withDayOfYear(1);
                    break;
                default:
                    // Handle invalid button value
                    break;
            }

            Date sqlStartDate = Date.valueOf(startDate);
            Date sqlEndDate = Date.valueOf(endDate);

            String query = "SELECT * FROM TRANSACTION WHERE DATE BETWEEN ? AND ?";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setDate(1, sqlStartDate);
            pst.setDate(2, sqlEndDate);
            ResultSet rs = pst.executeQuery();

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
                reportList.add(report);
            }

            conn.close();
        } catch (SQLException e) {
            // Handle the exception accordingly
        }

        return reportList;
    }

    public List<reportModel> getCustomData(Date from, Date to) {
        List<reportModel> reportList = new ArrayList<>();

        try {
            String query = "SELECT * FROM TRANSACTION WHERE DATE BETWEEN ? AND ?";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setDate(1, from);
            pst.setDate(2, to);
            ResultSet rs = pst.executeQuery();

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
                reportList.add(report);
            }

            conn.close();
        } catch (SQLException e) {
            // Handle the exception accordingly
        }

        return reportList;
    }
}
