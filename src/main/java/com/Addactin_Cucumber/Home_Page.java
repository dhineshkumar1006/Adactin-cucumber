package com.Addactin_Cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	public WebDriver driver;//---null
	
	@FindBy(id = "location")
	private WebElement location;
	
	@FindBy(id = "hotels")
	private WebElement hotel;
	
	@FindBy(id = "room_type")
	private WebElement roomtype;
	
	@FindBy(id = "room_nos")
	private WebElement noofroom;
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement indate;
	
	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement outdate;
	
	@FindBy(id = "adult_room")
	private WebElement adperroom;
	
	@FindBy(id = "child_room")
	private WebElement childperroom;
	
	@FindBy(xpath = "(//input[@type='submit'])")
	private WebElement search;
	
	

	public Home_Page(WebDriver driver2) {
	
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNoofroom() {
		return noofroom;
	}

	public WebElement getIndate() {
		return indate;
	}

	public WebElement getOutdate() {
		return outdate;
	}

	public WebElement getAdperroom() {
		return adperroom;
	}

	public WebElement getChildperroom() {
		return childperroom;
	}

	public WebElement getSearch() {
		return search;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	

}
