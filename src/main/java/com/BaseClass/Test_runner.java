package com.BaseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.pom.BookHotel_P4;
import com.pom.Confirmation_P5;
import com.pom.Home_Page;
import com.pom.Search_Hotel_P2;
import com.pom.SelectHotel_P3;

public class Test_runner extends Base_Class {

	public static WebDriver driver = getBrowser("chrome");
	
	public static Home_Page hp = new Home_Page(driver);
	
	public static Search_Hotel_P2 sh = new Search_Hotel_P2(driver);
	
	public static SelectHotel_P3 p3 = new SelectHotel_P3(driver);
	
	public static BookHotel_P4 p4 = new BookHotel_P4 (driver);
	
	public static Confirmation_P5 p5 = new Confirmation_P5(driver);
	
	public static void main(String[] args) {
		
		url("https://adactinhotelapp.com/index.php");
		
		inputValueElement(hp.getUsername(), "Riyas1226");
		
		inputValueElement(hp.getPwd(), "Chelsea@1226");
		
		clickOnElement(hp.getClk());
		
		dropdown("index",sh.getLocation(), "8" );
		dropdown("value",sh.getHotel(), "Hotel Sunshine");
		dropdown("value",sh.getRoomtype(),"Super Deluxe");
		dropdown("index", sh.getRoomno(),"2");
		clearall(sh.getCheckin());
		inputValueElement(sh.getCheckin(), "12/12/2021");
		clearall(sh.getCheckout());
		inputValueElement(sh.getCheckout(), "14/12/2021");
		dropdown("index", sh.getAdults(), "2");
		dropdown("index", sh.getChilds(), "2");
		clickOnElement(sh.getSubmit());
		
		clickOnElement(p3.getRadio());
		clickOnElement(p3.getContin());
		
		inputValueElement(p4.getFirstname(),"Shahid");
		inputValueElement(p4.getLastname(), "Afaan");
		inputValueElement(p4.getAdd(), "Arasamaram Street");
		inputValueElement(p4.getAdd(), "\n");
		inputValueElement(p4.getAdd(), "Vembar Patty");
		inputValueElement(p4.getAdd(), "\n");
		inputValueElement(p4.getAdd(), "Dindigul");
		inputValueElement(p4.getAdd(), "\n");
		
		inputValueElement(p4.getCardno(), "8908987643273464");
		dropdown("value", p4.getCardtype(), "VISA");
		dropdown("index", p4.getExpirym(), "5");
		dropdown("value", p4.getExpiryy(), "2022");
		inputValueElement(p4.getCvv(), "890");
		
		clickOnElement(p4.getBooknow());
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		clickOnElement(p5.getMyitenary());
		
		
		
	}
}
