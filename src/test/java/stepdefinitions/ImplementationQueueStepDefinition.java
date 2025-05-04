package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ImplementationQueuePage;
import utils.CommonUtils;

public class ImplementationQueueStepDefinition {
	WebDriver driver;
	CommonUtils commonUtils;
	ImplementationQueuePage implementationQueuePage;
	
	@Then("User should able  see Implementation of Queue in Python title of the Page")
	public void user_should_able_see_implementation_of_queue_in_python_title_of_the_page() {
		driver = DriverFactory.getDriver();
	  Assert.assertTrue(driver.getTitle().contains("Implementation"));  
	}

	@Then("User sees the header as mplementation of Queue in Python")
	public void user_sees_the_header_as_mplementation_of_queue_in_python() {
		driver = DriverFactory.getDriver();
		implementationQueuePage = new ImplementationQueuePage(driver);
		Assert.assertTrue(implementationQueuePage.getimplementationQueueHeader().contains("Python"));
	    
	}

	@Then("User should able to see mplementation of Queue in Python Page Content")
	public void user_should_able_to_see_mplementation_of_queue_in_python_page_content() {
		driver = DriverFactory.getDriver();
		implementationQueuePage = new ImplementationQueuePage(driver);
		Assert.assertTrue(implementationQueuePage.implementationQueuePageContent().contains("There are various ways to implement queue in python"));
	    
	}
	@Then("User should able to see Username  on implementation of Queue in Python")
	public void user_should_able_to_see_username_on_implementation_of_queue_in_python() {
		driver = DriverFactory.getDriver();
		commonUtils = new CommonUtils(driver);
		Assert.assertTrue(commonUtils.isUserNameDisplayed());
	}

	@Then("User should able to validate number of the link on implementation of Queue in Python")
	public void user_should_able_to_validate_number_of_the_link_on_implementation_of_queue_in_python() {
		driver = DriverFactory.getDriver();
		implementationQueuePage = new ImplementationQueuePage(driver);
		Assert.assertEquals(implementationQueuePage.numberofLinksImplementationQueuePage(),5);
	}

	@When("User click on Try Editor Button on implementation of Queue in Python")
	public void user_click_on_try_editor_button_on_implementation_of_queue_in_python() {
		driver = DriverFactory.getDriver();
		implementationQueuePage = new ImplementationQueuePage(driver);
		implementationQueuePage.doClickonQueueTryEditorBtn();
	}

	@Then("User should Naviagte to Try editor page from implementation of Queue in Python Page")
	public void user_should_naviagte_to_try_editor_page_from_implementation_of_queue_in_python_page() {
		driver = DriverFactory.getDriver();
		implementationQueuePage = new ImplementationQueuePage(driver);
		Assert.assertTrue(driver.getCurrentUrl().contains("tryEditor"));
	}







}
