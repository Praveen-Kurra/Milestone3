package reusable;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import utility.GetExtentReports;

public class BaseClass {

	public static WebDriver driver;
	public ExtentReports report;
	public ExtentTest test;
	public static Logger log = LogManager.getLogger(BaseClass.class);

	public void initialize() {
		log.info("Setting up drivers");
		driver = Browser.startBrwser(driver, "Chrome");
		GetExtentReports exreport = new GetExtentReports(driver);
		report = exreport.reports;
	}

}
