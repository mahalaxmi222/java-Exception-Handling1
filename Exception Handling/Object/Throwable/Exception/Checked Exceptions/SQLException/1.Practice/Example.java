import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Example {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            // Code that may throw an SQLException
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/exampleDB", "username", "password");
            String sqlQuery = "SELECT * FROM exampleTable";
            preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.executeQuery();
        } catch (SQLException e) {
            // Handle the SQLException, log it, or take appropriate action
            e.printStackTrace();
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
