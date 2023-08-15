package controller;

import dao.DatabaseHandlerDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DatabaseHandler {
    private final DatabaseHandlerDAO dao;

    public DatabaseHandler() {
        dao = new DatabaseHandlerDAO();
    }

    public List<String> fetchData(String date) {
        List<String> data = new ArrayList<>();

        try {
            data = dao.fetchData(date);
            System.out.println(data);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return data;
    }
}