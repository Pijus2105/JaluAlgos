package StepDefinition;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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
 	
	

	 @When("^verify if a user cannot login with a blank credentials$")
	    public void verify_if_a_user_cannot_login_with_a_blank_credentials() throws Throwable {
		 WebElement click = driver.findElement(By.xpath("//button[@class='btn sign_in_btn']"));
	     click.click();
	
	     System.out.println("Please filled Username And Password");
	    }

	    	    
	 
	    
	    @When("^verify if a user cannot login with an invalid and valid \"([^\"]*)\" and blank password$")
	    public void verify_if_a_user_cannot_login_with_an_invalid_and_valid_something_and_blank_password(String username) throws Throwable {
	    	 WebElement Email = driver.findElement(By.xpath("//input[@type='email']"));
			 Email.sendKeys(username);
			 
			 WebElement click = driver.findElement(By.xpath("//button[@class='btn sign_in_btn']"));
		     click.click();
	    }

	    @Then("^verify user able to see validation if user not enter of password \"([^\"]*)\"$")
	    public void verify_user_able_to_see_validation_if_user_not_enter_of_password_something(String emailmessage) throws Throwable {
	    	WebElement message_validation = driver.findElement(By.xpath("//div[@role='alert']"));
	    	String received_message = message_validation.getText();
	    	
	    	if(emailmessage == received_message) {
	    		System.out.println("Error Message Is : - " + received_message);
	    	} else {
	    		System.out.println("Actual Message Is : - " + received_message);
	    		System.out.println("Expected Message Is : - " + emailmessage);
	    	}
	    	
	    	
	    }
	    
	  
	    @When("^Verify if a user cannot login with a blank username and invalid valid and valid \"([^\"]*)\"$")
	    public void verify_if_a_user_cannot_login_with_a_blank_username_and_invalid_valid_and_valid_something(String password) throws Throwable {
	    	 WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
			 pwd.sendKeys(password);
			 pwd.sendKeys(Keys.ENTER);
		
			 System.out.println("Email Id Is Required");
	    }
	    
	    @When("^verify if a user cannot login with a valid \"([^\"]*)\" and an invalid \"([^\"]*)\"$")
	    public void verify_if_a_user_cannot_login_with_a_valid_something_and_an_invalid_something(String username, String password) throws Throwable {
	    	 WebElement Email = driver.findElement(By.xpath("//input[@type='email']"));
			 Email.sendKeys(username);
			 
			 WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
			 pwd.sendKeys(password);
			 
			 WebElement click = driver.findElement(By.xpath("//button[@class='btn sign_in_btn']"));
		     click.click();
			 			 
	    }
 
    	
	    
	    @Then("^verify the \"([^\"]*)\" for invalid login$")
	    public void verify_the_something_for_invalid_login(String invalidmessages) throws Throwable {
	    	WebElement message_validation = driver.findElement(By.xpath("//div[@role='alert']"));
	    	String received_message = message_validation.getText();
	    	
	    	if(invalidmessages == received_message) {
	    		System.out.println("Error Message Is : - " + received_message);
	    	} else {
	    		System.out.println("Actual Message Is : - " + received_message);
	    		System.out.println("Expected Message Is : - " + invalidmessages);
	    	}
	    	
	    }
	    
	    
	    @Then("^Verify if a user will be able to login with a valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	    public void verify_if_a_user_will_be_able_to_login_with_a_valid_something_and_valid_something(String username, String password) throws Throwable {
	    	WebElement Email = driver.findElement(By.xpath("//input[@type='email']"));
			 Email.sendKeys(username);
			 
			 WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
			 pwd.sendKeys(password);
			 
			 WebElement click = driver.findElement(By.xpath("//button[@class='btn sign_in_btn']"));
		     click.click();
		     
		     System.out.println("Admin On The Dashboard");
	    }
	

	    @Then("^User will be able to login with a valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	    public void user_will_be_able_to_login_with_a_valid_something_and_valid_something(String username, String password) throws Throwable {
	    	WebElement Email = driver.findElement(By.xpath("//input[@type='email']"));
			 Email.sendKeys(username);
			 
			 WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
			 pwd.sendKeys(password);
			 
			 WebElement click = driver.findElement(By.xpath("//button[@class='btn sign_in_btn']"));
		     click.click();
		     
		     System.out.println("Admin On The Dashboard");
	    }  
	    
	    @When("^verify if a user is able to login with a new \"([^\"]*)\" only after he or she has changed able to received \"([^\"]*)\"$")
	    public void verify_if_a_user_is_able_to_login_with_a_new_something_only_after_he_or_she_has_changed_able_to_received_something(String password, String successmessage) throws Throwable {
	    	driver.findElement(By.xpath("//p[@class='avatar rounded-circle']")).click();
	    	driver.findElement(By.xpath("//a[@class='dropdown-item d-flex align-items-center']")).click();
	    	driver.findElement(By.xpath("//input[@placeholder='New Password']")).sendKeys(password);
	    	WebElement confirmp = driver.findElement(By.xpath("//input[@placeholder='Confirm password']"));
	    	confirmp.sendKeys(password);
	    	confirmp.sendKeys(Keys.ENTER);
	    	
	    	WebElement message_validation = driver.findElement(By.xpath("//div[@role='alert']"));
	    	String received_message = message_validation.getText();
	    	
	    	if(successmessage == received_message) {
	    		System.out.println("Error Message Is : - " + received_message);
	    	} else {
	    		System.out.println("Actual Message Is : - " + received_message);
	    		System.out.println("Expected Message Is : - " + successmessage);
	    	}
	    }
	    
	    
	    
	   	    
	    @Then("^First user will be able to login with a valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	    public void first_user_will_be_able_to_login_with_a_valid_something_and_valid_something(String username, String password) throws Throwable {
	    	 
	    	driver.findElement(By.xpath("//p[@class='avatar rounded-circle']")).click();
	    	
	    	driver.findElement(By.xpath("//button[@class='dropdown-item d-flex align-items-center']")).click();
	    	
	    	 WebElement Email = driver.findElement(By.xpath("//input[@type='email']"));
			 Email.sendKeys(username);
			 
			 WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
			 pwd.sendKeys(password);
	    }

	    @And("^verify the Remember Me functionality$")
	    public void verify_the_remember_me_functionality() throws Throwable {
	    	
	    	 driver.findElement(By.xpath("//label[@class='form-check-label']")).click();
	    	 WebElement click = driver.findElement(By.xpath("//button[@class='btn sign_in_btn']"));
		     click.click();
		     
		        driver.findElement(By.xpath("//p[@class='avatar rounded-circle']")).click();
		    	
		    	driver.findElement(By.xpath("//button[@class='dropdown-item d-flex align-items-center']")).click();
	    }
	    
	    
	    
	    
	    @When("^Verify if the Enter key of the keyboard is working correctly on the login page with \"([^\"]*)\" and valid \"([^\"]*)\"$")
	    public void verify_if_the_enter_key_of_the_keyboard_is_working_correctly_on_the_login_page_with_something_and_valid_something(String username, String password) throws Throwable {
	    	 WebElement Email = driver.findElement(By.xpath("//input[@type='email']"));
			 Email.sendKeys(username);
			 
			 WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
			 pwd.sendKeys(password);
			 

			 WebElement click = driver.findElement(By.xpath("//button[@class='btn sign_in_btn']"));
		     click.sendKeys(Keys.ENTER);
	    
	    }
	    
	    
	    @When("^verify the home page by pressing Back button of the browser It should not allow you to enter into the system once you log out with \"([^\"]*)\" and valid \"([^\"]*)\"$")
	    public void verify_the_home_page_by_pressing_back_button_of_the_browser_it_should_not_allow_you_to_enter_into_the_system_once_you_log_out_with_something_and_valid_something(String username, String password) throws Throwable {
	    	 WebElement Email = driver.findElement(By.xpath("//input[@type='email']"));
			 Email.sendKeys(username);
			 
			 WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
			 pwd.sendKeys(password);
			 

			 WebElement click = driver.findElement(By.xpath("//button[@class='btn sign_in_btn']"));
		     click.sendKeys(Keys.ENTER);
		     
		     driver.navigate().back();
	    }
	    
	    
	    @When("^verify if password change in chrome after when old credentials use in other browser  with \"([^\"]*)\" and valid \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void verify_if_password_change_in_chrome_after_when_old_credentials_use_in_other_browser_with_something_and_valid_something_and_something(String username, String password, String newpassword) throws Throwable {
	    	driver.findElement(By.xpath("//p[@class='avatar rounded-circle']")).click();
	    	driver.findElement(By.xpath("//button[@class='dropdown-item d-flex align-items-center']")).click();
	    	
	    	 WebElement Email = driver.findElement(By.xpath("//input[@type='email']"));
			 Email.sendKeys(username);
			 
			 WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
			 pwd.sendKeys(password);
			 
			 WebElement click = driver.findElement(By.xpath("//button[@class='btn sign_in_btn']"));
		     click.click();
		     
		    
		     
		     
		     
		        driver.findElement(By.xpath("//p[@class='avatar rounded-circle']")).click();
		    	driver.findElement(By.xpath("//a[@class='dropdown-item d-flex align-items-center']")).click();
		    	driver.findElement(By.xpath("//input[@placeholder='New Password']")).sendKeys(newpassword);
		    	WebElement confirmp = driver.findElement(By.xpath("//input[@placeholder='Confirm password']"));
		    	confirmp.sendKeys(newpassword);
		    	confirmp.sendKeys(Keys.ENTER);
		    	
		    	
		    	 driver.findElement(By.xpath("//p[@class='avatar rounded-circle']")).click();
		    	 driver.findElement(By.xpath("//button[@class='dropdown-item d-flex align-items-center']")).click();
		    	 
		    	  WebElement Emailv = driver.findElement(By.xpath("//input[@type='email']"));
     			  Emailv.sendKeys(username);
				 
				 WebElement newpwd = driver.findElement(By.xpath("//input[@type='password']"));
				 newpwd.sendKeys(password);
				 
				 WebElement clicks = driver.findElement(By.xpath("//button[@class='btn sign_in_btn']"));
			     clicks.click();
			     
			     newpwd.clear();
			     
			     WebElement newpwds = driver.findElement(By.xpath("//input[@type='password']"));
				 newpwds.sendKeys(newpassword);
				 
				 WebElement clickss = driver.findElement(By.xpath("//button[@class='btn sign_in_btn']"));
			     clickss.click();
			     
			     driver.findElement(By.xpath("//p[@class='avatar rounded-circle']")).click();
			     
			     driver.findElement(By.xpath("//a[@class='dropdown-item d-flex align-items-center']")).click();
			     driver.findElement(By.xpath("//input[@placeholder='New Password']")).sendKeys(password);
			     driver.findElement(By.xpath("//input[@placeholder='Confirm password']")).sendKeys(password);
			     driver.findElement(By.xpath("//button[@class='subnit_btn  btn btn-primary']")).click();
			     
			     driver.findElement(By.xpath("//p[@class='avatar rounded-circle']")).click();
			     driver.findElement(By.xpath("//button[@class='dropdown-item d-flex align-items-center']")).click();
		    	
		    	
	    }
	    @When("^Verify if there is a checkbox with the label remember password on the login page$")
	    public void verify_if_there_is_a_checkbox_with_the_label_remember_password_on_the_login_page() throws Throwable {
	        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	       
	    }
	    
	    @When("^page refresh after all credentials is \"([^\"]*)\" and \"([^\"]*)\" present or not at text box$")
	    public void page_refresh_after_all_credentials_is_something_and_something_present_or_not_at_text_box(String username, String password) throws Throwable {
	    	     WebElement Email = driver.findElement(By.xpath("//input[@type='email']"));
			     Email.sendKeys(username);
			  
			     WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
				 pwd.sendKeys(password);
				 
				 driver.navigate().refresh();
	    }
	    
	    
	    @When("^verify that clicking the back button does not logout the user once is user is logged in is \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void verify_that_clicking_the_back_button_does_not_logout_the_user_once_is_user_is_logged_in_is_something_and_something(String username, String password) throws Throwable {
	    	 WebElement Email = driver.findElement(By.xpath("//input[@type='email']"));
		     Email.sendKeys(username);
		  
		     WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
			 pwd.sendKeys(password); 
			 
			 WebElement clicks = driver.findElement(By.xpath("//button[@class='btn sign_in_btn']"));
		     clicks.click();
	    }

	    @Then("^The application will logout$")
	    public void the_application_will_logout() throws Throwable {
	    	
	    	 driver.findElement(By.xpath("//p[@class='avatar rounded-circle']")).click();
		     
		     driver.findElement(By.xpath("//a[@class='dropdown-item d-flex align-items-center']")).click();
		     
		     driver.navigate().back();
	    }
 }

	   
	    
	    
	    
	  




