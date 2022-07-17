package com.orangehrm.utilies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testBase  {
	GetExtentReports exReports;
	WebDriver driver;
	ExtentReports test;
	ExtentTest logger;
	@BeforeClass
	public void tets() {
		WebDriverManager.chromedriver().setup();
		//exReports=new GetExtentReports(driver);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	//driver.get("http://www.google.com");
	//exReports.reports.createTest("Mama");
		exReports=new GetExtentReports(driver);
		test=exReports.reports;
		logger=test.createTest("My first Test");
		
	}

}
