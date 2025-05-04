package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BinaryTreesPage {

	WebDriver driver;
	
	public BinaryTreesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//p[text()='Binary Trees']")
	private WebElement binaryTreesHeading;
	
	@FindBy(xpath="//div[@id='content']/li")
	private List<WebElement> countOfLinks;
	
	@FindBy(xpath="//a[@class='btn btn-info']")
	private WebElement tryHereButton;
	
	
	
	public int getCountOfLinks() {
		int totalLinks = countOfLinks.size();
		System.out.println("Total Links "+totalLinks);
		 return countOfLinks.size();	 
		 
	}
	
	public void binaryTreesHeadingIsDisplayed() {
		binaryTreesHeading.isDisplayed();
	}
	
	public void clickOnTryHereButton() {
		tryHereButton.click();
	}
}
