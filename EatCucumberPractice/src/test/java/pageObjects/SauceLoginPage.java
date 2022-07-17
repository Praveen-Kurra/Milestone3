package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceLoginPage {
	WebDriver driver;

	public SauceLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "user-name")  WebElement userBox;
	
	@FindBy(id = "password")   WebElement passBox;
	
	@FindBy(id = "login-button")   WebElement loginButton;

	public void enterUserName(String userName) {
		userBox.sendKeys(userName);
	}

	public void enterPassword(String Password) {
		passBox.sendKeys(Password);
	}

	public void clickLoginButton() {
		loginButton.click();
	}
}
