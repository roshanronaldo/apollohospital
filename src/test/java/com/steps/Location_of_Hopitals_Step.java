package com.steps;

import com.pages.Location_of_Hopitals_Page;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Location_of_Hopitals_Step {

	
	@Steps
	Location_of_Hopitals_Page lh;

@When("Scroll down the application to locations section")
public void scroll_down_the_application_to_locations_section() throws InterruptedException {
	
	lh.scroll_down_the_application_to_locations_section();
	
}

@Then("validate the location section")
public void validate_the_location_section() {
	
	lh.validate_the_location_section();
}

@When("Get the address of the hospitals across india")
public void get_the_address_of_the_hospitals_across_india() throws InterruptedException {
	
	
	lh.get_the_address_of_the_hospitals_across_india();
}
	
}
