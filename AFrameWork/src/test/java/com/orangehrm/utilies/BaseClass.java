package com.orangehrm.utilies;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.pages.ProductClick;
import com.orangehrm.reusable.ScreenShots;
import com.orangehrm.reusable.getDateTime;

import lombok.Builder.Default;

public class BaseClass {
	public WebDriver driver;
	public ConfigData config;
	public ExcelData excel;
	public ExtentReports report;
	public ExtentTest logger;
	public ExtentSparkReporter spark;
	

	public static Logger log = LogManager.getLogger(BaseClass.class);

	@BeforeSuite
	public void initialize() {
		excel = new ExcelData();
		config = new ConfigData();
		excel = new ExcelData();

//		report = new ExtentReports();
//		spark = new ExtentSparkReporter(new File("./ExtentReports/" + getDateTime.getDatetimeFormat() + ".html"));
//		report.attachReporter(spark);
//		spark.config().setDocumentTitle("Mindtree");
		log.info("Intilizing all the Methods");
	}

	@BeforeClass
	public void setUp() {
		String BrowserTaken = config.getData("Browser");
		String UrlFromConfig = config.getData("Url");

		driver = Browser.startBrwser(driver, BrowserTaken, UrlFromConfig);
		log.info("Setting Up Browser");
		GetExtentReports exreport=new GetExtentReports(driver);
		   report=exreport.reports;

	}

	@AfterMethod
	public void tearDownMethod(ITestResult result) {
		if (result.getStatus() == ITestResult.SUCCESS) {
			ScreenShots.CaptureScreenShot(driver);

			logger.pass("Passed").addScreenCaptureFromPath(ScreenShots.CaptureScreenShot(driver));
			// Reusable.CaptureScreenShot(driver);
//				Reusable.CaptureScreenShot(driver);

			// logger.pass("Passs
			// ").addScreenCaptureFromPath(Reusable.CaptureScreenShot(driver));
			log.info("Passed the Test Case");

		} else if (result.getStatus() == ITestResult.FAILURE) {
//				Reusable.CaptureScreenShot(driver);
			logger.fail("Failed ").addScreenCaptureFromPath(ScreenShots.CaptureScreenShot(driver));
			log.warn("This is Failed");
		}
		Browser.quitBrowser(driver);
		// report.flush();
	}

	@AfterSuite
	public void Clear() {
		report.flush();
		log.info("Finished Extent Report");

	}

}
