package com.testrunner;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.PhilipsCarAutomotive;
import com.utilities.BaseClass;

public class PhilipsCarAutomotiveTest extends BaseClass {

	@Test
	public void clicking(Method method) throws Exception {
		log.info(method.getName() + " is being executed");

		logger = report.createTest(this.getClass().getName() + "::" + method.getName());
		
		PhilipsCarAutomotive pca = new PhilipsCarAutomotive(driver);
		
		pca.hoverOnAutomotive();
		
		pca.clickOnCarLights();
		
		String text = pca.getResults();

		if (text.contains(config.getData("pageText"))) {
			
			Assert.assertTrue(true);
			
			log.info("Sucessfully Passed");
			
		} else {
			
			Assert.assertTrue(false);
			
			log.info(method.getName() + " is completed");
		}
	}

}
