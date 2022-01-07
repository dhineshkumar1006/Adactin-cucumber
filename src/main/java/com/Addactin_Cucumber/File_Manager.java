package com.Addactin_Cucumber;

public class File_Manager {
	
	
	
	private File_Manager() {
		
	}
	
	public  Configuration_Reader getinscr() throws Throwable {
		
		Configuration_Reader cr = new Configuration_Reader();
		
		return cr;
	}
	
	public static File_Manager fm() {
		
		File_Manager fmr = new File_Manager();
		
		return fmr;
	}
	
	
	

}
