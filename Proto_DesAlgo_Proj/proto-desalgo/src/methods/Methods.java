package methods;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.mysql.cj.xdevapi.Table;

public class Methods {
    
    public static Connection getConnection() throws Exception {
        
        try {
            String driver = "com.sql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/database";
            String username = "Albedo";
            String password = "SolarIsotoma";
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Success!");

            return conn;
        } catch(Exception e) {
            e.getStackTrace();
        }
        
        return null;
    }

    public static void createTable() throws Exception {
        try {
            Connection con = getConnection();
            PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXIST ulam(id int NOT NULL AUTO_INCREMENT, name VARCHAR(25), PRIMARY KEY (id))");
            create.executeUpdate();

            System.out.println("Table Creation Success!");
        } catch(Exception e){
            e.getStackTrace();
        }
    }

    public static Table getTable() throws Exception {
        try {
            Connection con = getConnection();
            PreparedStatement create = con.prepareStatement("SELECT id FROM database");
            create.executeQuery();

        } catch(Exception e) {
            
        }
        
        return null;
    }
    
    public static ArrayList<String> getData(String data) throws Exception {
        try {
            Connection con = getConnection();
            PreparedStatement get = con.prepareStatement("SELECT " + data + " FROM ulam");

            ResultSet result = get.executeQuery();
        } catch (Exception e) {
            e.getStackTrace();
        }
        
        return null;
    }
}
