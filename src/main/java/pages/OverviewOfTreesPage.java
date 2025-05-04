package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverviewOfTreesPage {
WebDriver driver;
	
	public OverviewOfTreesPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//strong[contains(text(), 'Overview:')]")
	private WebElement overviewHeading;
	
	@FindBy(xpath="//p[text()='Overview of Trees']")
	private WebElement topHeading;
	
	@FindBy(xpath="//p[contains(text(), 'hierarchical data structure')]")
	private WebElement paragraphText;
	
	@FindBy(xpath="//div[@class='col-sm']/a")
	private WebElement tryHereButton;
	
	@FindBy(xpath="//div[@id='content']/li")
	private List<WebElement> countOfLinks;
	
	public void overviewHeadingText() {
		overviewHeading.isDisplayed();
	}
	
	public void topHeadingIsDisplayed() {
		topHeading.isDisplayed();
		
	}
	
	public String verifyParagraphText() {
		String paraText = paragraphText.getText();
		return paraText;
	}
	
	public void clickOnTryHereButton() {
		tryHereButton.click();
	}
	
	public int getCountOfLinks() {
		int totalLinks = countOfLinks.size();
		System.out.println("Total Links "+totalLinks);
		 return countOfLinks.size();
	}
	
	
}
