package com.sd2;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Addactin_Cucumber.Ora_DataRunner;
import com.Orange.Hrm.Base_Orange;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Orangedatasetup extends Base_Orange {
	
	public static WebDriver driver = Ora_DataRunner.driver;
	
	@Given("^user Launch The Application In Chrome$")
	public void user_Launch_The_Application_In_Chrome() throws Throwable {

		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^user Enters The Valid \"([^\"]*)\" And \"([^\"]*)\"$")
	public void user_Enters_The_Valid_And(String username, String password) throws Throwable {

		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	
	}

	@When("^user Click Login Button$")
	public void user_Click_Login_Button() throws Throwable {

		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^user Navigates To Welcome Page$")
	public void user_Navigates_To_Welcome_Page() throws Throwable {

		boolean status = driver.findElement(By.linkText("Dashboard")).isDisplayed();
		Assert.assertTrue(status);
	}



}
