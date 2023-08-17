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

        
                Row headerRow = sheet.createRow(0);
                for (int column = 0; column < model.getColumnCount(); column++) {
                    Cell cell = headerRow.createCell(column);
                    cell.setCellValue(model.getColumnName(column));
                }

              
                for (int row = 0; row < model.getRowCount(); row++) {
                    Row dataRow = sheet.createRow(row + 1);
                    for (int column = 0; column < model.getColumnCount(); column++) {
                        Cell cell = dataRow.createCell(column);
                        cell.setCellValue(model.getValueAt(row, column).toString());
                    }
                }


                for (int column = 0; column < model.getColumnCount(); column++) {
                    sheet.autoSizeColumn(column);
                }


                FileOutputStream fileOut = new FileOutputStream(filePath);
                workbook.write(fileOut);
                fileOut.close();

                System.out.println("Excel file saved successfully.");
            } catch (Exception e) {

            }
        }
    }

    public void saveAsPDF(DefaultTableModel model) {
        try {

            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Save PDF");
            fileChooser.setFileFilter(new FileNameExtensionFilter("PDF files", "pdf"));


            int result = fileChooser.showSaveDialog(null);
            if (result == JFileChooser.APPROVE_OPTION) {

                String filePath = fileChooser.getSelectedFile().getAbsolutePath();


                if (!filePath.toLowerCase().endsWith(".pdf")) {
                    filePath += ".pdf";
                }

 
                Document document = new Document();
                PdfWriter.getInstance(document, new FileOutputStream(filePath));
                document.open();


                PdfPTable pdfTable = new PdfPTable(model.getColumnCount());


                for (int column = 0; column < model.getColumnCount(); column++) {
                    PdfPCell cell = new PdfPCell(new Phrase(model.getColumnName(column)));
                    pdfTable.addCell(cell);
                }


                for (int row = 0; row < model.getRowCount(); row++) {
                    for (int column = 0; column < model.getColumnCount(); column++) {
                        PdfPCell cell = new PdfPCell(new Phrase(model.getValueAt(row, column).toString()));
                        pdfTable.addCell(cell);
                    }
                }

   
                document.add(pdfTable);
                document.close();

                System.out.println("PDF file saved successfully.");
            } else if (result == JFileChooser.CANCEL_OPTION) {

            }
        } catch (Exception e) {

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
            
        }

        return reportList;
    }
}
