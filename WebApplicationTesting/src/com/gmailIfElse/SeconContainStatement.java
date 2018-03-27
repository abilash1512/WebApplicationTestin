package com.gmailIfElse;

import org.openqa.selenium.firefox.FirefoxDriver;

public class SeconContainStatement {

	public static void main(String[] args) {
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("http://gmail.com");
	
	 String Expectedurl = "google.com";
	String actuelurl =driver.getCurrentUrl();
	
	System.out.println(Expectedurl);
	System.out.println(actuelurl);
	
	if(actuelurl.contains(Expectedurl) ) 
	{
		System.out.println("actuelurl match - pass ");
		
	} 
	
	else
	{
		System.out.println("actuelurl not match - fail");
		
	}
		
	driver.close();
	
	 
			 
	 
	 
			
			

	}

}
