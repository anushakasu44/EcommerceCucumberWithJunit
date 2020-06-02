package Com.Cucumber.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Cucumber.Util.BaseClass;

public class payment extends BaseClass{

	
	@FindBy(xpath="//a[@title='Pay by check.']")
	WebElement pabycheck;

	

	public payment() {
		PageFactory.initElements(driver, this);
	}
	
	public confirmorder paybycheck() {
		pabycheck.click();
		return new confirmorder();
	}
}
