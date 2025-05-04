package hooks;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import utils.ConfigReader;

public class ApplicationHooks {
	

	private Properties prop;
	
	

    @Before(order = 0)
    public void setup() {
        prop = ConfigReader.initializeProperties();
        DriverFactory.initializeBrowser(prop.getProperty("browser"));
        System.out.println("Launching " + prop.getProperty("browser") + " browser...");
        WebDriver driver = DriverFactory.getDriver();  
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
    }

    
    
    @Before(order = 1)
       public void testBrowser() {
  
        DriverFactory.getDriver().get(prop.getProperty("url"));  
    }

    @After
    public void tearDown() {
        DriverFactory.quitDriver();  
    }
}

