package com.org.Myproject;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Runner_class {
	
	static Logger log = Logger.getLogger(Runner_class.class);

	public static void main(String[] args) throws InterruptedException, Throwable {
		
		PropertyConfigurator.configure("log4j.properties");
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"//Driver//chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
         driver.get("https://adactinhotelapp.com/index.php");
         driver.manage().window().maximize();
 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 		
 		log.info("Webaddress launch successfully");
 	//String url =	driver.getCurrentUrl();
 	//System.out.println("WebsiteName:"+" "+url);
 	System.out.println(" ");
 		
 		WebElement username = driver.findElement(By.id("username"));
 		username.sendKeys("Riyas1226");
 		Thread.sleep(2000);
 		WebElement pwd = driver.findElement(By.id("password"));
 		pwd.sendKeys("Chelsea@1226");
 		
 		log.info("Username & Password entered successfully");
 		Thread.sleep(2000);
 		
 		driver.findElement(By.id("login")).click();
 		
 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 		
 		WebElement location = driver.findElement(By.id("location"));
 		Select s1 = new Select(location);
 		s1.selectByVisibleText("Paris");
 		String city = s1.getFirstSelectedOption().getText();
 		//System.out.println("Selected City:"+" "+city);
 		log.info("City Selected Successfully");
 		System.out.println(" ");
 		
 		Thread.sleep(2000);
 		WebElement hotel = driver.findElement(By.xpath("//select[@id='hotels']"));
 		Select s2 = new Select(hotel);
 		s2.selectByVisibleText("Hotel Sunshine");
 		String venue = s2.getFirstSelectedOption().getText();
 		//System.out.println("Selected Hotel:"+" "+venue);
 		log.info("Hotel Selected Successfully");
 		System.out.println(" ");
 		
 		Thread.sleep(2000);
 		
 		WebElement roomtype = driver.findElement(By.id("room_type"));
 		Select s3 = new Select(roomtype);
 		s3.selectByVisibleText("Super Deluxe");
 		String roomname = s3.getFirstSelectedOption().getText();
 		//System.out.println("Room_Type:"+" "+roomname);
 		
 		log.info("Roomtype Selected Successfully");
 		System.out.println(" ");
 		
 		Thread.sleep(2000);
 		
 		WebElement roomno = driver.findElement(By.id("room_nos"));
 		Select s4 = new Select(roomno);
 		s4.selectByIndex(2);
 		String totalrooms = s4.getFirstSelectedOption().getText();
 		//System.out.println("Total Rooms:"+" "+totalrooms);
 		log.info("Total Rooms selected Successfully");
 		System.out.println(" ");
 		
 		Thread.sleep(2000);
 		
 		WebElement checkin = driver.findElement(By.xpath("//input[@id='datepick_in']"));
 		checkin.clear();
 		Thread.sleep(2000);
 		checkin.sendKeys("02/12/2021");
 		Thread.sleep(2000);
 		String d1 = checkin.getAttribute("value");
 		//System.out.println("CheckinDate:"+" "+d1);
 		
 		log.info("Check In Date entered successfully");
 		System.out.println(" ");
 		
 		
 		WebElement checkout = driver.findElement(By.xpath("//input[@id='datepick_out']"));
 		checkout.clear();
 		Thread.sleep(1000);
 		checkout.sendKeys("06/12/2021");
 		String d2 = checkout.getAttribute("value");
 		//System.out.println("CheckoutDate:"+" "+d2);
 		log.info("Check Out Date entered successfully");
 		System.out.println(" ");
 		
 		WebElement adults = driver.findElement(By.id("adult_room"));
 		Select s5 = new Select(adults);
 		s5.selectByIndex(2);
 		String adultno = s5.getFirstSelectedOption().getText();
 		//System.out.println("Total Adults:"+" "+adultno);
 		log.info("Total Adults entered successfully");
 		System.out.println(" ");
 		
 		WebElement childs = driver.findElement(By.xpath("//select[@id='child_room']"));
 		Select s6 = new Select(childs);
 		s6.selectByIndex(1);
 		String childno = s6.getFirstSelectedOption().getText();
 	//	System.out.println("Total Childs:"+" "+childno);
 		log.info("Total Child entered successfully");
 		System.out.println(" ");
 		Thread.sleep(2000);
 		
 		driver.findElement(By.xpath("//input[@id='Submit']")).click();
 		
 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 		
 		driver.findElement(By.id("radiobutton_0")).click();
 		driver.findElement(By.id("continue")).click();
 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 		WebElement fistname = driver.findElement(By.id("first_name"));
 		fistname.sendKeys("Riyas");
 		String fname = fistname.getAttribute("value");
 		//System.out.println("CustomerName:"+" "+fname);
 		
 		WebElement lastname = driver.findElement(By.id("last_name"));
 		lastname.sendKeys("Afaan");
 		
 		WebElement add = driver.findElement(By.id("address"));
 		add.sendKeys("Arasamaram Street");
 		add.sendKeys("\n");
 		add.sendKeys("Vembarpatty");
 		add.sendKeys(" ");
 		add.sendKeys("Dindigul");
 		Thread.sleep(1000);
 		
 		WebElement cardno = driver.findElement(By.id("cc_num"));
 		cardno.sendKeys("8286627812346276");
 		
 		WebElement cardtype = driver.findElement(By.id("cc_type"));
 		Select s7 = new Select(cardtype);
 		s7.selectByVisibleText("VISA");
 		
 		WebElement expirym = driver.findElement(By.id("cc_exp_month"));
 		Select s8 = new Select(expirym);
 		s8.selectByVisibleText("April");
 		
 		
 		WebElement expiryy = driver.findElement(By.id("cc_exp_year"));
 		Select s9 = new Select(expiryy);
 		s9.selectByVisibleText("2022");
 		Thread.sleep(1000);
 		
 		driver.findElement(By.id("cc_cvv")).sendKeys("756");
 		Thread.sleep(2000);
 		driver.findElement(By.id("book_now")).click();
 		
 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 		
 		driver.findElement(By.xpath("//input[@id='my_itinerary']")).click();
 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 		
 		TakesScreenshot t =(TakesScreenshot) driver;
		File s = t.getScreenshotAs(OutputType.FILE);
		File d = new File("C:\\Users\\riyas\\Desktop\\Myproject\\paris1.png");
	//FileUtils.copyFile(s, d);
		FileHandler.copy(s, d);
		
		

	}

}
