package com.utilities;



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



import com.reusable.ScreenShots;

/**
 * @author M1088236
 *
 */
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
//		spark = new ExtentSparkReporter(new File("./ExtentReports/" + GetDateTime.getDatetimeFormat() + ".html"));
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
		GetExtentReports exRports=new GetExtentReports(driver);
		report=exRports.reports;

	}

	@AfterMethod
	public void tearDownMethod(ITestResult result) {
		if (result.getStatus() == ITestResult.SUCCESS) {
			ScreenShots.CaptureScreenShot(driver);

			logger.pass("Passed").addScreenCaptureFromPath(ScreenShots.CaptureScreenShot(driver));

			log.info("Passed the Test Case");
		}else {

			logger.fail("Failed ").addScreenCaptureFromPath(ScreenShots.CaptureScreenShot(driver));
			log.warn("This is Failed");
		}
		Browser.quitBrowser(driver);

	}

	@AfterSuite
	public void Clear() {
		report.flush();
		log.info("Finished Extent Report");

	}


}
