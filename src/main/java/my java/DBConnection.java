import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection{
static Connection conn = null;
    public static Connection getDBConnection()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/event_form","root","");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}