package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel_P2 {
	
	public WebDriver driver;
	public Search_Hotel_P2(WebDriver driver2) {
        this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id ="location")
	private WebElement location;

	public WebElement getLocation() {
		return location;
	}
	
	@FindBy(xpath ="//select[@id='hotels']")
	private WebElement hotel;

	public WebElement getHotel() {
		return hotel;
	}
	
	@FindBy(id ="room_type")
	private WebElement roomtype;
	public WebElement getRoomtype() {
		return roomtype;
	}
	
	@FindBy(id ="room_nos")
	private WebElement roomno;
	public WebElement getRoomno() {
		return roomno;
	}
	@FindBy(xpath ="//input[@id='datepick_in']")
	private WebElement checkin;
	public WebElement getCheckin() {
		return checkin;
	}
	
	@FindBy(xpath ="//input[@id='datepick_out']")
	private WebElement checkout;
	public WebElement getCheckout() {
		return checkout;
	}
	
	@FindBy(id ="adult_room")
	private WebElement adults;
	public WebElement getAdults() {
		return adults;
	}
	
	@FindBy(xpath = "//select[@id='child_room']")
	private WebElement childs;
	public WebElement getChilds() {
		return childs;
	}
	
	@FindBy(xpath = "//input[@id='Submit']")
	private WebElement submit;
	public WebElement getSubmit() {
		return submit;
	}
	
	
	

}
