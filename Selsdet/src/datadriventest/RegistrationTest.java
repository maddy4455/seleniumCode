package datadriventest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class RegistrationTest {
	public static  WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		 System.setProperty("webdriver.chrome.driver","\\C:\\Users\\yavyo\\Desktop\\seleniumproject\\chromedriver.exe\\");	 
		 driver=new ChromeDriver();
		 driver.get("http://newtours.demoaut.com/");
		 driver.manage().window().maximize();
		// driver.findElement(By.linkText("REGISTER")).click();
		 FileInputStream file=new FileInputStream("C:\\Users\\yavyo\\Desktop\\Registration.xlsx");
		 
		 XSSFWorkbook workbook=new XSSFWorkbook(file);
		 XSSFSheet sheet= workbook.getSheet("sheet1");
		 int rowcount= sheet.getLastRowNum();
		// System.out.println("No. of Records in the Excel Sheet:"+ rowcount);
		 
		 for ( int i=1; i <=rowcount; i++) {
			 XSSFRow row = sheet.getRow(i);
			// XSSFCell First_Name=row.getCell(0);
			 int First=(int)row.getCell(0).getNumericCellValue();
			 
			 String First_name = row.getCell(0).getStringCellValue();
			 String Last_name = row.getCell(1).getStringCellValue();
			 String Phone = row.getCell(2).getStringCellValue();
			 String Email = row.getCell(3).getStringCellValue();
			 String Address = row.getCell(4).getStringCellValue();
			 String City = row.getCell(5).getStringCellValue();
			 String State = row.getCell(6).getStringCellValue();
			 String PinCode = row.getCell(7).getStringCellValue();
			 String Country = row.getCell(8).getStringCellValue();
			 String UserNmae = row.getCell(9).getStringCellValue();
			 String Password = row.getCell(10).getStringCellValue();
			 
			 driver.findElement(By.linkText("REGISTER")).click();
			 
			 driver.findElement(By.name("firstName")).sendKeys(First_name);
			 driver.findElement(By.name("lastNmae")).sendKeys(Last_name);
			 driver.findElement(By.name("phone")).sendKeys(Phone);
			 driver.findElement(By.name("userName")).sendKeys(Email);
			 
			 driver.findElement(By.name("address1")).sendKeys(Address);
			 driver.findElement(By.name("address2")).sendKeys(Address);
			 driver.findElement(By.name("city")).sendKeys(City);
			 driver.findElement(By.name("state")).sendKeys(State);
			 driver.findElement(By.name("postalCode")).sendKeys(PinCode); 
			 
	          Select dropcountry = new Select(driver.findElement(By.name("country")));
			
	          dropcountry.selectByVisibleText(Country);
	          
	          
	          driver.findElement(By.name("email")).sendKeys(UserNmae);
	          
	          driver.findElement(By.name("password")).sendKeys(Password);
	          
	          driver.findElement(By.name("confirmPassword")).sendKeys(Password);
	          
	          driver.findElement(By.name("register")).click();
	          
	          if (driver.getPageSource().contains("Thank you for registering"))
	          {
	        	  
	        	  System.out.println("registration completed for "+ row + "record");
	          }
	          
	          else
	          {
	        	  System.out.println("registration failed for " +row + "record");
	          }
			 
			 
			 
			 
			 
			 
		 }
		 
		 
		 
		 
		

	}

}
