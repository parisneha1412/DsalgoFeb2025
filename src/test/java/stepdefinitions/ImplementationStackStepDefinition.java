package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ImplementationStackPage;
import utils.CommonUtils;

public class ImplementationStackStepDefinition {

	WebDriver driver;
	ImplementationStackPage implementationStackPage;
	CommonUtils commonUtils;
	
	@Then("User should able  see title of the Implementation Page")
	public void user_should_able_see_title_of_the_implementation_page() {
		driver = DriverFactory.getDriver();
		implementationStackPage = new ImplementationStackPage(driver);
		Assert.assertTrue(driver.getTitle().contains("Implementation"));
	}
	@Then("User sees the header as Implementation")
	public void user_sees_the_header_as_implementation() {
		driver = DriverFactory.getDriver();
		implementationStackPage = new ImplementationStackPage(driver);
		Assert.assertTrue(implementationStackPage.getimplementationPageHeader().contains("Implementation") );
		
	}

	@Then("User should able to see ImplementationkPage Content")
	public void user_should_able_to_see_implementationk_page_content() {
		driver = DriverFactory.getDriver();
		implementationStackPage = new ImplementationStackPage(driver);
		Assert.assertTrue(implementationStackPage.implementationPageContent().contains("A stack can be easily implemented either through an") ); 
	}
	@Then("User should able to see Signout Link")
	public void user_should_able_to_see_signout_link() {
		driver = DriverFactory.getDriver();
		commonUtils = new CommonUtils(driver);
		Assert.assertTrue(commonUtils.isSignOutLinkDisplayed());
	}
	

	@Then("User should able to validate number of the link on Implementation page")
	public void user_should_able_to_validate_number_of_the_link_on_implementation_page() {
		driver = DriverFactory.getDriver();
		implementationStackPage= new ImplementationStackPage(driver);
		Assert.assertEquals(implementationStackPage.implementationPagenumberOfLinks(), 4);
	    
	}

	@When("User click on Try Editor Button on Implementation page")
	public void user_click_on_try_editor_button_on_implementation_page() {
		driver = DriverFactory.getDriver();
		implementationStackPage = new ImplementationStackPage(driver);
		implementationStackPage.doClickOnTryBtn();
	}

	@Then("User should Naviagte to Try editor page from Implementation page")
	public void user_should_naviagte_to_try_editor_page_from_implementation_page() {
		Assert.assertTrue(driver.getCurrentUrl().contains("tryEditor"));   
	}
	@When("User click on PracticeQuestion Link on Implementation Page")
	public void user_click_on_practice_question_link_on_implementation_page() {
		driver = DriverFactory.getDriver();
		implementationStackPage = new ImplementationStackPage(driver);
		implementationStackPage.doClickOnImpPracticeLink();
	    
	}

	@Then("User should Naviagte to PracticeQuestion page sucessfully")
	public void user_should_naviagte_to_practice_question_page_sucessfully() {
		Assert.assertTrue(driver.getTitle().contains("Practice"));
	}
}







