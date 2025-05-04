package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GraphPage {
WebDriver driver;
	
	public GraphPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h4[text()='Graph']")
	private WebElement graphHeader;
	

	@FindBy(xpath="//p[text()='Topics Covered']")
	private WebElement subHeader;
	
	@FindBy(xpath="//a[@class='list-group-item']")
	private List<WebElement> linksOnGraph;
	
	@FindBy(xpath="//a[text()='Graph Representations']")
	private WebElement grapPresentationlink;
	
	@FindBy(xpath="//div[@id='content']//a")
	private List<WebElement> noOfLinkOnGraphrPage;
	
	public String getGraphPageTitle() {
		   return driver.getTitle();
	   }
	public String getGraphPageUrl() {
		   return driver.getCurrentUrl();
	   }
	
	
	public String getGraphheader()
	{
		String actualText = graphHeader.getText();
		System.out.println("Successful header is displayed: " +actualText);
		return actualText;
	}
	public String getGraphsubheader()
	{
		String actualText = subHeader.getText();
		System.out.println("Successful subheader is displayed: " +actualText);
		return actualText;
	}
	public String graphPageContent() {
 		return driver.getPageSource();

	
	}
	
	public int getLinkSizeOnGraph() {
		return linksOnGraph.size();
	}
	
	public void doClickOnGrapgPLink() {
		grapPresentationlink.click();
	}
	
	
}
