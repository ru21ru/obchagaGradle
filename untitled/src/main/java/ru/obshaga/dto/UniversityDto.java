package ru.obshaga.dto;

import exceptions.DaoException;
import objects.University;
import ru.obshaga.dbUtils.ConnectorManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UniversityDto {
    private static final UniversityDto INSTANCE = new UniversityDto();

    private UniversityDto(){}

    public static UniversityDto getInstance(){
        return INSTANCE;
    }
    public boolean delete(int id){
        try (Connection connection = ConnectorManager.getConnection()) {
          String SQLQuery = """
                    DELETE FROM universities
                     WHERE id = ?
                    """;
            PreparedStatement preparedStatement = connection.prepareStatement(SQLQuery);
            preparedStatement.setInt(1, id);
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            throw new DaoException(e);
        }
    }
    public boolean create(University university){
       try (Connection connection = ConnectorManager.getConnection()) {
            String SQLQuery = """
                    INSERT INTO universities (id, name, duration)
                    VALUES (?, ? , ?)
                    """;
            PreparedStatement preparedStatement = connection.prepareStatement(SQLQuery);
           // preparedStatement.setInt(1, University);
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            throw new DaoException(e);
        }
    }
}
