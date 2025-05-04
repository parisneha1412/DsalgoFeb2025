package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageBeforeLogin {

	WebDriver driver;

	// HomePageBeforeLogin Constructor
	public HomePageBeforeLogin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// HomePageBeforeLogin Locators
	@FindBy(xpath= "//a[text()='Sign in']")
	private WebElement signInLink;
	
	//MainPage actions
		public void doClickOnSignInLink() {
			signInLink.click();
		}
}
