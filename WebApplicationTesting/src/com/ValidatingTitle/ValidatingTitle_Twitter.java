package com.ValidatingTitle;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidatingTitle_Twitter {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://twitter.com");
		
		 String expectedTitle="Twitter. It's what's happening";
		  String actualTitle=driver.getTitle();
		  
		 System.out.println(actualTitle);
		 System.out.println(expectedTitle);
		 
		 if(actualTitle.equals(expectedTitle))
		 {
			 System.out.println("title match - Pass");
			 
		 }
		 else
		 {
			 System.out.println("title not match - fail");
		 }
		 driver.close();
			 
			 
			 
		
		
		
	}

}
