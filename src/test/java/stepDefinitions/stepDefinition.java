package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinition {

	@Given("^user is on banking landing page$")
	
	public void user_is_on_banking_landing_page() throws Throwable {
		
		// code to navigate to login url
		System.out.println("I am at the homepage");
		
	}
	
	
	@When("^user login into application with username and password$")  
	
	public void user_login_into_application_with_username_and_password() throws Throwable {
		
	// code to log in 
		System.out.println("username & password entered");
		
		
	}
	
	@When("user login into application with {string} and {string}")
	public void user_login_into_application_with_and(String string, String string2) {
		
		System.out.println("username= " + string + "& password=" + string2 +" entered");
	  
	}
	
	
	@Then("^home page is populated$")
	
	public void home_page_is_populated() throws Throwable {
		
		// code for home page validation
		
		System.out.println("amount 300£");
		
	}
	
	@And("^cards are displayed$") 
	
	public void cards_are_displayed() throws Throwable {
		
		
		System.out.println("credit card 434345560604440 displayed ");
		
	}
	

	@And("cards not displayed")
	public void cards_not_displayed() {
		
		System.out.println("credit card error ");
	 
	}
	
	
	
	
}
