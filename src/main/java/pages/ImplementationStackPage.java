package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ImplementationStackPage {
	
	WebDriver driver;
	
	public ImplementationStackPage (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
		
		@FindBy(xpath="//p[text()='Implementation']")
		private WebElement implementationPageHeader;
		
		@FindBy(xpath="//div[@id='content']//a")
		private List<WebElement> implementationPageLinkList;
		
		@FindBy(xpath="//a[@class='btn btn-info']")
		private WebElement tryHereBtn;
		
		@FindBy(xpath="//a[text()='Practice Questions']")
				private WebElement practiceImpQuestionLink;
				
	
	public String implementationPageTitle() {
		   return driver.getTitle();
	}
		   public String getimplementationPageHeader()
			{
				String actualText = implementationPageHeader.getText();
				System.out.println("Successful header is displayed: " +actualText);
				return actualText;
			}
			public String implementationPageContent() {
		 		return driver.getPageSource();
		}
			
			public int implementationPagenumberOfLinks() {
			return implementationPageLinkList.size();
			
			
}
			public void doClickOnTryBtn() {
				 tryHereBtn.click();
			}
			public void doClickOnImpPracticeLink() {
				practiceImpQuestionLink.click();
			}
			
			}


