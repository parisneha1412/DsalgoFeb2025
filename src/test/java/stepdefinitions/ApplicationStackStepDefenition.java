package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ApplicationPage;
import utils.CommonUtils;

public class ApplicationStackStepDefenition {
	
	WebDriver driver;
	ApplicationPage applicationPage;
	CommonUtils commonUtils;
	
	@Then("User should able  see URL of the Page")
	public void user_should_able_see_url_of_the_page() {
		driver = DriverFactory.getDriver();
		Assert.assertTrue(driver.getCurrentUrl().contains("applications"));
	    
	}

	@Then("User sees the header as Applications")
	public void user_sees_the_header_as_applications() {
		driver = DriverFactory.getDriver();
		applicationPage= new ApplicationPage(driver);
		Assert.assertTrue(applicationPage.getapplicationsPageHeader().contains("Applications") );  
	}

	@Then("User should able to see ApplicationsPage Content")
	public void user_should_able_to_see_applications_page_content() {
		driver = DriverFactory.getDriver();
		applicationPage= new ApplicationPage(driver);
		Assert.assertTrue(applicationPage.applicationPageContent().contains ("Some of the real time applications of Stack include"));
	} 

	@Then("User should able to validate number of the link on Applications Page")
	public void user_should_able_to_validate_number_of_the_link_on_applications_page() {
		driver = DriverFactory.getDriver();
		applicationPage= new ApplicationPage(driver);
		Assert.assertEquals(applicationPage.noOfLinksApplicationPage(),4);
	}

	@Then("User sees the DatastuructureDropdown on Applications")
	public void user_sees_the_datasturucture_dropdown_on_applications() {
		driver = DriverFactory.getDriver();
		applicationPage= new ApplicationPage(driver);
		commonUtils = new CommonUtils(driver);
		Assert.assertTrue(commonUtils.isDropdownDisplayed());
	}
	@When("User click on Try Editor Button on application Page")
	public void user_click_on_try_editor_button_on_application_page() {
		driver = DriverFactory.getDriver();
		applicationPage= new ApplicationPage(driver);
		applicationPage.doClickOnTryHereBtn();
	}

	@Then("User should Naviagte to Try editor page from aplicatio page")
	public void user_should_naviagte_to_try_editor_page_from_aplicatio_page() {
		Assert.assertTrue(driver.getCurrentUrl().contains("tryEditor"));
	}

	@When("User click on PracticeQuestion Link on application Page")
	public void user_click_on_practice_question_link_on_application_page() {
		driver = DriverFactory.getDriver();
		applicationPage= new ApplicationPage(driver);
		applicationPage.doClickOnPracticeQLink();
	}

	@Then("User should Naviagte to page sucessfully from  application Page")
	public void user_should_naviagte_to_page_sucessfully_from_application_page() {
		Assert.assertTrue(driver.getTitle().contains("Practice"));
	} 
	}



