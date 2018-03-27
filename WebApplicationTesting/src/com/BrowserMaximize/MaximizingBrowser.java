package com.BrowserMaximize;

import org.openqa.selenium.firefox.FirefoxDriver;

public class MaximizingBrowser {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		driver.manage().window().maximize();
		
		driver.close();

	}

}
