package com.practise;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest extends BaseClass {
	
	
  @Test
  public void f() throws Exception {
	  Elementactions e=new Elementactions(driver);
	 e.sendTextInto(ElementUi.user, "standard_user");
	 e.sendTextInto(ElementUi.password, "secret_sauce");
	 e.click(ElementUi.loggin);
	  Thread.sleep(5000);
	  driver.quit();
	  
  }
}
