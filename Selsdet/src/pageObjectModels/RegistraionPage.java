package pageObjectModels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistraionPage {
	
	WebDriver driver;
	
	@FindBy(linkText="REGISTER")
	WebElement RegLink;
	
	@FindBy(name="firstName")
	WebElement FirstName;
	
	@FindBy(name="lastName")
	WebElement LastName;
	
	@FindBy(name="phone")
	WebElement Phone;
	
	@FindBy(name="userNmae")
	WebElement Email;
	
	@FindBy(name="address1")
	WebElement address1;
	
	@FindBy(name="address2")
	WebElement address2;
	
	@FindBy(name="city")
	WebElement City;
	
	@FindBy(name="state")
	WebElement State;
	
	@FindBy(name="postalcode")
	WebElement PostalCode;
	
	@FindBy(name="country")
	WebElement Country;
	
	@FindBy(name="email")
	WebElement UserNmae;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(name="confirmPassword")
	WebElement ConfirmPassword;
	
	@FindBy(name="register")
	WebElement Submit;
	
	RegistraionPage(WebDriver d){
	driver = d;
	
	PageFactory.initElements(d, this);
	
}

public void clickReglink() {
	RegLink.click();
}

public void setFirstName(String fname) {
	FirstName.sendKeys(fname);
}

public void setLastName(String lname) {
	LastName.sendKeys(lname);
}
public void setPhone(String phone) {
	Phone.sendKeys(phone);
}
}





