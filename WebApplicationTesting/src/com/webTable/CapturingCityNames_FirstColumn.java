package com.webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.jna.platform.win32.WinNT.SYSTEM_LOGICAL_PROCESSOR_INFORMATION;

public class CapturingCityNames_FirstColumn {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		
		// html/body/div[1]/div[8]/section[2]/div[1]/table/tbody/tr[1]/td[1]
		// html/body/div[1]/div[8]/section[2]/div[1]/table/tbody/tr[36]/td[1]
		
		String part1="html/body/div[1]/div[8]/section[2]/div[1]/table/tbody/tr[";
		String part2="]/td[1]";
		
		
		for(int i=1;i<=36;i++)
		{
			String CityName=driver.findElement(By.xpath(part1+i+part2)).getText();
			
			System.out.println(CityName);
			
		}
		
		driver.close();

	}

}
