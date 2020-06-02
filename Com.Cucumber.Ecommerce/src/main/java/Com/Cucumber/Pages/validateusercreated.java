package Com.Cucumber.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Cucumber.Util.BaseClass;
import junit.framework.Assert;

public class validateusercreated extends BaseClass{

	
	
	@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")
		WebElement usercreated;
	
	public validateusercreated() {
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void validateuseraccount() {
		String actual=usercreated.getText();
		if(actual.contains("reddy")) {
			System.out.println("user created");
		}
		else {
			System.out.println("user not created");
		}
		
		
	}
}
