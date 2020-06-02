package Com.Cucumber.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Cucumber.Util.BaseClass;

public class confirmorder extends BaseClass{

	
	@FindBy(xpath="//button[@type='submit']//span//i")
	WebElement confirmorder;

	

	public confirmorder() {
		PageFactory.initElements(driver, this);
	}
	
	public completeOrderValidation confirmorderrr() {
		confirmorder.click();
		return new completeOrderValidation();
	}
}
