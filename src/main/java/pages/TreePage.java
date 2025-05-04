package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TreePage {

WebDriver driver;
	
	public TreePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Overview of Trees')]")
	private WebElement overviewOfTreeLink;
	
	@FindBy(xpath="//a[contains(text(),'Terminologies')]")
	private WebElement terminologiesLink;
	
	@FindBy(xpath="//a[contains(text(),'Types of Trees')]")
	private WebElement typesOfTreesLink;
	
	@FindBy(xpath="//a[contains(text(),'Tree Traversals')][1]")
	private WebElement treeTraversalsLink;
	
	@FindBy(xpath="//a[contains(text(),'Traversals-Illustration')]")
	private WebElement traversals_IllustrationLink;
	
	@FindBy(xpath="//a[contains(text(),'Binary Trees')]")
	private WebElement binaryTreesLink;
	
	@FindBy(xpath="//a[contains(text(),'Types of Binary Trees')]")
	private WebElement typesOfBinaryTreesLink;
	
	@FindBy(xpath="//a[contains(text(),'Implementation in Python')]")
	private WebElement implementationInPythonLink;
	
	@FindBy(xpath="//a[contains(text(),'Binary Tree Traversals')]")
	private WebElement binaryTreeTraversalsLink;
	
	@FindBy(xpath="//a[contains(text(),'Implementation of Binary Trees')]")
	private WebElement implementationOfBinaryTreesLink;
	
	@FindBy(xpath="//h4")
	private WebElement treeHeading;
	
	@FindBy(xpath="//p[@class='bg-secondary text-white']")
	private WebElement treeSubHeader;
		
	@FindBy(xpath="//div[@style=\'margin-top: 40px;margin-bottom: 40px;margin-right: 150px;margin-left: 80px;background-color: ;\']/ul")
	private List<WebElement> countOfLinks;
	
	
	

	public void clickOnOverviewOfTree() {
		overviewOfTreeLink.click();
	}
	
	public void treeHeadingIsDisplayed() {
		treeHeading.isDisplayed();
		
	}
	
	public void treeSubHeaderIsDisplayed() {
		treeSubHeader.isDisplayed();
	}
	
	public int getCountOfLinks() {
		int totalLinks = countOfLinks.size();
		System.out.println("Total Links "+totalLinks);
		 return countOfLinks.size();
		
	}
	
	public void clickOnTerminologies() {
		terminologiesLink.click();
	}

	public void clickOnTypesOfTreesLink() {
		typesOfTreesLink.click();
	}
	
	public void clickOnTreeTraversalsLink() {
		treeTraversalsLink.click();
	}
	
	public void clickOnTraversals_IllustrationLink() {
		traversals_IllustrationLink.click();
	}

	public void clickOnBinaryTreesLink() {
		binaryTreesLink.click();	
	}
	
	public void clickOnTypesOfBinaryTreesLink() {
		typesOfBinaryTreesLink.click();
	}
	
	public void clickOnimplementationInPythonLink() {
		implementationInPythonLink.click();
	}
	
	public void clickOnBinaryTreeTraversalsLink() {
		binaryTreeTraversalsLink.click();
	}
	
	public void clickOnImplementationOfBinaryTreesLink() {
		implementationOfBinaryTreesLink.click();
	}
	
}
