package controller;

import dao.AddTrainDAO;

public class AddTrainController {
    
    private AddTrainDAO addTrainDAO;

    public AddTrainController() {
        addTrainDAO = new AddTrainDAO();
    }
    
    public void addTrainData(String addDate, String addTrain, String addTime, String addRoute,
            String addMeal, int addPriceA, int addPriceB) {
        addTrainDAO.addTrain(addDate, addTrain, addTime, addRoute, addMeal, addPriceA, addPriceB);
    }
}