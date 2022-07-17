package mine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xyz {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver-1.exe");

		WebDriver driver=new ChromeDriver();
		
//		WebDriver driver=new ChromeDriver();

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
