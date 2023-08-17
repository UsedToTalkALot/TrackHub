

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


            model.setRowCount(0);


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


            view.updateTable();
        } catch (Exception e) {

        }
    }

    public void populateCustomTable(DefaultTableModel model, Date from, Date to) {
        try {
            List<reportModel> reportList = dao.getCustomData(from, to);


            model.setRowCount(0);


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


            view.updateTable();
        } catch (Exception e) {

        }
    }
    public List<reportModel> getCustomData(Date from, Date to) {
    return dao.getCustomData(from, to);
}

}
