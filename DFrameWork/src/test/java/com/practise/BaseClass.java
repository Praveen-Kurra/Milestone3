package com.practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		  WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  
		  driver.get("https://www.saucedemo.com/");
		
	}

}
