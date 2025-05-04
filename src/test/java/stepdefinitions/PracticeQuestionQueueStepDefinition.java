package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ImplementationUsingCollectionPage;
import pages.OperationsinStackPage;
import pages.PracticeQuestionQueuePage;
import utils.CommonUtils;

public class PracticeQuestionQueueStepDefinition {
	
	WebDriver driver;
	PracticeQuestionQueuePage practicequestionPage;
	CommonUtils commonUtils;
	ImplementationUsingCollectionPage implementationUsingCollectionPage;
	OperationsinStackPage operationsinStackPage;
		
	
	
	@Then("User should validate URL of Practice Page from Sucessfully.")
	public void user_should_validate_url_of_practice_page_from_sucessfully() {
		driver = DriverFactory.getDriver();
		practicequestionPage = new PracticeQuestionQueuePage(driver);
		Assert.assertTrue(driver.getCurrentUrl().contains("queue"));
		
	}

	@Then("User should validate logo on page Practice page sucessfully")
	public void user_should_validate_logo_on_page_practice_page_sucessfully() {
		driver = DriverFactory.getDriver();
		implementationUsingCollectionPage=new ImplementationUsingCollectionPage(driver);
		commonUtils = new CommonUtils(driver);
		Assert.assertTrue(commonUtils.isLogoPresent());
				
	    
	}

	@Then("user should validate Userrname on Practice page Sucessfully.")
	public void user_should_validate_userrname_on_practice_page_sucessfully() {
		driver = DriverFactory.getDriver();
		implementationUsingCollectionPage=new ImplementationUsingCollectionPage(driver);
		commonUtils = new CommonUtils(driver);
		Assert.assertTrue(commonUtils.isUserNameDisplayed());
	    
	}

	@Then("user should able to see  DropdownList on Practice Page.")
	public void user_should_able_to_see_dropdown_list_on_practice_page() {
		driver = DriverFactory.getDriver();
		implementationUsingCollectionPage=new ImplementationUsingCollectionPage(driver);
		commonUtils = new CommonUtils(driver);
		Assert.assertEquals(commonUtils.getDropdownCount(),6);
	    
	}

	@When("User click on dropdownmenu option from Practice Page")
	public void user_click_on_dropdownmenu_option_from_practice_page() {
		driver = DriverFactory.getDriver();
		implementationUsingCollectionPage=new ImplementationUsingCollectionPage(driver);
		operationsinStackPage =new OperationsinStackPage(driver); 
		commonUtils = new CommonUtils(driver);
		commonUtils.doSelectOptionFromDropDown();
//		operationsinStackPage.doClickonDropdownoption();
		
	    
	}

	@Then("User should able to navigate that  Page sucessfully")
	public void user_should_able_to_navigate_that_page_sucessfully() {
		Assert.assertTrue(driver.getCurrentUrl().contains("array"));
	    
	}

	@When("User click on Back button from Practice Page")
	public void user_click_on_back_button_from_practice_page() {
		driver = DriverFactory.getDriver();
		driver.navigate().back();
	}

	@Then("User should navigate to back page from Queue Practice Page  Sucessfully")
	public void user_should_navigate_to_back_page_from_queue_practice_page_sucessfully() {
		Assert.assertTrue(driver.getCurrentUrl().contains("implementation"));
	    
	}




}
