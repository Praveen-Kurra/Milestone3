package com.runner;

import org.testng.annotations.Test;

import com.pageObjects.BbcCricketPage;
import com.utilities.BaseClass;

public class BbcCricketTest extends BaseClass {
	
	

	
	@Test
	public void cricketTest() {
		
		logger=report.createTest("My testCase2");
		
		BbcCricketPage cricketPage=new BbcCricketPage(driver);
		
		cricketPage.clickSearchIcon();
		
		cricketPage.enterTextIntoSearchBox("Cricket");
		
		System.out.println(cricketPage.getResults());
	}
}
