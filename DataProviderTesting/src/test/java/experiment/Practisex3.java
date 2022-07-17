package experiment;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practisex3 {

	public static void main(String[] args) throws Exception {

	WebDriverManager.chromedriver().setup();
	
	Map<String, String> mobileEmulation= new HashMap<String , String> ();
	
	mobileEmulation.put ("deviceName", "iPhone XR");
	
	Map<String, Object> chromeOptions= new HashMap<String, Object>();
	
	chromeOptions.put ("mobileEmulation", mobileEmulation);
	DesiredCapabilities capabilities=DesiredCapabilities.chrome();
	capabilities.setCapability (ChromeOptions.CAPABILITY, chromeOptions);
	
	
	WebDriver driver=new ChromeDriver(capabilities);
//	Thread.sleep(5000);
	Dimension dimension=new Dimension(1000,900);
	driver.manage ().window ().setSize (dimension);
	driver.get("https://www.oral-b.co.in/en-in");
	
	//driver.findElement(By.id("nav-cart-count")).click();
	}

}
