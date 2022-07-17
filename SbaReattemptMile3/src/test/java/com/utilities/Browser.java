package com.utilities;







import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


/**
 * @author M1088236
 *
 */
public class Browser {	

	/**
	 * 
	 * @param driver
	 * @param browserName
	 * @param Url
	 * @return the driver whichever name is passed
	 */
	public static WebDriver startBrwser(WebDriver driver, String browserName, String Url) {
	ExcelData excel=new ExcelData();
	int implicitlywait=(int) excel.getNumericdata(0, 0, 1);
//	ChromeOptions options = new ChromeOptions();
//	options.addArguments("disable-notifications");
//	options.addArguments("disable-geolocation");
//	options.addArguments("disable-media-stream");
	
		if (browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browserName.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			

		} else {
			System.out.println("Sorry this browser Doesnt support");
		}

		driver.manage().window().maximize();
		driver.get(Url);
		
		
		return driver;

	}

	public static void quitBrowser(WebDriver driver) {
		driver.quit();
	}
	
}
