package Project;
import java.sql.*;

public class ConnectionProvider {

    public static Connection getCon() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Updated driver class
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BloodBankMS", "root", "duRR#@eFg1995");
        } catch (Exception e) {
            System.out.println("Connection error: " + e.getMessage());
        }
        return con;
    }
}
