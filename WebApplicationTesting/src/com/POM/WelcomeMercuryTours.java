package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomeMercuryTours
{
		// Object Repository
	
	//WebElement register=driver.findElement(By.linkText("REGISTER"));
	
	@FindBy(linkText="REGISTER")
	WebElement register;
	
	public void Register()
	{
		register.click();
	}
	
	// SUPPORT
	@FindBy(linkText="SUPPORT")
	WebElement support;
	
	public void Support()
	{
		support.click();
	}
	
	//CONTACT
	@FindBy(linkText="CONTACT")
	WebElement contact;
	
	public void Contact()
	{
		contact.click();
	}
	
	//UserName
	@FindBy(name="userName")
	WebElement UserName;
	
	//Password
	@FindBy(name="password")
	WebElement Password;
	
	//LogIn
	@FindBy(name="login")
	WebElement LogIn;
	
	
	public void LogIN(String Uname,String Pwd)
	{
		UserName.sendKeys(Uname);
		Password.sendKeys(Pwd);
		LogIn.click();
	}
	
	
}
