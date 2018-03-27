package com.TestNGAnnoations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations3
{

	@BeforeMethod
	public void BrowserLaunchAndLogIn()
	{
		System.out.println("FireFox Launch and LogIN");
	}

	
	@Test(priority=1)
	public void InBox()
	{
		System.out.println("testing InBox Functionality");
	}
	
	@Test(priority=2)
	public void ComposeMail()
	{
		System.out.println("Testing ComposeMail Functionality");
	}
	
	@Test(priority=3)
	public void SentMail()
	{
		System.out.println("Testing SEnt Mail Functionality");
	}
	
	@AfterMethod
	public void ApplicationCLose()
	{
		System.out.println("CLosing Application");
	}
}
