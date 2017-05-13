package system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataBase {
    static{
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
                    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
    public static Connection connect() throws SQLException{
        String url = "jdbc:mysql://127.0.0.1/salon?user=root&password=root";
        return DriverManager.getConnection(url); 
    }
    }

