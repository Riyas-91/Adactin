package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	public WebDriver driver; //null
	
	@FindBy(id = "username")
	private WebElement username;
	
	public WebElement getUsername() {
		return username;
	}

	@FindBy(id = "password")
	private WebElement pwd;
	
	public WebElement getPwd() {
		return pwd;
	}

	@FindBy(id = "login")
	private WebElement clk;
	
	public WebElement getClk() {
		return clk;
	}

	public Home_Page(WebDriver driver2) {
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}

}
