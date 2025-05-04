package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.OperationsinStackPage;
import utils.CommonUtils;

public class OpeartionsinStackStepDefinition {
	
		WebDriver driver;
		CommonUtils commonUtils;
		OperationsinStackPage operationsinStackPage;
		
		@Then("User should able  see title of the Page")
		public void user_should_able_see_title_of_the_page() {
			driver = DriverFactory.getDriver();
			operationsinStackPage =new OperationsinStackPage(driver);
			Assert.assertTrue(driver.getTitle().contains("Operations"));
			
		}
		
		
		@Then("User sees the header as Operations in Stack")
		public void user_sees_the_header_as_operations_in_stack()
		{
			driver = DriverFactory.getDriver();
			operationsinStackPage =new OperationsinStackPage(driver);
		  Assert.assertTrue(operationsinStackPage.getoperationinstackHeader().contains("Operations"));  
		}

		@Then("User should able to see operationinStackPage Content")
		public void user_should_able_to_see_operationin_stack_page_content() {
			driver = DriverFactory.getDriver();
		operationsinStackPage = new OperationsinStackPage(driver);
		Assert.assertTrue(operationsinStackPage.operationinstackPageContent().contains("The two main operations of Stack are")); 

		}
		@Then("User should able to see Username")
		public void user_should_able_to_see_username() {
			driver = DriverFactory.getDriver();
			commonUtils = new CommonUtils(driver);
			Assert.assertTrue(commonUtils.isUserNameDisplayed());
		    
		}
		@Then("User should able to validate number of the link on Operations in stack page")
		public void user_should_able_to_validate_number_of_the_link_on_operations_in_stack_page() {
			driver = DriverFactory.getDriver();
			operationsinStackPage = new OperationsinStackPage(driver);
			Assert.assertEquals(operationsinStackPage.operationsinLinksList(),4);
		    
		} 
		
		@When("User click on Try Editor Button")
		public void user_click_on_try_editor_button() {
			driver = DriverFactory.getDriver();
			operationsinStackPage = new OperationsinStackPage(driver);
			operationsinStackPage.doClickonTryEditorBtn();
		    
		}

		@Then("User should Naviagte to Try editor page")
		public void user_should_naviagte_to_try_editor_page() {
			operationsinStackPage = new OperationsinStackPage(driver);
			   Assert.assertTrue(driver.getCurrentUrl().contains("tryEditor"));
		}
		
		@When("User click on PracticeQuestion Link")
		public void user_click_on_practice_question_link() {
			driver = DriverFactory.getDriver();
			operationsinStackPage = new OperationsinStackPage(driver);
			operationsinStackPage.doClickonPracticequestionLink();   
		}

		@Then("User should Naviagte to page sucessfully")
		public void user_should_naviagte_to_page_sucessfully() {
			Assert.assertTrue(driver.getCurrentUrl().contains("practice"));  
		}



	}

