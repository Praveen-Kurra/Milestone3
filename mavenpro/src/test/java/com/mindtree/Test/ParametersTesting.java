package com.mindtree.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParametersTesting {
  WebDriver driver;
	@BeforeSuite
	public void SetUp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	@BeforeClass
	public void AccessUrl() {
		driver.get("https://www.saucedemo.com/");
	}
	@Parameters({"UserName","Password"})
	@Test
	public void Login(String UserName,String Passweord) {
	
		driver.findElement(By.id("user-name")).sendKeys(UserName);
		driver.findElement(By.id("password")).sendKeys(Passweord);
		driver.findElement(By.id("login-button")).click();
		
		
	}
	@Test
	public void isLogo() {
		String x=driver.findElement(By.xpath("//div[@class='app_logo']")).getText();
		if(x.equals("")) {
			System.out.println("Hello World");
		}
		else {
			System.out.println(x);
		}
	}
	@AfterSuite
	public void InvokeBrowser() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
		
	}
	
}
