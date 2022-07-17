package stepDefnition;

import org.junit.Assert;

import com.utilities.BaseClass;
import com.utilities.Browser;
import com.utilities.Screenshots;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.GelHomePage;
import pageObjects.GelProductsPage;

public class StepDefnition extends BaseClass {
	GelHomePage gelHomepage;
	GelProductsPage gelProducts;
	
	@Before
	public void initializeAll() {
		initialize();
		setUp();
		 gelHomepage=new GelHomePage(driver);
		 gelProducts=new GelProductsPage(driver);
		
		
	}
	@After
	public void tearDown() {
		
		Browser.quitBrowser(driver);
		
	}
	
	
	
	
	@Given("i am on Gillete website")
	public void i_am_on_gillete_website() {
		gotoUrl(config.getData("Url"));
		
		
	}
	@When("i click on search icon")
	public void i_click_on_search_icon() {
		gelHomepage.clickSearchIcon();
		
	}
	@When("enter the text {string}")
	public void enter_the_text(String string) {
		
		gelHomepage.enterText(string);
	    
	}
	@Then("it should displays all the relevent results")
	public void it_should_displays_all_the_relevent_results() {
		String value=gelHomepage.getResults();
		
	 if(value.contains(config.getData("TestOneResult"))) {
		 Assert.assertTrue(true);
		 
		//Screenshots.CaptureScreenShot(driver);
		 
	 }
	 else {
		 Assert.assertTrue(false);
		 Screenshots.CaptureScreenShot(driver);
	 }
	}

	@When("i click on products")
	public void i_click_on_products() {
		
	  gelProducts.gotoProducts();
	  try {
	  gelProducts.clickOnAllProducts();
	  }
	  catch (Exception e) {
		System.out.println("Causes an exception");
	}
		
	}
	@Then("it should display products")
	public void it_should_display_products() {

		gelProducts.getResults();
		System.out.println("All done");
	}
	
	
	
}
