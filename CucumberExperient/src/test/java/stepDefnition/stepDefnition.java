package stepDefnition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefnition {


@Given("i am an user")
public void i_am_an_user() {

	System.out.println("first feature file -----> first step defnition class");

}
@When("enter username")
public void enter_username() {

	System.out.println("first feature file -----> first step defnition class");

	
}
@Then("it should display homePage")
public void it_should_displays() {
	
	System.out.println("first feature file -----> first step defnition class");
}

//
//@Given("^entering pass (.*) here$")
//public void entering_pass_praveen_here(String x) {
//	System.out.println("first feature file -----> first step defnition class");
//}
//@When("^declare somthing (.*) name$")
//public void declare_somthing_kurra_name(String x) {
//
//	System.out.println("first feature file -----> first step defnition class");
//	
//}
//@Then("^show output (.*) enters$")
//public void show_output_mind_enters(String x) {
//
//	System.out.println("first feature file -----> first step defnition class");
//	
//	
//	System.out.println("       ");
//	
//	System.out.println("       ");
//	
//	System.out.println("--------------------------------------");
//}


}
	

