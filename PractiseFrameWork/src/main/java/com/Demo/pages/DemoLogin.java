package com.Demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoLogin {
	WebDriver driver;
	
	    By UserName= By.id("user-name");
	    By Password=By.id("password");
	    By LoginButton=By.id("login-button");
	
     public DemoLogin(WebDriver driver) {
    	 this.driver=driver;
     }
     
     
     public void Login(String Uname,String Pass) {
    	 
    	 driver.findElement(UserName).sendKeys(Uname);
    	 driver.findElement(Password).sendKeys(Pass);
    	 driver.findElement(LoginButton).click();
     }
     
     
}
