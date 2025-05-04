package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDefinition {
	
	WebDriver driver;
	
	@Given("User navigates to Registration page")
	public void user_navigates_to_registration_page() {
	    driver = DriverFactory.getDriver();
	    driver.findElement(By.xpath("//button[@class='btn']")).click();
	    driver.findElement(By.xpath("//a[text()=' Register ']")).click();
	}

	@When("User enters below details into the fields")
	public void user_enters_below_details_into_the_fields(DataTable dataTable) {
	   
		Map<String, String> dataMap = dataTable.asMap(String.class,String.class);
		driver.findElement(By.id("id_username")).sendKeys(dataMap.get("username"));
		driver.findElement(By.id("id_password1")).sendKeys(dataMap.get("password"));
		driver.findElement(By.id("id_password2")).sendKeys(dataMap.get("confirmPassword"));
		
	}

	@When("User clicks on Register button")
	public void user_clicks_on_register_button() {
	   driver.findElement(By.xpath("//input[@value='Register']")).click();
	}

	@Then("User account should be created")
	public void user_account_should_be_created() {
		Assert.assertTrue(driver.findElement(By.xpath("//div[contains(text(),'New Account Created')]")).getText().contains("New Account Created."));

	   	}

	@Then("User should get a proper error message")
	public void user_should_get_a_proper_error_message() {
       Assert.assertEquals("password_mismatch:The two password fields didn’t match.", driver.findElement(By.xpath("//div[@role='alert']")).getText());
	}

	@When("User keeps all the fields blanks")
	public void user_keeps_all_the_fields_blanks() {
	   driver.findElement(By.id("id_username")).sendKeys("");
	   driver.findElement(By.id("id_password1")).sendKeys("");
	   driver.findElement(By.id("id_password2")).sendKeys("");
	}
	
	@Then("User should remain on Register page")
	public void user_should_remain_on_register_page() {
	    Assert.assertTrue(driver.getCurrentUrl().contains("/register"));
	}


	
}
