package stepDefnition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObjects.LoginPage;
import pageObjects.ProductsPage;
import utilities.BaseClass;
import utilities.Browser;
import utilities.Screenshots;

public class LoginStep extends BaseClass {

	int i = 1;

	@Given("I am an user and opens the browser")
	public void i_am_an_user_and_opens_the_browser() {

		driver = Browser.startBrwser(driver, "Chrome");

		initialize();

		logger = report.createTest(this.getClass().getName() + "::" + "Test" + i);
	}

	@And("enters the {string}")
	public void enters_the_url(String url) {

		driver.get(config.getData("Url"));
	}

	@When("I enter the {string} and {string} then")
	public void i_enter_and(String string, String string2) throws InterruptedException {

		lp = new LoginPage(driver);

		lp.enterUserId(config.getData("userId"));

		lp.enterPassword(config.getData("password"));

	}

	@When("click on enters")
	public void click_on_enters() {
		lp.clickLogin();
	}

	@Then("it should navigating to Homepage")
	public void it_should_navigating_to_homepage() {

	
	
		Boolean b;

		try {
			b = driver.findElement(By.xpath("//span[text()='Products']")).isDisplayed();

			if (b) {
				Assert.assertTrue(true);
				logger.pass("Test Is Passes").addScreenCaptureFromPath(Screenshots.CaptureScreenShot(driver));
			} else {
				Assert.assertTrue(false);
				logger.fail("Test Is Passes").addScreenCaptureFromPath(Screenshots.CaptureScreenShot(driver));
			}
		} catch (Exception e) {
			Assert.assertTrue(false);
			logger.fail("Test Is Passes").addScreenCaptureFromPath(Screenshots.CaptureScreenShot(driver));
		}

	}

	@Then("close the browser")
	public void close_the_browser() {

		Clear();
		i++;
	}

	@Then("click on products and navigates to product discription")
	public void click_on_products_and_navigates_to_product_discription() {
		logger = report.createTest(this.getClass().getName() + "::" + "Test Products");
		ProductsPage pg = new ProductsPage(driver);
		pg.clickBag();

	}

	@Then("get the extent report")
	public void get_the_extent_report() {
		getExtentReport();
	}

	@When("^I enter (.+) and (.+)$")
	public void setDataProvider(String uname, String upass) {
		lp = new LoginPage(driver);
		lp.enterUserId(uname);

		lp.enterPassword(upass);
	}
}
