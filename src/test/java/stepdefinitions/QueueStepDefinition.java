package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePageAfterLogin;
import pages.HomePageBeforeLogin;
import pages.QueuePage;
import pages.StackPage;
import utils.CommonUtils;

public class QueueStepDefinition {
	WebDriver driver;
	HomePageAfterLogin homePageAfterLogin;
	HomePageBeforeLogin homePageBeforeLogin;
	StackPage stackPage;
	CommonUtils commonUtils;
	QueuePage queuePage;
	
	@When("User clicks the Get Started button from Queue section")
	public void user_clicks_the_get_started_button_from_queue_section() {
		driver = DriverFactory.getDriver();
		homePageAfterLogin = new HomePageAfterLogin(driver);
		homePageAfterLogin.doClickOnQueueGetStarted();
	    
	}

	@Then("Queue page opens up successfully")
	public void queue_page_opens_up_successfully() {
		driver = DriverFactory.getDriver();
		Assert.assertTrue(driver.getCurrentUrl().contains("queue"));
	   
	}

	@Then("User should able  see title of queue Page")
	public void user_should_able_see_title_of_queue_page() {
		driver = DriverFactory.getDriver();
		Assert.assertTrue(driver.getTitle().contains("Queue"));
	    
	}

	@Then("User should able to see queue Header")
	public void user_should_able_to_see_queue_header() {
		driver = DriverFactory.getDriver();
		queuePage= new QueuePage(driver);
		Assert.assertTrue(queuePage.getqueueheader().contains("Queue"));
		
		
	}

	@Then("User should able to see SubHeader of quaeue page")
	public void user_should_able_to_see_sub_header_of_quaeue_page() {
		driver = DriverFactory.getDriver();
		queuePage= new QueuePage(driver);
		Assert.assertTrue(queuePage.getqueuesubheader().contains("Topics"));
	    
	}

	@Then("User should able to see queuepagecontent")
	public void user_should_able_to_see_queuepagecontent() {
		driver = DriverFactory.getDriver();
		queuePage= new QueuePage(driver);
		Assert.assertTrue(queuePage.getqueuepagecontent().contains("Queue is very similar to stacks, but the only"));
	    
	}

	@Then("User should able to see Logo on Queue Page")
	public void user_should_able_to_see_logo_on_queue_page() {
		queuePage= new QueuePage(driver);
		commonUtils = new CommonUtils(driver);
		Assert.assertTrue(commonUtils.isLogoPresent());
	    
	}

	@Then("User should able to validate number of the link on Queue page")
	public void user_should_able_to_validate_number_of_the_link_on_queue_page() {
		queuePage= new QueuePage(driver);
		Assert.assertEquals(queuePage.getQueuePageLink(),4);
	}

	@When("User click on Implementation of Queue in Python Link")
	public void user_click_on_implementation_of_queue_in_python_link() {
		queuePage= new QueuePage(driver);
		queuePage.doClickonImplementationLink();
	    
	}

	@Then("User should land on Implementation of Queue in Python page successfully")
	public void user_should_land_on_implementation_of_queue_in_python_page_successfully() {
		queuePage= new QueuePage(driver);
		Assert.assertTrue(driver.getCurrentUrl().contains("implementation-lists"));
	}

	@When("User click on Implementation using collections.deque  Link")
	public void user_click_on_implementation_using_collections_deque_link() {
		queuePage= new QueuePage(driver);
		queuePage.doClickonCollectionLink();
	}

	@Then("User should land on Implementation using collections.deque page successfully")
	public void user_should_land_on_implementation_using_collections_deque_page_successfully() {
		queuePage= new QueuePage(driver);
		Assert.assertTrue(driver.getCurrentUrl().contains("implementation-collections"));
	}

	@When("User click on Implementation using array  Link")
	public void user_click_on_implementation_using_array_link() {
		queuePage= new QueuePage(driver);
		queuePage.doClickonArrayLink();
	}

	@Then("User should land on Implementation using array page successfully")
	public void user_should_land_on_implementation_using_array_page_successfully() {
	   Assert.assertTrue(driver.getCurrentUrl().contains("Implementation-array"));
	}

	@When("User click on Queue Enqueue Link from Queue page")
	public void user_click_on_queue_enqueue_link_from_queue_page() {
		queuePage= new QueuePage(driver);
		queuePage.doClickonOperationLink();
	}

	@Then("User should land on Queue Enqueue page successfully")
	public void user_should_land_on_queue_enqueue_page_successfully() {
		queuePage= new QueuePage(driver);
		Assert.assertTrue(driver.getCurrentUrl().contains("QueueOp"));
	}

	
}
