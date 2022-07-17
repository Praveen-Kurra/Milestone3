package com.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Elementactions {
WebDriver driver;

public Elementactions(WebDriver driver) {
	super();
	this.driver = driver;
}
	
	public void sendTextInto( By ele,String ana) {
		
		try {
			driver.findElement(ele).sendKeys(ana);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

	public void click( By ele) {
		
		try {
			driver.findElement(ele).click();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	

}
