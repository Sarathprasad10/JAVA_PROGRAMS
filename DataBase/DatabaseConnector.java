
import java.sql.*;

public class DatabaseConnector 
{
    private Connection connection = null;
    private Statement statement = null;
    private ResultSet resultSet = null;

    public DatabaseConnector(String url, String username, String password) 
    {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database.");
        } 
        catch (Exception e) 
        {
            System.out.println("Error connecting to the database: " + e.getMessage());
        }
    }

    public ResultSet executeQuery(String query) 
    {
        try 
        {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
        } 
        catch (SQLException e) 
        {
            System.out.println("Error executing query: " + e.getMessage());
        }
        return resultSet;
    }

    public void closeConnection() 
    {
        try {
            if (resultSet != null)
                resultSet.close();
            if (statement != null)
                statement.close();
            if (connection != null)
                connection.close();
            System.out.println("Connection closed.");
        } 
        catch (SQLException e) 
        {
            System.out.println("Error closing connection: " + e.getMessage());
        }
    }

    public static void main(String[] args) 
    {

        String url = "jdbc:mysql://localhost:3306/emp_db?characterEncoding=utf8";
        String username = "root";
        String password = "";

        DatabaseConnector connector = new DatabaseConnector(url, username, password);

        String query = "SELECT * FROM emp";
        ResultSet resultSet = connector.executeQuery(query);

        try {
            while (resultSet.next()) 
            {

                int id = resultSet.getInt("eno");
                String name = resultSet.getString("Ename");
                System.out.println("no: " + id + ", Name: " + name);
            }
        } 
        catch (SQLException e) 
        {
            System.out.println("Error processing result set: " + e.getMessage());
        }

        // Close the connection
        connector.closeConnection();
    }
}
