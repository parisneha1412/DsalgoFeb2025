package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StackPage {
WebDriver driver;
	
	public StackPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h4[text()='Stack']")
	private WebElement stackHeader;
	
	@FindBy(xpath="//p[text()='Topics Covered']")
	private WebElement subHeader;
	
	@FindBy(xpath="//a[@class='list-group-item']")
	private List<WebElement> stackLinksList;
	
	@FindBy(xpath="//a[text()='Operations in Stack']")
	private WebElement operationLink;
	
	@FindBy(xpath="//a[text()='Implementation']")
	private WebElement implementationLink;
	
	@FindBy(xpath="//a[text()='Applications']")
	private WebElement applicationsLink;
	

	
	public String getstackheader()
	{
		String actualText = stackHeader.getText();
		System.out.println("Successful header is displayed: " +actualText);
		return actualText;
	}
	public String getstacksubheader()
	{
		String actualText = subHeader.getText();
		System.out.println("Successful subheader is displayed: " +actualText);
		return actualText;
	}

     public String stackPageContent() {
 		return driver.getPageSource();

	
	}

public int stackLinksList() {
	
	return stackLinksList.size();
	
	//int optionsCount = stackLinksList.size();
//	System.out.println("The size of the Link is: " + optionsCount);
//
//	for (int i = 0; i < optionsCount; i++) {
//		String value = stackLinksList.get(i).getText();
//
//		System.out.println(value);
//	}
//	return stackLinksList;
}
   public void doClickonOperationLink() {
	operationLink.click();

     
}
   public void doClickonImplementationLink() {
		implementationLink.click();
}
   public void doClickonApplicationsLink() {
		applicationsLink.click();
}
   public String stackPageTitle() {
	   return driver.getTitle();
   }
}




