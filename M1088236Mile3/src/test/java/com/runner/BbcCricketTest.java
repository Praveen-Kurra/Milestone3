package com.runner;

import java.lang.reflect.Method;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageObjects.BbcCricketPage;
import com.utilities.BaseClass;

public class BbcCricketTest extends BaseClass {

	@Test
	public void cricketTest(Method method) throws InterruptedException {

		log.info(method.getName() + " is being executed");

		logger = report.createTest(this.getClass().getName() + "::" + method.getName());

		logger.assignAuthor("Praveen");

		BbcCricketPage cricketPage = new BbcCricketPage(driver);

		try {

			cricketPage.clickSearchIcon();
			
		//	cricketPage.enterTextIntoSearchBox(config.getData("searchText"));

		} catch (Exception e) {
//			Duration d = Duration.ofSeconds(30);
//
//			WebDriverWait wait = new WebDriverWait(driver, 30);
//
//			wait.until(ExpectedConditions.visibilityOf(cricketPage.enterIntoSearchIcon));
			
			//cricketPage.enterTextIntoSearchBox(config.getData("searchText"));
		}


		cricketPage.enterTextIntoSearchBox(config.getData("searchText"));
		
		String results = cricketPage.getResults();

		if (results.contains(config.getData("TestTwoResult"))) {

			Assert.assertTrue(true);
			log.info(this.getClass().getName() + "::" + method.getName() + "    is sucessfully Executed");
		} else {
			Assert.assertTrue(false);
			log.warn(this.getClass().getName() + "::" + method.getName() + "   is failed");
		}

		log.info(this.getClass().getName() + "::" + method.getName() + "  is Finished");

	}
}
