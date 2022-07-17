package ExtentReports;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class GenerateExtentReport {
	ExtentReports extentReport;
	ExtentSparkReporter sparkReport;
	WebDriver driver;
	ExtentTest extentTest;
       int i=0;
       private static Logger logger=LogManager.getLogger(GenerateExtentReport.class);
       
	@Test(dataProvider = "dp")
	public void f(String a1, String s2 ) {
		driver.get("http://www.google.com");
		driver.findElement(By.xpath("//div[@class='a4bIc']//input")).sendKeys(a1, Keys.ENTER);
		assertEquals(s2, driver.getTitle());

	}

	@BeforeMethod
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		logger.info("Launching Browser");

	}

	@AfterMethod
	public void afterMethod(ITestResult result) {

		if (result.getStatus() == ITestResult.SUCCESS) {
			ExtentReportForSucess();
			logger.info("Passing Test Case");

		} else if (result.getStatus() == ITestResult.FAILURE) {
			ExtentReportForFailed();
			logger.info("Failing TestCase");

		} else {
			ExtentReportForInfo();
		}
        
		driver.quit();
	}

	@DataProvider
	public String[][] dp() {
		return new String[][] { { "Ms Dhoni", "Ms Dhoni Finisher - Google Search" },

				{ "ABD", "ABD - Google Search" },

				{ "Virat", "Virat - Google Search" },

				{ "Kohli", "KohliSingh - Google Search" },

				{ "Sachin", "Sachin - Google Search" }

		};
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This is calling");
		extentReport = new ExtentReports();
		sparkReport = new ExtentSparkReporter("./ExtentReprts/annotates.html");
		extentReport.attachReporter(sparkReport);
		logger.info("Initialising ExtentReport");

	}

	@AfterSuite
	public void afterSuite() {
		logger.info("Closing All Functions");

		extentReport.flush();
	}

	public void ExtentReportForSucess() {
		extentReport.createTest("PassedTest"+i).pass("Passes");
		i++;

	}

	public void ExtentReportForFailed() {
		extentReport.createTest("FailedTest"+i).fail("failed");
		i++;

	}

	public void ExtentReportForInfo() {
		extentReport.createTest("PassedTest"+i).info("Information");
		i++;

	}

}
