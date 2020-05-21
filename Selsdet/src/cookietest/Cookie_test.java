package cookietest;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookie_test {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","\\C:\\Users\\yavyo\\Desktop\\seleniumproject\\chromedriver.exe\\");	 
		 WebDriver driver=new ChromeDriver();
		
		 driver.get("https://www.amazon.in");
		 
	
	/*for(Cookie cookie:cookies) // this statement read and print all the cookies
	{
		System.out.println(cookie.getName()+":"+cookie.getValue());
		
	}*/
	
	//System.out.println(driver.manage().getCookieNamed("session-id-time"));
	Cookie cobj=new Cookie("madd119h","67878912");// create a new cookie
	driver.manage().addCookie(cobj);// add new cookie
	
	Set <Cookie> cookies= driver.manage().getCookies(); // capture all the cookies from the browser
	System.out.println("Size of cookies:"+cookies.size()); // print  size of cookies
	
	
	for(Cookie cookie:cookies) // this statement read and print all the cookies
	{
		System.out.println(cookie.getName()+":"+cookie.getValue());//print name and value of the cookie
		
				
	}
	Cookie cookieobj=new Cookie("rama675s","99999");
	driver.manage().addCookie(cookieobj);
	System.out.println("Size of cookies:"+cookies.size());
	
	for(Cookie cookie:cookies) // this statement read and print all the cookies
	{
		System.out.println(cookie.getName()+":"+cookie.getValue());//print name and value of the cookie
	}

	}

}
