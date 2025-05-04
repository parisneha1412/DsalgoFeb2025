package stepdefinitions;



import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.OperationsinStackPage;
import utils.CommonUtils;

public class PracticeQuestionStackStepDefinition {
	
	WebDriver driver;
	CommonUtils commonUtils;
	OperationsinStackPage operationsinStackPage;
	
	@Then("User should validate URL Sucessfully.")
	public void user_should_validate_url_sucessfully() {
		driver = DriverFactory.getDriver();
		operationsinStackPage =new OperationsinStackPage(driver);
		Assert.assertTrue(driver.getCurrentUrl().contains("stack/practice"));
	    
	}

	@Then("User should validate logo on page sucessfully")
	public void user_should_validate_logo_on_page_sucessfully() {
		driver = DriverFactory.getDriver();
		operationsinStackPage =new OperationsinStackPage(driver);
		commonUtils = new CommonUtils(driver);
		Assert.assertTrue(commonUtils.isLogoPresent());
	    
	}

	@Then("user should validate Userrname Sucessfully.")
	public void user_should_validate_userrname_sucessfully() {
		driver = DriverFactory.getDriver();
		operationsinStackPage =new OperationsinStackPage(driver);
		commonUtils = new CommonUtils(driver);
		Assert.assertTrue(commonUtils.isUserNameDisplayed());
	    
	}
	@Then("user should able to see  Dropdown on Practice Page.")
	public void user_should_able_to_see_dropdown_on_practice_page() {
		driver = DriverFactory.getDriver();
		operationsinStackPage =new OperationsinStackPage(driver);
		commonUtils = new CommonUtils(driver);
		Assert.assertTrue(commonUtils.isDropdownDisplayed());
		
	}
	
	@When("User click on Back button")
	public void user_click_on_back_button() {
		driver = DriverFactory.getDriver();
		operationsinStackPage =new OperationsinStackPage(driver);
		driver.navigate().back();
	}

	@Then("User should navigate to back page")
	public void user_should_navigate_to_back_page() {
		Assert.assertTrue(driver.getCurrentUrl().contains("in-stack"));
	    
	}
	@When("User click on dropdownmenu option")
	public void user_click_on_dropdownmenu_option() {
		driver = DriverFactory.getDriver();
		operationsinStackPage =new OperationsinStackPage(driver); 
		commonUtils = new CommonUtils(driver);
		commonUtils.doSelectOptionFromDropDown();
//	    operationsinStackPage.doClickonDropdownoption();
	}

	@Then("User should able to navigate that  Page.")
	public void user_should_able_to_navigate_that_page() {
		Assert.assertTrue(driver.getCurrentUrl().contains("array"));
		
		
	}


}
