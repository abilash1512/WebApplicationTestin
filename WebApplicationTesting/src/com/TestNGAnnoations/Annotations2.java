package com.TestNGAnnoations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2
{

	@BeforeTest
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
	
	@AfterTest
	public void ApplicationCLose()
	{
		System.out.println("CLosing Application");
	}
	
}
