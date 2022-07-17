package Mine;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Help {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver-1.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php");
		try {
		driver.findElement(By.xpath("//a[@class='login']")).click();
		
		System.out.println("perfect");
		
		driver.findElement(By.id("email")).sendKeys("oct.test@yahoo.com");
		System.out.println("perfect");
		
		}catch (Exception e) {
			
		driver.findElement(By.id("email")).sendKeys("oct.test@yahoo.com");
		
		System.out.println("Exception");
		
		}
		
		driver.findElement(By.id("passwd")).sendKeys("test123");
		
		driver.findElement(By.id("SubmitLogin")).click();
		
		
		WebElement ele=driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
		
		Actions as=new Actions(driver);
		
		as.moveToElement(ele).perform();
		
		driver.findElement(By.xpath("(//a[@title='Summer Dresses'])[2]")).click();
		
		WebElement dr2=driver.findElement(By.xpath("(//a[@class='product-name'])[2]"));
		
		WebElement dr3=driver.findElement(By.xpath("(//a[@class='product-name'])[3]"));
		
		as.moveToElement(dr2).perform();
		
		driver.findElement(By.xpath("(//a[@class='add_to_compare'])")).click();
		
		as.moveToElement(dr3).perform();
		
		driver.findElement(By.xpath("(//a[@class='add_to_compare'])[1]")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Compare')]")).click();
		
	String a=	driver.findElement(By.xpath("//table[@id='product_comparison']//tr[3]//td[2]")).getText();
	
	String b=driver.findElement(By.xpath("//table[@id='product_comparison']//tr[3]//td[3]")).getText();
	
	System.out.println(a);
	
	System.out.println(b);
	
	driver.findElement(By.xpath("(//span[text()='Add to cart'])[2]")).click();
	
	String price=driver.findElement(By.xpath("(//span[@class='price product-price'])[2]")).getText();
	
	System.out.println(price);
	
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]")).click();
	
	String finale=driver.findElement(By.id("total_price")).getText();
	
	if(price.equals(finale)) {
		System.out.println("same price");
	}else {
		System.out.println("not same price");
	}
	
	
	}
}
