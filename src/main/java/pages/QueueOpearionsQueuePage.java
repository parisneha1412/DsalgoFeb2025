package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QueueOpearionsQueuePage {
WebDriver driver;
	
	
	public  QueueOpearionsQueuePage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);

}
	@FindBy(xpath="//p[text()='Queue Operations']")
	private WebElement queueOperationsHeader;
	
	@FindBy(xpath="//a[@class='btn btn-info']")
	private WebElement queueOptionsTryHere;
	
	@FindBy(xpath="//div[@id='content']//a")
	private List<WebElement> noOfLinkOnOperationsPage;
	
	public String getTitleQueueOpearions () {
		return driver.getTitle();
	}
		
		public String getqueueOperationsHeader()
		{
			String actualText = queueOperationsHeader.getText();
			System.out.println("Successful header is displayed: " +actualText);
			return actualText;
		}
		public String getqueueOperationsPageContent() {
			return driver.getPageSource();
		}
		
		public void doclickonTryHereBtn() {
			queueOptionsTryHere.click();
		}
		
		public String getCurretuUrlTryHere() {
			return driver.getCurrentUrl();
			
		}
		
		public int countNoOfLinks() {
			return noOfLinkOnOperationsPage.size();
		}
		
		
		
}


