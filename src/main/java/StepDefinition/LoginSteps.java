package StepDefinition;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
	     String Expected_Title_Of_Page =   "Stock Strategy"; 
		 String Actual_Title_Of_Page = driver.getTitle();
		 
		 if(Actual_Title_Of_Page == Expected_Title_Of_Page)
			{
				System.out.println("Expected_Title_Of_Page : - " + Expected_Title_Of_Page );
			}else
			System.out.println("Actual_Title_Of_Page : - " + Actual_Title_Of_Page );

		}

	       
	  

	
	  
	  @Then("^verify if a user will be able to login with a \"([^\"]*)\" and a \"([^\"]*)\"$")
	    public void verify_if_a_user_will_be_able_to_login_with_a_something_and_a_something(String username, String password) throws Throwable {
		     WebElement Email = driver.findElement(By.xpath("//input[@type='email']"));
		     
			 Email.sendKeys(username);
			 WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
			 pwd.sendKeys(password);
			 WebElement click = driver.findElement(By.xpath("//button[@class='btn sign_in_btn']"));
		     click.click();
		     
	    }
	  
//	  @Then("^verify if a user is able to login with a new password only after he/she has  the \"([^\"]*)\"$")
//	    public void verify_if_a_user_is_able_to_login_with_a_new_password_only_after_heshe_has_the_something(String strArg1) throws Throwable {
//	        driver.findElement(By.xpath("//p[@class='avatar rounded-circle']")).click();
//	        
//	    }

	 

	  @Then("^verify if a user is able to login with a new password only after he she has  the changedpassword$")
	    public void verify_if_a_user_is_able_to_login_with_a_new_password_only_after_he_she_has_the_changedpassword() throws Throwable {
		  driver.findElement(By.xpath("//p[@class='avatar rounded-circle']")).click();
	    }


	

}
