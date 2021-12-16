package com.po_manager;

import org.openqa.selenium.WebDriver;

import com.pom.BookHotel_P4;
import com.pom.Confirmation_P5;
import com.pom.Home_Page;
import com.pom.Search_Hotel_P2;
import com.pom.SelectHotel_P3;

public class Page_Object_Manager {
	
	public Page_Object_Manager(WebDriver driver2) {
		this.driver = driver2;
	}

	public WebDriver driver; //--->null
	
	private Home_Page hp;
	
	private Search_Hotel_P2 p2;
	
	private SelectHotel_P3 p3; 
	
	private BookHotel_P4 p4;
	
    private	Confirmation_P5 p5;
    
    
    
    public Home_Page getInstanceHp() {
    	
    	if (hp == null) {
    		hp = new Home_Page(driver);
    	}
    	
		return hp;
    	
    	 }
    
    public Search_Hotel_P2 getInstanceP2() {
    	
    	if (p2 == null) {
    		p2 = new Search_Hotel_P2(driver);
    	}
		return p2;
    	
    }
    
    public SelectHotel_P3 getInstanceP3() {
    	
    	if (p3 == null) {
    		p3 = new SelectHotel_P3(driver);
    	}
		return p3;
    }
    
    public BookHotel_P4 getInstanceP4() {
    	
    	if (p4 == null) {
    		
    		p4 = new BookHotel_P4(driver);
    	}
		return p4;
    }
    
    public Confirmation_P5 getInstanceP5() {
    	
    	if (p5 == null) {
    		
    		p5 = new Confirmation_P5(driver);
    	}
		return p5;
    }
    
    

}
