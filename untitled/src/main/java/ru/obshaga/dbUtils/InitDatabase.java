package ru.obshaga.dbUtils;
/*
private final int id;
private final String name;
private final int durationMonths;
*/

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static ru.obshaga.dbUtils.DBService.*;
import static ru.obshaga.dbUtils.ConnectorManager.*;

public class InitDatabase {
    public static void initDB(){
        CreateDatabase("dormitory");
        DBService.CreateTable(UniversityQueryText());
    }
    public static void CreateDatabase(String DBName) {
        try (Connection connection = ConnectorManager.getConnection()) {
            if (DataBaseExist(connection, DBName)) {
                return;
            }
            String SQLQuery = """
                    CREATE DATABASE ?
                    """;
            PreparedStatement preparedStatement = connection.prepareStatement(SQLQuery);
            preparedStatement.setString(1, DBName);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static String UniversityQueryText(){
        return """
                CREATE TABLE IF NOT EXISTS universities 
                (
                    id SERIAL PRIMARY KEY,
                    name VARCHAR(128),
                    duration smallint 
                )
                """;
    }
}
