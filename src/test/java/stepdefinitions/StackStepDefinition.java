package stepdefinitions;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePageAfterLogin;
import pages.HomePageBeforeLogin;
import pages.OperationsinStackPage;
import pages.StackPage;
import utils.CommonUtils;


public class StackStepDefinition {
	WebDriver driver;
	HomePageAfterLogin homePageAfterLogin;
	HomePageBeforeLogin homePageBeforeLogin;
	StackPage stackPage;
	CommonUtils commonUtils;
	OperationsinStackPage operationsinStackPage;
	

	
	@When("User clicks the Get Started button from Stack section")
	public void user_clicks_the_get_started_button_from_stack_section() {
		driver = DriverFactory.getDriver();
		homePageAfterLogin = new HomePageAfterLogin(driver);
		homePageAfterLogin.doClickOnStackGetStarted();
	}

	@Then("Stack page opens up successfully")
	public void stack_page_opens_up_successfully() {
		stackPage = new StackPage(driver);
	   Assert.assertTrue(driver.getCurrentUrl().contains("com/stack/"));
	}
	@Then("User should able  see title of stack Page")
	public void user_should_able_see_title_of_stack_page() {
		stackPage = new StackPage(driver);
		Assert.assertTrue(driver.getTitle().contains("Stack"));
	}
	
	@Then("User should able to see stack Header")
	public void user_should_able_to_see_stack_header() {
		
		stackPage = new StackPage(driver);	
		Assert.assertTrue(stackPage.getstackheader().contains("Stack"));
		
	}
	@Then("User should able to see SubHeader")
	public void user_should_able_to_see_sub_header() {
		stackPage = new StackPage(driver);	
		Assert.assertTrue(stackPage.getstacksubheader().contains("Topics")); 
		
	}
	@Then("User should able to see stackpagecontent")
	public void user_should_able_to_see_stackpagecontent() {
		stackPage = new StackPage(driver);	
		Assert.assertTrue(stackPage.stackPageContent().contains("A stack is an Abstract Data Type (ADT), commonly used in most programming languages")); 
	}
	
	@Then("User should able to see Logo")
	public void user_should_able_to_see_logo() {
		stackPage = new StackPage(driver);
		commonUtils = new CommonUtils(driver);
		Assert.assertTrue(commonUtils.isLogoPresent());
		
}
	@Then("User should able to validate number of the link")
	public void user_should_able_to_validate_number_of_the_link() {
		stackPage = new StackPage(driver); 
		Assert.assertEquals(stackPage.stackLinksList(),3);
	}
	@When("User click on operation in Stack Link")
	public void User_click_on_operation_in_Stack_Link() {
	stackPage = new StackPage(driver); 
	stackPage.doClickonOperationLink();
	}
	
	@Then("User should land on Opeartion in Stack page successfully")
	public void User_should_land_on_Opeartion_in_Stack_page_successfully() {
		operationsinStackPage = new OperationsinStackPage(driver);
	   Assert.assertTrue(driver.getCurrentUrl().contains("operations-in-stack"));
	}
	
	@When("User click on Implementation  Link")
	public void user_click_on_implementation_link() {
		stackPage = new StackPage(driver);
		stackPage.doClickonImplementationLink();
	    
	}

	@Then("User should land on Implementation page successfully")
	public void user_should_land_on_implementation_page_successfully() {
	Assert.assertTrue(driver.getCurrentUrl(). contains("implementation"));    
		
}

	@When("User click on Applications  Link")
	public void user_click_on_applications_link() {
		stackPage = new StackPage(driver);
		stackPage.doClickonApplicationsLink();
	    
	}

	@Then("User should land on Applications page successfully")
	public void user_should_land_on_applications_page_successfully() {
	Assert.assertTrue(driver.getCurrentUrl(). contains("applications"));    
		
}
}


