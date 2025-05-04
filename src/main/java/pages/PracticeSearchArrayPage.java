package pages;

import java.time.Duration;

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

public class PracticeSearchArrayPage {
	WebDriver driver;

	public PracticeSearchArrayPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='input']")
	private WebElement textEditor;

	@FindBy(xpath = "//span[@role='presentation']")
	private WebElement defaultTextinEditorPane;

	@FindBy(xpath = "//button[@type='button']")
	private WebElement runBtn;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submitBtn;

	@FindBy(xpath = "//div[@class='question']")
	private WebElement defaultText;

//	@FindBy(xpath = "//pre[@id='output']")
//	private WebElement outputPane;
	
	@FindBy(id = "output")
	private WebElement outputTab;

	public String getPageURL() {
		System.out.println(driver.getCurrentUrl());
		return driver.getCurrentUrl();
	}

	public String getPageTitle() {
		System.out.println(driver.getTitle());
		return driver.getTitle();
	}

	public String getPageText() {
		System.out.println(defaultText.getText());
		return defaultText.getText();
	}

	public String getEditorPaneText() {
		System.out.println(defaultTextinEditorPane.getText());
		return defaultTextinEditorPane.getText();
	}

	public boolean IsRunBtnDisplayed() {
		return runBtn.isDisplayed();
	}

	public boolean IsSubmitBtnDisplayed() {
		return submitBtn.isDisplayed();
	}

	public void doClickOnRun() {
		runBtn.click();
	}

	public void doClickOnSubmit()  {
		submitBtn.click();
		
	}

	public void enterData(String testData) {
		Actions act = new Actions(driver);
		act.click(defaultTextinEditorPane)
		.keyDown(Keys.CONTROL)
		.sendKeys("a")
		.keyUp(Keys.CONTROL)
		.sendKeys(Keys.BACK_SPACE)
		.build()
		.perform();
     	//act.sendKeys(defaultTextinEditorPane, "print(\"Testing Automation\")").build().perform();
		act.sendKeys(defaultTextinEditorPane, testData).build().perform();
		
	}

	public String verifyOutput() {
		 Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		 String actualText = wait.until(ExpectedConditions.visibilityOf(outputTab)).getText();
    	 System.out.println("The output is: " +actualText);
		 return actualText;
	}
	
	public void verifyAlertMessageWindow()
	{
		Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		String alertMsg = alert.getText();
		alert.accept();
		System.out.println(alertMsg);
	}
	
	public void navigateToBack()
	{
		driver.navigate().back();
	}

}
