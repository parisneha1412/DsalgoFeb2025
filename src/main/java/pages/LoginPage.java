package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	// HomePageBeforeLogin Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// HomePageBeforeLogin Locators
	@FindBy(id = "id_username")
	private WebElement userName;

	@FindBy(id = "id_password")
	private WebElement passWord;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement loginBtn;

	// MainPage actions
	public void enterLoginCredentials(String userID, String passWordID) {
		userName.sendKeys(userID);
		passWord.sendKeys(passWordID);
	}

	public void doClickLoginBtn() {
		loginBtn.click();
	}
}
