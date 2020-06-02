package Com.Cucumber.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Cucumber.Util.BaseClass;

public class proceedtocheckout extends BaseClass{
	
	
@FindBy(xpath="(//a//span//i[@class='icon-chevron-right right'])[2]")
WebElement proceedtocheckout;


public proceedtocheckout() {
	PageFactory.initElements(driver, this);
}

public finalproceed procedtocheckout() {
	proceedtocheckout.click();
	return new finalproceed();
}


}
