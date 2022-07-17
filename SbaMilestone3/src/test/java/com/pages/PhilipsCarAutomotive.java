package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author M1088236
 *
 */
public class PhilipsCarAutomotive {

	WebDriver driver;

	public PhilipsCarAutomotive(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//span[text()='Automotive'])[1]")
	WebElement automotive;

	@FindBy(xpath = "//span[text()='Car lights']")
	WebElement carLights;

	@FindBy(xpath = "//span[contains(text(),'Philips Automotive')]")
	WebElement pagetext;

	
	/**
	 * it usally mouse hover on the particuar element
	 */
	public void hoverOnAutomotive() {

		Actions action = new Actions(driver);

		action.moveToElement(automotive).perform();

	}

	
	/**
	 * it clicks on lights which was displays on page
	 */
	public void clickOnCarLights() {

		carLights.click();
	}

	/**
	 * 
	 * @return a string value from the page
	 */
	public String getResults() {

		return pagetext.getText();
	}
}
