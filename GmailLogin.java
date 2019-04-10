package cucumberDemo.cucumberDemo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GmailLogin {
	@Given("^User on gmail login page$")
	public void user_on_gmail_login_page()  {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^click on login$")
	public void click_on_login()  {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^successfully login to gmail$")
	public void successfully_login_to_gmail()  {
	    // Write code here that turns the phrase above into concrete actions
	   
	}


}
