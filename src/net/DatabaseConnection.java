package net;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Connect MySQL Database
 * @author Yuxuan Wang
 *
 */
public class DatabaseConnection {
    public static void main(String[] args) {
        // Import MySQL driver
        Connection conn = null;
        try {
            // 1.Load driver
            Class.forName("com.mysql.jdbc.Driver");
            // 2. Connect the Database
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/musicdata", "root", "Lhl0209..");
            System.out.println("The MySQL database is connected successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (null != conn) {
                try {
                    conn.close();
                    System.out.println("The database connection is closed");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
