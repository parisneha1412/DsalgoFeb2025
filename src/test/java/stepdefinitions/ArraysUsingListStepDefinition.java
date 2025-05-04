package stepdefinitions;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import pages.ArraysUsingListPage;
import utils.CommonUtils;

public class ArraysUsingListStepDefinition {
	
	WebDriver driver;
	ArraysUsingListPage arraysUsingListPage;
	CommonUtils commonUtils;
	
	@Then("User sees Arrays Using List header on the page")
	public void user_sees_arrays_using_list_header_on_the_page() {
		driver = DriverFactory.getDriver();
		arraysUsingListPage = new ArraysUsingListPage(driver);
		arraysUsingListPage.getPageHeader();
	}

	@Then("Text of all the links on Arrays Using List should be correct")
	public void text_of_all_the_links_on_arrays_using_list_should_be_correct() {
		ArrayList<String> expValues = new ArrayList<String>();
		expValues.add("Arrays in Python");
		expValues.add("Arrays Using List");
		expValues.add("Basic Operations in Lists");
		expValues.add("Applications of Array");
		expValues.add("Practice Questions");
		driver = DriverFactory.getDriver();
		arraysUsingListPage = new ArraysUsingListPage(driver);
		Assert.assertEquals(arraysUsingListPage.verifyLinkText(), expValues);
	}

	@Then("Page source on Arrays Using List page should be correct")
	public void page_source_on_arrays_using_list_page_should_be_correct() {
		driver = DriverFactory.getDriver();
		arraysUsingListPage = new ArraysUsingListPage(driver);
		Assert.assertTrue(arraysUsingListPage.getPageSource().contains("grocery.append"));
	}

	@Then("Page url should be correct on Arrays Using List page")
	public void page_url_should_be_correct_on_arrays_using_list_page() {
		driver = DriverFactory.getDriver();
		arraysUsingListPage = new ArraysUsingListPage(driver);
		Assert.assertTrue(arraysUsingListPage.getCurrentPageURL().contains("arrays-using-list/"));
	}

	@Then("Arrays Using List title should be correct")
	public void arrays_using_list_title_should_be_correct() {
		driver = DriverFactory.getDriver();
		arraysUsingListPage = new ArraysUsingListPage(driver);
		Assert.assertTrue(arraysUsingListPage.getPageTitle().contains("Arrays Using List"));
	}

	@Then("User should navigate to {string} page")
	public void user_should_navigate_to_page(String pageLink) {
		driver = DriverFactory.getDriver();
		arraysUsingListPage = new ArraysUsingListPage(driver);
		Assert.assertTrue(arraysUsingListPage.doClickOnLink(pageLink).contains(pageLink));
	}

	@Then("{string} page opens up on Arrays Using List page")
	public void page_opens_up_on_arrays_using_list_page(String pageLink) {
		driver = DriverFactory.getDriver();
		arraysUsingListPage = new ArraysUsingListPage(driver);
		Assert.assertTrue(arraysUsingListPage.doClickOnLink(pageLink).contains(pageLink));
	}

	@Then("Try Editor page opens up from Arrays Using List page")
	public void try_editor_page_opens_up_from_arrays_using_list_page() {
		driver = DriverFactory.getDriver();
		commonUtils = new CommonUtils(driver);
		Assert.assertTrue(commonUtils.isTryEditorPageDisplayed().contains("tryEditor"));
	}

}
