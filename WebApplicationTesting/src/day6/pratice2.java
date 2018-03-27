package day6;

import org.openqa.selenium.firefox.FirefoxDriver;

public class pratice2 {

	public static void main(String[] args) {
		FirefoxDriver cell = new FirefoxDriver();
		cell.get("http://gmail.com");
	String	iphone=cell.getTitle();
	System.out.println(iphone);
	cell.close();

	}

}
