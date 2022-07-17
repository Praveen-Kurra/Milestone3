package com.TestRunner;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.Pages.AddTwoCart;
import com.Pages.GoToCart;
import com.Pages.LoginPage;
import com.Pages.ProductClick;
import com.ReusableMethods.Reusable;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.utilities.Browser;
import com.utilities.ConfigProperty;
import com.utilities.ExcellDataProvider;

//import ExtentReports.GenerateExtentReport;


public class BaseClass {

	//String url = "https://www.saucedemo.com/";
	 public  WebDriver driver;
	
	 ExcellDataProvider excel;
	 
	 ConfigProperty config;
	 ExtentReports report;
	 LoginPage login;
	 ProductClick product;     
	 AddTwoCart addcart;
	 ExtentTest logger;
	 GoToCart gocart;
	 public static Logger log=LogManager.getLogger(BaseClass.class);
	 
	 @BeforeSuite
	public void InitializeMethods() {
		excel=new ExcellDataProvider();
		config=new ConfigProperty();
		report=new ExtentReports();
		//loginPage = PageFactory.initElements(driver, LoginPage.class);
		ExtentSparkReporter spark=new ExtentSparkReporter(new File("./ExtentReports/"+com.ReusableMethods.Reusable.getDatetime()+".html"));
		report.attachReporter(spark);
		spark.config().setDocumentTitle("Mindtree");
		log.info("Initialize all the Methods");
	} 
	 	
	@BeforeClass
	public void setUp() {
		String BrowserTaken= config.getData("Browser");
		String UrlFromConfig=config.getData("Url");
		
		driver = Browser.startBrwser(driver, BrowserTaken, UrlFromConfig);
		log.info("Setting Up Browser");
	}
	
	
	@AfterMethod
	public void tearDownMethod(ITestResult result) {
		if (result.getStatus()==ITestResult.SUCCESS) {
			Reusable.CaptureScreenShot(driver);
//			Reusable.CaptureScreenShot(driver);
			logger.pass("Passs ").addScreenCaptureFromPath(Reusable.CaptureScreenShot(driver));
			log.info("Passed the Test Case");
			
		}
		else if (result.getStatus()==ITestResult.FAILURE) {
//			Reusable.CaptureScreenShot(driver);
			logger.fail("Failed ").addScreenCaptureFromPath(Reusable.CaptureScreenShot(driver));
			log.warn("This is Failed");
		}
     	Browser.quitBrowser(driver);
		//report.flush();
	}
	@AfterSuite
	public void Clear() {
		log.info("Finished Extent Report");
		report.flush();
		
		
	}
//	@AfterClass
//	public void QuitingBrowser() {
//		Browser.quitBrowser(driver);
//	}
	
	@BeforeMethod
	public void initizeMethods() {
		 login=new LoginPage(driver);
	   product=new ProductClick(driver);
	   addcart=new AddTwoCart(driver);
	   gocart=new GoToCart(driver);
	}
	
}
