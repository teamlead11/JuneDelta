package com.stepdefinition;

import org.openqa.selenium.By;

import com.ObjectRepository.HomePage;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class HomePageSteps extends FunctionalLibrary {
	  HomePage home;
	@Given("^The User is in Delta homepage$")
	public void the_User_is_in_Delta_homepage() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.get("https://www.delta.com/");
		 home=new HomePage();
	}

	@Given("^The User clicks the OneWay button$")
	public void the_User_clicks_the_OneWay_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		home.getBtnOneWay().click();
	}

	@When("^The User enters the input for origin,destination and journey date$")
	public void the_User_enters_the_input_for_origin_destination_and_journey_date() throws Throwable {
	
		home.getBtnOrigin().clear();
		home.getBtnOrigin().sendKeys("BHM");
		home.getBtnDestination().clear();
		home.getBtnDestination().sendKeys("PHX");
		home.getBtnDate().sendKeys("08/11/2018");
		
	
	}

	@When("^The user clicks find a flight button$")
	public void the_user_clicks_find_a_flight_button() throws Throwable {
home.getBtnFindFlight().click();
	}

	@Then("^The user should be in search results page$")
	public void the_user_should_be_in_search_results_page() throws Throwable {
Assert.assertEquals("Flight Results : Find & Book Airline Tickets : Delta Air Lines",driver.getTitle());	}

}
