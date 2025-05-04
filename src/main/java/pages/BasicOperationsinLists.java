package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasicOperationsinLists {
	WebDriver driver;

	public BasicOperationsinLists(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//p[text()='Basic Operations in Lists']")
	private WebElement pageHeader;

	@FindBy(css = "div#content a")
	private List<WebElement> pageLinkList;

	public String getPageSource() {
		System.out.println(driver.getPageSource());
		return driver.getPageSource();
	}

	public String getPageTitle() {
		System.out.println(driver.getTitle());
		return driver.getTitle();
	}

	public String getPageHeader() {
		System.out.println("The Header is: " + pageHeader.getText());
		return pageHeader.getText();
	}

//	public String getPageSubHeader() {
//		System.out.println("The Sub header is: " + pageSubHeader.getText());
//		return pageSubHeader.getText();
//	}

	public int getPageLinkCounts() {
		System.out.println("The list count is:" + pageLinkList.size());
		return pageLinkList.size();
	}

	public String getCurrentPageURL() {
		System.out.println("The current URL is:" + driver.getCurrentUrl());
		return driver.getCurrentUrl();
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

