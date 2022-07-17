package experiment;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practisex4 {

	public static void main(String[] args) throws Exception {

		 WebDriverManager.chromedriver().setup();

	//	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

 	// WebDriver driver = new EdgeDriver();				
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.bbc.com");
		
		System.out.println(" Message 1");

		driver.findElement(By.id("orbit-search-button")).click();
		
		System.out.println(" Message 2");

	//	driver.findElement(By.id("search-input")).click();
		
	

		driver.findElement(By.xpath("//input[@placeholder='Search the BBC']")).sendKeys("Cricket");
		
		System.out.println(" Message 3");

		driver.quit();

		System.out.println("Sucesss");
	}
}
