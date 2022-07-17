package stepDefnition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import oralPageObjects.ElectricBrushPageObj;
import oralPageObjects.ShopPageObj;
import reuable.BaseClass;
import reuable.Browser;

public class OralstepDefnition extends BaseClass {
	ElectricBrushPageObj productBrush;
	ShopPageObj shop;

	@Before
	public void initializeMethods() {
		log.info("Initializing all the methods");
		
		initialize();
		
		test=report.createTest("Scenario 1 DropDown Menu");
		
		test.assignAuthor("Praveen");
		
       
		productBrush = new ElectricBrushPageObj();

		shop = new ShopPageObj();

	}

	@After
	public void tearDown() {
		
		log.info("Closing the browser");
		
		System.out.println(productBrush.getResults());
		
		productBrush.clckBuyNow();
		
		Browser.quitBrowser(driver);
		
		report.flush();
	}

	@Given("i am on website")
	public void i_am_on_website() {
		
		test=report.createTest("Scenario 1 dropdrown");
		
		log.info("Navigating to that Website");
		
		driver.get("https://www.oral-b.co.in/en-in");
	}

	@When("i click on dropdown menu")
	public void i_click_on_dropdown_menu() {
		
		log.info("Clicking the dropDown Menu");
		
		productBrush.clickOnDropDown();
	}

	@And("click on Electric toothBrush")
	public void click_on_electric_tooth_brush() {
		
		log.info("Clicking on eletrich ToothBrush");
		
		productBrush.clickElectricBrush();

	}

	@Then("it should displays relevent details")
	public void it_should_displays_relevent_details() {

		log.info("displaying relevent Products");
		
		productBrush.clickProseriesBrush();

	}

	@When("i click on shop")
	public void i_click_on_shop() {
		
		test=report.createTest("Scenario 1 dropdrown");
		
		log.info("Click on the shop ");
		
		shop.clickShop();
	}

	@When("click on Eletric toothBrush from menu")
	public void click_on_eletric_tooth_brush() {
		
 log.info("click on eletric tooth brush from the shop memu");
 
		shop.clickEletricBrush();

	}

	@Then("it should navigate to electric tooth BrushPage")
	public void it_should_navigate_to_electric_tooth_brush_page() {
		
		log.info("Displaying relevent Products");
		
		System.out.println("Hello");

	}

}
