package utulities;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;

public class BaseClass {
	public ExtentReports extent;
	ExtentRep exreport=new ExtentRep();
	
	public void initialize() throws IOException {
		
		extent=exreport.extentReport();
	}
}
