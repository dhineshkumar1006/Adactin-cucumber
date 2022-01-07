package com.sd1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Addactin_Cucumber.Orange_Runner;
import com.Orange.Hrm.Base_Orange;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Orange_Steps extends Base_Orange {
	
	public static WebDriver driver = Orange_Runner.driver;
	
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {

		
		driver.get("https://opensource-demo.orangehrmlive.com/");
	
	}

	@When("^user Enters The Valid Username And Password$")
	public void user_Enters_The_Valid_Username_And_Password() throws Throwable {

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}

	@When("^user Clicks Login Button$")
	public void user_Clicks_Login_Button() throws Throwable {

		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^user Navigated To Welcome Page$")
	public void user_Navigated_To_Welcome_Page() throws Throwable {
		
		boolean status = driver.findElement(By.linkText("Dashboard")).isDisplayed();
		Assert.assertTrue(status);
	}



}
