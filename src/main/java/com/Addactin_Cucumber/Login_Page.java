package com.Addactin_Cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	public WebDriver driver;//null
	

	
	@FindBy(xpath = "(//input[@type='text'])")
	private WebElement usn;
	
	@FindBy(xpath = "(//input[@type='password'])")
	private WebElement pswd;
	
	@FindBy(xpath = "(//input[@type='Submit'])")
	private WebElement login;
	
	
	
	public Login_Page(WebDriver driver2) {
		
		this.driver = driver2;
	
		PageFactory.initElements(driver, this);
	
	}

	public WebElement getUsn() {
		return usn;
	}

	public WebElement getPswd() {
		return pswd;
	}

	public WebElement getLogin() {
		return login;
	}
	

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
