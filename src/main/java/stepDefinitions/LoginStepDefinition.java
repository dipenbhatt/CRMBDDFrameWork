
//package stepDefinitions;

//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//
//
//
//public class LoginStepDefinition {
//	
//	WebDriver driver;
//	
//	@Given("^User is already on login page$")
//	public void user_is_already_on_login_page()
//	{
//		System.setProperty("webdriver.chrome.driver", "C:\\QA\\SeleniumJars\\chromedriver.exe");
//		driver = new ChromeDriver();	
//		driver.get("https://classic.freecrm.com/");
//		
//		
//	}
//	@When("^title of Login page is Free CRM$")
//	public void title_of_Login_page_is_Free_CRM()  {
//	    String title=driver.getTitle();
//	    System.out.println(title);
//	    Assert.assertEquals("Free CRM - CRM software for customer relationship management, sales, and support.", title);
//	}
//
//	@Then("^user enters \"(.*)\" and \"(.*)\"$")
//	public void user_enters_Uswename_and_Password(String username,String password)  {
//	    
//		driver.findElement(By.name("username")).sendKeys(username);
//		driver.findElement(By.name("password")).sendKeys(password);
//	}
//
//	@Then("^user Clicks on Login button$")
//	public void user_Clicks_on_Login_button()  {
//	    
//		WebElement loginbtn=driver.findElement(By.xpath("//input[@type='submit']"));
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();", loginbtn);
//	}
//
//	@Then("^user is on home page$")
//	public void user_is_on_home_page()
//	{
//		
//		String title=driver.getTitle();
//		System.out.println("home page title::"+ title);
//		Assert.assertEquals("CRMPRO",title);
//	}
//	 @Then("^user moves to new contact page$")
//	 public void user_moves_to_new_contact_page() {
//		driver.switchTo().frame("mainpanel");
//		Actions action = new Actions(driver);
//		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
//		driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
//		
//		}
//	 
//	 
//	 @Then("^user enters contact details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
//	 public void user_enters_contacts_details(String firstname, String lastname, String position){
//		 driver.findElement(By.id("first_name")).sendKeys(firstname);
//		 driver.findElement(By.id("surname")).sendKeys(lastname);
//		 driver.findElement(By.id("company_position")).sendKeys(position);
//		 driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
//	 }
//	 
//
//	 @Then("^Close the browser$")
//	 public void close_the_browser(){
//		 driver.quit();
//	 }
//}
