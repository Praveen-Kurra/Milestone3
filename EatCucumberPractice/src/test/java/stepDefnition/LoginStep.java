package stepDefnition;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.ProductsClick;
import pageObjects.SauceLoginPage;
import pagetest.logintest;

@RunWith(Cucumber.class)
public class LoginStep {
	WebDriver driver;
	SauceLoginPage slp;
	ProductsClick pc;
	logintest lt;

	@Given("User is invoking the browser")
	public void user_is_invoking_the_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	@Given("enters the website url")
	public void enters_the_website_url() {

		driver.get("https://www.saucedemo.com/");
	}

	@When("User enters the {string} and {string}")
	public void user_enters_the_and(String string, String string2) {

		
		 lt=new logintest();
		 
		lt.loginvalidatio();
		
		
		
//		slp = new SauceLoginPage(driver);
//		slp.enterUserName(string);
//		slp.enterPassword(string2);
	}

	@And("User clicks on submit button")
	public void user_clicks_on_submit_button() {
		slp.clickLoginButton();
	}

	@Then("products or cart icon is displayed there")
	public void products_or_cart_icon_is_displayed_there() {
		Boolean b = driver.findElement(By.xpath("//span[@class='title']")).isDisplayed();
		if (b) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}

	@And("Quitting the browser")
	public void quitting_the_browser() {
		driver.quit();
	}

	@Then("user clicks on products")
	public void user_clicks_on_products() {
		//driver.findElement(By.id("item_4_title_link")).click();
		pc=new ProductsClick(driver);
		pc.clickBag();
	}

	@Then("user navigates to products specification page")
	public void user_navigates_to_products_specification_page() {
		Boolean b = driver.findElement(By.xpath("//div[@class='inventory_details_desc_container']")).isDisplayed();
		if (b) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}

}
