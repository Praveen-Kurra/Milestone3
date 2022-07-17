package com.testrunner;

import org.testng.annotations.Test;

import com.utilities.BaseClass;

public class NewTest extends BaseClass {

	
	@Test
	public void test() {
		logger=report.createTest("Myne Test");
		System.out.println(driver.getTitle());
		log.info("Haopjdw ");
	}
}
