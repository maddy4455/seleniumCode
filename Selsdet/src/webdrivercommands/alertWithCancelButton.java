package webdrivercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alertWithCancelButton {

	public static void main(String[] args) {
	

		System.setProperty("webdriver.gecko.driver","C:\\Users\\yavyo\\Desktop\\seleniumproject\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/button")).click();
		
		String exptextOK="You pressed Ok";
		
		driver.switchTo().alert().accept();
		
		String acttextOK=driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
		
		
		if(exptextOK.equals(acttextOK)==true)
{
	System.out.println("Test is passed");
	
}    
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/button")).click();
		String exptextCancel="You Pressed Cancel";
		driver.switchTo().alert().dismiss();
		String acttext=driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
       if( exptextCancel.equals(acttext)==true)
       {
    	   System.out.println("Test is success");
       }
	}

}
