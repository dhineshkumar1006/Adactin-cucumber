package com.sd4;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Addactin_Cucumber.DatawithHeader_Runner;
import com.Orange.Hrm.Base_Orange;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DatawithHeader_Steps extends Base_Orange {
	
	public static WebDriver driver = DatawithHeader_Runner.driver;
	
	@Given("^Launch The Application In Chrome Browser$")
	public void launch_The_Application_In_Chrome_Browser() throws Throwable {

		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^user Enters The Valid Credentials$")
	public void user_Enters_The_Valid_Credentials(DataTable wh) throws Throwable {
		
		//step--1--wh.asMaps(keyType, valueType)
		//step--2--wh.asMaps(String.class, String.class)
					//take return type
		//step--3--List<Map<String, String>>cdl = wh.asMaps(String.class, String.class);
		//step--4--List<Map<String, String>>cdl = wh.asMaps(String.class, String.class);
				   //cdl.get(0).get("Username") take return type
		//step--5--List<Map<String, String>>cdl = wh.asMaps(String.class, String.class);
				   //String usn = cdl.get(0).get("Username");
		//step--6--List<Map<String, String>>cdl = wh.asMaps(String.class, String.class);
				   //String usn = cdl.get(0).get("Username");
				   //cdl.get(0).get("PassWord") take return type
		//step--7--List<Map<String, String>>cdl = wh.asMaps(String.class, String.class);
				   //String usn = cdl.get(0).get("Username");
					//String pswd = cdl.get(0).get("PassWord");
		
		
		List<Map<String, String>>cdl = wh.asMaps(String.class, String.class);
		String usn = cdl.get(0).get("Username");
		String pswd = cdl.get(0).get("PassWord");
		
		//step--8
		driver.findElement(By.id("txtUsername")).sendKeys(usn);
		driver.findElement(By.id("txtPassword")).sendKeys(pswd);
		
		
		
	}

	@When("^user Clicks To Login Button For Login$")
	public void user_Clicks_To_Login_Button_For_Login() throws Throwable {

		driver.findElement(By.id("btnLogin")).click();
	}



}
