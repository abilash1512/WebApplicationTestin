package day5;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingTitle_Facebook {

	public static void main(String[] args) {
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("http://twitter.com");
		 String ab=driver.getTitle();
		 System.out.println(ab);
		
		
		
		  //System.out.println(facebookTitle);
		  String Hi="abilash";
		  System.out.println(Hi);
		  driver.close();
	}

}
