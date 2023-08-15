package controller;

import dao.RemoveTrainDAO;

public class RemoveTrainController {
    public void removeTrain(String removeDate, String removeTrain) {
        RemoveTrainDAO dao = new RemoveTrainDAO();
        boolean success = dao.removeTrainData(removeDate, removeTrain);

        if (success) {
            System.out.println("Train data removed successfully.");
        } else {
            System.out.println("Failed to remove train data.");
        }
    }
}
