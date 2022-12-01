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

    And Verify the Generate Password UI button is displayed at the left side
    Then Verify that Generate Password button is clickable or not 
    Then Verify pagination is accessible or not by clicking on the Next and Previous and number
    Then Verify the positioning of the toggle button
    And Verify the positioning of the data table 
   
    And Verify the user can go direct Generate password page to Admin panel
    Then Verify the Add Password button is clickable or not
    Then Verify the API dropdown
    Then Verify the Select API row
    Then Verify the Generate Password button
    And Verify the Submit button
    Then Verify the application will be click close button after open the Generate Password form
    Then Verify that the total 4 data Table coloumn at Generate password page
    Then Verify the primary key is clickable or not
    Then Verify the when open Generate password pop up box if click at outside
    Then Verify when password not generate will display at the API key at Add password
    Then Verify the admin can generate password after click the primary key button
    Then Verify when generate password for the particular API page should be fixed the particular
    Then Verify when click the generated password for the particular API will be change the password
    And Verify the password is complexicty
    
    
  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
