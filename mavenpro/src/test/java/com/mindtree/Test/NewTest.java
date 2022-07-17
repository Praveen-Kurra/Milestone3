package com.mindtree.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
	WebDriver driver;
  @Test
  public void WebPageAccess() {
	  WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	  
	  
  }
  @Test
  public void Login() {
	 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	 driver.findElement(By.id("btnLogin")).click();
	  
  }
  @Test
  public void LoginSucesssful() {
	 Boolean b= driver.findElement(By.id("welcome")).isDisplayed();
	 System.out.println(b);
	 driver.quit();
  }
}
