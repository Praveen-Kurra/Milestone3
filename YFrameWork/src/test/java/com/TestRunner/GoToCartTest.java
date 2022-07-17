package com.TestRunner;

import org.testng.annotations.Test;

import com.Pages.AddTwoCart;
import com.Pages.GoToCart;
import com.Pages.LoginPage;
import com.Pages.ProductClick;

public class GoToCartTest extends BaseClass {

	@Test
	public void MyCart() throws InterruptedException {
		logger = report.createTest("Login Test");
		String userName = excel.getstringdata("Sheet1", 1, 0);

		String password = excel.getstringdata("Sheet1", 1, 1);

		logger.info("Login Activity").assignAuthor("Sachin Tendulkar");

		login.loginPage(userName, password);
		product.clickBag();

		gocart.goToMyCart();

		log.info("Executed all test");

		Thread.sleep(5000);

	}

}
