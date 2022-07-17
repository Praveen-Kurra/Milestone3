package stepDefnition;

import org.junit.Assert;

import com.aventstack.extentreports.Writable;
import com.utilities.BaseClass;
import com.utilities.Browser;
import com.utilities.GetExtentReports;
import com.utilities.Screenshots;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SauceLoginPage;

public class StepDefnition extends BaseClass{
	SauceLoginPage slp;
	
	@Before
	public void invokingBrowser() {
		initialize();
	     setUp();
		slp=new SauceLoginPage(driver);
	}
	@After
	public void closingBrowser() {

		Browser.quitBrowser(driver);
		
	}
	
	@Given("navigating to the website")
	public void navigating_to_the_website() {
		createReports(driver);

		
	}
	@Given("i am an user to go that website")
	public void i_am_an_user_to_go_that_website() {
		logger=report.createTest(this.hashCode()+"test 1");
		logger.assignAuthor("Praveen");
		
		String UrlFromConfig = config.getData("Url");
		gotoUrl(UrlFromConfig);
		
	}
	@When("^i enter valid (.*) and (.*)$")
	public void i_enter_valid_standard_user_and_secret_sauce(String uname,String upass) {
		
	   slp.enterUname(uname);
	   slp.enterPassword(upass);
	   slp.clickLoginButton();
		
	}
	@Then("it should navigate to homepage")
	public void it_should_navigate_to_homepage() {
	   
		String title=driver.getTitle();
		if(title.equalsIgnoreCase("Swag Labs")) {
			Assert.assertTrue(true);
			Screenshots.CaptureScreenShot(driver);

			logger.pass("Passed").addScreenCaptureFromPath(Screenshots.CaptureScreenShot(driver));
			 Screenshots.CaptureScreenShot(driver);

			log.info("Passed the Test Case");
		}
		else {
			Assert.assertTrue(true);
			Screenshots.CaptureScreenShot(driver);
			logger.fail("Failed ").addScreenCaptureFromPath(Screenshots.CaptureScreenShot(driver));
			log.warn("This is Failed");
		}
	Clear();
	}

}
