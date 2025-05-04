package utils;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtils {

	WebDriver driver;

	// ***********************************Constructor*****************************************/
	public CommonUtils(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// ***********************************Locators******************************************/

	@FindBy(xpath = "//div[@class='dropdown-menu']//a")
	private List<WebElement> dataStructuresDropDownList;

	@FindBy(xpath = "//div/a[text()='Arrays']")
	private WebElement arraysOption;

	@FindBy(xpath = "//a[@data-toggle='dropdown']")
	private WebElement dataStructuresDropDown;

	@FindBy(xpath = "//a[text()='NumpyNinja']")
	private WebElement numpyLogo;

	@FindBy(xpath = "//button[@type='button']")
	private WebElement runButton;

	@FindBy(xpath = "//div[@role='presentation']")
	private WebElement tryEditorPane;

	@FindBy(id = "output")
	private WebElement tryEditorOutput;

	@FindBy(xpath = "//a[text()='Sign out']")
	private WebElement signOutLink;

	@FindBy(xpath = "//a[text()=' Automationtechies ']")
	private WebElement userName;

	@FindBy(xpath = "//a[text()='Try here>>>']")
	private WebElement tryHereBtn;

	// **********************Page Actions
	// ********************************************************/

	// Get the dropdown list and display it on the console
	public String getdataStructuresDropDownList(String OptionName) {
		String pageUrl = null;
		System.out.println("The size of the dropdown list is: " + dataStructuresDropDownList.size());
		dataStructuresDropDown.click();
		System.out.println("The size of the dropdown list is: " + dataStructuresDropDownList.size());
		for (int i = 0; i < dataStructuresDropDownList.size(); i++) {
			String value = dataStructuresDropDownList.get(i).getText();
			System.out.println(value);
			if (value.equals(OptionName)) {
				dataStructuresDropDownList.get(i).click();
				pageUrl = driver.getCurrentUrl();
				break;
			}
		}
		return pageUrl;
	}

	// ******************************Select the option from the dropdown
	// list***********************
	public void doSelectOptionFromDropDown() {
		dataStructuresDropDown.click();
		arraysOption.click();
//	    Actions action = new Actions(driver); 
//	    action.moveToElement(arraysOption).click();
		// action.moveToElement(arraysOption).build().perform();

	}

	public int getDropdownCount() {
		return dataStructuresDropDownList.size();
	}

	public boolean isLogoPresent() {
		return numpyLogo.isDisplayed();
	}

	public boolean isDropdownDisplayed() {
		return dataStructuresDropDown.isDisplayed();
	}

	public String isTryEditorPageDisplayed() {
		System.out.println("The current URL is: " +driver.getCurrentUrl());
		return driver.getCurrentUrl();
	}

	public boolean isSignOutLinkDisplayed() {
		return signOutLink.isDisplayed();
	}

	public boolean isUserNameDisplayed() {
		return userName.isDisplayed();
	}

//	public String verifyValidDataInTryEditor() {
//		tryEditorPane.sendKeys("print 10");
//		runButton.click();
//		return tryEditorOutput.getText();
//	}

	public void doSendData(String testData) {
		//tryEditorPane.sendKeys(testData);
		Actions act = new Actions(driver);
		act.click(tryEditorPane)
		.keyDown(Keys.CONTROL)
		.sendKeys("a")
		.keyUp(Keys.CONTROL)
		.sendKeys(Keys.BACK_SPACE)
		.build()
		.perform();
     	//act.sendKeys(defaultTextinEditorPane, "print(\"Testing Automation\")").build().perform();
		act.sendKeys(tryEditorPane, testData).build().perform();
	}

	public void doClickOnRunBtn() {
		runButton.click();
	}

	public String doCheckTryEditorOutput() {
		return tryEditorOutput.getText();
	}

	public void verifyAlertMessageInTryEditor() {
		Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		String alertMsg = alert.getText();
		alert.accept();
		System.out.println(alertMsg);
	}

	public String verifyBlankDataInTryEditor() {
		tryEditorPane.clear();
		runButton.click();
		return driver.getCurrentUrl();
	}

	public String verifyBackFromTryEditorPage() {
		driver.navigate().back();
		return driver.getCurrentUrl();
		
	}
	public boolean isRunBtnDisplayed() {
		return runButton.isDisplayed();
	}
	
	public void doClickOnTryHereBtn() {
		tryHereBtn.click();
	}
}
