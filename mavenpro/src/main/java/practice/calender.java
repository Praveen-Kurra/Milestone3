package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class calender {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\M1088236\\MySeleniumProject\\myFirstSeleniumProject\\chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   driver.manage().window().maximize();
   driver.get("https://www.makemytrip.com");
   driver.findElement(By.xpath("//li[@class='menu_Hotels']")).click();
   
   driver.findElement(By.id("checkin")).click();
   
 
  List<WebElement> date=driver.findElements(By.xpath("//div[@class='DayPicker-Day']"));
  
    int count=date.size();
    for(int i=0;i<count;i++) {
    	String webDate=date.get(i).getText();
    	if(webDate.equalsIgnoreCase("30")) {
    		date.get(i).click();
    		break;
    	}
    }
   
   Thread.sleep(5000);
   driver.quit();
	}

}
