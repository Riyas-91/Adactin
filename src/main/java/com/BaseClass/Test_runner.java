package com.BaseClass;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import com.po_manager.Page_Object_Manager;


    public class Test_runner extends Base_Class {

	public static WebDriver driver = getBrowser("chrome");
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	static Logger log = Logger.getLogger(Properties.class);
	
	public static void main(String[] args) throws Throwable {
		
		PropertyConfigurator.configure("log4j.properties");
		url("https://adactinhotelapp.com/index.php");
		
		log.info("url launched");
		
        String username = particular_data("C:\\Users\\riyas\\Desktop\\Mavenproject\\TeamCaptains.xlsx", 2,1,0);
		
		inputValueElement(pom.getInstanceHp().getUsername(), username );
		
		String password = particular_data("C:\\Users\\riyas\\Desktop\\Mavenproject\\TeamCaptains.xlsx",2,1,1);
		
		inputValueElement(pom.getInstanceHp().getPwd(), password);
		
		log.info("Username and password entered");
		clickOnElement(pom.getInstanceHp().getClk());
		log.info("Home page opened");
		
		String city = particular_data("C:\\Users\\riyas\\Desktop\\Mavenproject\\TeamCaptains.xlsx", 2,3,1);
		dropdown("index",pom.getInstanceP2().getLocation(), city );
		
		String hotelname = particular_data("C:\\Users\\riyas\\Desktop\\Mavenproject\\TeamCaptains.xlsx", 2,5,1);
		dropdown("value",pom.getInstanceP2().getHotel(), hotelname);
		
		String hotelclass1 = particular_data("C:\\Users\\riyas\\Desktop\\Mavenproject\\TeamCaptains.xlsx", 2,6,1);
		dropdown("value",pom.getInstanceP2().getRoomtype(),hotelclass1);
		
		dropdown("index",pom.getInstanceP2().getRoomno(),"2");
		clearall(pom.getInstanceP2().getCheckin());
		inputValueElement(pom.getInstanceP2().getCheckin(), "22/12/2021");
		clearall(pom.getInstanceP2().getCheckout());
		inputValueElement(pom.getInstanceP2().getCheckout(), "26/12/2021");
		dropdown("index", pom.getInstanceP2().getAdults(), "2");
		dropdown("index", pom.getInstanceP2().getChilds(), "2");
		clickOnElement(pom.getInstanceP2().getSubmit());
		
		clickOnElement(pom.getInstanceP3().getRadio());
		clickOnElement(pom.getInstanceP3().getContin());
		
		inputValueElement(pom.getInstanceP4().getFirstname(),"Shahid");
		inputValueElement(pom.getInstanceP4().getLastname(), "Afaan");
		inputValueElement(pom.getInstanceP4().getAdd(), "Arasamaram Street");
		inputValueElement(pom.getInstanceP4().getAdd(), "\n");
		inputValueElement(pom.getInstanceP4().getAdd(), "Vembar Patty");
		inputValueElement(pom.getInstanceP4().getAdd(), "\n");
		inputValueElement(pom.getInstanceP4().getAdd(), "Dindigul");
		inputValueElement(pom.getInstanceP4().getAdd(), "\n");
		
		inputValueElement(pom.getInstanceP4().getCardno(), "8908987643273464");
		dropdown("value", pom.getInstanceP4().getCardtype(), "VISA");
		dropdown("index", pom.getInstanceP4().getExpirym(), "5");
		dropdown("value", pom.getInstanceP4().getExpiryy(), "2022");
		inputValueElement(pom.getInstanceP4().getCvv(), "890");
		
		clickOnElement(pom.getInstanceP4().getBooknow());
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		clickOnElement(pom.getInstanceP5().getMyitenary());
		
	   screenshot();
		
		
	}

	
}
