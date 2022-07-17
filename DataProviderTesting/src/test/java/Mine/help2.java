package Mine;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class help2 {
	
	
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver-1.exe");
//		WebDriver driver=new ChromeDriver();
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.findElement(By.xpath("//a[@title='Contact Us']")).click();
		
		System.out.println(driver.findElement(By.xpath("//label[text()='Message']")).getText());

		
        driver.quit();
		
		
	}

}
