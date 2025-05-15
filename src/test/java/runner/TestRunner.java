package runner;


import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

    

@CucumberOptions(features = {"/Users/parikshit/workspace/DSALGO/src/test/resources/features"}, 
glue = {"stepdefinitions", "hooks"},
		 plugin = { "pretty","html:target/index.html","json:target/cucumber-reports/Cucumber.json",
//				"html:target/cucumber-reports/index.html",
//				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		 "com.aventstack.chaintest.plugins.ChainTestCucumberListener:",
		 "rerun:target/rerun.txt",
		
},
monochrome = true)


public class TestRunner extends AbstractTestNGCucumberTests {
	
	

       @Override
	    @DataProvider(parallel = true)
	    public Object[][] scenarios() {
	        return super.scenarios();
	    }
//       

}
			
