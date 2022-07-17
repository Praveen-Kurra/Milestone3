package experiment;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practisex {

	public static void main(String[] args) {
		//for disabling notifications
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		options.addArguments("disable-geolocation");
		options.addArguments("disable-media-stream");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		
		Dimension dimension=new Dimension(390,844);
		driver.manage ().window ().setSize (dimension);
		
		driver.get("https://www.amazon.com/");
		
	driver.findElement(By.id("nav-cart-count")).click();
	
	//for alerts
	Alert a=driver.switchTo().alert();
	
	a.dismiss();
	
	
	System.out.println("hegbfvbfv");	
	}
	
}
