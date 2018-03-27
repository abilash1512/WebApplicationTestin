package com.gmailIfElse;

import org.openqa.selenium.firefox.FirefoxDriver;

public class First {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		
		
		String Expectedurl = "google";
		 String actuelurl=driver.getCurrentUrl();
		 
		   if(actuelurl.equals(Expectedurl))
		   {
			   System.out.println("url match-pass");
			   
		   }
		   else 
		   {
			   System.out.println("url notmatch-fail");
		   }
		   
		   
		   String ExpectedTitle="Gmail";
		   
			   
		driver.close();   
		
			
			

	}

}
