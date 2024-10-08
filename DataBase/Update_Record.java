import java.sql.*;
import java.util.Scanner;

public class Update_Record 
{
    public static void main(String[] args) 
    {
        Connection con = null;
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_db?characterEncoding=utf8", "root", "");
            PreparedStatement st = con.prepareStatement("UPDATE emp SET Esal = ? WHERE ename = ?");
            Scanner s = new Scanner(System.in);
            System.out.print("Enter the Name of Employee: ");
            String ename = s.nextLine();
            System.out.print("Enter the New Salary: ");
            int newSal = s.nextInt();
            st.setInt(1, newSal);
            st.setString(2, ename);
            int i = st.executeUpdate();
            System.out.println(i + " record(s) Updated");
            con.close();
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}
