package com.orangehrm.testcases;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.orangehrm.pages.LoginPage;
import com.orangehrm.pages.ProductClick;
import com.orangehrm.pages.loginUi;
import com.orangehrm.utilies.BaseClass;

public class testDerived extends BaseClass {

	ProductClick products;
	LoginPage lp;
	
	
	@BeforeMethod
	public void setupMethods() {
		 lp=new LoginPage(driver);
   products=new ProductClick(driver);
	}
	
	@Test
	public void test() {
		log.info("djcbdjcnkdjncej");
        logger=report.createTest("Login Test");
//    	LoginPage lp=new LoginPage(driver);
//    	 ProductClick products=new ProductClick(driver);
		lp.setUserName(config.getData("userId"));
		
		lp.setPassword(config.getData("password"));
		
	    lp.clickSubmit();
		
		
	  //  ProductClick products=new ProductClick(driver);
		products.tShirtClick();
		
		
	}
}
