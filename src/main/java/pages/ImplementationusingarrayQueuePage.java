package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ImplementationusingarrayQueuePage {
WebDriver driver;
	
	
	public  ImplementationusingarrayQueuePage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);

}
	@FindBy(xpath="//p[text()='Implementation using array']")
	private WebElement implementationusingArrayHeader;
	
	@FindBy(xpath="//div[@id='content']//a")
	 private List<WebElement> linksonQueueusingArrayPage ;
	
	@FindBy(xpath="//a[@class='btn btn-info']")
	private WebElement usingArrayQueueTryEditorBtn;
	
	
	
	public String getimplementationusingArrayHeader()
	{
		String actualText = implementationusingArrayHeader.getText();
		System.out.println("Successful header is displayed: " +actualText);
		return actualText;
	}
	public String implementationUsingArrayPageContent() {
		return driver.getPageSource();
}
	public int numberofLinksusingArrayQueuePage() {
		return linksonQueueusingArrayPage.size();
		
	}
	public void doClickonusingArrayQueueTryEditorBtn() {
		usingArrayQueueTryEditorBtn.click();
	}
}
