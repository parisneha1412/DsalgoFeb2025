package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GraphReprentationsPage {

WebDriver driver;
	
	public GraphReprentationsPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(xpath="//p[text()='Graph Representations']")
	private WebElement graphReprentationHeader;
	
	@FindBy(xpath="//div[@id='content']//a")
	private List<WebElement> noOfLinkOnGraphrPage;
	
	@FindBy(xpath="//a[@class='btn btn-info']")
	private WebElement tryHereBtn;
	
	@FindBy(xpath="//a[text()='Practice Questions']")
			private WebElement practiceImpQuestionLink;
			
	
	
	public String getGraphhReader()
	{
		String actualText = graphReprentationHeader.getText();
		System.out.println("Successful header is displayed: " +actualText);
		return actualText;
	}
	public int getCountofLinksonGRPage() {
		return noOfLinkOnGraphrPage.size();
	}
	public void doClickOnTryBtn() {
		 tryHereBtn.click();
	}
	public void doClickOnImpPracticeLink() {
		practiceImpQuestionLink.click();
	}
	
		
		
}
