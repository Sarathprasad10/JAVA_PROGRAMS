
import java.sql.*;
import java.io.*;

class TableCreation 
{
    public static void main(String args[]) 
    {
        Connection con;
        Statement st;
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_db?characterEncoding=utf8","root", "");
            st = con.createStatement();
            String str1 = "CREATE TABLE department(dno INT primary key, dname VARCHAR(40),dloc VARCHAR(50))";
            String str2 = "CREATE TABLE EMP(Eno INT primary key, Ename VARCHAR(40),esal DECIMAL(10,2),dno INT, FOREIGN KEY (dno) REFERENCES department(dno))";
            System.out.println(str1);
            st.executeUpdate(str1);
            System.out.println(str2);
            st.executeUpdate(str2);
        } 
        catch (Exception e) 
        {
            System.out.println("Error :" + e);
        }
    }
}
