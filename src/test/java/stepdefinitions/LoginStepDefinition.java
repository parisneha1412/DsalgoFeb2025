package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePageAfterLogin;
import pages.HomePageBeforeLogin;
import pages.LoginPage;
import pages.MainPage;

public class LoginStepDefinition {
	public static WebDriver driver;
	MainPage mainPage;
	HomePageBeforeLogin homePageBeforeLogin;
	LoginPage loginPage;
	HomePageAfterLogin homePageAfterLogin;
	
	@Given("User is on the Login page")
	public void user_is_on_the_login_page() {
		driver = DriverFactory.getDriver();
		mainPage = new MainPage(driver);
		mainPage.doClickOnGetStartedBtn();
		homePageBeforeLogin = new HomePageBeforeLogin(driver);
		homePageBeforeLogin.doClickOnSignInLink();
	    
	} 
	
	@When("User enters username {string} and enters password {string}")
	public void user_enters_username_and_enters_password(String username, String password) {
		loginPage = new LoginPage(driver);
		loginPage.enterLoginCredentials(username, password);
		
	}

	@And("User clicks on Login button")
	public void user_clicks_on_login_button() {
		loginPage.doClickLoginBtn();
	}

	@Then("User is logged in to home page")
	public void User_is_logged_in_to_home_page() {
		homePageAfterLogin = new HomePageAfterLogin(driver);
		Assert.assertTrue(homePageAfterLogin.getSuccessfulLoginMsg().contains("You are logged in"));
	}	
}
