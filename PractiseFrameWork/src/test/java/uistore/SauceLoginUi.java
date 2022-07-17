package uistore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SauceLoginUi {
	
	@FindBy(id="user-name")
	protected
	  WebElement useridLocator;
	
	@FindBy(id="password")
	protected WebElement passwordLocator;
	
	@FindBy(id="login-button")
	protected WebElement loginLocator;

}
