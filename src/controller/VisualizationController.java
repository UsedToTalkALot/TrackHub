package controller;

import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
public class VisualizationController {
    private VisualizationModel model;
    private visualization view;
    private Connection conn;

    public VisualizationController(VisualizationModel model, visualization view) {
        this.model = model;
        this.view = view;
    }

    public void generateCharts() {
        
        // Database connection details
        String url = "jdbc:mysql://localhost:3306/trackhub";
        String username = "root";
        String password = "ENTERT@1nment";
            //conn= MyConnection.dbConnect();

        // Fetch data from the database
        String query = "SELECT date, price, class FROM transaction";
        try (Connection conn = DriverManager.getConnection(url, username, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            // Map to store monthly sales data for each class
            Map<String, Map<String, Integer>> classSalesMap = new HashMap<>();
            // Map to store overall monthly sales
            Map<String, Integer> overallSalesMap = new HashMap<>();

            while (rs.next()) {
                String date = rs.getString("date");
                int price = rs.getInt("price");
                String salesClass = rs.getString("class");

                // Calculate the month from the date
                LocalDate localDate = LocalDate.parse(date);
                String month = localDate.format(DateTimeFormatter.ofPattern("MMM yyyy"));

                // Update the class sales map
                Map<String, Integer> monthlySalesMap = classSalesMap.getOrDefault(salesClass, new HashMap<>());
                int currentMonthlySales = monthlySalesMap.getOrDefault(month, 0);
                currentMonthlySales += price;
                monthlySalesMap.put(month, currentMonthlySales);
                classSalesMap.put(salesClass, monthlySalesMap);

                // Update the overall sales map
                int currentOverallSales = overallSalesMap.getOrDefault(month, 0);
                currentOverallSales += price;
                overallSalesMap.put(month, currentOverallSales);

            }

            // Create a JPanel to hold the charts
            JPanel chartPanel = new JPanel(new GridLayout(1, 3));

            // Pie chart - Monthly sales for each clas
            DefaultPieDataset pieDataset = new DefaultPieDataset();
            for (Map.Entry<String, Map<String, Integer>> entry : classSalesMap.entrySet()) {
                String salesClass = entry.getKey();
                Map<String, Integer> monthlySalesMap = entry.getValue();

                for (Map.Entry<String, Integer> monthlyEntry : monthlySalesMap.entrySet()) {
                             String month = monthlyEntry.getKey();
                    int monthlySales = monthlyEntry.getValue();

                    // Create a unique key for the pie chart using the class and month
                    String key = salesClass + " - " + month;
                    pieDataset.setValue(key, monthlySales);
                }
            }
            JFreeChart pieChart = ChartFactory.createPieChart("Monthly Sales of Tickets by Class", pieDataset, true, true, false);
            ChartPanel pieChartPanel = new ChartPanel(pieChart);
            chartPanel.add(pieChartPanel);

            // Bar graph - Monthly sales by class
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

            // Line graph - Overall monthly sales
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

            // Add the chart panel to the JFrame
           // getContentPane().add(chartPanel);
            
            // Create a JFrame to display the panel
            JFrame frame = new JFrame("Visualization of report");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(chartPanel);
            frame.setSize(1920,1080);
            frame.setVisible(true);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
    

    // Other controller methods can be added as needed

//    public static void main(String[] args) {
//        VisualizationModel model = new VisualizationModel();
//        visualization view = new visualization();
//        VisualizationController controller = new VisualizationController(model, view);
//
//        // Set up any necessary listeners or event handlers
//
//        view.setVisible(true);
//        controller.generateCharts();
//    }
//}
