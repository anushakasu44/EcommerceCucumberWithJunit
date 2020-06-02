package Com.Cucumber.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Cucumber.Util.BaseClass;

public class Addresscheckout extends BaseClass{

	
	
	@FindBy(xpath="//span[text()='Proceed to checkout']")
	WebElement finalcheckout;


	public Addresscheckout() {
		PageFactory.initElements(driver, this);
	}

	public shippingcheckout procedtocheckout() {
		//scrolltoelement(finalcheckout);
		finalcheckout.click();
		return new shippingcheckout();
		
	}
}
