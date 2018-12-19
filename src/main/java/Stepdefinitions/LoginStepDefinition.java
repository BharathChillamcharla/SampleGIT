package Stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class LoginStepDefinition {
	
	WebDriver driver;
	
	@Given("^user is already on login page$")
	public void user_is_already_on_login_page() 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
	  
	}

	@SuppressWarnings("deprecation")
	@When("^verify title of the login page$")
	public void verify_title_of_the_login_page() 
	{
	    String title=driver.getTitle();
	    System.out.println(title);
	    Assert.assertEquals("#1 Free CRM software in the cloud for sales and service", title);
	    
	
	}

	@Then("^enter username and password$")
	public void enter_username_and_password() 
	{
	
		driver.findElement(By.name("username")).sendKeys("bharath526");
		driver.findElement(By.name("password")).sendKeys("marchipoya");
		
		
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() 
	{
		WebElement loginbtn=driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", loginbtn);
		    
		
	}



}
