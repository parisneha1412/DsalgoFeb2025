package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OperationsinStackPage {
	

		WebDriver driver;
			
			public OperationsinStackPage (WebDriver driver)
			{
				this.driver = driver;
				PageFactory.initElements(driver, this);
			}
			@FindBy(xpath="//p[text()='Operations in Stack']")
			private WebElement operationinstackHeader;
			
			@FindBy(xpath = "//div[@id='content']//a")
			private List<WebElement> operationsinPageLinkList;
			
			@FindBy(xpath="//a[@class='btn btn-info']")
			private WebElement TryEditorBtn;
			
			@FindBy(xpath="//a[text()='Practice Questions']")
			private WebElement practiceQuestionLink;
			
			@FindBy (xpath = "//a[text()='Arrays']")
			private WebElement arraysOption;
			
			public String getoperationinstackHeader()
			{
				String actualText = operationinstackHeader.getText();
				System.out.println("Successful header is displayed: " +actualText);
				return actualText;
			}
			public String operationinstackPageContent() {
		 		return driver.getPageSource();
		}
			
			public int operationsinLinksList() {
				
				return operationsinPageLinkList.size();
				
}
			public void doClickonTryEditorBtn() {
				TryEditorBtn.click();
			}
			
			public String operationInStackPageTitle() {
				   return driver.getTitle();
}
			public void doClickonPracticequestionLink() {
				practiceQuestionLink.click();
			}	
			
			 public void doClickonDropdownoption() {
				 arraysOption.click();
			 }
}
