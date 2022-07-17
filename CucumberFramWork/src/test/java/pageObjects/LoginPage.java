package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
 WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="user-name") WebElement userIdLoca;
	
	@FindBy(id="password")WebElement passLoc;
	
	@FindBy(id="login-button")WebElement loginLaoc;
	
	
	
	
	
	public void enterUserId(String Userid) {
		
		userIdLoca.sendKeys(Userid);
	}
	
	
	
	public void enterPassword(String Upass) {
		passLoc.sendKeys(Upass);
	}
	
	public void clickLogin() {
		loginLaoc.click();
	}
}
