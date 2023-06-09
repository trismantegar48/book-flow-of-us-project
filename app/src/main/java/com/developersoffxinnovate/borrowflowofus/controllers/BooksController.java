package com.developersoffxinnovate.borrowflowofus.controllers;

import java.sql.SQLException;

import com.developersoffxinnovate.borrowflowofus.config.DatabaseConfig;

public class BooksController extends DatabaseConfig {

    public static void getDataBuku() {
        connection();
        query = "SELECT * FROM buku";
        try {
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getString("judul") + " " + resultSet.getString("pengarang"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
