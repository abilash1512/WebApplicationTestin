package newToursApplicationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewToursLogInTest
{

	FirefoxDriver driver;
	@Given("^Open FireFox Browser and Navigate to NewTours Application$")
	public void Open_FireFox_Browser_and_Navigate_to_NewTours_Application() throws Throwable 
	{
		driver= new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
	}

	@When("^User enters Valid \"([^\"]*)\" and \"([^\"]*)\" and click on SignIn button$")
	public void User_enters_Valid_and_and_click_on_SignIn_button(String UserName, String Password) throws Throwable
	{
		driver.findElement(By.name("userName")).sendKeys(UserName);
		driver.findElement(By.name("password")).sendKeys(Password);
		driver.findElement(By.name("login")).click();
	 
	}

	@Then("^User should be able to LogIn Successfully$")
	public void User_should_be_able_to_LogIn_Successfully() throws Throwable
	{
	
		String ExpectedTitle="Find";
		String Actualtitle=driver.getTitle();
		
		if(Actualtitle.contains(ExpectedTitle))
		{
			System.out.println("User LogIn Successfull -- PASS");
		}
		else
		{
			System.out.println("User Failed to LogIn -- FAIL");
		}
	}

	@Then("^User should close the application$")
	public void User_should_close_the_application() throws Throwable
	{
		driver.close();
	}


	
}
