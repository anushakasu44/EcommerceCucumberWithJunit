package Com.Cucumber.Pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Cucumber.Util.BaseClass;

public class completeOrderValidation extends BaseClass {

	
	@FindBy(xpath="//p[@class='alert alert-success']")
	WebElement confirmorder;

	

	public completeOrderValidation() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateorderrr() {
		return confirmorder.getText();
		
		
		
	}
}
