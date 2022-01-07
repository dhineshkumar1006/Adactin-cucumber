package com.Orange.Hrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Orange {
	
public static WebDriver driver;//null
	
	public static  WebDriver getbrowser(String type) {
		
		if (type.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", 
					System.getProperty("user.dir")+"//driver//chromedriver.exe");
			
			 driver = new ChromeDriver();
			
		}
		else if (type.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", 
					System.getProperty("user.dir")+"//driver//firefoxdriver.exe");
			
			 driver = new ChromeDriver();
			
		}
		return driver;
	}

}
