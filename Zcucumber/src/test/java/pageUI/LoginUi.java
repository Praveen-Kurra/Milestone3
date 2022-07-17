package pageUI;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginUi {
	 @FindBy(id="user-name") protected WebElement usernameloc;
	    
	    @FindBy(id="password") protected WebElement passwordloc;
	    
	    @FindBy(id="login-button") protected WebElement loginloc;
	
	
}
