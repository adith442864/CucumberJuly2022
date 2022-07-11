package stepDefinitions;


import org.junit.runner.RunWith;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefinition {
	
    @Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
        //code to navigate to login url
    	System.out.println("navigated to login url");
    }

    @When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_something(String strArg1, String strArg2) throws Throwable {
       //code to login
    	System.out.println(strArg1);
    	System.out.println(strArg2);
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
        //home page validation
    	System.out.println("validated home page");
    }

    @And("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are_something(String strArg1) throws Throwable {
       System.out.println(strArg1);
    }
    
//    @And("^Cards are not displayed$")
//    public void cards_are_not_displayed() throws Throwable {
//       System.out.println("cards not displayed");
//    }
	
}
	

