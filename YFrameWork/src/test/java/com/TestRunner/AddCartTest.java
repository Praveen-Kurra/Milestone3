package com.TestRunner;

import org.testng.annotations.Test;

import com.Pages.AddTwoCart;
import com.Pages.LoginPage;
import com.Pages.ProductClick;



public class AddCartTest extends BaseClass {
	
	
	@Test
	public void clickAddCart() {
		logger = report.createTest("Login Test");
		String userName = excel.getstringdata("Sheet1", 1, 0);

		String password = excel.getstringdata("Sheet1", 1, 1);
           
		logger.info("Login Activity").assignAuthor("Sachin Tendulkar");

		login.loginPage(userName, password);
		product.clickBag();

		addcart.addBagToCart();

		log.info("Executed all test");
	}

}
