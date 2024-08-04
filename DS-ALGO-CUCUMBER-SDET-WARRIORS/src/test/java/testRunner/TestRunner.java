package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
			  features={".//FeatureFiles/GetStarted.feature"},
			  glue = "stepDefinitions",
			  plugin = {"pretty", "html:reports/myreport.html", 
					  "rerun:target/rerun.txt",
					  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
					},
			  dryRun = false,
			  monochrome = true,
			  publish = true
			  //tags="@sanity"  // this will execute scenarios tagged with @sanity
			  //tags="@regression"
			  //tags="@sanity and @regression" //Scenarios tagged with both @sanity and @regression
			  //tags="@sanity and not @regression" //Scenarios tagged with @sanity but not tagged with @regression
			  //tags="@sanity or @regression" //Scenarios tagged with either @sanity or @regression	
			  
		)

public class TestRunner {

}
