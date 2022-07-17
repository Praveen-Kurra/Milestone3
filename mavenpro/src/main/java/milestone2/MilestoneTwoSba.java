package milestone2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MilestoneTwoSba {

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver", ".\\chromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://indianbookworms.com/");

		driver.findElement(By.id("searchinput")).sendKeys("Ocean");

		driver.findElement(By.xpath("//input[@id='searchinput']/following-sibling::*")).click();

		driver.findElement(
				By.xpath("//div[@class='block pl-5 relative col-span-8']//h2[contains(text(),'The Ocean of Churn')]"))
				.click();

	
		WebDriverWait wait = new WebDriverWait(driver, 60);
		WebElement el = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//a[@class='sale-btn group']//span[contains(text(),'Book Chor')]")));

	
		el.click();
		
		
	    Set<String>ids=	driver.getWindowHandles();
	    
	    Iterator<String> handles=ids.iterator();
	    
	    String parent=handles.next();
	    
	    String child=handles.next();
	    
	    driver.switchTo().window(child);

//	    Robot robot = new Robot();
//	       robot.keyPress(KeyEvent.VK_ESCAPE);
//	       robot.keyRelease(KeyEvent.VK_ESCAPE);
	      

		String publisher = driver.findElement(By.xpath(
				"//td[@class='datasheet-features-type' and contains (text(),'Publisher')]/parent::tr//td[2]//span"))
				.getText();
		String pages = driver.findElement(By.xpath(
				"//td[@class='datasheet-features-type' and contains (text(),'Pages')]/parent::tr//td//span[contains(text(),'312')]"))
				.getText();

		System.out.println(publisher);
		System.out.println(pages);

		WebElement ele = driver.findElement(By.xpath("//a[@class='dropdown-toggle']//strong"));

		Actions a = new Actions(driver);

		a.moveToElement(ele).perform();

		driver.findElement(By.xpath("//ul[@class='dropdown-menu']//ul[@class='nopadding']//li[4]//a")).click();
		

		driver.findElement(By.xpath("//div[@class='checkbox-list'][2]//label[3]//input")).click();
		Thread.sleep(5000);
		   Robot robot = new Robot();
          robot.keyPress(KeyEvent.VK_ESCAPE);
	       robot.keyRelease(KeyEvent.VK_ESCAPE);
	       
	   Boolean icon= driver.findElement(By.xpath("//a[@type='button']")).isDisplayed();
	   
	   if(icon) {
		   driver.findElement(By.xpath("//a[@type='button']")).click();
		   driver.findElement(By.xpath("//a[@type='button']//following-sibling::ul//li//a[@href=\"/login\"]")).click();
		   
	   }
	   else {
		driver.findElement(By.xpath(
				"//ul[@class='list-unstyled list-inline pull-right']//li[@class='hidden-sm hidden-xs hidden-md']//a"))
				.click();
	   }
	   

		driver.findElement(By.xpath("//div[@class='form-group']//input[@id='login_phone']")).sendKeys("2345653234");

		driver.findElement(By.xpath("//div[@class='form-group']//button[@id='lg_ph']")).click();

		driver.switchTo().alert().accept();

		driver.findElement(By.xpath("//div[@class='close-btn']//a//img")).click();

		Thread.sleep(5000);
		driver.quit();

	}

}
