package com.Addactin_Cucumber;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {
	
	public Properties p;
	
	public Configuration_Reader() throws Throwable {
		
		File f = new File
	("C:\\Users\\DELL\\eclipse-workspace\\Amazon\\src\\main\\java\\com\\properties\\Configuration.properties");
		
		FileInputStream fis = new FileInputStream(f);
		
		 p = new Properties();
		
		p.load(fis);
	
	}
	public String geturl() {
		 
		String url = p.getProperty("url");
		
		return url;
	
	}
	public String getusn() {
		
		String usn = p.getProperty("username");
		
		return usn;
	}
	public String getpswd() {
		
		String pswd = p.getProperty("password");
		
		return pswd;
	}
	public String getfn() {
		
		String fn = p.getProperty("firstname");
		
		return fn;
	}
	public String getln() {
		
		String ln = p.getProperty("lastname");
		
		return ln;
		
	}
	public String getadd() {
		
		String add = p.getProperty("address");
		
		return add;
	}
	public String getcc() {
		
		String ccno = p.getProperty("ccno");
		
		return ccno;
	}
	public String getyr() {
		
		String yr = p.getProperty("year");
		
		return yr;
		
	}
	public String getcvv() {
		
		String cvv = p.getProperty("cvv");
		
		return cvv;
		
	}

}
