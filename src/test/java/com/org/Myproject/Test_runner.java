package com.org.Myproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Test_runner extends Base_class {
	
	public static WebDriver driver;

	public static void main(String[] args) throws Throwable {
		driver = getBrowser("chrome");
		
		url("https://adactinhotelapp.com/index.php");
		
		WebElement username = driver.findElement(By.id("username"));
		inputValueElement(username,"Riyas1226");
		
		WebElement pwd = driver.findElement(By.id("password"));
		inputValueElement(pwd ,"Chelsea@1226");
		
		WebElement clk =driver.findElement(By.id("login"));
		clickOnElement(clk);
		
	   WebElement location = driver.findElement(By.id("location"));
	
		dropdown("index",location,"8");
		
		WebElement hotel = driver.findElement(By.xpath("//select[@id='hotels']"));
		
		dropdown("value",hotel,"Hotel Sunshine");
		
		WebElement roomtype = driver.findElement(By.id("room_type"));
		
		dropdown("value",roomtype,"Super Deluxe");
		
		WebElement roomno = driver.findElement(By.id("room_nos"));
	    
		dropdown("index",roomno,"2");
		
		WebElement checkin = driver.findElement(By.xpath("//input[@id='datepick_in']"));
		checkin.clear();
		inputValueElement(checkin ,"25/12/2021");
		
		WebElement checkout = driver.findElement(By.xpath("//input[@id='datepick_out']"));
  		checkout.clear();
  		inputValueElement(checkout ,"28/12/2021");
  		
  		WebElement adults = driver.findElement(By.id("adult_room"));
  		dropdown("index",adults,"2");
  		
  		WebElement childs = driver.findElement(By.xpath("//select[@id='child_room']"));
  		dropdown("index",childs,"2");
  		
  		WebElement submit =driver.findElement(By.xpath("//input[@id='Submit']"));
  		clickOnElement(submit);
  		
  		WebElement radio=driver.findElement(By.id("radiobutton_0"));
  		clickOnElement(radio);
  		
  		WebElement contin=driver.findElement(By.id("continue"));
  		clickOnElement(contin);
  		
  		WebElement fistname = driver.findElement(By.id("first_name"));
  		
  		inputValueElement(fistname, "Shahid");
  		
  		WebElement lastname = driver.findElement(By.id("last_name"));
		
  		inputValueElement(lastname, "Afaan");
  		
  		WebElement add = driver.findElement(By.id("address"));
  		
  		inputValueElement(add, "Arasamaram Street");
  		inputValueElement(add, "\n");
  		inputValueElement(add, "Vembar Patty");
  		inputValueElement(add, "\n");
  		inputValueElement(add, "Dindigul");
  		
  		WebElement cardno = driver.findElement(By.id("cc_num"));
  		inputValueElement(cardno, "8286527888825643");
  		
  		WebElement cardtype = driver.findElement(By.id("cc_type"));
  		
  		dropdown("value", cardtype, "VISA");
  		
  		WebElement expirym = driver.findElement(By.id("cc_exp_month"));
		
  		dropdown("index", expirym, "11");
  		
  		WebElement expiryy = driver.findElement(By.id("cc_exp_year"));
  		
  		dropdown("value", expiryy, "2022");
  		
  	WebElement cvv =driver.findElement(By.id("cc_cvv"));
  	inputValueElement(cvv,"345");

	}

}
