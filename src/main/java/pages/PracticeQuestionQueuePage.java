package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticeQuestionQueuePage {
	
WebDriver driver;
	
	
	public  PracticeQuestionQueuePage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@data-toggle='dropdown']")
	private WebElement dataStructuresDropDownFromPP;

//	
//	public void getCurrentURLOfPracticepage() {
//		driver.getCurrentUrl();
//		
//		public void doclickonDropdownMenu {
//			
//			Actions act = new Actions(driver);
//			act.moveToElement(dataStructuresDropDownFromPP)
//			.build()
//			.perform();
//	     
//			act.click(dataStructuresDropDownFromPP).build().perform();
//		}
	}




	


