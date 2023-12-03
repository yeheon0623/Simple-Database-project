package database_project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Connection_DB {
    private static Connection con;

    public static Connection DBCon() throws SQLException {
        if(con == null){
            try {
                // Update the JDBC URL for MySQL
                String DB = "jdbc:mysql://localhost:3306/musicdata";
                // Replace 'yourDatabaseName' with your actual database name

                String user = "root"; //  MySQL username
                String pass = "Lhl0209.."; //  MySQL password

                // Register MySQL JDBC driver
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

                con = DriverManager.getConnection(DB, user, pass);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Connection has not been established");
            }
        }
        return con;
    }
}
