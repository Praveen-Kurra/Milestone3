package TestHelper;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyTest {
	
	@Test
	public void newTest() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.yatra.com/");
		driver.findElement(By.xpath("//button[@class='btngdpr']")).click();
		
		driver.findElement(By.xpath("//a[@title='Offers']")).click();
		
	String color=	driver.findElement(By.xpath("//a[@class='OfferTabSel']")).getCssValue("border-top");
	String unHeighlited=driver.findElement(By.xpath("//a[contains(text(),'International Flights')]")).getCssValue("border-top");
	System.out.println(color);
	System.out.println(unHeighlited);
//		
//		driver.findElement(By.xpath("//a[@href='http://www.travelguru.com/']")).click();
//	    Set<String>handles=driver.getWindowHandles();
//	    Iterator<String>windos=  handles.iterator();
//		  String parent=windos.next();
//		  String Chind=windos.next();
//		 // System.out.println(driver.getTitle());
//		driver.switchTo().window(Chind);
//		
//		String childTitle=driver.getTitle();
//		System.out.println(childTitle);
//		if(childTitle.contains("Travelguru")) {
//			Assert.assertTrue(true);
//		}
//		else {
//			Assert.assertTrue(false);
//		}
		////a[@class='OfferTabSel']
		
		
		
		driver.quit();
		//System.out.println(childTitle);
		
		
	}

}
