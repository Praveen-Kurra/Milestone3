package com.pages;

import java.sql.Driver;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author M1088236
 *
 */
public class PhilipsLightning {
	WebDriver driver;
	public PhilipsLightning(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
	}

	
	
	
	
	@FindBy(xpath = "//span[@class='p-text' and text()='Lighting']") WebElement lightning;
	
	@FindBy(xpath = "//div[@class='p-text-container-inner']//p[contains(text(),'international toll free number')][1]")
	WebElement customerSupport;
	
	/**
	 * it clicks on lightning text which displays on the page
	 */
	public void clickOnLigntning() {
		lightning.click();
	}
	
	/**
	 * it usally switches from parent to child window
	 */
	public void switchToChildWindow() {
		
		Set<String>handles=driver.getWindowHandles();

		Iterator<String> window=handles.iterator();
		  String parent=window.next();
		  String Chind=window.next();
		  driver.switchTo().window(Chind);
	}
	
	
	/**
	 * 
	 * @return return a customer support number from the webpage
	 */
	public String getCustomernumber() {
		
	return	customerSupport.getText();
	}
	
////p[contains(text(),'international toll free number')]
}
