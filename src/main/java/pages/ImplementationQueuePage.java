package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ImplementationQueuePage {
WebDriver driver;
	
		public  ImplementationQueuePage(WebDriver driver)
		{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

		@FindBy(xpath="//p[text()='Implementation of Queue in Python']")
		private WebElement implementationQueueHeader;
		
		
		@FindBy(xpath="//div[@id='content']//a")
		 private List<WebElement> linksQueueInPythonPage ;
		
		@FindBy(xpath="//a[@class='btn btn-info']")
		private WebElement impQueueTryEditorBtn;
		
		public String getimplementationQueueHeader()
		{
			String actualText = implementationQueueHeader.getText();
			System.out.println("Successful header is displayed: " +actualText);
			return actualText;
		}
		
		public String implementationQueuePageContent() {
			return driver.getPageSource();
		}
		public int numberofLinksImplementationQueuePage() {
			return linksQueueInPythonPage.size();
			
		}
		
		public void doClickonQueueTryEditorBtn() {
			impQueueTryEditorBtn.click();
		}
		
		
}


