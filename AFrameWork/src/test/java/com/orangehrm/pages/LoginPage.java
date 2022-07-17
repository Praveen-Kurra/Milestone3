package com.orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

 @FindBy(id = "user-name") WebElement userNameFeild;

 @FindBy(id = "password") WebElement passwordFeild;

 @FindBy(id = "login-button") WebElement loginButtonFeild;

	public void setUserName(String uName) {
		userNameFeild.sendKeys(uName);
	}

	public void setPassword(String uName) {
		passwordFeild.sendKeys(uName);
	}

	public void clickSubmit() {
		loginButtonFeild.click();
	}

}
