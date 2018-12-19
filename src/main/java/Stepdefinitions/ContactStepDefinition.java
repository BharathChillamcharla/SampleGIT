//package Stepdefinitions;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class ContactStepDefinition {
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
//
//	@When("^user enter \"(.*)\" and \"(.*)\"$")
//	public void user_enter_username_and_password(String username,String password)
//	{
//
//		driver.findElement(By.name("username")).sendKeys(username);
//		driver.findElement(By.name("password")).sendKeys(password);
//	
//	
//	}
//
//	@Then("^click on login button$")
//	public void click_on_login_button() 
//	{
//		WebElement loginbtn=driver.findElement(By.xpath("//input[@type='submit']"));
//		JavascriptExecutor jse=(JavascriptExecutor)driver;
//		jse.executeScript("arguments[0].click()", loginbtn);
//	
//		
//	}
//
//	@Then("^mouse hover on contacts link$")
//	public void mouse_hover_on_contacts_link() 
//	{
//		driver.switchTo().frame("mainpanel");
//		WebElement contactslink=driver.findElement(By.xpath("//a[text()='Contacts']"));
//		Actions action=new Actions(driver);
//		action.moveToElement(contactslink).build().perform();
//	}
//
//	@Then("^click on new contact link$")
//	public void click_on_new_contact_link()
//	{
//		
//		driver.findElement(By.xpath("//a[@title='New Contact']")).click();
//	}
//
//	@Then("^Enter \"(.*)\" and \"(.*)\"$")
//	public void enter_firstname_and_lastname(String firstname,String lastname) 
//	{
//		driver.findElement(By.name("first_name")).sendKeys(firstname);
//		driver.findElement(By.name("surname")).sendKeys(lastname);
//		
//	}
//
//	@Then("^user click on save button$")
//	public void user_click_on_save_button() 
//	{
//		driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
//	}
//
//	@Then("^close the browser$")
//	public void CloseBrowser()
//	{
//		driver.quit();
//	}
//	
//}
