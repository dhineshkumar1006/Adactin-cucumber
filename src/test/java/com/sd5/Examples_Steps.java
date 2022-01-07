package com.sd5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Addactin_Cucumber.Examples_Runner;
import com.Orange.Hrm.Base_Orange;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Examples_Steps extends Base_Orange {
	
	public static WebDriver driver = Examples_Runner.driver;
	
	@Given("^Launching The Application In Chrome Browser$")
	public void launching_The_Application_In_Chrome_Browser() throws Throwable {

		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^user Enters The \"([^\"]*)\" And \"([^\"]*)\"$")
	public void user_Enters_The_And(String Usn, String Pswd) throws Throwable {

		driver.findElement(By.id("txtUsername")).sendKeys(Usn);
		driver.findElement(By.id("txtPassword")).sendKeys(Pswd);
	}

	@When("^user Clicks To Login Button For Signin$")
	public void user_Clicks_To_Login_Button_For_Signin() throws Throwable {

		driver.findElement(By.id("btnLogin")).click();
	}




}
