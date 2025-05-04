package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationPage {
WebDriver driver;
	
	public ApplicationPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath="//p[text()='Applications']")
	private WebElement applicationsPageHeader;
	
	@FindBy(xpath="//div[@id='content']//a")
	private List<WebElement> applicationPageLinkList;
	
	@FindBy(xpath="//a[@class='btn btn-info']")
	private WebElement tryHerebtn;
	
	@FindBy(xpath="//a[text()='Practice Questions']")
	private WebElement practiceQuestionLink;
	
	
	public String getapplicationsPageHeader()
	{
		String actualText = applicationsPageHeader.getText();
		System.out.println("Successful header is displayed: " +actualText);
		return actualText;
	}
	public String applicationPageContent() {
 		return driver.getPageSource();

}
	
	public int noOfLinksApplicationPage() {
	return applicationPageLinkList.size();
}
	
	public void doClickOnTryHereBtn() {
		tryHerebtn.click();
	}
	
	public void doClickOnPracticeQLink() {
		practiceQuestionLink.click();
}
}