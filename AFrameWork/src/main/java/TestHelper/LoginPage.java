package TestHelper;

import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	Helper help=new Helper();
	
	public LoginPage(WebDriver driver) {
	 this.driver=driver;
	}
	
	public void sendUserName(String text) throws Exception {
		help.sendkeys(Ui.Sauce_userName, text);
	}
	public void sendPassword(String text) throws Exception {
		help.sendkeys(Ui.Sauce_Password, text);
		
	}
	public void clickSubmit() throws Exception {
		help.click(Ui.Sauce_Login);
	}
}
