package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel_P4 {
	public WebDriver driver;
	
	public BookHotel_P4(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "first_name")
	private WebElement firstname;

	public WebElement getFirstname() {
		return firstname;
	}
	
	@FindBy(id = "last_name")
	private WebElement lastname;

	public WebElement getLastname() {
		return lastname;
	}
	
	@FindBy(id = "address")
	private WebElement add;

	public WebElement getAdd() {
		return add;
	}
	
	@FindBy(id = "cc_num")
	private WebElement cardno;

	public WebElement getCardno() {
		return cardno;
	}
	
	@FindBy(id = "cc_type")
	private WebElement cardtype;

	public WebElement getCardtype() {
		return cardtype;
	}
	
	@FindBy(id ="cc_exp_month")
	private WebElement expirym;

	public WebElement getExpirym() {
		return expirym;
	}

	@FindBy(id = "cc_exp_year")
	private WebElement expiryy;

	public WebElement getExpiryy() {
		return expiryy;
	}
	
	@FindBy(id = "cc_cvv")
	private WebElement cvv;

	public WebElement getCvv() {
		return cvv;
	}
	
	@FindBy(id ="book_now")
	private WebElement booknow;

	public WebElement getBooknow() {
		return booknow;
	}
	
	

}
