package com.testrunner;



import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.Test;


import com.pages.PhilipsTv;
import com.utilities.BaseClass;

public class PhilipsTvTest extends BaseClass {

	@Test
	public  void checkTvResults(Method method) {
		log.info(method.getName()+" is being executed");
		
		logger = report.createTest(this.getClass().getName()+"::"+method.getName());
		
		PhilipsTv ptv = new PhilipsTv(driver);
		
		ptv.clickSearchIcon();
		
		ptv.enterTextIntoSearch("Tv");
		
		String result = ptv.getTextFromResults();
		
		if (result.contains(config.getData("Tvresult"))) {
			Assert.assertTrue(true);
			log.info("Sucessfully Passed");
		} else {
			Assert.assertTrue(false);
			log.warn("Test is failed");
		
		}
		log.info(method.getName()+" is completed");
	}
	
	
	

}
