package ExtentReports;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.model.Media;
import com.aventstack.extentreports.observer.entity.MediaEntity.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ViewName;

import io.github.bonigarcia.wdm.WebDriverManager;

/// changing theme of extent Report
public class Practise5 {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.goibibo.com/flights/");


		driver.findElement(By.xpath("//span[contains(text(),'Departure')]")).click();
		
//           List<WebElement> dates  = driver.findElements(By.className("fsw__date")); 
//      int count=  driver.findElements(By.className("fsw__date")).size();
//           
//           for(int i=0;i<count;i++)
//           {
//        	   
//        	String x= driver.findElements(By.className("fsw__date")).get(i).getText();
//        	
//      
//        	 if(x.equals("22")) {
//    		 driver.findElements(By.className("fsw__date")).get(i).click();
//    		 
//    		 driver.findElement(By.xpath("//span[@class='fswTrvl__done']")).click(); 
//    		 break;
//      }
//        	 }
//        	
		
	Boolean flag=true;
	while(flag) {
	   //driver.findElement(By.xpath("//div[@class='DayPicker-Month']//div[contains(text(),'September 2022')]")).isDisplayed();
		
	    if( driver.findElement(By.xpath("//div[@class='DayPicker-Month']//div[contains(text(),'September 2022')]")).isDisplayed()) {
	    	flag=false;
	    }
	    else {
	    	driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
	    	flag=true;
	    }
	    
	}
		
     Thread.sleep(5000);      
	driver.quit();

	}
}