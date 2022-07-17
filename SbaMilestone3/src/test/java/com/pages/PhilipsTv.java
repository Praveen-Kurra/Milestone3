package com.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author M1088236
 *
 */
public class PhilipsTv {
	WebDriver driver;
	public PhilipsTv(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	 
	}

	@FindBy(xpath = "//div[@class='p-n02v3__mzsearch--open']") WebElement searchIcon;
	
	@FindBy(xpath = "//input[@name='q']") WebElement searchBar;
	
	@FindBy(xpath = "(//a[@class='CoveoResultLink'])[1]//span") WebElement tvResults;
	
	/**
	 * it clicks on search icon 
	 */
	public void clickSearchIcon() {
		searchIcon.click();
	}
	
	/**
	 * 
	 * @param text
	 * it takes text as input and enters into the search to search
	 */
	public void enterTextIntoSearch(String text) {
		searchBar.sendKeys(text,Keys.ENTER);
	}
	
	
	/**
	 * 
	 * @return a string value from the search results from the page 
	 */
	public String getTextFromResults() {
		return tvResults.getText();
	}
}
