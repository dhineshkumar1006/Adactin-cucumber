package com.Addactin_Cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_hotel {
	
	public WebDriver driver;
	
	@FindBy(id = "radiobutton_0")
	private WebElement btn;
	
	public Select_hotel(WebDriver driver2) {
	
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	
		
	}

	public WebElement getBtn() {
		return btn;
	}

	public WebElement getCont() {
		return cont;
	}

	@FindBy(xpath = "(//input[@type='submit'])")
	private WebElement cont;

}
