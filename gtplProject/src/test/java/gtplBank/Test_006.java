package gtplBank;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import utilities.BaseTest;

public class Test_006 extends BaseTest {

	@Test(dataProvider = "newCusData")
	public void newCusRegistration(String username, String password, String CustomerName, String DOB, String Address,
			String city, String state, String pin, String telephone, String emailId, String cusPWD)
			throws InterruptedException {

		openBrowser("chrome");
		driver.get("http://demo.guru99.com/V4/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.name("uid")).clear();
		driver.findElement(By.name("uid")).sendKeys(username);
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("btnLogin")).click();
		

		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[contains(text(),'New Customer')]")).click();
		driver.findElement(By.xpath("//input[@name='name']")).clear();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys(CustomerName);

		driver.findElement(By.name("rad1")).click();
		driver.findElement(By.xpath("//input[@id='dob']")).sendKeys(DOB);

		driver.findElement(By.xpath("//textarea[@name='addr']")).clear();
		driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys(Address);

		driver.findElement(By.name("city")).clear();
		driver.findElement(By.name("city")).sendKeys(city);

		driver.findElement(By.name("state")).clear();
		driver.findElement(By.name("state")).sendKeys(state);

		driver.findElement(By.name("pinno")).clear();
		driver.findElement(By.name("pinno")).sendKeys(pin);

		driver.findElement(By.name("telephoneno")).clear();
		driver.findElement(By.name("telephoneno")).sendKeys(telephone);

		driver.findElement(By.name("emailid")).clear();
		driver.findElement(By.name("emailid")).sendKeys(emailId);

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(cusPWD);
		driver.findElement(By.name("sub")).click();
		Thread.sleep(3000);

		try {
			Alert alt = driver.switchTo().alert();
			String actualBoxMsg = alt.getText();
			test.log(Status.INFO, "Alert message is: "+actualBoxMsg);
			alt.accept();
			String expBoxMsg = "please fill all fields";
			assertEquals(actualBoxMsg, expBoxMsg);

		} catch (NoAlertPresentException e) {

			String actcusPage = driver.getTitle();
			System.out.println("registerd cusPage is: "+actcusPage);
			String cusId = driver.findElement(By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[4]/td[2]")).getText();
			System.out.println("cusId is: "+cusId);
			test.log(Status.INFO, "new customer Idis: "+cusId);
			assertTrue(actcusPage.contains("Guru99 Bank Customer Registration Page"));
			
		}
	}

	@DataProvider(name = "newCusData")
	public Object[][] getDataFromDataprovider() {
		return new Object[][] { { "mngr276570", "AtYdagE", "maddy", "05/09/1987", "summerside", "delaware", "newyork",
				"100100", "1234567890", "tes45gf5fds@gmail.com", "Data1233" } };
	}
}
