package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArraysInPythonPage {
	WebDriver driver;

	public ArraysInPythonPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='col-2']//a")
	private List<WebElement> linkList;

	@FindBy(xpath = "//p[text()='Arrays in Python']")
	private WebElement pageHeader;

	@FindBy(xpath = "//p[text()='Array']")
	private WebElement pageSubHeader;

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

	public String getPageSubHeader() {
		System.out.println("The Sub header is: " + pageSubHeader.getText());
		return pageSubHeader.getText();
	}

	public int getPageLinkCounts() {
		System.out.println("The list count is:" + linkList.size());
		return linkList.size();
	}

	public String getCurrentPageURL() {
		System.out.println("The current URL is:" + driver.getCurrentUrl());
		return driver.getCurrentUrl();
	}

	public String doClickOnLink(String pageLink) {

		String pageTitle = null;
		int linkListSize = linkList.size();
		for (int i = 0; i < linkListSize; i++) {
			String linkText = linkList.get(i).getText();
			if (linkText.equals(pageLink)) {
				linkList.get(i).click();
				pageTitle = driver.getTitle();
				System.out.println("The title of the page is: " + pageTitle);
				break;
			}
		}
		return pageTitle;
	}

	public ArrayList<String> verifyLinkText() {
		ArrayList<String> actValues = new ArrayList<String>();
		for (int i = 0; i < linkList.size(); i++) {
			System.out.println(linkList.get(i).getText());
			actValues.add(linkList.get(i).getText().trim());
		}
		System.out.println(actValues);
		return actValues;
	}
	
		
}
