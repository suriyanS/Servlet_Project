import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;
 
 
public class FetchData {
 
    private static Connection connection = null;
 
    public static Connection getConnection() {
        if (connection != null)
            return connection;
        else {
            try {
                Properties prop = new Properties();
                InputStream inputStream = FetchData.class.getClassLoader().getResourceAsStream("/db.properties");
                prop.load(inputStream);
                String driver = prop.getProperty("driver");
                String url = prop.getProperty("url");
                String user = prop.getProperty("user");
                String password = prop.getProperty("password");
                Class.forName(driver);
                connection = DriverManager.getConnection(url, user, password);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return connection;
        }
 
    }
     
    public static ArrayList<pojoFetchData> getAllCountries() {
     connection = FetchData.getConnection();
        ArrayList<pojoFetchData> countryList = new ArrayList<pojoFetchData>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from country limit 10");
         
            while(rs.next()) { 
             pojoFetchData country=new pojoFetchData();
             country.setCode(rs.getString("Code"));
             country.setName(rs.getString("Name"));
                country.setContinent(rs.getString("Continent"));
                country.setRegion(rs.getString("Region"));
             country.setPopulation(rs.getInt("Population"));
             country.setCapital(rs.getString("Capital"));
             countryList.add(country);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
 
        return countryList;
    }
}