package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Recheck {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\M1088236\\MySeleniumProject\\myFirstSeleniumProject\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.xpath("//div[text()='From']")).click();

	     driver.findElement(By.xpath("//div[contains(text(),'Pandit ')]")).click();   
	
		 
		Thread.sleep(5000);
		driver.quit();

	}
 
}
