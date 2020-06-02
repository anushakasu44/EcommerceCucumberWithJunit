package Com.Cucumber.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Cucumber.Util.BaseClass;

public class shippingcheckout extends BaseClass {
	
	@FindBy(xpath="//button[@type='submit']//span//i")
	WebElement finalcheckout;

	@FindBy(xpath="//input[@type='checkbox']")
	WebElement checkbox;

	public shippingcheckout() {
		PageFactory.initElements(driver, this);
	}

	public payment procedtocheckout() {
		checkbox.click();
		Actions act=new Actions(driver);
		act.moveToElement(finalcheckout).click().build().perform();
		return new payment();
		
	}
}
