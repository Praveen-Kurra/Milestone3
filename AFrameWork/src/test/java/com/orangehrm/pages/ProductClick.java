package com.orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductClick {
	WebDriver driver;
	public ProductClick(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	
	@FindBy(id = "item_4_title_link") WebElement sauceBag;
	@FindBy(id="item_0_title_link") WebElement bikeLight;
	@FindBy(id="item_1_title_link") WebElement tShirt;
	
	public void sauceBagClick() {
		sauceBag.click();
	}
	public void bikeLightClick() {
		bikeLight.click();
		
	}
	public void tShirtClick() {
		tShirt.click();
		
	}
	
}
