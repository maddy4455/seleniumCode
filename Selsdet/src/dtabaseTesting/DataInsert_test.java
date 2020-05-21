package dtabaseTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataInsert_test {

	public static void main(String[] args) throws SQLException {
	
		System.setProperty("webdriver.chrome.driver","\\C:\\Users\\yavyo\\Desktop\\seleniumproject\\chromedriver.exe\\");	 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("http://newtours.demoaut.com/");
		
		

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
			
			driver.findElement(By.name("studentid")).sendKeys(studentid);
			driver.findElement(By.name("studentname")).sendKeys(studentname);
			
			if(driver.getTitle().equals("Find a Flight: Mercury Tours:"))
			{
				System.out.println("test is passed");
			}
			else
			{
				System.out.println("test is failed");
			}
		}
		
		//step5
		con.close();
		
		System.out.println("programe is exited");

	}

}
