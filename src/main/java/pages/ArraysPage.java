package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArraysPage {

	WebDriver driver;

	public ArraysPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h4[text()='Array']")
	private WebElement arrayHeader;

	@FindBy(xpath = "//p[text()='Topics Covered']")
	private WebElement topicsCoveredHeader;

	@FindBy(xpath = "//ul/a[@class='list-group-item']")
	private List<WebElement> arrayLinksList;

	public String getArraySourcePage() {
		return driver.getPageSource();
	}

	public String getArrayHeader() {
		System.out.println(arrayHeader.getText());
		return arrayHeader.getText();
	}

	public String topicsCoveredHeader() {
		System.out.println(topicsCoveredHeader.getText());
		return topicsCoveredHeader.getText();
	}

	public int getLinksCount() {
		return arrayLinksList.size();
	}

	public String doClickOnLink(String pageLink) {

		String pageTitle = null;
		int linkListSize = arrayLinksList.size();
		for (int i = 0; i < linkListSize; i++) {
			String linkText = arrayLinksList.get(i).getText();
			if(linkText.equals(pageLink))
			{
				arrayLinksList.get(i).click();
				pageTitle = driver.getTitle();
				System.out.println("The title of the page is: "+pageTitle);
				break;
			}
		}
		return pageTitle;
	}

	public ArrayList<String> verifyLinkText() {
		ArrayList<String> actValues = new ArrayList<String>();
		for (int i = 0; i < arrayLinksList.size(); i++) {
			System.out.println(arrayLinksList.get(i).getText());
			actValues.add(arrayLinksList.get(i).getText().trim());
		}

		return actValues;
	}

	public String getArrayPageSource() {
		
		return driver.getPageSource();
	}
	
	public String getArrayPageTitle()
	{
		return driver.getTitle();
	}
	
	public String getCurrentPageURL()
	{
		return driver.getCurrentUrl();
	}
	
}
