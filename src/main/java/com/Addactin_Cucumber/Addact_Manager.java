package com.Addactin_Cucumber;

import org.openqa.selenium.WebDriver;

public class Addact_Manager {
	
	public WebDriver driver;
	
	private Login_Page lp;
	
	private Select_hotel sh;
	
	private Home_Page hp;
	
	private Booking_Page bp;
	
	public Addact_Manager(WebDriver driver2) {
	
		this.driver=driver2;
	
	}

	public Booking_Page getbp() {
		
		if (bp==null) {
			
			 bp = new Booking_Page(driver);
			
		}
		return bp;
		
	}
	
	public Select_hotel getsh() {
		
		if (sh==null) {
			
			 sh = new Select_hotel(driver);
			
		}
		return sh;
	}
	
	public Home_Page gethp() {
		
		if (hp==null) {
			
			 hp = new Home_Page(driver);
			
		}
		return hp;
	}
	
	public Login_Page getinstancelp() {
		
		if (lp==null) {
			
			 lp = new Login_Page(driver);
			
		}
		return lp;
		
	}
	
	
}
