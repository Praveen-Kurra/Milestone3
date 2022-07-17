package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pageUI.LoginUi;

public class SauceLoginPage  extends LoginUi{
	
WebDriver driver;
       public SauceLoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
//    @FindBy(id="user-name") WebElement usernameloc;
//    
//    @FindBy(id="password")  WebElement passwordloc;
//    
//    @FindBy(id="login-button") WebElement loginloc;
    
    public void enterUname(String unmae) {
    	usernameloc.sendKeys(unmae);
    }
    public void enterPassword(String pass) {
    	passwordloc.sendKeys(pass);
    }
     public void clickLoginButton() {
    	 loginloc.click();
     }  
}
