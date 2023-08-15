package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class VisualizationModel {
    private Map<String, Map<String, Integer>> classSalesMap;
    private Map<String, Integer> overallSalesMap;

    public VisualizationModel() {
        classSalesMap = new HashMap<>();
        overallSalesMap = new HashMap<>();
    }

    public void addToClassSalesMap(String salesClass, String month, int monthlySales) {
        Map<String, Integer> monthlySalesMap = classSalesMap.getOrDefault(salesClass, new HashMap<>());
        monthlySalesMap.put(month, monthlySales);
        classSalesMap.put(salesClass, monthlySalesMap);
    }

    public void addToOverallSalesMap(String month, int monthlySales) {
        overallSalesMap.put(month, monthlySales);
    }

    public Map<String, Map<String, Integer>> getClassSalesMap() {
        return classSalesMap;
    }

    public Map<String, Integer> getOverallSalesMap() {
        return overallSalesMap;
    }

    public void clearData() {
        classSalesMap.clear();
        overallSalesMap.clear();
    }

    public String formatMonth(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("MMM yyyy"));
    }
}
