package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.uiStore.CartUi;

public class AddTwoCart {
	WebDriver driver;
    public AddTwoCart(WebDriver driver) {
	this.driver=driver;
	}

	
	
	
	public  void addBagToCart() {
		driver.findElement(CartUi.Sauce_bagToCart).click();
	}
	
	public  void addLightToCart() {
		driver.findElement(CartUi.Sauce_LightToCart).click();
	}
	public  void addLabsToCart() {
		driver.findElement(CartUi.Sauce_LabsToCart).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@FindBy(id = "add-to-cart-sauce-labs-backpack") WebElement Addcart;
//	@FindBy(id = "add-to-cart-test.allthethings()-t-shirt-(red)") WebElement ShirtCart;
//	
//  public static	By shirt =By.id("add-to-cart-sauce-labs-backpack");
//	
//	public void Add2cart() {
//		Addcart.click();
//	}
//	
//	public void shirtClick() {
//		ShirtCart.click();
//	}
//	public static void checking(WebDriver driver) {
//		driver.findElement(shirt).click();
//	}
	
}
