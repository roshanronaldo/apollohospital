package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class Search_Page extends PageObject{

	
	@Step
	//Search the doctors or hospital  in search box
	public void search_the_doctors_or_hospital_in_search_box() {
		
		$(By.id("search")).type("orthopedician");
	}

	@Step
	
	//Click the search icon")
	public void click_the_search_icon() {
		
		$(By.id("srch-submit")).click();
	}

	@Step
	//validate the result page
	public void validate_the_result_page() {
		
		
		boolean displayed = $(By.xpath("//div[text()='12 Total Results For \"']")).isDisplayed();
		
		
		Assert.assertTrue(displayed);
	}

	@Step
	//print the orthopredician name in consol
	public void print_the_orthopredician_name_in_consol() {
		
		for (int i = 1; i <12; i++) {
			
		
		
		String text = $(By.xpath("(//h2/a)["+i+"]")).getText();
		
		System.out.println(text);
		}
	}
	
	
}
