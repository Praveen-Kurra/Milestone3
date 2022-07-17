package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.uiStore.LoginUi;

public class LoginPage {
	WebDriver driver;
  public LoginPage(WebDriver driver) {
	  this.driver=driver;

}



	public  void loginPage( String Username, String Password) {
		
        driver.findElement(LoginUi.Sauce_userName).sendKeys(Username);
		driver.findElement(LoginUi.Sauce_Password).sendKeys(Password);
		driver.findElement(LoginUi.Sauce_Login).click();
		

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//  WebDriver driver;
//	public LoginPage(WebDriver ldriver) {
//		this.driver=ldriver;
//	}
//	
//	@FindBy(id = "user-name") WebElement uname;
//	
//	@FindBy(id = "password") WebElement pass;
//	
//	@FindBy(id = "login-button") WebElement loginButton;
//	
//	public void loginToPage(String Username,String Password) {
//		
//		uname.sendKeys(Username);
//		pass.sendKeys(Password);
//		loginButton.click();
//	}
}
