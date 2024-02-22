package com.steps;

import org.openqa.selenium.WebDriver;

import com.base.Library;
import com.pages.Search_Page;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Search_Steps{

	
	@Managed
	
	WebDriver driver;

	
	@Steps
	Search_Page s;
	

@Given("Launch the apollo hospital application")
public void launch_the_apollo_hospital_application() {
	driver.get("https://www.apollohospitals.com/");
	
	driver.manage().window().maximize();

	
}

@When("Search the doctors or hospital  in search box")
public void search_the_doctors_or_hospital_in_search_box() {
	
	s.search_the_doctors_or_hospital_in_search_box();
}

@When("Click the search icon")
public void click_the_search_icon() {
	
	s.click_the_search_icon();
}

@Then("validate the result page")
public void validate_the_result_page() {
	
	
	s.validate_the_result_page();
}

@When("print the orthopredician name in consol")
public void print_the_orthopredician_name_in_consol() {
	
	s.print_the_orthopredician_name_in_consol();
}
}
