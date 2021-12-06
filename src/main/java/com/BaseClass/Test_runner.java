package com.BaseClass;

import org.openqa.selenium.WebDriver;

import com.pom.Home_Page;

public class Test_runner extends Base_Class {

	public static WebDriver driver = getBrowser("chrome");
	
	public static Home_Page hp = new Home_Page(driver);
	
	public static void main(String[] args) {
		
		url("https://adactinhotelapp.com/index.php");
		
		inputValueElement(hp.getUsername(), "Riyas1226");
		
		inputValueElement(hp.getPwd(), "Chelsea@1226");
		
		clickOnElement(hp.getClk());
	}
}
