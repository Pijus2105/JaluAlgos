package StepDefinition;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginSteps {
	
	
	
	public static final WebDriver driver = new ChromeDriver();
	
	
	 @Given("^open the browser$")
	    public void open_the_browser() throws Throwable {
		 System.out.println("This Step is open the Chrome.");
		 System.getProperty("webdriver.chrome.driver", "C:/Users/Elphill/eclipse-workspace/JaluAlgos/src/main/resources/Drivers/chromedriver.exe");

		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("http://3.209.102.189:3000/");
	    }
	 
	 
	 @When("^verify login page title$")
	    public void verify_login_page_title() throws Throwable {
	        String title = driver.getTitle();
	        System.out.println("Login page title" + title);
	        Assert.assertEquals("login page", title);
	 }
	 
	 
	 
	  @Then("^verify if a user will be able to login with a valid username and valid password$")
	    public void verify_if_a_user_will_be_able_to_login_with_a_valid_username_and_valid_password() throws Throwable {
	       
		  driver.findElement(By.xpath("//input[@type='email']")).sendKeys("admin@gmail.com");
		  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345");
		  
	    }

	
	

}
