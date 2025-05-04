package stepdefinitions;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import pages.PracticePage;

public class PracticeStepDefinition {
	WebDriver driver;
	PracticePage practicePage;
	
	@Then("Page title is displayed on the Practice page")
	public void page_title_is_displayed_on_the_practice_page() {
		driver = DriverFactory.getDriver();
		practicePage = new PracticePage(driver);
		Assert.assertTrue(practicePage.getPageTitle().contains("Practice Questions"));
	}

	@Then("{int} links should be displayed on the Practice page")
	public void links_should_be_displayed_on_the_practice_page(int pageLinkCount) {
		driver = DriverFactory.getDriver();
		practicePage = new PracticePage(driver);
		Assert.assertEquals(practicePage.getLinksCount(), pageLinkCount);
	}

	@Then("Text should be displayed correctly on the Practice page")
	public void text_should_be_displayed_correctly_on_the_practice_page() {
		ArrayList<String> expValues = new ArrayList<String>();
		expValues.add("Search the array");
		expValues.add("Max Consecutive Ones");
		expValues.add("Find Numbers with Even Number of Digits");
		expValues.add("Squares of a Sorted Array");
		driver = DriverFactory.getDriver();
		practicePage = new PracticePage(driver);
		Assert.assertEquals(practicePage.verifyLinkText(), expValues);
	}

	@Then("{string} page opens up from Practice page")
	public void page_opens_up_from_practice_page(String pageLink) {
		driver = DriverFactory.getDriver();
		practicePage = new PracticePage(driver);
		//Assert.assertTrue(practicePage.doClickOnLink(pageLink).contains(pageLink));
		Assert.assertTrue(practicePage.doClickOnLink(pageLink).contains("Assessment"));
	}
}
