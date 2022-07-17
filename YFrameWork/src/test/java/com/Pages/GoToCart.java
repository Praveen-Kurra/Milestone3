package com.Pages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.uiStore.GoToCartUi;

public class GoToCart {
	WebDriver driver;
	public GoToCart(WebDriver driver) {
		this.driver=driver;
	}

	public  void goToMyCart() {
		driver.findElement(GoToCartUi.Sauce_ClickCart).click();
	}
	
}
