package tms.c29.lec_18.classwork;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {
    // MySQL version = 5.6
    private static final String url = "jdbc:mysql://127.0.0.1:3306/tms";
    private static final String username = "root";
    private static final String password = "password";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
//            DriverManager.getConnection(String.join("", ))

            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery("SELECT * from user");

            while (rs.next()) {
                System.out.println(rs.getString(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                System.out.println(rs.getInt(4));
                System.out.println("=== new user ===");

            }

            Statement update = connection.createStatement();

            int i = update.executeUpdate("INSERT INTO user (login, password, age) VALUES ('rdd2', 'admin', 44)");
            System.out.println(i);

            int transactionIsolation = connection.getTransactionIsolation();
            System.out.println(transactionIsolation);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
