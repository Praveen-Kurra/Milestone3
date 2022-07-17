package com.mindtree.Test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class DataProviderPractice {
	WebDriver	driver;
	SoftAssert s;
	

	private boolean True;

	@DataProvider(name = "test-data")
	public Object[][] dataProvFunc() {
		return new Object[][] { { "Selenium", "Delhi" }, { "QTP", "Bangalore" }, { "LoadRunner", "Chennai" } };
	}
	

	@BeforeMethod
	public void setUp() {
		System.out.println("Start test");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		String url = "https://www.saucedemo.com/";
		driver.get(url);
		driver.manage().window().maximize();

	}

	@Test(dataProvider = "Login" ,dataProviderClass =ExcellPractice.class)
	public void search(String keyWord1, String keyWord2)  {
		
		SoftAssert s=new SoftAssert();
		
		Reporter.log("Keyword entered is : " + keyWord1 + " " + keyWord2);
	
		Reporter.log("Search results are displayed.");
		driver.findElement(By.id("user-name")).sendKeys(keyWord1);
		driver.findElement(By.id("password")).sendKeys(keyWord2);
		driver.findElement(By.id("login-button")).click();			
        Boolean g=driver.findElement(By.xpath("//span[@class='title']")).isDisplayed();
		
		s.assertTrue(g);
		
	}

	@AfterMethod
	public void burnDown() {
		driver.quit();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	@DataProvider(name = "Login")
//	public Object[][] Logindata() {
//		Object[][] data = new Object[6][2];
//
//		data[0][0] = "standard_user";
//		data[0][1] = "secret_sauce";
//		
//		data[1][0] = "locked_out_user";
//		data[1][1] = "secret_sauce";
//		
//		data[2][0] = "problem_user";
//		data[2][1] = "secret_sauce";
//		
//		data[3][0] = "performance_glitch_user";
//		data[3][1] = "secret_sauce";
//	  
//		data[4][0]="Hello World";
//		data[4][1]="GoodBye";
//
//		data[5][0]="&&&&&&&&&";
//		data[5][1]="GoodBye";
//		
//		return data;
//
//	}
}
