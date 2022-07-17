package com.TestRunner;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import com.Pages.AddTwoCart;
import com.Pages.GoToCart;
import com.Pages.LoginPage;

import com.Pages.ProductClick;


public class Login extends BaseClass {
//	WebDriver driver;

	@Test
	public void loading(Method method) throws InterruptedException {
      
		
		
		logger = report.createTest(this.getClass().getName()+"::"+method.getName());
		
		log.info("Extent Report test is created");
		
		String userName = excel.getstringdata(0, 1, 0);

		String password = excel.getstringdata(0, 1, 1);

		logger.info("Login Activity").assignAuthor("Sachin Tendulkar");
		
       //we.sendKeys(userName, LoginPage.getelements());
         
		login.loginPage(userName, password);
	    //LoginPage.loginPage(driver, userName,password);	     	
		Thread.sleep(5000);
		
		log.info("Executed all test");
	}

}






































//LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

//loginPage.loginToPage(userName, password);

//ProductClick product = PageFactory.initElements(driver, ProductClick.class);
//
//product.clickBagFunction();

//AddTwoCart cart = PageFactory.initElements(driver, AddTwoCart.class);

///cart.Add2cart();
