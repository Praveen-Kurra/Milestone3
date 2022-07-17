package com.airline.page;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.air.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(id="user-name") WebElement username;
	
	@FindBy(id="password") WebElement password;
	
	@FindBy(id="login-button") WebElement loginButton;
	
	//Initialize pageObjects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public String  validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	
	public HomePage login(String Uname,String pass) {
		username.sendKeys(Uname);
		password.sendKeys(pass);
		loginButton.click();
		
		return new HomePage();
	}
	
}




