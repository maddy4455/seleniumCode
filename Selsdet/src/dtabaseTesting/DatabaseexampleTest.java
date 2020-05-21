package dtabaseTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseexampleTest {

	public static void main(String[] args) throws SQLException 
	{
		
		/*1) create connection
		 * 2)create statement
		 * 3)execute statement
		 * 4)close connection
		 */
           //step 1
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:3306/mydb","root","root");
			
		
		
		//step 2	
		Statement stmt=con.createStatement();
		
		//step3
		//String s="insert into student values(104,'maddy')";// to insert a row
		//String s="update student set STUNAME='anji' where SID=103"; //to update name
	      String s="delete student where SID=103"; // to delete a row
		
		stmt.executeQuery("s");
		
		//step4
		con.close();
		
		System.out.println("programe is exited");
		
		
	}

}
