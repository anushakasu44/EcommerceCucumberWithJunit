
package Com.Cucumber.Pages;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Cucumber.Util.BaseClass;
import junit.framework.Assert;

public class SignIn extends BaseClass{

	@FindBy(xpath="//a[@class='login']")
	WebElement signin ;
	
	@FindBy(xpath="//a[text()='Women']")
	WebElement women;
	
	@FindBy(xpath="(//a[text()='T-shirts'])[1]")
	WebElement tshirts;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a")
	WebElement product;
	
	@FindBy(xpath="//input[@id='search_query_top']")
	WebElement searchBbox;
	
	@FindBy(xpath="//form[@id='searchbox']//ancestor::button")
	WebElement Searchbutton;
	
	@FindBy(xpath="//span[text()='More']")
	WebElement More;
	
	
	public SignIn() {
		PageFactory.initElements(driver, this);
	}
	
	public RegistrationPage clickOnSignin() {
		signin.click();
		return new RegistrationPage();
	}
	
	public String validatetitle() {
		return driver.getTitle();
	}
	public void mousehoverToWomen() {
		Actions act=new Actions(driver);
		act.moveToElement(women).build().perform();
	}
	
	public void clickOnTshirts() {
		tshirts.click();
	}
	
	public String getproductname() {
		return product.getText();
		
	}
	
	public void EntertextInsearchBox() {
		Actions act=new Actions(driver);
		act.moveToElement(searchBbox).build().perform();
		searchBbox.sendKeys(product.getText());
		Searchbutton.click();
		
	}
	
	public String validateproduct() {
		return product.getText();
		
	}
	public addtocart mousehoverToMore() {
		Actions act=new Actions(driver);
		act.moveToElement(product).build().perform();
		More.click();
		return new addtocart();
		
		
	}
}
