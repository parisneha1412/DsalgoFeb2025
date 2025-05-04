package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GraphPage;
import pages.HomePageAfterLogin;
import pages.HomePageBeforeLogin;

public class GraphSpepDefinition {
	
	WebDriver driver;
	HomePageAfterLogin homePageAfterLogin;
	HomePageBeforeLogin homePageBeforeLogin;
	GraphPage graphPage;
	
	
	@When("User clicks the Get Started buttonfrom Graph section")
	public void user_clicks_the_get_started_buttonfrom_graph_section() {
		driver = DriverFactory.getDriver();
		homePageAfterLogin = new HomePageAfterLogin(driver);
		homePageAfterLogin.doClickOnGraphGetStarted();;
	    
	}

	@Then("Graph page opens up successfully")
	public void graph_page_opens_up_successfully() {
		driver = DriverFactory.getDriver();
		graphPage=new GraphPage(driver);
		Assert.assertTrue(graphPage.getGraphPageTitle().contains("Graph"));
		Assert.assertTrue(graphPage.getGraphPageUrl().contains("graph"));
	   
	}

	@Then("User should able to see Graph Header")
	public void user_should_able_to_see_graph_header() {
		driver = DriverFactory.getDriver();
		graphPage=new GraphPage(driver);
		Assert.assertTrue(graphPage.getGraphheader().contains("Graph"));
		Assert.assertTrue(graphPage.getGraphsubheader().contains("Topics Covered"));
	    
	}

	@Then("User should able to see Graphpagecontent")
	public void user_should_able_to_see_graphpagecontent() {
		driver = DriverFactory.getDriver();
		graphPage=new GraphPage(driver);
		Assert.assertTrue(graphPage.graphPageContent().contains("Graph is a non-linear data structure having a set of vertices"));
	    
	}

	@Then("User should able to validate number of the link on Graph Page")
	public void user_should_able_to_validate_number_of_the_link_on_graph_page() {
		driver = DriverFactory.getDriver();
		graphPage=new GraphPage(driver);
		Assert.assertEquals(graphPage.getLinkSizeOnGraph(),2);
	    
	}
	@When("User click on Graph Link")
	public void user_click_on_graph_link() {
		driver = DriverFactory.getDriver();
		graphPage=new GraphPage(driver);
		
	}

	@Then("User should able to navigate to  Graph Page Link sucessfully")
	public void user_should_able_to_navigate_to_graph_page_link_sucessfully() {
	    
	}

	@When("User click on Graph Representations Link")
	public void user_click_on_graph_representations_link() {
		driver = DriverFactory.getDriver();
		graphPage=new GraphPage(driver);
		graphPage.doClickOnGrapgPLink();
	}

	@Then("User should able to navigate to  Graph Representations Link sucessfully")
	public void user_should_able_to_navigate_to_graph_representations_link_sucessfully() {
	    Assert.assertTrue(driver.getCurrentUrl().contains("representations"));
	}




}
