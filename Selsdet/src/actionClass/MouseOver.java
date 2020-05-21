package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		
System.setProperty("webdriver.gecko.driver","C:\\Users\\yavyo\\Desktop\\seleniumproject\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		//Admin-->User management-->Users
		Actions act=new Actions(driver);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[1]/a/b")).click();
		WebElement usermg=driver.findElement(By.xpath("//*[@id=\"menu_admin_UserManagement\"]"));
		WebElement users=driver.findElement(By.xpath("//*[@id=\"menu_admin_viewSystemUsers\"]"));
		
		//act.moveToElement(admin).build().perform(); //mouseover to admin tab
		//act.moveToElement(usermg).build().perform(); //mouseover to user mangmnr
		//act.moveToElement( users).click().build().perform(); //mouseover to users and click the tab
		// we can write in one line
		act.moveToElement(usermg).moveToElement(users).click().build().perform();
		
		
	}

}
