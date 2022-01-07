package com.Addactin_Cucumber;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Orange.Hrm.Base_Orange;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features =

		"src\\test\\java\\com\\adactin\\feature\\Examples.feature",
		
		glue = "com.sd5"
		)

public class Examples_Runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void esetup() {
		
		driver = Base_Orange.getbrowser("chrome");
	}

	public static void eteardown() {
		
		driver.close();
	}
}
