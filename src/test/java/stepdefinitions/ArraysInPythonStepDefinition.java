package stepdefinitions;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ArraysInPythonPage;
import utils.CommonUtils;

public class ArraysInPythonStepDefinition {
	WebDriver driver;
	ArraysInPythonPage arraysInPythonPage;
	CommonUtils commonUtils;
	
	@Then("User sees Arrays in Python header on the page")
	public void user_sees_arrays_in_python_header_on_the_page() {
		driver = DriverFactory.getDriver();
		arraysInPythonPage = new ArraysInPythonPage(driver);
		Assert.assertTrue(arraysInPythonPage.getPageHeader().contains("Arrays in Python"));
	}

	@Then("User sees Array header on the page")
	public void user_sees_array_header_on_the_page() {
		driver = DriverFactory.getDriver();
		arraysInPythonPage = new ArraysInPythonPage(driver);
		Assert.assertTrue(arraysInPythonPage.getPageSubHeader().contains("Array"));
		
	}

	@Then("User should see {int} links on the page")
	public void user_should_see_links_on_the_page(int pageLinksCount) {
		driver = DriverFactory.getDriver();
		arraysInPythonPage = new ArraysInPythonPage(driver);
		Assert.assertEquals(arraysInPythonPage.getPageLinkCounts(),pageLinksCount);
	}

	@Then("Text of all the links on Arrays in Python should be correct")
	public void text_of_all_the_links_on_arrays_in_python_should_be_correct() {
		ArrayList<String> expValues = new ArrayList<String>();
		expValues.add("Arrays in Python");
		expValues.add("Arrays Using List");
		expValues.add("Basic Operations in Lists");
		expValues.add("Applications of Array");
		expValues.add("Practice Questions");
		driver = DriverFactory.getDriver();
		arraysInPythonPage = new ArraysInPythonPage(driver);
		Assert.assertEquals(arraysInPythonPage.verifyLinkText(), expValues);
		
	}

	@Then("Page source on Arrays in Python page should be correct")
	public void page_source_on_arrays_in_python_page_should_be_correct() {
		driver = DriverFactory.getDriver();
		arraysInPythonPage = new ArraysInPythonPage(driver);
		Assert.assertTrue(arraysInPythonPage.getPageSource().contains("Insertion"));
	}

	@Then("Page url should be correct on Arrays in Python page")
	public void page_url_should_be_correct_on_arrays_in_python_page() {
		driver = DriverFactory.getDriver();
		arraysInPythonPage = new ArraysInPythonPage(driver);
		Assert.assertTrue(arraysInPythonPage.getCurrentPageURL().contains("arrays-in-python/"));
	}

	@Then("Arrays in Python page title should be correct")
	public void arrays_in_python_page_title_should_be_correct() {
		driver = DriverFactory.getDriver();
		arraysInPythonPage = new ArraysInPythonPage(driver);
		Assert.assertTrue(arraysInPythonPage.getPageTitle().contains("Arrays in Python"));
	}

	@Then("User should remain on {string} page")
	public void user_should_remain_on_page(String pageLinkName) {
		driver = DriverFactory.getDriver();
		arraysInPythonPage = new ArraysInPythonPage(driver);
		Assert.assertTrue(arraysInPythonPage.doClickOnLink(pageLinkName).contains(pageLinkName));
	}

	@Then("{string} page opens up on Arrays in Python page")
	public void page_opens_up_on_arrays_in_python_page(String pageLinkName) {
		driver = DriverFactory.getDriver();
		arraysInPythonPage = new ArraysInPythonPage(driver);
		Assert.assertTrue(arraysInPythonPage.doClickOnLink(pageLinkName).contains(pageLinkName));
	}
	
	@When("User clicks on Try here button on Arrays in Python page")
	public void user_clicks_on_try_here_button_on_arrays_in_python_page() {
		driver = DriverFactory.getDriver();
		commonUtils = new CommonUtils(driver);
		commonUtils.doClickOnTryHereBtn();
	}
	
	@Then("Try Editor page opens up on Arrays in Python page")
	public void try_editor_page_opens_up_on_arrays_in_python_page() {
		Assert.assertTrue(commonUtils.isTryEditorPageDisplayed().contains("tryEditor"));
	}



}
