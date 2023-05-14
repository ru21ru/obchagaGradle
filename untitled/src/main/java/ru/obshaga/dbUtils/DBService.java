package ru.obshaga.dbUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//HikariCP
public class DBService {
    public static boolean DataBaseExist(Connection connection, String DBName) throws SQLException {
        String SQLQuery = """
                SELECT COUNT(*) FROM pg_database WHERE datname = ?
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(SQLQuery);
        preparedStatement.setString(1, DBName);
        ResultSet exResult = preparedStatement.executeQuery();
        if (exResult.next()) {
            return exResult.getInt(1) > 0;
        }
        return false;
    }


    public static void CreateTable(String SQLQuery){
        try (Connection connection = ConnectorManager.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(SQLQuery);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
