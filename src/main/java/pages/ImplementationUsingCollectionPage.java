package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ImplementationUsingCollectionPage {
	WebDriver driver;
	
	
	public  ImplementationUsingCollectionPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
	
	@FindBy(xpath="//p[text()='Implementation using collections.deque']")
	private WebElement implementationCollectionHeader;
	
	@FindBy(xpath="//div[@id='content']//a")
	 private List<WebElement> linksonQueueusingcollectionPage ;
	
	@FindBy(xpath="//a[@class='btn btn-info']")
	private WebElement implementationCollectionQueueTryEditorBtn;
	
	@FindBy(xpath="//a[text()='Practice Questions']")
	private WebElement practiceQuestionLink;
	
	public String getimplementationCollectioneHeader()
	{
		String actualText = implementationCollectionHeader.getText();
		System.out.println("Successful header is displayed: " +actualText);
		return actualText;
	}
	
	public String implementationCollectionPageContent() {
		return driver.getPageSource();

}
	public int numberofLinksIusingcollectionsnQueuePage() {
		return linksonQueueusingcollectionPage.size();
		
	}
	public void doClickonCollectionQueueTryEditorBtn() {
		implementationCollectionQueueTryEditorBtn.click();
	}
	public void doClickOnpracticeQuestionLink() {
		practiceQuestionLink.click();
	}
	
	
}
