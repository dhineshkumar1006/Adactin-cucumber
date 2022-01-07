package com.Addactin_Cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Amazon {
	
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
	public static void url(String type) {
		
		driver.get(type);
	}
	public static void inputvalue(WebElement element,String text) {
		
		element.sendKeys(text);
		
	}
	public static void getclick(WebElement element) {
		
		element.click();
	}
	public static void selectvisibletext(WebElement element,String text) {
		
		Select vt = new Select(element);
		vt.selectByVisibleText(text);
//		if (text.equalsIgnoreCase("text")) {
//			
//			s.selectByVisibleText(text);
//		}
//		else if (index.equalsIgnoreCase("index")) {
//			
//			int number = Integer.parseInt(index);
//			
//			s.selectByIndex(number);
//			
//		}
//		else if (value.equalsIgnoreCase("value")) {
//			
//			s.selectByValue(value);
//			
//		}
		
	}
	public static void selectindex(WebElement element,String index) {
		
		Select ind = new Select(element);
		
		int number = Integer.parseInt(index);
		
		ind.selectByIndex(number);
	}
	public static void selectvalue(WebElement element,String value) {
		
		Select txt = new Select(element);
		
		txt.selectByValue(value);
	}
	public static void getsleep(long millis) throws InterruptedException {
		
		Thread.sleep(millis);
	}
				
			
		}
			
				
			
			
		
		
		
	
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


