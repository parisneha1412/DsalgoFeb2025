package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ArraysInPythonPage;
import pages.TryEditorPage;
import utils.CommonUtils;

public class TryEditorStepDefinition {
	
	WebDriver driver;
	TryEditorPage tryEditorPage;
	CommonUtils commonUtils;
	ArraysInPythonPage arraysInPythonPage;
	
	@Then("Title of the Editor Page should be correct")
	public void title_of_the_editor_page_should_be_correct() {
		driver = DriverFactory.getDriver();
		tryEditorPage = new TryEditorPage(driver);
		Assert.assertTrue(tryEditorPage.getPageTitle().contains("Assessment"));
	}

	@When("User sends valid data {string} in the Editor")
	public void user_sends_valid_data_in_the_editor(String testData) {
		driver = DriverFactory.getDriver();
		commonUtils = new CommonUtils(driver);
		commonUtils.doSendData(testData);
		
	}

	@When("User clicks on Run button on Try Editor")
	public void user_clicks_on_run_button_on_Try_Editor() {
		commonUtils.doClickOnRunBtn();
	}

	@Then("User sees the correct output")
	public void user_sees_the_correct_output() {
		Assert.assertTrue(commonUtils.doCheckTryEditorOutput().contains("10"));
	}

	@When("Alert message is displayed on Try Editor")
	public void alert_message_is_displayed_on_try_editor() {
		driver = DriverFactory.getDriver();
		commonUtils = new CommonUtils(driver);
		commonUtils.verifyAlertMessageInTryEditor();
	}

	@Then("Page url is displayed correctly on Try Editor page")
	public void page_url_is_displayed_correctly_on_try_editor_page() {
	    Assert.assertTrue(commonUtils.isTryEditorPageDisplayed().contains("/tryEditor"));
	}

	@When("User clicks on browser back button in the Editor")
	public void user_clicks_on_browser_back_button_in_the_editor() {
		driver = DriverFactory.getDriver();
		tryEditorPage = new TryEditorPage(driver);
		tryEditorPage.navigateToPreviousPage();
	}

	@Then("Arrays in Python page should be displayed")
	public void arrays_in_python_page_should_be_displayed() {
		arraysInPythonPage = new ArraysInPythonPage(driver);
		Assert.assertTrue(arraysInPythonPage.getPageTitle().contains("Arrays in Python"));
	}

}
