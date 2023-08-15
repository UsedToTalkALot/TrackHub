package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import dao.trainDAO;

public class trainController {
    private trainDAO dao;

    public trainController() {
        dao = new trainDAO();
    }

    public List<String> fetchData(String date) {
        List<String> data = new ArrayList<>();

        try {
            data = dao.fetchData(date);
            System.out.println(data);
        } catch (SQLException | ClassNotFoundException e) {
        }

        return data;
    }
}
