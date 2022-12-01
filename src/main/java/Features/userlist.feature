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

    And Verify the User List UI button is displayed at the left side
    Then Verify that User List button is clickable or not 
    Then Verify the data table box default value number is least of all
    Then Verify the user can go direct User List details page to Admin panel
    Given Verify the Create User UI button is displayed at the right side
    Then Verify after click the Create User button then open the user form
    Then Verify the do not enter any value at User registration form
    Then Verify the behavior of the form by adding random data in the text field
    Then Verify the Full name text field without adding the First name
    Then Verify the Full name text field without adding the Last name
    Then Verify by adding numbers instead of strings in the full name text field
    Then Verify the Phone text field with both area code and phone number both being a string instead of numbers
    Then Verify the Email text field that has an Email address without add the rate symbol
    Then Verify the Email text field that has a random string instead a real email
    When Verify the Email text field that has a missing dot in the email address
    Given Verify the Email text field as “name@192.168.1.1.0.”
    Then Verify the Email text field as “name.. @gmail.com.”
    When Verify that the User is not allowed to create an account is the password and confirm passwords are different
    Then Verify the application will be click close button after open the user form
    Then Verify the View API button is clickable or not
    
    
    
    
  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
