package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QueuePage {
	
	WebDriver driver;
	
	public QueuePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//h4[text()='Queue']")
	private WebElement queuePageHeader;

   @FindBy(xpath="//p[text()='Topics Covered']")
   private WebElement queuePageSubHeader;
   
   @FindBy(xpath="//a[@class='list-group-item']")
   private List<WebElement> queuePageLinks;
   
   @FindBy(xpath="//a[text()='Implementation of Queue in Python']")
   private WebElement queuePageImplementationLink;
   
   @FindBy(xpath="//a[text()='Implementation using array']")
   private WebElement queuePageArrayLink;
   
   @FindBy(xpath="//a[text()='Implementation using collections.deque']")
   private WebElement queuePageCollectionLink;
   
   @FindBy(xpath="//a[text()='Queue Operations']")
   private WebElement queuePageOperationLink;
   
   
   public String getqueueheader()
	{
		String actualText = queuePageHeader.getText();
		System.out.println("Successful header is displayed: " +actualText);
		return actualText;
	}
	public String getqueuesubheader()
	{
		String actualText = queuePageSubHeader.getText();
		System.out.println("Successful subheader is displayed: " +actualText);
		return actualText;
	}
	
	public String getqueuepagecontent() {
	return driver.getPageSource();
   
	}
	
	public int getQueuePageLink() {
		return queuePageLinks.size();
	}
	public void doClickonImplementationLink() {
		queuePageImplementationLink.click();
	}
	public void doClickonArrayLink() {
		queuePageArrayLink.click();
	}
	public void doClickonCollectionLink() {
		queuePageCollectionLink.click();
		}
	public void doClickonOperationLink() {
		queuePageOperationLink.click();
		}
	}
   
