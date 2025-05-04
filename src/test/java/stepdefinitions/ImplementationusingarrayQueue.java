package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ImplementationusingarrayQueuePage;
import utils.CommonUtils;

public class ImplementationusingarrayQueue {

	WebDriver driver;
	CommonUtils commonUtils;
	ImplementationusingarrayQueuePage implementationusingarrayQueuePage;
	
	@Then("User should able  see Title of Implementation using array of the Page")
	public void user_should_able_see_title_of_implementation_using_array_of_the_page() {
		driver = DriverFactory.getDriver();
		  Assert.assertTrue(driver.getTitle().contains("using array"));
	    
	}

	@Then("User sees the header as Implementation using array")
	public void user_sees_the_header_as_implementation_using_array() {
		driver =  DriverFactory.getDriver();
		implementationusingarrayQueuePage = new ImplementationusingarrayQueuePage(driver);
		Assert.assertTrue(implementationusingarrayQueuePage.getimplementationusingArrayHeader().contains("using array"));
	    
	}

	@Then("User should able to see Implementation using array Content")
	public void user_should_able_to_see_implementation_using_array_content() {
		driver =  DriverFactory.getDriver();
		implementationusingarrayQueuePage = new ImplementationusingarrayQueuePage(driver);
  Assert.assertTrue(implementationusingarrayQueuePage.implementationUsingArrayPageContent().contains("Elements are added from the end"));
	    
	}

	@Then("User should able to see Dropdown on Implementation using array")
	public void user_should_able_to_see_dropdown_on_implementation_using_array() {
		driver =  DriverFactory.getDriver();
		commonUtils = new CommonUtils(driver);
		(commonUtils).isDropdownDisplayed();
		
	}

	@Then("User should able to validate number of the link on Implementation using array")
	public void user_should_able_to_validate_number_of_the_link_on_implementation_using_array() {
		driver =  DriverFactory.getDriver();
		implementationusingarrayQueuePage = new ImplementationusingarrayQueuePage(driver);
		Assert.assertEquals(implementationusingarrayQueuePage.numberofLinksusingArrayQueuePage(),5);
	   
	}

	@When("User click on Try Editor Button on Implementation using array")
	public void user_click_on_try_editor_button_on_implementation_using_array() {
		driver =  DriverFactory.getDriver();
		implementationusingarrayQueuePage = new ImplementationusingarrayQueuePage(driver);
		implementationusingarrayQueuePage.doClickonusingArrayQueueTryEditorBtn();
	}

	@Then("User should Naviagte to Try editor page from Implementation using array")
	public void user_should_naviagte_to_try_editor_page_from_implementation_using_array() {
		driver =  DriverFactory.getDriver();
		implementationusingarrayQueuePage = new ImplementationusingarrayQueuePage(driver);
		Assert.assertTrue(driver.getCurrentUrl().contains("tryEditor"));
	}



}
