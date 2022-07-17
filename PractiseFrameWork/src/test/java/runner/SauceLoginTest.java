package runner;

import org.testng.annotations.Test;

import pageObjects.SauceLoginPage;
import utilities.BaseClass;

public class SauceLoginTest extends BaseClass {

	
	@Test
	public void testLoginFeature() {
		test=report.createTest("MyFirstTestCase");
		SauceLoginPage slp=new SauceLoginPage(driver);
		slp.enterUserName("standard_user");
		slp.enterPassword("secret_sauce");
		slp.clickLoginButton();
		
	}
	
}
