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

		"src\\test\\java\\com\\adactin\\feature\\Orange.feature",
		
		glue = "com.sd1",
		
		monochrome = true,
		
		dryRun = false,
		
		strict = true,
		
				plugin = {
						
						"html:Report/Html_Report",
						"pretty",
						"json:Reports/jsonReport.json"
				}
		
	
		)

public class Orange_Runner   {
	
	
	public static WebDriver driver;
	@BeforeClass
	public static void Set_Up() {
		
		driver = Base_Orange.getbrowser("chrome");
		
		
	}
	@AfterClass
	public static void Tear_Down() {
		
		driver.close();
	}

}
