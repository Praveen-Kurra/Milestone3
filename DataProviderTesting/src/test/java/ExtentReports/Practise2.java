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

import io.github.bonigarcia.wdm.WebDriverManager;


public class Practise2 {
	static WebDriver driver;

	public static void main(String[] args) {
		ExtentReports extentReport=new ExtentReports();
		ExtentSparkReporter sparkReport=new ExtentSparkReporter("./ExtentReprts/Report2.html");
		
		extentReport.attachReporter(sparkReport);
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.get("http://google.com");
		String ScreenshotPath=TakeScreenShot(driver, "ExtentScreenShot.jpg");
		
		extentReport.createTest("ScreeShot Test 1","Taking screenshot and attach with extent reports")
		.info("This takes ScreemShot")
		.addScreenCaptureFromPath(ScreenshotPath);

		extentReport.createTest("ScreeShot Test 2","Taking screenshot and attach with extent reports")
		.info("This takes ScreemShot")		
		.fail(com.aventstack.extentreports.MediaEntityBuilder.createScreenCaptureFromPath(ScreenshotPath).build());
	
		
		driver.quit();
		extentReport.flush();
	}
	
	
	
public static String TakeScreenShot(WebDriver driver,String FileName)  {
		

		TakesScreenshot ts=(TakesScreenshot)driver;
		File file=ts.getScreenshotAs(OutputType.FILE);
		File dest= new File("./ScreenShots/"+FileName);
	
			try {
				FileUtils.copyFile(file, dest);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			System.out.println("ScreenShot Sucessfully");
	   
			return dest.getAbsolutePath();
		
	}

}
