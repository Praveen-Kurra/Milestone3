package com.orangehrm.utilies;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	public static WebDriver startBrwser(WebDriver driver, String browserName, String Url) {
		if (browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			//WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browserName.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			

		} else {
			System.out.println("Sorry this browser Doesnt support");
		}

		driver.manage().window().maximize();
		driver.get(Url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return driver;

	}

	public static void quitBrowser(WebDriver driver) {
		driver.quit();
	}
	
	
}
