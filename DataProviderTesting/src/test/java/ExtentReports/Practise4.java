package ExtentReports;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.model.Media;
import com.aventstack.extentreports.observer.entity.MediaEntity.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ViewName;

import io.github.bonigarcia.wdm.WebDriverManager;

/// changing theme of extent Report
public class Practise4 {
	static WebDriver driver;

	public static void main(String[] args) {
		ExtentReports extentReport=new ExtentReports();
		ExtentSparkReporter sparkReport=new ExtentSparkReporter("./ExtentReprts/Report4.html");
		
		extentReport.attachReporter(sparkReport);
		
		sparkReport.config().setReportName("My Reporter");
		sparkReport.config().setDocumentTitle("Extent Report");
		sparkReport.config().setCss(".header{background-color:#35acdc;}");
		sparkReport.config().setCss(".fa {color: #64ab97;}");
		
		//change the ordcer of views
		
//		sparkReport.viewConfigurer().viewOrder().as(new ViewName[] {
//				ViewName.DASHBOARD,
//				ViewName.TEST,
//				ViewName.AUTHOR,
//				ViewName.CATEGORY,
//				ViewName.LOG,
//				ViewName.EXCEPTION
//		});
		
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.get("http://google.com");
		
	    extentReport.createTest("This is Test 1")
	    .assignAuthor("Ms Dhoni")
      	.assignCategory("Regression")	
      	.assignDevice("Chrome 102")
      	.pass("This is passes Test Case");
      	
      	
	    extentReport.createTest("This is Test 2")
	    .assignAuthor("Virat Kohli")
      	.assignCategory("smoke")	
      	.assignDevice("Chrome 102")
      	.fail("This is failed Test Case"); 
	    
	    //passing multple strings 
	    extentReport.createTest("This is Test 3")
	    .assignAuthor("Virat Kohli","Ms Dhoni","Sachin")
      	.assignCategory("smoke","Regression","Sanity")	
      	.assignDevice("Chrome 102","Chroome 99","Edge 44","Firefox 60")
      	.fail("This is failed Test Case");
	    
	    //Also we can pass String Array
	    String [] s=new String[3];
	    s[0]="Smoke";
	    s[1]="Regression";
	    s[2]="Sanity";
    
	    extentReport.createTest("This is Test 4")
	    .assignAuthor(new String []{"Sky","Virat Kohli"})
      	.assignCategory(s)	
      	.assignDevice("Chrome 102")
      	.fail("This is failed Test Case");
	    
		driver.quit();
		extentReport.flush();
	}
	
	
	


}
