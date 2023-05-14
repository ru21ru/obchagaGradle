package ru.obshaga.dbUtils;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import utils.PropertiesUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectorManager {

    private static HikariConfig config = new HikariConfig();
    private static HikariDataSource ds;

    static {
        config.setJdbcUrl(PropertiesUtil.get("db.url"));
        config.setUsername(PropertiesUtil.get("db.user"));
        config.setPassword(PropertiesUtil.get("db.pass"));
        config.setMaximumPoolSize(Integer.parseInt(PropertiesUtil.get("db.maxpool")));        //config.addDataSourceProperty( "cachePrepStmts" , "true" );
        //config.addDataSourceProperty( "prepStmtCacheSize" , "250" );
        //config.addDataSourceProperty( "prepStmtCacheSqlLimit" , "2048" );
        ds = new HikariDataSource(config);
    }

    private ConnectorManager() {}

    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
/*    private static final String PASS_KEY = "db.pass";
    private static final String USER_KEY = "db.user";
    private static final String URL_KEY = "db.url";
    public static Connection open() {


        try {
            return DriverManager.getConnection(
                    PropertiesUtil.get(URL_KEY),
                    PropertiesUtil.get(USER_KEY),
                    PropertiesUtil.get(PASS_KEY));
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }*/
}
