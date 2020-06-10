package MyMavenDemo.MavenDemo;

import java.awt.AWTException;
import java.io.FileNotFoundException;

import org.openqa.selenium.By;

public class Dummy_Test extends BaseTest {

	public static void main(String[] args) throws AWTException, FileNotFoundException {
		
		init();
		
		openBrowser("chrome");
		
		driver.get("https://www.amazon.in/");
		
		//String actLink = driver.findElement(By.linkText("Books")).getText();
	String actLink = driver.findElement(By.linkText("Books")).getAttribute("innerHTML");
	String expLink = "Book";
	
		System.out.println("actual link :" +actLink);

		System.out.println("expexted link :"+ expLink);
		if(actLink.equals(expLink))
			System.out.println("both links are equal");
		else
			System.out.println("both are not equal");
		driver.quit();
	
		
	}
	
		
	}


