package stepdefinitions;

import java.util.ArrayList;

//import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import pages.ArraysPage;

public class ArrayStepDefinition {
	WebDriver driver;
	ArraysPage arraysPage;

	@Then("User sees Array header on the Array page")
	public void user_sees_array_header_on_the_array_page() {
		driver = DriverFactory.getDriver();
		arraysPage = new ArraysPage(driver);
		Assert.assertTrue(arraysPage.getArrayHeader().contains("Array"));
	}

	@Then("User sees Topics Covered header on the Array page")
	public void user_sees_topics_covered_header_on_the_array_page() {
		driver = DriverFactory.getDriver();
		arraysPage = new ArraysPage(driver);
		Assert.assertTrue(arraysPage.topicsCoveredHeader().contains("Topics Covered"));
	}

	@Then("User should see {int} links on the Array page")
	public void user_should_see_links_on_the_array_page(int linksCount) {
		driver = DriverFactory.getDriver();
		arraysPage = new ArraysPage(driver);
		Assert.assertEquals(arraysPage.getLinksCount(), linksCount);
	}

	@Then("Text of all the links should be correct")
	public void text_of_all_the_links_should_be_correct() {
		ArrayList<String> expValues = new ArrayList<String>();
		expValues.add("Arrays in Python");
		expValues.add("Arrays Using List");
		expValues.add("Basic Operations in Lists");
		expValues.add("Applications of Array");
		driver = DriverFactory.getDriver();
		arraysPage = new ArraysPage(driver);
		Assert.assertEquals(arraysPage.verifyLinkText(), expValues);
	}

	@Then("Page source on Array page should be correct")
	public void page_source_on_array_page_should_be_correct() {
		driver = DriverFactory.getDriver();
		arraysPage = new ArraysPage(driver);
		Assert.assertTrue(arraysPage.getArrayPageSource().contains("Processors, especially vector processors"));
	}
	
	@Then("Page url should be correct")
	public void page_url_should_be_correct() {
		driver = DriverFactory.getDriver();
		arraysPage = new ArraysPage(driver);
		Assert.assertTrue(arraysPage.getCurrentPageURL().contains("com/array/"));
	}

	@Then("Page title should be correct")
	public void page_title_should_be_correct() {
		driver = DriverFactory.getDriver();
		arraysPage = new ArraysPage(driver);
		Assert.assertTrue(arraysPage.getArrayPageTitle().contains("Array"));
	}
//	
//	@When("User clicks on {string} link")
//	public void user_clicks_on_link(String pageLink) {
//		driver = DriverFactory.getDriver();
//		arraysPage = new ArraysPage(driver);
//		
//	}
//
//	@Then("Arrays in Python page opens up")
//	public void arrays_in_python_page_opens_up() {
//	    
//	}	
	
	@Then("{string} page opens up")
	public void page_opens_up(String pageLink) {
		driver = DriverFactory.getDriver();
		arraysPage = new ArraysPage(driver);
		Assert.assertTrue(arraysPage.doClickOnLink(pageLink).contains(pageLink));
	}


}
