package webdrivercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alertWithOKbutton {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.gecko.driver","C:\\Users\\yavyo\\Desktop\\seleniumproject\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
		
		//switch to alert
		System.out.println(driver.switchTo().alert().getText()); // to print the text from alert
		driver.switchTo().alert().accept();

	}

}
