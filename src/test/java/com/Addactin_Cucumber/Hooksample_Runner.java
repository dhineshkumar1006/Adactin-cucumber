package com.Addactin_Cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature\\Hooks.feature",
	
		monochrome = true,
		
		dryRun = false,
		
		strict = true,
		
		glue = "com.sd6",
		
		tags = ("@Hooks") 
		)

public class Hooksample_Runner {
	
	

}
