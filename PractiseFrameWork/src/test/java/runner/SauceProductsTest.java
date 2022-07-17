package runner;

import org.testng.annotations.Test;

import pageObjects.SauceLoginPage;
import pageObjects.SauceProductsPage;
import utilities.BaseClass;

public class SauceProductsTest extends BaseClass {

@Test
public void testProducts() {
	
	test=report.createTest("My first second");
	SauceLoginPage slp=new SauceLoginPage(driver);
	
	slp.enterUserName("standard_user");
	slp.enterPassword("secret_sauce");
	slp.clickLoginButton();
	
	SauceProductsPage spp=new SauceProductsPage(driver);
	
	spp.clickJacket();
}




}
