package com.orangehrm.utilies;

import org.testng.annotations.Test;

public class ActualTest extends testBase {

	@Test
	public void acTest() {
		
		driver.get("http://www.google.com");
		logger.pass("This is passes");
		driver.quit();
		test.flush();
	}
	
}
