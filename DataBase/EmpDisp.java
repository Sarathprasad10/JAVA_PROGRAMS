import java.sql.*;
import java.util.Scanner;

class EmpDisp {
	public static void main(String args[]) {
		Connection con;
		Statement st;
		ResultSet rs;
		Scanner s = new Scanner(System.in);
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_db?characterEncoding=utf8","root","");
			st = con.createStatement();
			int dno, eno,n;
			String dn,dl,str1, en,str2, str3;
			float el;
			System.out.println("Enter the number of rows to be inserted into emp table : ");
			n = s.nextInt();
			for(int i=0 ; i <n; i++) {
			System.out.println("Enter the Dept.no , Dept.name ,Dept.location : ");
			dno = s.nextInt();
			s.nextLine();
			dn = s.nextLine();
			dl = s.nextLine();
			str1 = "Insert into department values(" + dno + ",'" + dn + "','" + dl + "')";
			st.executeUpdate(str1);
			}

			System.out.println("Enter the number of rows to be inserted into emp table : ");
			n = s.nextInt();
			for(int i=0 ; i <n; i++) {
			System.out.println("Enter the Emp.no , Emp.name , Emp.sal ,Dept.no : ");
			eno = s.nextInt();
			s.nextLine();
			en = s.nextLine();
			el = s.nextFloat();
			dno = s.nextInt();
			str2 = "Insert into emp values(" + eno + ",'" + en + "'," + el + ","  + dno + ")";
			st.executeUpdate(str2);
			}
			str3 = "Select  e.eno , e.ename, e.esal , d.dname , d.dloc from emp e inner join department d on e.dno = d.dno";
			rs = st.executeQuery(str3);
	
			System.out.println("Eno     Ename     esal     dname    dloc");
			System.out.println("+---------------------------------------+");
			while(rs.next()) {
				System.out.println(rs.getString("eno") + "   " + rs.getString("ename") + "   " + rs.getString("esal") + "   " + rs.getString("dname") + "   " + rs.getString("dloc"));
			}
		}
		catch(Exception e) {
			System.out.println("Error : " + e);
		}
	}
}