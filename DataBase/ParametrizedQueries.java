
import java.sql.*;

public class ParametrizedQueries  
{
    public static void main(String[] args) 
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_db?characterEncoding=utf8","root", "");

            PreparedStatement statement = con.prepareStatement("SELECT * FROM emp WHERE ename LIKE ?");

            statement.setString(1, "R%");

            ResultSet resultSet = statement.executeQuery();

            System.out.println("Records in Emp table with names starting with 'R':");
            while (resultSet.next()) {
                int eno = resultSet.getInt("eno");
                String ename = resultSet.getString("Ename");
                double esal = resultSet.getDouble("esal");
                int dno = resultSet.getInt("dno");
                System.out.println("----------------------------------------------");
                System.out.println("Employee No: " + eno + "   |\t Name: " + ename + "   |\t Salary: " + esal+ "   |\t Department No: " + dno);
            }

            // Close resources
            resultSet.close();
            statement.close();
            con.close();
        } 
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
