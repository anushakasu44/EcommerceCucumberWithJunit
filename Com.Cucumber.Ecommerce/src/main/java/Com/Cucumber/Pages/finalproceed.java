package Com.Cucumber.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Cucumber.Util.BaseClass;

public class finalproceed extends BaseClass{

	
	
	@FindBy(xpath="//span[text()='Proceed to checkout']")
	WebElement finalcheckout;


	public finalproceed() {
		PageFactory.initElements(driver, this);
	}

	public Addresscheckout procedtocheckout() {
		Actions act=new Actions(driver);
		act.moveToElement(finalcheckout).click().build().perform();
		return new Addresscheckout();
		
	}
}
