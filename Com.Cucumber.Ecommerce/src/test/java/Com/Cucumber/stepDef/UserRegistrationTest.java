package Com.Cucumber.stepDef;

import static org.junit.Assert.assertTrue;

import java.util.Map;

import Com.Cucumber.Pages.Addresscheckout;
import Com.Cucumber.Pages.CreateAnAccount;
import Com.Cucumber.Pages.RegistrationPage;
import Com.Cucumber.Pages.SignIn;
import Com.Cucumber.Pages.addtocart;
import Com.Cucumber.Pages.completeOrderValidation;
import Com.Cucumber.Pages.confirmorder;
import Com.Cucumber.Pages.finalproceed;
import Com.Cucumber.Pages.payment;
import Com.Cucumber.Pages.proceedtocheckout;
import Com.Cucumber.Pages.shippingcheckout;
import Com.Cucumber.Pages.validateusercreated;
import cucumber.api.DataTable;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class UserRegistrationTest {
SignIn sin;
RegistrationPage reg;
CreateAnAccount caa;
validateusercreated vac;
addtocart ac;
proceedtocheckout pc;
finalproceed fp;
Addresscheckout addr;
shippingcheckout aac;
payment p;
confirmorder c;
completeOrderValidation cov;

	@Given("Open the URL")
	public void open_the_URL() {
	   sin=new SignIn();
	   String act=sin.validatetitle();
       Assert.assertEquals("My Store", act);
	}

	@Given("Click on sign in link")
	public void click_on_sign_in_link() {
		 sin=new SignIn();
		 reg= sin.clickOnSignin();
	}

	@When("Enter your email address in Create and account section")
	public void enter_your_email_address_in_Create_and_account_section() {
	   reg.enterEmailAdress();
	}

	@When("Click on Create an Account button.")
	public void click_on_Create_an_Account_button() {
		caa=reg.clickonCreateAnAccount();
	}

	
	
	@Given("^Enter your Personal Information Address and Contact info$")
	public void enter_your_Personal_Information_Address_and_Contact_info(DataTable arg1) throws Throwable {
		 for(Map<String, String> data:arg1.asMaps(String.class,String.class)) {
			   caa.createanAccount(data.get("fname"), data.get("lname"), data.get("add"), data.get("cit"), data.get("zip"), data.get("mobb"), data.get("alias"));
			   
		   }
	}
	@Then("Click on Register button")
	public void click_on_Register_button() {
		vac=caa.clickOnReg();
	}

	@Then("Validate that user is created")
	public void validate_that_user_is_created() {
	    vac.validateuseraccount();
	}
	
	@Given("^Move your cursor over Women's link\\.$")
	public void move_your_cursor_over_Women_s_link() throws Throwable {
		 sin=new SignIn();
		   sin.mousehoverToWomen();
	}

	@When("^Click on sub menu 'T-shirts'$")
	public void click_on_sub_menu_T_shirts() throws Throwable {
		   sin.clickOnTshirts();
	}

	@When("^Get Name/Text of the first product displayed on the page\\.$")
	public void get_Name_Text_of_the_first_product_displayed_on_the_page() throws Throwable {
		
		   System.out.println(sin.getproductname());
	}

	@When("^Now enter the same product name in the search bar present on top of page and click search button\\.$")
	public void now_enter_the_same_product_name_in_the_search_bar_present_on_top_of_page_and_click_search_button() throws Throwable {
		
		   sin.EntertextInsearchBox();
	}

	@Then("^Validate that same product is displayed on searched page with same details which were displayed on T-Shirt's page\\.$")
	public void validate_that_same_product_is_displayed_on_searched_page_with_same_details_which_were_displayed_on_T_Shirt_s_page() throws Throwable {
		
		   String val=sin.validateproduct();
		   assertTrue(val, true);
	}
	
	@Given("^Login to the website$")
	public void login_to_the_website() throws Throwable {
		
		  sin= reg.loginaccount();
	}
	
	@When("^'More' button will be displayed, click on 'More' button\\.$")
	public void more_button_will_be_displayed_click_on_More_button() throws Throwable {
		
		  ac= sin.mousehoverToMore();
	}
	@When("^Select quantity,size,colour and add to cart$")
	public void select_quantity_size_colour_and_add_to_cart() throws Throwable {
	   
	    pc=ac.addToCart();
	}
	
	@When("^Click 'Proceed to checkout' button\\.$")
	public void click_Proceed_to_checkout_button() throws Throwable {
	   
	    fp=pc.procedtocheckout();
	}
	
	@When("^Complete the buy order process till payment\\.$")
	public void complete_the_buy_order_process_till_payment() throws Throwable {
	   
	   addr=fp.procedtocheckout();
	  
	   aac=addr.procedtocheckout();
	   
	   p=aac.procedtocheckout();
	   
	   c=p.paybycheck();
	  
	   cov=c.confirmorderrr();
	   
	}
	@When("^Make sure that Product is ordered\\.$")
	public void make_sure_that_Product_is_ordered() throws Throwable {

	   String com= cov.validateorderrr();
	   assertTrue(com, true);
	}

}
