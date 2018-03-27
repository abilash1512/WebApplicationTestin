package com.linksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TSRTC_Block_LinksCount {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.tsrtconline.in/oprs-web/");
		
		WebElement HeaderBlock=driver.findElement(By.className("menu-wrap"));
		
		List<WebElement>HeaderLinks=HeaderBlock.findElements(By.tagName("a"));
		
		int HeaderLinksCount=HeaderLinks.size();
		System.out.println(HeaderLinksCount);
		
		for(int i=0;i<HeaderLinks.size();i++)
		{
			String HeaderLinkName=HeaderLinks.get(i).getText();
			System.out.println(HeaderLinkName);
		}
		
		driver.close();

	}

}
