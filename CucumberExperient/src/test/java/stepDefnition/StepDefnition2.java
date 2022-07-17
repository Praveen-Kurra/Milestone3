package stepDefnition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefnition2 {

	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
		System.out.println("Second feature file -----> second step defnition class");
	}

	@Given("some other precondition")
	public void some_other_precondition() {
		System.out.println("Second feature file -----> second step defnition class");
	}

	@When("I complete action")
	public void i_complete_action() {
		System.out.println("Second feature file -----> second step defnition class");
	}

	@When("some other action")
	public void some_other_action() {

		System.out.println("Second feature file -----> second step defnition class");
	}

	@When("yet another action")
	public void yet_another_action() {
		System.out.println("Second feature file -----> second step defnition class");

	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		System.out.println("Second feature file -----> second step defnition class");
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
		System.out.println("Second feature file -----> second step defnition class");
	}

	
	@Given("^entering pass (.*) here$")
	public void entering_pass_praveen_here(String x) {
		System.out.println("first feature file -----> first step defnition class");
	}
	@When("^declare somthing (.*) name$")
	public void declare_somthing_kurra_name(String x) {

		System.out.println("first feature file -----> first step defnition class");
		
	}
	@Then("^show output (.*) enters$")
	public void show_output_mind_enters(String x) {

		System.out.println("first feature file -----> first step defnition class");
		
		
		System.out.println("       ");
		
		System.out.println("       ");
		
		System.out.println("--------------------------------------");
	}
	
	
}
