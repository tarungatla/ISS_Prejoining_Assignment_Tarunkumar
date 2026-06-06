package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * JDBC Example
 * Reads records from database.
 */
public class JDBC{

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/examportal";

        String username = "root";
        String password = "11111111";

        try {

         
            Connection connection =
                    DriverManager.getConnection(
                            url,
                            username,
                            password);

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM quiz");

            while(resultSet.next()) {

                System.out.println(
                        resultSet.getInt("q_id")
                        + " "
                        + resultSet.getString("description"));
            }

            connection.close();
        }
        catch(Exception e) {

            e.printStackTrace();
        }
    }
}