package stepdefinitions;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import logger.Log;
import pages.ApplicationsofArrayPage;
import utils.CommonUtils;

public class ApplicationsofArrayStepDefinition {

	WebDriver driver;
	ApplicationsofArrayPage applicationsofArrayPage;
	CommonUtils commonUtils;

	@Then("User sees Applications of Array header on the page")
	public void user_sees_applications_of_array_header_on_the_page() {
		driver = DriverFactory.getDriver();
		applicationsofArrayPage = new ApplicationsofArrayPage(driver);
		Log.info("User is on the Application page...");
		Assert.assertTrue(applicationsofArrayPage.getPageHeader().contains("Applications of Array"));
	}

	@Then("Text of all the links on Applications of Array should be correct")
	public void text_of_all_the_links_on_applications_of_array_should_be_correct() {
		ArrayList<String> expValues = new ArrayList<String>();
		expValues.add("Arrays in Python");
		expValues.add("Arrays Using List");
		expValues.add("Basic Operations in Lists");
		expValues.add("Applications of Array");
		expValues.add("Practice Questions");
		driver = DriverFactory.getDriver();
		applicationsofArrayPage = new ApplicationsofArrayPage(driver);
		Assert.assertEquals(applicationsofArrayPage.verifyLinkText(), expValues);
	}

	@Then("Page url should be correct on Applications of Array page")
	public void page_url_should_be_correct_on_applications_of_array_page() {
		driver = DriverFactory.getDriver();
		applicationsofArrayPage = new ApplicationsofArrayPage(driver);
		Assert.assertTrue(applicationsofArrayPage.getCurrentPageURL().contains("applications-of-array/"));
	}

	@Then("Page title should be correct on Applications of Array page")
	public void page_title_should_be_correct_on_applications_of_array_page() {
		driver = DriverFactory.getDriver();
		applicationsofArrayPage = new ApplicationsofArrayPage(driver);
		Assert.assertTrue(applicationsofArrayPage.getPageTitle().contains("Applications of Array"));
	}

	@Then("{string} page opens up from Applications of Array page")
	public void page_opens_up_from_applications_of_array_page(String pageLinkName) {
		driver = DriverFactory.getDriver();
		applicationsofArrayPage = new ApplicationsofArrayPage(driver);
		Assert.assertTrue(applicationsofArrayPage.doClickOnLink(pageLinkName).contains(pageLinkName));
	}

	@Then("Page source on Applications of Array page should be correct")
	public void page_source_on_applications_of_array_page_should_be_correct() {
		driver = DriverFactory.getDriver();
		applicationsofArrayPage = new ApplicationsofArrayPage(driver);
		Assert.assertTrue(applicationsofArrayPage.getPageSource().contains("Some Common real world"));
	}

	@Then("Try Editor page opens up from Applications of Array page")
	public void try_editor_page_opens_up_from_applications_of_array_page() {
		driver = DriverFactory.getDriver();
		commonUtils = new CommonUtils(driver);
		Assert.assertTrue(commonUtils.isTryEditorPageDisplayed().contains("tryEditor"));
	}

}
