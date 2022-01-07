package com.Addactin_Cucumber;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Orange.Hrm.Base_Orange;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = 

		"src\\test\\java\\com\\adactin\\feature\\odata.feature",
		
		glue = "com.sd2")

public class Ora_DataRunner {
	
	public static WebDriver driver;
	@BeforeClass
	public static void setup() {
		
		driver = Base_Orange.getbrowser("chrome");
	}
	@AfterClass
	public static void teardown() {
		
		driver.close();
		
	}
}
