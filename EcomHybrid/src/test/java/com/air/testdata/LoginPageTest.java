package com.air.testdata;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.air.base.TestBase;
import com.airline.page.HomePage;
import com.airline.page.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homepage;
	public LoginPageTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		 loginPage=new LoginPage();
	}
	
	
	
	@Test(priority = 1)
	public void  loginPageTitleTest() {
		
		String title=loginPage.validateLoginPageTitle();
	   Assert.assertEquals(title, "Swag Labs");
	
	}
	
	
	@Test(priority = 2)
	public void loginTest() {
	homepage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
