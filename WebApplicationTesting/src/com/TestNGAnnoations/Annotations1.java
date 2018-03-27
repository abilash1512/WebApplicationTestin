package com.TestNGAnnoations;

import org.testng.annotations.Test;

public class Annotations1 
{

	@Test(priority=1)
	public void BrowserLaunch()
	{
		System.out.println("This will launch FireFox Browser");
	}
	
	@Test(priority=2)
	public void LogIn()
	{
		System.out.println("Testing LogIn Functionality");
	}
	
	@Test(priority=3)
	public void InBox()
	{
		System.out.println("testing InBox Functionality");
	}
	
	@Test(enabled=false)
	public void ComposeMail()
	{
		System.out.println("Testing ComposeMail Functionality");
	}
	
}
