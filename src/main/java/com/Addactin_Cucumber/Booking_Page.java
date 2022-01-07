package com.Addactin_Cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath = "(//input[@type='text'])[11]")
	private WebElement firstname;
	
	@FindBy(xpath = "(//input[@type='text'])[12]")
	private WebElement lastname;
	
	@FindBy(id = "address")
	private WebElement add;
	
	@FindBy(xpath = "(//input[@type='text'])[13]")
	private WebElement ccno;
	
	@FindBy(id = "cc_type")
	private WebElement cardtype;
	
	@FindBy(id = "cc_exp_month")
	private WebElement month;
	
	@FindBy(id = "cc_exp_year")
	private WebElement year;
	
	@FindBy(xpath = "(//input[@type='text'])[14]")
	private WebElement cvv;
	
	@FindBy(xpath = "(//input[@type='button'])[1]")
	private WebElement booknow;
	
	public Booking_Page(WebDriver driver2) {
	
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getCcno() {
		return ccno;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBooknow() {
		return booknow;
	}

	

}
