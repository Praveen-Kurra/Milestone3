package com.testrunner;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.PhilipsLightning;
import com.utilities.BaseClass;

public class PhilipsLightningTest extends BaseClass {

	
	@Test
	public void testCustomerCarenumber(Method method) {

		log.info(method.getName() + " is being executed");

		logger = report.createTest(this.getClass().getName() + "::" + method.getName());
		
		PhilipsLightning plight=new PhilipsLightning(driver);
		plight.clickOnLigntning();
		plight.switchToChildWindow();
	  String number=plight.getCustomernumber();
	  
	 if(number.contains(config.getData("customercarenumber"))) {
		 Assert.assertTrue(true);
		 log.info("Sucessfully Passed");
	 }
	 else {
		 Assert.assertTrue(false); 
		 log.info("Sucessfully Passed");
	 }
	 log.info(method.getName()+" is completed");
	}
}
