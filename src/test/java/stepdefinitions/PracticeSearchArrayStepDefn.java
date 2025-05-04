package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PracticeSearchArrayPage;

public class PracticeSearchArrayStepDefn {
	WebDriver driver;
	PracticeSearchArrayPage practiceSearchArrayPage;
	
	@Then("Page title {string} is displayed correctly on Search the array page")
	public void page_title_is_displayed_correctly_on_search_the_array_page(String pageTitle) {
		driver = DriverFactory.getDriver();
		practiceSearchArrayPage = new PracticeSearchArrayPage(driver);
		Assert.assertTrue(practiceSearchArrayPage.getPageTitle().contains(pageTitle));
	}

	@Then("Page url is displayed correctly on Search the array page")
	public void page_url_is_displayed_correctly_on_Search_the_array_page() {
		driver = DriverFactory.getDriver();
		practiceSearchArrayPage = new PracticeSearchArrayPage(driver);
		Assert.assertTrue(practiceSearchArrayPage.getPageURL().contains("question/1"));
	}

	@Then("Default text should be displayed correctly on Search the array page")
	public void default_text_should_be_displayed_correctly_on_Search_the_array_page() {
		driver = DriverFactory.getDriver();
		practiceSearchArrayPage = new PracticeSearchArrayPage(driver);
		Assert.assertTrue(practiceSearchArrayPage.getPageText().contains("Write a Python Program"));
	}
	
	@Then("Default text should be displayed correctly on the Editor pane")
	public void default_text_should_be_displayed_correctly_on_the_editor_pane() {
		driver = DriverFactory.getDriver();
		practiceSearchArrayPage = new PracticeSearchArrayPage(driver);
		Assert.assertTrue(practiceSearchArrayPage.getEditorPaneText().contains("def search(input"));
	}

	@Then("Run and Submit button should be displayed on Search the array page")
	public void run_and_submit_button_should_be_displayed_on_Search_the_array_page() {
		driver = DriverFactory.getDriver();
		practiceSearchArrayPage = new PracticeSearchArrayPage(driver);
		Assert.assertTrue(practiceSearchArrayPage.IsRunBtnDisplayed());
		Assert.assertTrue(practiceSearchArrayPage.IsSubmitBtnDisplayed());
	}

	@When("User enters data {string} in the text editor window")
	public void user_enters_data_in_the_text_editor_window(String testData) {
		driver = DriverFactory.getDriver();
		practiceSearchArrayPage = new PracticeSearchArrayPage(driver);
		practiceSearchArrayPage.enterData(testData);
	}

	@When("User clicks on Run button")
	public void user_clicks_on_run_button() {
		driver = DriverFactory.getDriver();
		practiceSearchArrayPage = new PracticeSearchArrayPage(driver);
		practiceSearchArrayPage.doClickOnRun();
	}

	@Then("Output {string} should be displayed correctly")
	public void output_should_be_displayed_correctly(String outputText) {
		driver = DriverFactory.getDriver();
		practiceSearchArrayPage = new PracticeSearchArrayPage(driver);
		Assert.assertEquals(practiceSearchArrayPage.verifyOutput(), outputText);
	}

	@When("User clicks on Submit button")
	public void user_clicks_on_submit_button() {
		driver = DriverFactory.getDriver();
		practiceSearchArrayPage = new PracticeSearchArrayPage(driver);
		practiceSearchArrayPage.doClickOnSubmit();
	}

	@When("Alert message is displayed")
	public void alert_message_is_displayed() {
		driver = DriverFactory.getDriver();
		practiceSearchArrayPage = new PracticeSearchArrayPage(driver);
		practiceSearchArrayPage.verifyAlertMessageWindow();
	}
	
	@When("User clicks on browser back button")
	public void user_clicks_on_browser_back_button() {
		driver = DriverFactory.getDriver();
		practiceSearchArrayPage = new PracticeSearchArrayPage(driver);
		practiceSearchArrayPage.navigateToBack();
		
	}

	@Then("User is navigated to Practice page")
	public void user_is_navigated_to_practice_page() {
		driver = DriverFactory.getDriver();
		practiceSearchArrayPage = new PracticeSearchArrayPage(driver);
		Assert.assertTrue(practiceSearchArrayPage.getPageURL().contains("/practice"));
	}


}
