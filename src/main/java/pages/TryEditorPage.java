package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TryEditorPage {
WebDriver driver;
	
	public TryEditorPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
	}
	
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	
	public void navigateToPreviousPage()
	{
		driver.navigate().back();
	}
}
