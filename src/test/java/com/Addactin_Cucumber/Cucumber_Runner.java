package com.Addactin_Cucumber;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\java\\com\\adactin\\feature\\adactin.feature",

		glue = "com.sd",
		
		monochrome = true,
		
		dryRun = false,
		
		strict = true,
		
		plugin = {
				
				"html:Report/Html_Report",
				"pretty",
				"json:Reports/jsonReport.json"
		}
		
		)


public class Cucumber_Runner {
	
	public static WebDriver driver;
	@BeforeClass
	public static void set_up() {
		
		driver = Base_Amazon.getbrowser("chrome");
		
	}
	@AfterClass
	public static void Tear_down() {
		
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
