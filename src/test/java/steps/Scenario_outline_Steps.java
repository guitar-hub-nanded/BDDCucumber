package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Scenario_outline_Steps {
	
	@Given("User is at signup page")
	public void user_is_at_signup_page() {
	    System.out.println("User is at signup page");
	}

	@When("user enter {string} on signup page")
	public void user_enter_on_signup_page(String string) {
		  System.out.println("User enters name on signup page : " +string);
	}

	@When("User select gender as {string} with weight as {double}")
	public void user_select_gender_as_with_weight_as_weight(String string, double weight) {
		  System.out.println("User enters gender : " + string + "and enters weight : "+ weight);
	}

	@When("User select slot number as {int}")
	public void user_select_slot_number_as_slot_number(int number) {
		  System.out.println("User enters the slot number : " + number);
	}

	@Then("User is create")
	public void user_is_create() {
		  System.out.println("User gets created");
	}

}
