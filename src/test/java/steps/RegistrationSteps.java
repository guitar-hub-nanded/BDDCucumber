package steps;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class RegistrationSteps {
	@Given("User is at the accounts page")
	public void user_is_at_the_accounts_page() {
	    System.out.println("Pre defined statement");
	}

	@When("User enters the following data")
	public void user_enters_the_following_data(DataTable dataTable) {
	    List<List<String>> data =  dataTable.asLists();
	   List<String> firstList = data.get(0);
	   String lastName = firstList.get(1);
	  // System.out.println(lastName);
	   for(int i=1; i<=firstList.size()-1; i++) {
		   for(int j=0; j<=3; j++) {
			   System.out.println(data.get(i).get(j));
		   }
	   }
	   System.out.println("========================Map===========================");
	   
	   List<Map<String, String>> mapData = dataTable.asMaps();
	  Map<String, String> firstRow = mapData.get(0);
	  String firstname = firstRow.get("name");
	  System.out.println(firstname);
	  System.out.println(mapData);
	   
	}

	@When("user clicks on submit button")
	public void user_clicks_on_submit_button() {
	    System.out.println("form submitted");

	}

	@Then("user should get confirmed")
	public void user_should_get_confirmed() {
	    System.out.println("Account Successfully created");

	}
}
