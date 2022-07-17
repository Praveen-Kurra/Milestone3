package com.DataProvider.InTest;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderInTest {
	WebDriver driver;
	private boolean True;
	int i;

//	@DataProvider(name = "test-data")
//	public Object[][] dataProvFunc() {
//		return new Object[][] { { "Selenium", "Delhi" }, { "QTP", "Bangalore" }, { "LoadRunner", "Chennai" } };
//	}
	

	@BeforeMethod
	public void setUp() {
		System.out.println("Start test");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		String url = "https://www.saucedemo.com/";
		driver.get(url);
		driver.manage().window().maximize();

	}

	@Test(dataProvider = "Login" ,dataProviderClass = ExcelDataProvider.class)
	public void search(String keyWord1, String keyWord2) throws IOException  {
		
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
	public void burnDown(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE) {
//			String file="Image"+i+".png";
			Utilites.TakeScreenShot(driver, "Image"+i+".png");
			i++;
		}
		driver.quit();
	}

}
