//package Stepdefinitions;
//
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class dealsStepDefinition {
//	
//	WebDriver driver;
//	@Given("^user already on login page$")
//	public void user_already_on_login_page() 
//	{
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
//		driver.get("https://www.freecrm.com/index.html");
//	
//	}
//	@When("^user enter username and password$")
//	public void user_enter_username_and_password(DataTable credentials)
//	{
//		List<List<String>> data=credentials.raw();
//		driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
//		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
//	
//	
//	}
//	@Then("^click on login button$")
//	public void click_on_login_button() 
//	{
//		WebElement loginbtn=driver.findElement(By.xpath("//input[@type='submit']"));
//		JavascriptExecutor jse=(JavascriptExecutor)driver;
//		jse.executeScript("arguments[0].click()", loginbtn);
//	
//		
//	}
//	@Then("^mouse hover on deals link$")
//	public void mouse_hover_on_deals_link() 
//	{
//		driver.switchTo().frame("mainpanel");
//		WebElement contactslink=driver.findElement(By.xpath("//a[text()='Deals']"));
//		Actions action=new Actions(driver);
//		action.moveToElement(contactslink).build().perform();
//	}
//	@Then("^click on new deal link$")
//	public void click_on_new_deal_link()
//	{
//		
//		driver.findElement(By.xpath("//a[@title='New Deal']")).click();
//	}
//
//	@Then("^Enter deal details$")
//	public void Enter_deal_details(DataTable dealdata) 
//	{
//		List<List<String>> deal=dealdata.raw();
//		driver.findElement(By.name("title")).sendKeys(deal.get(0).get(0));
//		driver.findElement(By.name("amount")).sendKeys(deal.get(0).get(1));
//		driver.findElement(By.name("probability")).sendKeys(deal.get(0).get(2));
//		driver.findElement(By.name("commission")).sendKeys(deal.get(0).get(3));
//	}
//	@Then("^user click on save button$")
//	public void user_click_on_save_button() 
//	{
//		driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
//	}
//
//
//}
