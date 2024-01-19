package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver" ;
    private static final String DB_URL = "jdbc:mysql://localhost:3306/pre_project_db?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC" ;
    private static final String DB_USER = "root" ;
    private static final String DB_PASSWORD = "root" ;

    public static Connection getConnection () {
        Connection connection = null;
        try {
            Class.forName(DB_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            connection.setAutoCommit(false);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}
