package com.reusable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author M1088236
 *
 */

public class ElementHelper {
	
	WebDriver driver;

	public ElementHelper(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void sendText(By element,String key) {
		
		try {
			driver.findElement(element).sendKeys(key);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		}
	
      public void clickElement(By element,String key) {
		
		try {
			driver.findElement(element).click();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		}

}
