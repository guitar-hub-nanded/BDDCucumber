package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	@Given("I am at the login page")
	public void preRequisite()
	{
		System.out.println("Given statement is executing");
	}
	
	@When("I enter the username")
	public void enteringUsername()
	{
		System.out.println("Entered username");
	}
	
	@When("I enter the password")
	public void enteringPassword()
	{
		System.out.println("Entered pwd");
	}
	
	@When("I click on login button")
	public void clickOnLogin()
	{
		System.out.println("Clicked on login");
	}
	
	@Then("I should be able to login")
	public void validateOutput()
	{
		System.out.println("Output validated!!!");
	}
	
	
	

}