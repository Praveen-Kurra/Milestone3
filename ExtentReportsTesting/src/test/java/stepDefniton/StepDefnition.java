package stepDefniton;

import java.io.IOException;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utulities.BaseClass;

public class StepDefnition extends BaseClass {
	//ExtentTest test;
//	ExtentTest test1;
	
	//Scenario 1
	
	@Before
	public void setUp() throws IOException {
		initialize();
		ExtentTest	 test = extent.createTest("Hook Before");
	}
	@After
	public void tearDown() {
		extent.flush();
	}
	
	
	@Given("go to home page")
	public void go_to_home_page() {
	  System.out.println("Scenario 1  @Given");
	  ExtentTest  test = extent.createTest("Scenario 1");
		
	}
	@When("navige back")
	public void navige_back() {
	System.out.println("Scenario 1 @GWhen");
	}
	@Then("close the window")
	public void close_the_window() {
		System.out.println("Scenario 1 @Then");
	   
	}
	
	
	
	
	//scenario 2
	
	
	
	
	@Given("go to website")
	public void go_to_website() {
	 System.out.println("Scenario 2 @Given");
	ExtentTest  test1 = extent.createTest("Scenaio 2");
	}
	@When("farword to test")
	public void farword_to_test() {
	System.out.println("Scenario 2 @When");
	}
	@Then("close the website")
	public void close_the_website() {
	   System.out.println("Scenario 2 @Then");
	}

}
