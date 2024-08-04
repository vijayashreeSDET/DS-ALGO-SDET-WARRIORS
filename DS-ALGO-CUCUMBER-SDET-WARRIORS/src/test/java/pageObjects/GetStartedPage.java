package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GetStartedPage extends BasePage {

	public GetStartedPage(WebDriver driver) {
		super(driver);
		
	}
	
	//-------------WebElements--------------
	@FindBy (xpath="//button[normalize-space()='Get Started']")
	private WebElement GetStartedBtn;
	
	@FindBy (xpath="//p[normalize-space()='Copyright@NumpyNinja2021']")
	private WebElement NumpyNinjaCopyrightLink;
	
	
	
	//-----------Methods---------
	
	public void clickGetStarted() {
		GetStartedBtn.click();
	}
		
	public boolean copyrightDisplay() {
	boolean displayed = NumpyNinjaCopyrightLink.isDisplayed();
	return displayed;		
	}
	


}
