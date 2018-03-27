package com.UrlValidation;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidatingFaceBookUrl {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		String ExpectedUrl="facebook.com"; // Client Requirement
		
		String ActualUrl=driver.getCurrentUrl();
		
		System.out.println(ExpectedUrl);
		System.out.println(ActualUrl);
		
	    if(ActualUrl.contains(ExpectedUrl))
	    {
	    	System.out.println("URL Matched -- PASS");
	    }
	    else
	    {
	    	System.out.println("URL not matched -- FAIL");
	    }
	    	
	    driver.close();

	}

}
