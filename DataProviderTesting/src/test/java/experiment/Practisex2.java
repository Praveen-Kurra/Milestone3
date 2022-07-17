package experiment;



import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practisex2 {

	public static void main(String[] args) {
		//for disabling notifications
		ChromeOptions options = new ChromeOptions();
//		options.addArguments("disable-notifications");
//		options.addArguments("disable-geolocation");
//		options.addArguments("disable-media-stream");
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver(options);
		
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/alerts");
		
        driver.findElement(By.id("confirmButton")).click();
	
//        WebDriverWait wait = new WebDriverWait(driver,30);
//        wait.until(ExpectedConditions.alertIsPresent());
    

        
        //Compare and buy books online from Indian online book stores | Indian Bookworms
//	for alerts
	Alert a=driver.switchTo().alert();
	
	a.dismiss();
	
	driver.quit();
	}
	
}
