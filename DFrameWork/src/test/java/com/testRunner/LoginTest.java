package com.testRunner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.pages.LoginPage;
import com.pages.ProductClickPage;
import com.uistore.ProductUi;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	
	@Test
	public void sauceLogin() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		LoginPage.loginOperation(driver, "standard_user", "secret_sauce");
		
		ProductClickPage pc=new ProductClickPage();
		
		pc.Backpack(driver);
		driver.close();
	}
}
