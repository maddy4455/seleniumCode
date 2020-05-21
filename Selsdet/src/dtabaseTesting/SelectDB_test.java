package dtabaseTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDB_test {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		
		
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:3306/mydb","root","root");
			
		
		
		//step 2	
		Statement stmt=con.createStatement();
		
		//step3
		String s="select sid,stuname from student";
		
		//step4
		
		ResultSet rs=stmt.executeQuery("s");
		
		while(rs.next())
		{
			String studentid=rs.getString("sid");
			String studentname=rs.getString("stuname");
			
			
			System.out.print(studentid+" ");
			System.out.println(studentname);
		}
		
		//step5
		con.close();
		
		System.out.println("programe is exited");
		
		
	}

}



