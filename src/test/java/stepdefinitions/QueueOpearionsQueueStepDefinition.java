package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.QueueOpearionsQueuePage;
import utils.CommonUtils;

public class QueueOpearionsQueueStepDefinition {
	
	WebDriver driver;
	CommonUtils commonUtils;
	QueueOpearionsQueuePage queueOpearionsQueuePage;
	
	@Then("User should able  see Title of Queue Operations Page")
	public void user_should_able_see_title_of_queue_operations_page() {
		driver = DriverFactory.getDriver();
		queueOpearionsQueuePage =new QueueOpearionsQueuePage(driver);
		Assert.assertTrue(queueOpearionsQueuePage.getTitleQueueOpearions().contains("Operations"));
	    
	}

	@Then("User sees the header as Queue Operations")
	public void user_sees_the_header_as_queue_operations() {
		driver = DriverFactory.getDriver();
		queueOpearionsQueuePage =new QueueOpearionsQueuePage(driver);  
		Assert.assertTrue(queueOpearionsQueuePage.getqueueOperationsHeader().contains("Operations"));
	}
	@Then("User should able to see Queue Operations Page Content")
	public void user_should_able_to_see_queue_operations_page_content() {
		driver = DriverFactory.getDriver();
		queueOpearionsQueuePage =new QueueOpearionsQueuePage(driver); 
		Assert.assertTrue(queueOpearionsQueuePage.getqueueOperationsPageContent().contains("The rear will point to the last element inserted in the queue."));
	}

	@Then("User should able to see DropdownList Queue Operations")
	public void user_should_able_to_see_dropdownlist_queue_operations() {
		driver = DriverFactory.getDriver();
		commonUtils=new CommonUtils(driver);
		Assert.assertEquals(commonUtils.getDropdownCount(),6);
		
	    
	}
	@When("User click on Try Editor Button on Queue Operations Page")
	public void user_click_on_try_editor_button_on_queue_operations_page() {
		driver = DriverFactory.getDriver();
		queueOpearionsQueuePage =new QueueOpearionsQueuePage(driver); 
		queueOpearionsQueuePage.doclickonTryHereBtn();
			
	    
	}

	@Then("User should Naviagte to Try editor page from Queue Operations")
	public void user_should_naviagte_to_try_editor_page_from_queue_operations() {
		driver = DriverFactory.getDriver();
		queueOpearionsQueuePage =new QueueOpearionsQueuePage(driver); 
		Assert.assertTrue(queueOpearionsQueuePage.getCurretuUrlTryHere().contains("tryEditor"));
	    
	}

	@Then("User should able to validate number of the link on Queue Operations Page")
	public void user_should_able_to_validate_number_of_the_link_on_queue_operations_page() {
		driver = DriverFactory.getDriver();
		queueOpearionsQueuePage =new QueueOpearionsQueuePage(driver);
		Assert.assertEquals(queueOpearionsQueuePage.countNoOfLinks(),5);
	}
	@Then("Text should be displayed correctly on Queue operations page")
	public void text_should_be_displayed_correctly_on_queue_operations_page() {
	    
	}





}
