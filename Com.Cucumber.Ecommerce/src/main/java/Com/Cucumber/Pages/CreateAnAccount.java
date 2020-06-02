package Com.Cucumber.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Com.Cucumber.Util.BaseClass;

public class CreateAnAccount extends BaseClass{

	@FindBy(xpath="//input[@id='id_gender2']")
	WebElement mrs;
	
	
	@FindBy(xpath="//input[@id='customer_firstname']")
    WebElement firstname;
	
	   @FindBy(xpath="//input[@id='customer_lastname']")
		WebElement lastname;

	   @FindBy(xpath="//input[@id='passwd']")
		WebElement password;

	   @FindBy(xpath="//input[@id='email']")
	   WebElement email;
	   
	   @FindBy(xpath="//select[@id='days']")
		WebElement days;

	   
	   @FindBy(xpath="//select[@id='months']")
		WebElement months;

	   
	   @FindBy(xpath="//select[@id='years']")
		WebElement years;

	   @FindBy(xpath="//input[@id='firstname']")
		WebElement fname;

	   @FindBy(xpath="//input[@id='lastname']")
		WebElement lname;

	   @FindBy(xpath="//input[@id='company']")
		WebElement company;
	   
	   @FindBy(xpath="//input[@id='address1']")
		WebElement adress1;

	   
	   @FindBy(xpath="//input[@id='city']")
		WebElement city;

	   
	   @FindBy(xpath="//select[@id='id_state']")
		WebElement state;
	   
	   @FindBy(xpath="//input[@id='postcode']")
		WebElement Zip;
	   
	   @FindBy(xpath="//select[@id='id_country']")
		WebElement country;
	   
	   @FindBy(xpath="//input[@id='phone_mobile']")
		WebElement mobile;


	   @FindBy(xpath="//input[@id='alias']")
	   WebElement addi;
	   
	   
	   @FindBy(xpath="//button[@id='submitAccount']")
	   WebElement register;
	   
	   
	public CreateAnAccount() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void createanAccount(String fName,String lName,String add,String cit,String zip,String mobb,String alias) {
		mrs.click();
		firstname.sendKeys(fName);
		lastname.sendKeys(lName);
		email.click();
		password.sendKeys(prop.getProperty("password"));
		Select sel=new Select(days);
		sel.selectByIndex(8);
		Select sel1=new Select(months);
		sel1.selectByValue("10");
		Select sel2=new Select(years);
		sel2.selectByValue("1993");
		fname.click();
		lname.click();
		adress1.sendKeys(add);
		city.sendKeys(cit);
		Select sel3=new Select(state);
		sel3.selectByIndex(3);
		Zip.sendKeys(zip);
		Select sel4=new Select(country);
		sel4.selectByVisibleText("United States");
		mobile.sendKeys(mobb);
		addi.sendKeys(alias);
	}
	public validateusercreated clickOnReg()  {
		register.click();
		return new validateusercreated();
		
		
}

}