package utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


import pageObjects.LoginPage;

public class BaseClass {

public	WebDriver driver;
public LoginPage lp;
public ConfigData config;
public ExtentReports report;
public ExtentTest logger;
public ExtentSparkReporter spark;
public static Logger log = LogManager.getLogger(BaseClass.class);	
	
	
public void initialize() {
	
	config = new ConfigData();
	log.info("Intilizing all the Methods");
	GetExtentReports exreport=new GetExtentReports(driver);
	   report=exreport.reports;
}
	
public void Clear() {
	Browser.quitBrowser(driver);
	
}


public void getExtentReport() {
	report.flush();
}
}
