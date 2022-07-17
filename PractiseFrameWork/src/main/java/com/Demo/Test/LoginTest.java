package com.Demo.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.Demo.pages.DemoLogin;
import com.Demo.pages.IntiationBrowser;

public class LoginTest {
	 WebDriver driver;
	@Test
	public void loginTest() throws FileNotFoundException, IOException {
		
		IntiationBrowser ib=new IntiationBrowser(driver);
		DemoLogin d=new DemoLogin(driver);
		d.Login("standard_user", "secret_sauce");
		driver.quit();
	}

}
