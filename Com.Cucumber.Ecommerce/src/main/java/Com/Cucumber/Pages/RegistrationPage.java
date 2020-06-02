package Com.Cucumber.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Cucumber.Util.BaseClass;

public class RegistrationPage extends BaseClass {

	
	@FindBy(xpath="//input[@id='email_create']")
	WebElement emailadress;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement regEmail;
	
	@FindBy(xpath="//input[@id='passwd']")
	WebElement regPassword;
	
	@FindBy(xpath="//button[@type='submit']//span//i[@class='icon-lock left']")
	WebElement submit;
	
	@FindBy(xpath="//button[@id='SubmitCreate']")
	WebElement createanacc;
	
	public RegistrationPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterEmailAdress() {
		emailadress.sendKeys(prop.getProperty("emailaddress"));
	}
	
	public CreateAnAccount clickonCreateAnAccount() {
		createanacc.click();
		return new CreateAnAccount();
	}
	
	
	public SignIn loginaccount() {
		regEmail.sendKeys(prop.getProperty("emailaddress"));
		regPassword.sendKeys(prop.getProperty("password"));
		submit.click();
		return new SignIn();
	}
	
}
