package tms.c29.lec_18.classwork;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {
    // MySQL version = 5.6
    // dbeaver - для рааботы с БД, графический редактор
    private static final String URL = "jdbc:mysql://localhost:3306/tms";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "password";

    private static final String INSERT = "INSERT INTO ? (login, password, age) VALUES (?, ?, ?)";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery("SELECT * from user where login = 'new'");

            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt(1));
                user.setLogin(rs.getString(2));
                user.setPassword(rs.getString(3));
                user.setAge(rs.getInt(4));
                System.out.println(user);
                System.out.println("=== new user ===");

            }

            Statement update = connection.createStatement();
//
//            int i = update.executeUpdate("INSERT INTO user (login, password, age) VALUES ('habra', 'admin', 44)");
//            System.out.println(i);
//
//            int transactionIsolation = connection.getTransactionIsolation();
//            System.out.println(transactionIsolation);

            PreparedStatement prs = connection.prepareStatement(INSERT);
            prs.setString(1, "Nikita");
            prs.setString(2, "adminadmin");
            prs.setInt(3, 77);

            prs.execute();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
