package day4;


import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomationBrowser_OpenFaceBookAppliation {

	public static void main(String[] args)
	{
		FirefoxDriver abc= new FirefoxDriver();
		abc.get("http://www.facebook.com");
		
		abc.navigate().to("http://gmail.com");
		abc.close();
		
	}

}
