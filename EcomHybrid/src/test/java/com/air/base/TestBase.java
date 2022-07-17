package com.air.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.air.utility.TestUtill;

public class TestBase {

	
public static	WebDriver driver;
  public static Properties prop;

	
	public  TestBase() {
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("./src/test/java/com/air/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public static void initialization() {
		
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else {
			System.err.println("This browser doesnt support");
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(TestUtill.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtill.IMPLICIT_TIMEOUT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}
	
}
