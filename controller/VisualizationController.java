

package controller;

import java.awt.GridLayout;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JPanel;
import model.VisualizationModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import view.visualization;
import database.*;
import dao.VisualizationDAO;
import java.awt.Toolkit;
import java.sql.SQLException;

public class VisualizationController {
    private VisualizationModel model;
    private visualization view;
    private VisualizationDAO dao;

    public VisualizationController(VisualizationModel model, visualization view) {
        this.model = model;
        this.view = view;
        dao = new VisualizationDAO();
    }

    public void generateCharts() {
        try {
 
            Map<String, Map<String, Integer>> classSalesMap = dao.getClassSalesData();
            Map<String, Integer> overallSalesMap = dao.getOverallSalesData();

            JPanel chartPanel = new JPanel(new GridLayout(1, 3));

             DefaultPieDataset pieDataset = new DefaultPieDataset();
            for (Map.Entry<String, Map<String, Integer>> entry : classSalesMap.entrySet()) {
                String salesClass = entry.getKey();
                Map<String, Integer> monthlySalesMap = entry.getValue();

                for (Map.Entry<String, Integer> monthlyEntry : monthlySalesMap.entrySet()) {
                    String month = monthlyEntry.getKey();
                    int monthlySales = monthlyEntry.getValue();

                     String key = salesClass + " - " + month;
                    pieDataset.setValue(key, monthlySales);
                }
            }
            JFreeChart pieChart = ChartFactory.createPieChart("Monthly Sales of Tickets by Class", pieDataset, true, true, false);
            ChartPanel pieChartPanel = new ChartPanel(pieChart);
            chartPanel.add(pieChartPanel);

             DefaultCategoryDataset barDataset = new DefaultCategoryDataset();
            for (Map.Entry<String, Map<String, Integer>> entry : classSalesMap.entrySet()) {
                String salesClass = entry.getKey();
                Map<String, Integer> monthlySalesMap = entry.getValue();

                for (Map.Entry<String, Integer> monthlyEntry : monthlySalesMap.entrySet()) {
                    String month = monthlyEntry.getKey();
                    int monthlySales = monthlyEntry.getValue();

                    barDataset.addValue(monthlySales, salesClass, month);
                }
            }
            JFreeChart barChart = ChartFactory.createBarChart("Monthly Sales Trend by Class", "Month", "Number of Tickets Sold",
                    barDataset, PlotOrientation.VERTICAL, true, true, false);
            ChartPanel barChartPanel = new ChartPanel(barChart);
            chartPanel.add(barChartPanel);

             DefaultCategoryDataset lineDataset = new DefaultCategoryDataset();
            for (Map.Entry<String, Integer> entry : overallSalesMap.entrySet()) {
                String month = entry.getKey();
                int monthlySales = entry.getValue();

                lineDataset.addValue(monthlySales, "Monthly Sales", month);
            }
            JFreeChart lineChart = ChartFactory.createLineChart("Overall Monthly Sales Trend", "Month", "Number of Tickets Sold",
                    lineDataset, PlotOrientation.VERTICAL, true, true, false);
            ChartPanel lineChartPanel = new ChartPanel(lineChart);
            chartPanel.add(lineChartPanel);

             JFrame frame = new JFrame("Trackhub: Visualization in Charts");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(chartPanel);
            frame.setSize(1920, 1080);
            frame.setVisible(true);
                    frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/thulologo.png")));

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
