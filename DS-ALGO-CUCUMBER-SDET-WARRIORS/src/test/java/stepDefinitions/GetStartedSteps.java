package stepDefinitions;

import java.util.Properties;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.GetStartedPage;
import pageObjects.HomePage;

public class GetStartedSteps {
	WebDriver driver;
	Properties p;
	Logger logger;
	
	@When("I click the GetStarted Button")
	public void i_click_the_get_started_button() {
		logger.info("Clicking the GetStarted Button.............");
		GetStartedPage sp = new GetStartedPage(BaseClass.getDriver());
		sp.clickGetStarted();
	}

	@Then("Home page should be displayed")
	public void home_page_should_be_displayed() {
		logger.info("Check display of Home Page............");
		HomePage hp = new HomePage(BaseClass.getDriver());
		boolean status = hp.NumpyNinjaLinkDisplay();
		Assert.assertEquals(status, true);	
		logger.info("Home page is displayed");
	  }
	
	@Then("Copyright@NumpyNinja2021 is displayed at Start page")
	public void copyright_numpy_ninja2021_is_displayed_at_start_page() {
		GetStartedPage sp = new GetStartedPage(BaseClass.getDriver());
		boolean status = sp.copyrightDisplay();
		Assert.assertTrue(status);  
	}


}
