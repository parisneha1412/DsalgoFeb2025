package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Terminologies {

	WebDriver driver;
	
	public Terminologies(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//p[text()='Terminologies']")
	private WebElement terminologiesHeading;
	
	@FindBy(xpath="//div[@id='content']/li")
	private List<WebElement> countOfLinks;
	
	@FindBy(xpath="//div[@class='col-sm']/a")
	private WebElement tryHereButton;
	
	public void terminologiesHeadingIsDisplayed() {
		terminologiesHeading.isDisplayed();
	}
	
	public int getCountOfLinks() {
		int totalLinks = countOfLinks.size();
		System.out.println("Total Links "+totalLinks);
		 return countOfLinks.size();
		 
		 
	}
	
	public void clickOnTryHereButton() {
		tryHereButton.click();
	}
	
	
}
