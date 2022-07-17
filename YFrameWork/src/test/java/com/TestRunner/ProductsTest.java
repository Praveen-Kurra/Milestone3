package com.TestRunner;

import org.testng.annotations.Test;

import com.Pages.LoginPage;
import com.Pages.ProductClick;

public class ProductsTest  extends BaseClass{

	@Test
	public void Myproduct() {
	
		logger = report.createTest("Login Test");
		String userName = excel.getstringdata("Sheet1", 1, 0);

		String password = excel.getstringdata("Sheet1", 1, 1);

	    
		logger.info("Login Activity").assignAuthor("Sachin Tendulkar");
		login.loginPage(userName, password);
	

		
	      product.clickBag();
		
		
		
		log.info("Executed all test");
	}
	

}
