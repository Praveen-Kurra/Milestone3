package com.pages;

import org.openqa.selenium.WebDriver;

import com.practise.Elementactions;
import com.uistore.ProductUi;

public class ProductClickPage {
	WebDriver driver;
	Elementactions ele=new Elementactions(driver);
	public  void Backpack(WebDriver driver) {
		
		this.driver=driver;
		
		ele.click(ProductUi.Sauce_BackPack);
		
	}

}
