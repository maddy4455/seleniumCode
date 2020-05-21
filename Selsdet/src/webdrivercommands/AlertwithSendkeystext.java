package webdrivercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertwithSendkeystext {

	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\yavyo\\Desktop\\seleniumproject\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[3]/button")).click();
		driver.switchTo().alert().sendKeys("maddy");// to enter the text in alert field
		driver.switchTo().alert().accept();

		String expmsg="Hello maddy How are you today";
		String acttextmsg=driver.findElement(By.xpath("//*[@id=\"demo1\"]")).getText();
		if(expmsg.equals(acttextmsg)==true)
		{
			System.out.println("Test is passed");
		}
	}

}
