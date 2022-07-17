package com.DataProvider.InTest;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

public class NewTest {
	WebDriver driver;

	@DataProvider(name = "test-data")
	public String[][] dataProvFunc() {
		return new String[][] { 
			{ "Ms Dhoni", "Ms Dhoni Finisher - Google Search" },

				{ "ABD", "ABD - Google Search" },

				{ "Virat", "Virat - Google Search" },

				{ "Kohli", "KohliSingh - Google Search" },

				{ "Sachin", "Sachin - Google Search" }

		};
	}


	public void OpenBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		System.out.println("This is  >>>>>>>>>>>Setup Browser ");

	}


	public void OpenBrowser1() {
		System.out.println("This is  >>>>>>>>>>>Searching Url ");
		driver.get("https://www.google.com/");
	}

	@BeforeMethod
	public void callingFuntion() {
		OpenBrowser();
		OpenBrowser1();

	}

	@Test(dataProvider = "test-data")
	public void search(String element1, String element2) {

		driver.findElement(By.xpath("//div[@class='a4bIc']//input")).sendKeys(element1, Keys.ENTER);

		// assertEquals(element2,driver.getTitle());
		assertNotEquals(element2, driver.getTitle());

	}

	@AfterMethod
	public void Quit() {

		System.out.println(driver.getTitle());
		driver.quit();
	}

}
