package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.uiStore.ProductsUi;

public class ProductClick {
	WebDriver driver;
   public ProductClick(WebDriver driver) {
	   this.driver=driver;

}

  
	public  void clickBag() {
		try {
			driver.findElement(ProductsUi.Sauce_bag).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void clickLight(WebDriver driver) {
		driver.findElement(ProductsUi.Sauce_Light).click();
	}

	public static void clickLabs(WebDriver driver) {
		driver.findElement(ProductsUi.Sauce_LabsOnsine).click();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	@FindBy(id = "item_4_title_link") WebElement product;
//	@FindBy(id="item_0_title_link")  WebElement light;
//	@FindBy(id="item_2_title_link") WebElement LabsOnsine;
//	
//	public void clickBagFunction() {
//		
//		product.click();	
//	}
//	public void BikeLight() {
//		light.click();
//	}
//	
//	public void LabsClick() {
//		LabsOnsine.click();
//	}
}
