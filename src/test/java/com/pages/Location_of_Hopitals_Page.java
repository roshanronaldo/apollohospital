package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class Location_of_Hopitals_Page extends PageObject{

	
	
	
	
	@Step
	
	//Scroll down the application to locations section
	
	public void scroll_down_the_application_to_locations_section() throws InterruptedException {
		
		
		
		
		
		 WebElementFacade location = $(By.xpath("//h4[text()='LOCATION']"));
		 
		 
		 
		 JavascriptExecutor js= (JavascriptExecutor) getDriver();
		 
		 
		 js.executeScript("arguments[0].scrollIntoView(true)", location);
		
		Thread.sleep(4000);
		
	}

	@Step
	
	//validate the location section
	public void validate_the_location_section() {
		

		String text = $(By.xpath("//h4[text()='LOCATION']")).getText();
		
		
		Assert.assertEquals(text, "LOCATION");
		
	}

	@Step
	
	//Get the address of the hospitals across india
	public void get_the_address_of_the_hospitals_across_india() throws InterruptedException {
		
		//  ((//div[@class='row justify-content-center'])[5]/div/div/div/a)[1]
		
		List<WebElement> els = getDriver().findElements(By.xpath("(//div[@class='row justify-content-center'])[5]/div/div/div/a"));
		
		for (int i = 0; i <=els.size()-2; i++) {
			
			
		
			 
			 
			String text = els.get(i).getText();	
			
			  String address = $(By.xpath("((//div[@class='py-3']/div/div/div/div)[1]/div)[2]")).getText();
			  
			  System.out.println(text+"\n"+"------------"+"\n"+address+"\n");
			  
				els.get(i+1).click();
			
			Thread.sleep(2000);
		}
		
		
	}
	
	
}
