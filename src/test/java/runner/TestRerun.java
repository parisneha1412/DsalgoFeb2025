package runner;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utils.ConfigReader;
    

@CucumberOptions(features = {"@target/rerun.txt"}, 
glue = {"stepdefinitions", "hooks"},
		 plugin = { "pretty","html:target/index.html","json:target/cucumber-reports/Cucumber.json",
//				"html:target/cucumber-reports/index.html",
//				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		 "com.aventstack.chaintest.plugins.ChainTestCucumberListener:",
		 "rerun:target/rerun.txt",
		
},
monochrome = true)


public class TestRerun extends AbstractTestNGCucumberTests {
	
	

       @Override
	    @DataProvider(parallel = true)
	    public Object[][] scenarios() {
	        return super.scenarios();
	    }
       @BeforeTest
       @Parameters({"browser"})
       public void browserFromTestNG(@Optional String browser) {
    	   ConfigReader readConfig = new ConfigReader();
   		readConfig.setBrowserFromTestNG(browser);
       }
	

}
			