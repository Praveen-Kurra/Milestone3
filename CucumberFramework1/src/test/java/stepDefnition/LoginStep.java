package stepDefnition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.BaseClass;

public class LoginStep  extends BaseClass{
	
   @Before
   public void beforeSteps() {
	   System.out.println("this is before");
	   initialize();
   }
	
   
   @After
   public void afterstep() {
	   System.out.println("this is after step");
   }
   
   
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
	   System.out.println("Hello 1");
	}
	@Given("some other precondition")
	public void some_other_precondition() {
	   System.out.println("Hello 2");
	}
	@When("I complete action")
	public void i_complete_action() {
	    System.out.println("helllo 3");
	}
	@When("some other action")
	public void some_other_action() {
	System.out.println("hello 4");
	}
	@When("yet another action")
	public void yet_another_action() {
	   System.out.println("hello 5");
	}
	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	   System.out.println("hello 6");
	}
	@Then("check more outcomes")
	public void check_more_outcomes() {
	 System.out.println("hello 7");
	}
	@Given("^I want to write a step with (.*) and (.*)$")
	public void i_want_to_write_a_step_with_name1_and_pass1(String a,String b) {
	 System.out.println(a +"   "+ b);
	}

	@When("^I check for the (.*) in step$")
	public void i_check_for_the_in_step(Integer int1) {
	 System.out.println(int1);
	}

	@Then("^I verify the (.*) in step$")
	public void i_verify_the_success_in_step(String x) {
	System.out.println(x);
	}


	@Given("I want to create extent Reports")
	public void i_want_to_create_extent_reports() {
	   System.out.println("This is pre conditons");
	}
	
}
