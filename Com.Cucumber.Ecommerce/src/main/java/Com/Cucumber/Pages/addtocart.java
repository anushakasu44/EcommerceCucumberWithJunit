package Com.Cucumber.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Com.Cucumber.Util.BaseClass;

public class addtocart extends BaseClass{

	@FindBy(xpath="//input[@id='quantity_wanted']")
	WebElement quantity;
	
	@FindBy(xpath="//select[@id='group_1']")
	WebElement size;
	
	@FindBy(xpath="//a[@title='Blue']")
	WebElement colour;
	
	@FindBy(xpath="//span[text()='Add to cart']")
	WebElement Addtocart;
	
	public addtocart() {
		PageFactory.initElements(driver, this);
	}
	
	
	public proceedtocheckout addToCart() {
		quantity.clear();
		quantity.sendKeys(prop.getProperty("quantity"));
		Select sel=new Select(size);
		sel.selectByValue("2");
		colour.click();
		Addtocart.click();
		return new proceedtocheckout();
		
	}
}
