package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
	
	WebDriver driver;
	
	//MainPage Constructor
	public MainPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//MainPage locators
	@FindBy(xpath="//button[@class='btn']")
	private WebElement getStartedBtn;
	
	
	//MainPage actions
	public void doClickOnGetStartedBtn() {
		getStartedBtn.click();
	}
	
}
