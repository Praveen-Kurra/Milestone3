package practice;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FlipcartBuy {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				".\\\\chromeDriver\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://the-internet.herokuapp.com/");

		driver.findElement(By.xpath("//li//a[contains(text(),'Hovers')]")).click();

		WebElement ele = driver.findElement(By.xpath("(//div[@class='figure']//img[@alt='User Avatar'])[1]"));

		Actions a = new Actions(driver);

		a.moveToElement(ele).perform();

		String user1 = driver.findElement(By.xpath("(//div[@class='figure']//div[@class='figcaption']//h5)[1]"))
				.getText();

		System.out.println(user1);

		driver.navigate().back();

		driver.findElement(By.xpath("//li//a[contains(text(),'Checkboxes')]")).click();

		WebElement checkBox1 = driver.findElement(By.xpath("(//form//input)[1]"));

		Boolean check1 = checkBox1.isSelected();

		if (check1) {
			checkBox1.click();
		}

		WebElement checkBox2 = driver.findElement(By.xpath("(//form//input)[2]"));

		Boolean check2 = checkBox2.isSelected();
		if (check2) {
			checkBox2.click();
		}

		driver.findElement(By.xpath("(//form//input)[1]")).click();

		driver.findElement(By.xpath("(//form//input)[2]")).click();

		driver.navigate().back();

		driver.findElement(By.xpath("//li//a[contains(text(),'Inputs')]")).click();

		driver.findElement(By.xpath("//div[@class='example']//input")).sendKeys("9999");

		driver.navigate().back();

		driver.findElement(By.xpath("//li//a[contains(text(),'Dropdown')]")).click();

		WebElement ele2 = driver.findElement(By.id("dropdown"));

		Select s = new Select(ele2);

		s.selectByValue("2");

		driver.navigate().back();

		driver.findElement(By.xpath("//li//a[contains(text(),'File Upload')]")).click();

		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\M1088236\\Desktop\\SlotBooking.txt");

		driver.findElement(By.id("file-submit")).click();

		driver.navigate().back();

		driver.navigate().back();

		driver.findElement(By.xpath("//li//a[contains(text(),'Sortable')]")).click();

		String email = driver.findElement(By.xpath("//table[@id='table1']//tbody/tr[4]//td[3]")).getText();

		String website = driver.findElement(By.xpath("//table[@id='table1']//tbody/tr[4]//td[5]")).getText();

		System.out.println("Email: " + email);

		System.out.println("website :" + website);

		driver.navigate().back();

		driver.findElement(By.xpath("//li//a[contains(text(),'Key')]")).click();

		driver.findElement(By.id("target")).sendKeys("Hell0 Guys");

		String s1 = driver.findElement(By.id("result")).getText();

		System.out.println(s1.substring(12));

		driver.navigate().back();

		driver.findElement(By.xpath("//li//a[contains(text(),'Multiple')]")).click();

		String parent = driver.getWindowHandle();

		driver.findElement(By.xpath("//div[@class='example']//a")).click();

		String window = driver.findElement(By.xpath("//div//h3")).getText();

		System.out.println(window);

		driver.switchTo().window(parent);

		driver.navigate().back();

		driver.findElement(By.xpath("//li//a[contains(text(),'Context')]")).click();

		WebElement location = driver.findElement(By.id("hot-spot"));

		Actions ac = new Actions(driver);

		ac.contextClick(location).perform();

		driver.switchTo().alert().accept();

		Thread.sleep(5000);

		driver.quit();

	}

}
