package StepDefinitions;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert; 

public class loginstepdefintion {

	WebDriver driver;
	
	
	@Given("^user is already on login page$")
	public void user_is_already_on_login_page() {
		 System.setProperty("webdriver.gecko.driver", "E:\\Gecko\\chromedriver_win32\\FF\\geckodriver.exe");
		    driver = new FirefoxDriver();
		    driver.get(" https://classic.crmpro.com");
		}
	
	@When("^title of login page is CRMPRO$")
	public void title_of_login_page_is_CRMPRO() {
		String title= driver.getTitle();
		System.out.println("title");
		Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);
	//	Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title, 0);
	}


	
	@Then("^user enters username and password$")
	public void user_enters_username_and_password() {
		driver.findElement(By.name("username")).sendKeys("batchautomation");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
	}
	
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button(){
		WebElement loginBtn =driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div/input"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", loginBtn);
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() {
		String title = driver.getTitle();
		System.out.println("Home Page title :"+ title);
     	Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);
     	
	}	

	
	
	
}
