package findElementsOnwedPage;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindingNumberOfElmentsInAPage {

	public static void main(String[] args)
	{
	   FirefoxDriver driver = new FirefoxDriver();
	   driver.get("http://newtours.demoaut.com");
	   
	   driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[3]")).click();
	   
	   
	   
	}

}
