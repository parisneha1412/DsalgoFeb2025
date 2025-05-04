package stepdefinitions;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import pages.BasicOperationsinLists;
import utils.CommonUtils;

public class BasicOperationsinListsStepDefinition {
	WebDriver driver;
	BasicOperationsinLists basicOperationsinLists;
	CommonUtils commonUtils;
	
	@Then("User sees Basic Operations in Lists header on the page")
	public void user_sees_basic_operations_in_lists_header_on_the_page() {
		driver = DriverFactory.getDriver();
		basicOperationsinLists = new BasicOperationsinLists(driver);
		basicOperationsinLists.getPageHeader();
	}

	@Then("Text of all the links on Basic Operations in Lists should be correct")
	public void text_of_all_the_links_on_basic_operations_in_lists_should_be_correct() {
		ArrayList<String> expValues = new ArrayList<String>();
		expValues.add("Arrays in Python");
		expValues.add("Arrays Using List");
		expValues.add("Basic Operations in Lists");
		expValues.add("Applications of Array");
		expValues.add("Practice Questions");
		driver = DriverFactory.getDriver();
		basicOperationsinLists = new BasicOperationsinLists(driver);
		Assert.assertEquals(basicOperationsinLists.verifyLinkText(), expValues);
	}

	@Then("Page source on Basic Operations in Lists page should be correct")
	public void page_source_on_basic_operations_in_lists_page_should_be_correct() {
		driver = DriverFactory.getDriver();
		basicOperationsinLists = new BasicOperationsinLists(driver);
		Assert.assertTrue(basicOperationsinLists.getPageSource().contains("Insertion in Lists:"));
	}

	@Then("Page url should be correct on Basic Operations in Lists page")
	public void page_url_should_be_correct_on_basic_operations_in_lists_page() {
		driver = DriverFactory.getDriver();
		basicOperationsinLists = new BasicOperationsinLists(driver);
		Assert.assertTrue(basicOperationsinLists.getCurrentPageURL().contains("basic-operations-in-lists/"));
	}

	@Then("Basic Operations in Lists title should be correct")
	public void basic_operations_in_lists_title_should_be_correct() {
		driver = DriverFactory.getDriver();
		basicOperationsinLists = new BasicOperationsinLists(driver);
		Assert.assertTrue(basicOperationsinLists.getPageTitle().contains("Basic Operations in Lists"));
	}

	@Then("{string} page opens up on Basic Operations in Lists page")
	public void page_opens_up_on_basic_operations_in_lists_page(String pageLink) {
		driver = DriverFactory.getDriver();
		basicOperationsinLists = new BasicOperationsinLists(driver);
		Assert.assertTrue(basicOperationsinLists.doClickOnLink(pageLink).contains(pageLink));
	}

	@Then("User should remain on {string}")
	public void user_should_remain_on(String pageLink) {
		driver = DriverFactory.getDriver();
		basicOperationsinLists = new BasicOperationsinLists(driver);
		Assert.assertTrue(basicOperationsinLists.doClickOnLink(pageLink).contains(pageLink));
	}

	@Then("Try Editor page opens up from Basic Operations in Lists page")
	public void try_editor_page_opens_up_from_basic_operations_in_lists_page() {
		driver = DriverFactory.getDriver();
		commonUtils = new CommonUtils(driver);
		Assert.assertTrue(commonUtils.isTryEditorPageDisplayed().contains("tryEditor"));
	}



}
