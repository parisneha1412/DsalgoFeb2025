package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticePage {

	WebDriver driver;

	public PracticePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//body//div[@class='list-group']")
	private List<WebElement> pageLinkList;

	public String getPageTitle() {
		System.out.println(driver.getTitle());
		return driver.getTitle();
	}
	
	public int getLinksCount()
	{
		return pageLinkList.size();
	}

	public String doClickOnLink(String pageLink) {

		String pageTitle = null;
		int linkListSize = pageLinkList.size();
		for (int i = 0; i < linkListSize; i++) {
			String linkText = pageLinkList.get(i).getText();
			if (linkText.equals(pageLink)) {
				pageLinkList.get(i).click();
				pageTitle = driver.getTitle();
				System.out.println("The title of the page is: " + pageTitle);
				break;
			}
		}
		return pageTitle;
	}

	public ArrayList<String> verifyLinkText() {

		ArrayList<String> actValues = new ArrayList<String>();
		for (int i = 0; i < pageLinkList.size(); i++) {
			System.out.println(pageLinkList.get(i).getText());
			actValues.add(pageLinkList.get(i).getText().trim());
		}
		System.out.println(actValues);
		return actValues;
	}

}
