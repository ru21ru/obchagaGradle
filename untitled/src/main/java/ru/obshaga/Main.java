package ru.obshaga;

import objects.University;
import ru.obshaga.dbUtils.InitDatabase;

import java.util.ArrayList;
import java.util.List;

public class Main {
    //Jackson - для форирования jSON
    public static void main(String[] args)  {
        University mgu = new University("МГУ", 36);
        University chgu = new University("ЧГУ", 60);

        //System.out.println(University.getAll());

        InitDatabase.initDB();

/*
        try (Connection connection = ConnectorManager.open()){
            System.out.println(connection.getTransactionIsolation());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
*/

    }
}
