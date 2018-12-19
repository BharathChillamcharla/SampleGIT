package Stepdefinitions;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class dealsMapStepDefinition {
	
	WebDriver driver;
	@Given("^user already on login page$")
	public void user_already_on_login_page() 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
	
	}
	@When("^user enter username and password$")
	public void user_enter_username_and_password(DataTable credentials)
	{
		for(Map<String, String> data:credentials.asMaps(String.class,String.class))
			{
		driver.findElement(By.name("username")).sendKeys(data.get("username"));
		driver.findElement(By.name("password")).sendKeys(data.get("password"));
	
			}
	}
	@Then("^click on login button$")
	public void click_on_login_button() 
	{
		WebElement loginbtn=driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", loginbtn);
	
		
	}
	@Then("^mouse hover on deals link$")
	public void mouse_hover_on_deals_link() 
	{
		driver.switchTo().frame("mainpanel");
		WebElement dealLink=driver.findElement(By.xpath("//a[text()='Deals']"));
		Actions action=new Actions(driver);
		action.moveToElement(dealLink).build().perform();
	}
	@Then("^click on new deal link$")
	public void click_on_new_deal_link()
	{
		
		driver.findElement(By.xpath("//a[@title='New Deal']")).click();
	}

	@Then("^Enter deal details$")
	public void Enter_deal_details(DataTable dealdata) 
	{
		for(Map<String, String> data:dealdata.asMaps(String.class,String.class))
		{
			driver.findElement(By.name("title")).sendKeys(data.get("title"));
			driver.findElement(By.name("amount")).sendKeys(data.get("amount"));
			driver.findElement(By.name("probability")).sendKeys(data.get("probability"));
			driver.findElement(By.name("commission")).sendKeys(data.get("commission"));
			driver.findElement(By.xpath("//input[@value='Save' and @type='submit']")).click();
			WebElement dealLink=driver.findElement(By.xpath("//a[text()='Deals']"));
			Actions action=new Actions(driver);
			action.moveToElement(dealLink).build().perform();
			driver.findElement(By.xpath("//a[@title='New Deal']")).click();

		}

			}
	@Then("^user close the browser$")
	public void user_close_the_browser() 
	{
		driver.quit();
	}



}
