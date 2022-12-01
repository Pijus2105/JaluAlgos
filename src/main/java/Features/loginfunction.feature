#Author: pijus@elphilltechnology.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Feature to test login functionality

  @tag1
  Scenario: Title of your scenario
    Given Open the browser
    And some other precondition
    When verify login page title
    Then verify if a user will be able to login with a valid username and valid password
    And verify the messages for invalid login
    Then verify if a user is able to login with a new password only after he she has changed the password
    Then verify the login page for both, when the field is blank and Submit button is clicked
    When Verify if a user cannot login with a valid username and an invalid password
    Then verify the ‘Lost Password’ functionality
    Then verify the ‘Remember Me’ functionality
    Then verify if the ‘Enter’ key of the keyboard is working correctly on the login page
    Then verify if a user should be able to login with the same credentials in different browsers at the same time
    When verify if the login page allows to log in simultaneously with different credentials in a different browser
    Then verify if password change in chrome after when old credentials use in other browser 
    Then Verify the home page by pressing ‘Back button’ of the browser. It should not allow you to enter into the system once you log out
    Then Verify that closing the browser should not log-out an authenticated user Launching the application should lead the user to login state only
    Then verify when page refresh after all credentials is present or not at text box
    Then verify if browser is not save the credentials after user tries to login the system should ask for credentials again
    And verify after the user login page is open, the cursor should not remain in the username text box by default
    Then verify if admin logout the application after when open URL with the other page that time should be landing the login page