package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Library {

	
	
	public static WebDriver driver;
	
	public void browser_Launch() {

		
		WebDriverManager.chromedriver().setup();
		
	 driver =new ChromeDriver();
		
		
		driver.get("https://www.apollohospitals.com/");
		
		driver.manage().window().maximize();
	}
	
}
