package reuable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class Browser {

	

	public static WebDriver startBrwser(WebDriver driver, String browserName) {
	
	
		if (browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
			driver = new ChromeDriver();

		} else if (browserName.equals("Edge")) {
		
			driver=new EdgeDriver();
			

		} else {
			System.out.println("Sorry this browser Doesnt support");
		}

		
		driver.manage().window().maximize();
		driver.get("https://www.headandshoulders.co.in/en-in");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		return driver;

	}

	public static void quitBrowser(WebDriver driver) {
		driver.quit();
	}
	
	
}
