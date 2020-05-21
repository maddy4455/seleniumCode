package cookietest;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DelCookie_test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","\\C:\\Users\\yavyo\\Desktop\\seleniumproject\\chromedriver.exe\\");	 
		 System.setProperty("webdriver.chrome.logfile","./chromelog.txt");// to generate txt log file
		WebDriver driver=new ChromeDriver();
		
		 driver.get("https://www.amazon.in");
		 
		 driver.manage().deleteCookieNamed("madd119h");
		 
		 Set <Cookie> cookies= driver.manage().getCookies(); // capture all the cookies from the browser
			System.out.println("Size of cookies:"+cookies.size()); // print  size of cookies
			System.out.println(driver.manage().getCookies());
	
	}

}
