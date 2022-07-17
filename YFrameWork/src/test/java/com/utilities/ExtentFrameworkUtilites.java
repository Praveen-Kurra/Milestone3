package com.utilities;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentFrameworkUtilites {
	ExtentReports reports;
	ExtentSparkReporter spark;
	
	public void createExtntReport() {
		
		reports=new ExtentReports();
		
		spark=new ExtentSparkReporter(new File("./ExtentReports/"+com.ReusableMethods.Reusable.getDatetime()+".html"));
		
		reports.attachReporter(spark);
		
		
	}
}
