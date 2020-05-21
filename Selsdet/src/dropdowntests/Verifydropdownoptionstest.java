package dropdowntests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Verifydropdownoptionstest {
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","\\C:\\Users\\yavyo\\Desktop\\seleniumproject\\chromedriver.exe\\");
		 
		 driver=new ChromeDriver();
		 
		 driver.get("https://www.facebook.com");
		 
		 driver.manage().window().maximize();
		 
		;
		 
		 WebElement element=driver.findElement(By.id("month"));
		 
		 Select se=new Select(element);
		 
		 List originalList=new ArrayList();
		 List tempList=new ArrayList();
	        
		 
		 List <WebElement>options=se.getOptions();
		 
		for(WebElement e:options)
		{
			originalList.add(e.getText());
                tempList.add(e.getText());
		}
		 
        System.out.println("before sorting theoriginalList:"+originalList);  
        System.out.println("before sorting the temp list"+tempList);
        
        Collections.sort(tempList);
        
        System.out.println("After sorting originalList"+originalList);
        System.out.println("After sorting temp list"+tempList);
      
        if(originalList==tempList)
        {
        	System.out.println("dropdown is sorted");
        }
        else
        {
        	System.out.println("dropdown is not sorted");
        }
	}

}
