package StepDefinition;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	
	@Given("^Open the browser$")
    public void open_the_browser() throws Throwable {
       
		System.out.println("This Step open the Chrome and launch the application.");
		
    }

    @When("^verify login page title$")
    public void verify_login_page_title() throws Throwable {
        
    	System.out.println("This Step for login page title.");
    }

    @When("^Verify if a user cannot login with a valid username and an invalid password$")
    public void verify_if_a_user_cannot_login_with_a_valid_username_and_an_invalid_password() throws Throwable {
    	System.out.println("This Step for user cannot login with a valid username and an invalid password.");
    }

    @When("^verify if the login page allows to log in simultaneously with different credentials in a different browser$")
    public void verify_if_the_login_page_allows_to_log_in_simultaneously_with_different_credentials_in_a_different_browser() throws Throwable {
    	System.out.println("This Step for login page allows to log in simultaneously with different credentials in a different browser.");
    }

    @Then("^verify if a user will be able to login with a valid username and valid password$")
    public void verify_if_a_user_will_be_able_to_login_with_a_valid_username_and_valid_password() throws Throwable {
    	System.out.println("This Step for user will be able to login with a valid username and valid password.");
    }

    @Then("^verify if a user is able to login with a new password only after he she has changed the password$")
    public void verify_if_a_user_is_able_to_login_with_a_new_password_only_after_heshe_has_changed_the_password() throws Throwable {
    	System.out.println("This Step for user is able to login with a new password only after he she has changed the password.");
    }

    @Then("^verify the login page for both, when the field is blank and Submit button is clicked$")
    public void verify_the_login_page_for_both_when_the_field_is_blank_and_submit_button_is_clicked() throws Throwable {
    	System.out.println("This Step the login page for both, when the field is blank and Submit button is clicked.");
    }

    @Then("^verify the ‘Lost Password’ functionality$")
    public void verify_the_lost_password_functionality() throws Throwable {
    	System.out.println("This Step for the ‘Lost Password’ functionality.");
    }
    

    @Then("^verify the ‘Remember Me’ functionality$")
    public void verify_the_remember_me_functionality() throws Throwable {
    	System.out.println("This Step for the ‘Remember Me’ functionality.");
    }

    @Then("^verify if the ‘Enter’ key of the keyboard is working correctly on the login page$")
    public void verify_if_the_enter_key_of_the_keyboard_is_working_correctly_on_the_login_page() throws Throwable {
    	System.out.println("This Step for the ‘Enter’ key of the keyboard is working correctly on the login page.");
    }

    @Then("^verify if a user should be able to login with the same credentials in different browsers at the same time$")
    public void verify_if_a_user_should_be_able_to_login_with_the_same_credentials_in_different_browsers_at_the_same_time() throws Throwable {
    	System.out.println("This Step for the login with the same credentials in different browsers at the same time.");
    }

    @Then("^verify if password change in chrome after when old credentials use in other browser $")
    public void verify_if_password_change_in_chrome_after_when_old_credentials_use_in_other_browser() throws Throwable {
    	System.out.println("This Step for the password change in chrome after when old credentials use in other browser.");
    }

    @Then("^Verify the home page by pressing ‘Back button’ of the browser It should not allow you to enter into the system once you log out$")
    public void verify_the_home_page_by_pressing_back_button_of_the_browser_it_should_not_allow_you_to_enter_into_the_system_once_you_log_out() throws Throwable {
    	System.out.println("This Step for the the home page by pressing ‘Back button’ of the browser It should not allow you to enter into the system once you log out.");
    }

    @Then("^Verify that closing the browser should not log out an authenticated user Launching the application should lead the user to login state only$")
    public void verify_that_closing_the_browser_should_not_logout_an_authenticated_user_launching_the_application_should_lead_the_user_to_login_state_only() throws Throwable {
    	System.out.println("This Step for closing the browser should not log out an authenticated user Launching the application should lead the user to login state only.");
    }

    @Then("^verify when page refresh after all credentials is present or not at text box$")
    public void verify_when_page_refresh_after_all_credentials_is_present_or_not_at_text_box() throws Throwable {
    	System.out.println("This Step for the page refresh after all credentials is present or not at text box.");
    }

    @Then("^verify if browser is not save the credentials after user tries to login the system should ask for credentials again$")
    public void verify_if_browser_is_not_save_the_credentials_after_user_tries_to_login_the_system_should_ask_for_credentials_again() throws Throwable {
    	System.out.println("This Step for the browser is not save the credentials after user tries to login the system should ask for credentials again.");
    }

    @Then("^verify if admin logout the application after when open URL with the other page that time should be landing the login page$")
    public void verify_if_admin_logout_the_application_after_when_open_url_with_the_other_page_that_time_should_be_landing_the_login_page() throws Throwable {
    	System.out.println("This Step for the logout the application after when open URL with the other page that time should be landing the login page.");
    }

    @And("^some other precondition$")
    public void some_other_precondition() throws Throwable {
    	System.out.println("This Step for the other precondition.");
    }

    @And("^verify the messages for invalid login$")
    public void verify_the_messages_for_invalid_login() throws Throwable {
    	System.out.println("This Step for the messages for invalid login.");
    }

    @And("^verify after the user login page is open, the cursor should not remain in the username text box by default$")
    public void verify_after_the_user_login_page_is_open_the_cursor_should_not_remain_in_the_username_text_box_by_default() throws Throwable {
    	System.out.println("This Step for the the user login page is open, the cursor should not remain in the username text box by default.");
    }
	
	
	

}
