
package controller;

import dao.reportDAO;
import model.reportModel;
import view.report;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Date;
import java.util.List;

public class reportController {
    private reportDAO dao;
    private report view;

    public reportController(report view) {
        this.view = view;
        dao = new reportDAO();
    }

    public void saveAsExcel(DefaultTableModel model) {
        dao.saveAsExcel(model);
    }

    public void saveAsPDF(DefaultTableModel model) {
        dao.saveAsPDF(model);
    }

    public void populateTable(DefaultTableModel model, String selectedButton) {
        try {
            List<reportModel> reportList = dao.getReportData(selectedButton);

            // Clear existing table data
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

            // Notify the view to update the table
            view.updateTable();
        } catch (Exception e) {
            // Handle the exception accordingly
        }
    }

    public void populateCustomTable(DefaultTableModel model, Date from, Date to) {
        try {
            List<reportModel> reportList = dao.getCustomData(from, to);

            // Clear existing table data
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

            // Notify the view to update the table
            view.updateTable();
        } catch (Exception e) {
            // Handle the exception accordingly
        }
    }
    public List<reportModel> getCustomData(Date from, Date to) {
    return dao.getCustomData(from, to);
}

}
