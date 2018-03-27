package com.linksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePageLinks_Testing {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
				
		List<WebElement>laddu=driver.findElements(By.tagName("a"));
		
		System.out.println(laddu.size());
		
		for(int i=0;i<laddu.size();i++)
		{
		String linkName=laddu.get(i).getText();
		System.out.println(linkName);
		
		laddu.get(i).click();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		
		driver.navigate().back();
		//recreating the array again since the informations stored in the array is cleared
		laddu=driver.findElements(By.tagName("a"));
		
				
		}
		
		driver.close();

	}

}
