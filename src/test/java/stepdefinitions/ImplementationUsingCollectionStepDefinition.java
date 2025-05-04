package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ImplementationUsingCollectionPage;
import utils.CommonUtils;

public class ImplementationUsingCollectionStepDefinition {
	
	WebDriver driver;
	ImplementationUsingCollectionPage implementationUsingCollectionPage;
	CommonUtils commonUtils;
	
	@Then("User should able  see Title of Implementation using collections.dequetitle of the Page")
	public void user_should_able_see_Title_of_implementation_using_collections_dequetitle_of_the_page() {
		driver = DriverFactory.getDriver();
		  Assert.assertTrue(driver.getTitle().contains("collections.deque")); 
	    
	}

	@Then("User sees the header as Implementation using collections.deque")
	public void user_sees_the_header_as_implementation_using_collections_deque() {
		driver = DriverFactory.getDriver();
		implementationUsingCollectionPage=new ImplementationUsingCollectionPage(driver);
		Assert.assertTrue(implementationUsingCollectionPage.getimplementationCollectioneHeader().contains("collections"));
	}

	@Then("User should able to see Implementation using collections.deque Content")
	public void user_should_able_to_see_implementation_using_collections_deque_Content() {
		driver = DriverFactory.getDriver();
		implementationUsingCollectionPage=new ImplementationUsingCollectionPage(driver);
		Assert.assertTrue(implementationUsingCollectionPage.implementationCollectionPageContent().contains("Queue in Python can be implemented using deque class"));
	}

	@Then("User should able to see Logo on Implementation using collections.deque")
	public void user_should_able_to_see_logo_on_implementation_using_collections_deque() {
		driver = DriverFactory.getDriver();
		commonUtils = new CommonUtils(driver);
		Assert.assertTrue(commonUtils.isLogoPresent());
	    
	}

	@Then("User should able to validate number of the link on Implementation using collections.deque")
	public void user_should_able_to_validate_number_of_the_link_on_implementation_using_collections_deque() {
		driver = DriverFactory.getDriver();
		implementationUsingCollectionPage=new ImplementationUsingCollectionPage(driver);
		Assert.assertEquals(implementationUsingCollectionPage.numberofLinksIusingcollectionsnQueuePage(),5);
		
	}

	@When("User click on Try Editor Button on Implementation using collections.deque Page")
	public void user_click_on_try_editor_button_on_implementation_using_collections_deque_page() {
		driver = DriverFactory.getDriver();
		implementationUsingCollectionPage=new ImplementationUsingCollectionPage(driver);
		implementationUsingCollectionPage.doClickonCollectionQueueTryEditorBtn();
	}

	@Then("User should Naviagte to Try editor page from Implementation using collections.deque")
	public void user_should_naviagte_to_try_editor_page_from_implementation_using_collections_deque() {
		driver = DriverFactory.getDriver();
		implementationUsingCollectionPage=new ImplementationUsingCollectionPage(driver);
		Assert.assertTrue(driver.getCurrentUrl().contains("tryEditor"));
		
	}
	@When("User Click on Practice question link from Queue Page")
	public void user_click_on_practice_question_link_from_queue_page() {
		driver = DriverFactory.getDriver();
		implementationUsingCollectionPage=new ImplementationUsingCollectionPage(driver);
		implementationUsingCollectionPage.doClickOnpracticeQuestionLink();
	}

	@Then("User should land on Practice question Page")
	public void user_should_land_on_practice_question_page() {
		driver = DriverFactory.getDriver();
		implementationUsingCollectionPage=new ImplementationUsingCollectionPage(driver);
		Assert.assertTrue(driver.getCurrentUrl().contains("practice"));
	}



}
