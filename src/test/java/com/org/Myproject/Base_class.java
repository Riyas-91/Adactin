package com.org.Myproject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_class {
	
	public static WebDriver driver;
	public static WebDriver getBrowser(String type) {
		
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
			System.getProperty("user.dir")+"//Driver//chromedriver.exe");
			
			driver = new ChromeDriver();
		}
		else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
			System.getProperty("user.dir")+"//Driver//firefoxdriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		return driver;
	}
	public static void url(String url) {
		driver.get(url);
	}
	public static void inputValueElement(WebElement element ,String value) {
		element.sendKeys(value);
	}
	public static void clickOnElement(WebElement element) {
		element.click();
	}
	public static void dropdown(String type,WebElement element ,String value) {
	  Select s1 = new Select(element);
	  
	  if(type.equalsIgnoreCase("index")) {
 		
		  int index = Integer.parseInt(value);
		  s1.selectByIndex(index);
	}
	  
	  else if(type.equalsIgnoreCase("value")) {
		  s1.selectByValue(value);
	  }
	  else if(type.equalsIgnoreCase("text")) {
		  s1.selectByVisibleText(value);
	  }
	

	}

}
