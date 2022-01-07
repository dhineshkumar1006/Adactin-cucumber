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

		"src\\test\\java\\com\\adactin\\feature\\datawithheader.feature",
		
		glue = "com.sd4"
		)

public class DatawithHeader_Runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void dwhsetup() {
		
		driver = Base_Orange.getbrowser("chrome");
		
	}
	@AfterClass
	public static void dwhteardown() {
		
		driver.close();
	}

}
