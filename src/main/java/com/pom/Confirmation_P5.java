package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirmation_P5 {
	WebDriver driver;
	
	public Confirmation_P5(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "my_itinerary")
	private WebElement myitenary;

	public WebElement getMyitenary() {
		return myitenary;
	} 

	
	

}
