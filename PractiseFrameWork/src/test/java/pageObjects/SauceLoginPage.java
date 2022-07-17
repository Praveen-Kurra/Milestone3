package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import uistore.SauceLoginUi;

public class SauceLoginPage  extends SauceLoginUi{

	WebDriver driver;
	
	public SauceLoginPage(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName(String userName) {
		useridLocator.sendKeys(userName);
	}
	public void enterPassword(String pasword) {
		passwordLocator.sendKeys(pasword);
	}
	public void clickLoginButton() {
		loginLocator.click();
	}
}
