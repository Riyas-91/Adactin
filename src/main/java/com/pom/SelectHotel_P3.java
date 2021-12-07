package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel_P3 {
	public WebDriver driver;
	
	public SelectHotel_P3(WebDriver driver2) {
		 this.driver = driver2;
			PageFactory.initElements(driver, this);
	}
	
	@FindBy(id ="radiobutton_0")
	private WebElement radio;

	public WebElement getRadio() {
		return radio;
	}
	
	@FindBy(id ="continue")
	private WebElement contin;

	public WebElement getContin() {
		return contin;
	}


	
	

}
