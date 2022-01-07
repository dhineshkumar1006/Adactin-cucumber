package com.Addactin_Cucumber;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Orange.Hrm.Base_Orange;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//DATA TABLE WITHOUT HEADER 
@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature\\Datawotable.feature",

		glue = "com.sd3"
		)

public class DataWithoutTable_Runner {
	
	public static WebDriver driver;
	@BeforeClass
	public static void Dwotsetup() {
		
		driver = Base_Orange.getbrowser("chrome");
	}
	@AfterClass
	public static void Dwotteardown() {
		
		driver.close();
	}

}
