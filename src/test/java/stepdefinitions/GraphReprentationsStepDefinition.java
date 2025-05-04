package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GraphPage;
import pages.GraphReprentationsPage;
import utils.CommonUtils;

public class GraphReprentationsStepDefinition {
	
	WebDriver driver;
	GraphPage graphPage;
	GraphReprentationsPage graphReprentationsPage;
	CommonUtils commonUtils;
	
	
	@Then("User should able  see title of the Graph Respresntations Page")
	public void user_should_able_see_title_of_the_graph_respresntations_page() {
		driver = DriverFactory.getDriver();
		 graphPage = new GraphPage(driver);
		 Assert.assertTrue(graphPage.getGraphPageTitle().contains("Graph"));
	    
	}

	@Then("User sees the header as Graph Respresntations")
	public void user_sees_the_header_as_graph_respresntations() {
		driver = DriverFactory.getDriver();
		graphReprentationsPage=new GraphReprentationsPage(driver);
		Assert.assertTrue(graphReprentationsPage.getGraphhReader().contains("Graph Representations"));
	 
	}

	@Then("User should able to see Graph Respresntations Content")
	public void user_should_able_to_see_graph_respresntations_content() {
		driver = DriverFactory.getDriver();
		graphPage=new GraphPage(driver);
		driver = DriverFactory.getDriver();
		Assert.assertTrue(graphPage.graphPageContent().contains("Now you would have got an idea of graphs."));
	    
	}

	@Then("User should able to see Signout Link on Graph Respresntations")
	public void user_should_able_to_see_signout_link_on_graph_respresntations() {
		driver = DriverFactory.getDriver();
		commonUtils = new CommonUtils(driver);
		commonUtils.isSignOutLinkDisplayed();
	}

	@Then("User should able to validate number of the link on Graph Respresntations")
	public void user_should_able_to_validate_number_of_the_link_on_graph_respresntations() {
		driver = DriverFactory.getDriver();
		graphReprentationsPage=new GraphReprentationsPage(driver);
		Assert.assertEquals(graphReprentationsPage.getCountofLinksonGRPage(),3);
	    
	}

	@When("User click on Try Editor Button on Graph Respresntations")
	public void user_click_on_try_editor_button_on_graph_respresntations() {
		driver = DriverFactory.getDriver();
	graphReprentationsPage=new GraphReprentationsPage(driver);
	graphReprentationsPage.doClickOnTryBtn();
	
	
	}

	@Then("User should Naviagte to Try editor page from Graph Respresntations")
	public void user_should_naviagte_to_try_editor_page_from_graph_respresntations() {
		Assert.assertTrue(driver.getCurrentUrl().contains("tryEditor"));
	}

	@When("User click on PracticeQuestion Link on Graph Respresntations")
	public void user_click_on_practice_question_link_on_graph_respresntations() {
		driver = DriverFactory.getDriver();
		graphReprentationsPage=new GraphReprentationsPage(driver);
		graphReprentationsPage.doClickOnImpPracticeLink();
	}

	@Then("User should Naviagte to PracticeQuestion page sucessfully from Graph Respresntations")
	public void user_should_naviagte_to_practice_question_page_sucessfully_from_graph_respresntations() {
		Assert.assertTrue(driver.getCurrentUrl().contains("practice"));
	}




}
