package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ArraysPage;
import pages.HomePageAfterLogin;
import pages.HomePageBeforeLogin;
import pages.LoginPage;
import pages.MainPage;
import utils.CommonUtils;

public class NavigateToArrayStepDefinition {
	WebDriver driver;
	HomePageAfterLogin homePageAfterLogin;
	HomePageBeforeLogin homePageBeforeLogin;
	ArraysPage arraysPage;
	CommonUtils commonUtils;
	LoginPage loginPage;
	MainPage mainPage;
	
	@Given("User is logged into Homepage with valid username {string} and {string}")
	public void user_is_logged_into_homepage_with_valid_username_and(String username, String password) {
		driver = DriverFactory.getDriver();
		mainPage = new MainPage(driver);
		mainPage.doClickOnGetStartedBtn();
		homePageBeforeLogin = new HomePageBeforeLogin(driver);
		homePageBeforeLogin.doClickOnSignInLink();
		loginPage = new LoginPage(driver);
		loginPage.enterLoginCredentials(username, password);
		loginPage.doClickLoginBtn();
		homePageAfterLogin = new HomePageAfterLogin(driver);
		String actualText = homePageAfterLogin.getSuccessfulLoginMsg();
		System.out.println(actualText);
	}

	@When("User clicks the Get Started button from Array section")
	public void user_clicks_the_get_started_button_from_array_section() {
		homePageAfterLogin.doClickOnArrayGetStarted();
	}
	
	@When("User clicks the Arrays option from Data Structures dropdown")
	public void user_clicks_the_arrays_option_from_data_structures_dropdown() {
		driver = DriverFactory.getDriver();
		commonUtils = new CommonUtils(driver);
		commonUtils.doSelectOptionFromDropDown();
	}


	@Then("Array page opens up successfully")
	public void array_page_opens_up_successfully() {
		arraysPage = new ArraysPage(driver);
	   Assert.assertTrue(driver.getCurrentUrl().contains("com/array/"));
	}
	

}
