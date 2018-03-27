package com.MouseHoverOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra_Men_MouseHover {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://myntra.com");
		
		WebElement Men=driver.findElement(By.xpath("//*[@id='desktop-header-cnt']/div[2]/nav/div/div[1]/div/a"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(Men).perform();
		
		driver.findElement(By.xpath(".//*[@id='desktop-header-cnt']/div[2]/nav/div/div[1]/div/div/div/ul[1]/li[6]/a")).click();
		
		driver.findElement(By.xpath("//*[@id='desktopSearchResults']/div[2]/section/ul/li[2]/a/img")).click();
	}

}
