package com.sd3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Addactin_Cucumber.DataWithoutTable_Runner;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

//DATA TABLE WITHOUT HEADER 
public class Datawithouttable_Steps {
	
	public static WebDriver driver = DataWithoutTable_Runner.driver;
	
	@Given("^user Launch The Application In Chrome Browser$")
	public void user_Launch_The_Application_In_Chrome_Browser() throws Throwable {

	driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^user Enters The Valid$")
	public void user_Enters_The_Valid(DataTable dt) throws Throwable {
		//step--1 DataTable --->import
		//step--2 change DataTable refname
		//step--3 dt.asList(itemType)
		//step--4 dt.asList(String.class)
		//step--5 List<String> cd = dt.asList(String.class);
		//step--6 List<String> cd = dt.asList(String.class);
				  //cd.get(0); take return type
		
		//step--7 List<String> cd = dt.asList(String.class);
				  //String username = cd.get(0);
		
		//step--8 List<String> cd = dt.asList(String.class);
		  		  //String username = cd.get(0);
				  //cd.get(1); take return type
		
		//step--9 List<String> cd = dt.asList(String.class);
				  //String username = cd.get(0);
				  //String password = cd.get(1);
		
		List<String> cd = dt.asList(String.class);
		String username = cd.get(0);
		String password = cd.get(1);
		//step--10
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	
	}

	@When("^user Clicks To Login Button$")
	public void user_Clicks_To_Login_Button() throws Throwable {

		driver.findElement(By.id("btnLogin")).click();
	
	}


}
