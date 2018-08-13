package com.stepdefinition;

import org.openqa.selenium.WebElement;

import com.ObjectRepository.HomePage;
import com.resources.FunctionalLibrary;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePage1 extends FunctionalLibrary {

@Given("^The Users is in Delta homepage$")
public void the_Users_is_in_Delta_homepage() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver.get("https://www.delta.com/");
}

@Given("^The Users clicks the Roundtrip button$")
public void the_Users_clicks_the_Roundtrip_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	HomePage1 home = new HomePage1();
	
	
	click(home.getBtnroundtrip());

}

@When("^The Users enters the input for origin,destination and journey date and Return date$")
public void the_Users_enters_the_input_for_origin_destination_and_journey_date_and_Return_date(DataTable arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
}

@When("^The users clicks find a flight button$")
public void the_users_clicks_find_a_flight_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
}

@Then("^The users should be in search results page$")
public void the_users_should_be_in_search_results_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
}



}
