package day6;

import org.openqa.selenium.firefox.FirefoxDriver;

public class pratice {

	public static void main(String[] args)
	{
		FirefoxDriver hello= new FirefoxDriver();
		hello.get("http://facebook.com");
		String abc=hello.getTitle();
		System.out.println(abc);
		hello.close();

	}

}
