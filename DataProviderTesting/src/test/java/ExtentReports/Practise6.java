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
public class Practise6 {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.philips.co.in/");

		driver.findElement(By.xpath("//span[@class='p-text' and text()='Lighting']")).click();
		
		
     Thread.sleep(5000);      
	driver.quit();

	}
}