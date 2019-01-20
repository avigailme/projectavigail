package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBWorker {
    private final String url = "jdbc:postgreql://localhost/scheme";
    private final String user = "postgres";
    private final String password = "<postgres>";

    public Connection connect(){
        Connection connection = null;
        try{
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the POSgreSQL server succesfully");
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        return  connection;
        }
    }

