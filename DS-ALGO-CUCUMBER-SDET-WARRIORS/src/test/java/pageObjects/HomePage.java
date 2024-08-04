package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	//-----------WebElements-----------------
	@FindBy (xpath="//a[normalize-space()='NumpyNinja']")
	private WebElement NumpyNinjaLink;
	
	
	//------------------Methods---------------
	
	public boolean NumpyNinjaLinkDisplay() {
		boolean display = NumpyNinjaLink.isDisplayed();
		return display;
	}

}
