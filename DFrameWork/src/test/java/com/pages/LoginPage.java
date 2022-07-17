package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.practise.Elementactions;
import com.uistore.LoginUi;

public class LoginPage {
	
	public static void loginOperation(WebDriver driver,String UserName,String Password) {
		Elementactions eleAction=new Elementactions(driver);
		eleAction.sendTextInto(LoginUi.loggin, UserName);
		eleAction.sendTextInto(LoginUi.password, Password);
		eleAction.click(LoginUi.loggin);
		
		
	}

}
