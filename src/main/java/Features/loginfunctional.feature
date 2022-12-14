Feature: Feature to test login functionality

#*TC-02 & 03
Background: Open the browser and verify login page title


Given open the browser
When verify login page title

@tag1
Scenario:  User cannot login with a blank credentials

When verify if a user cannot login with a blank credentials



Scenario Outline: User cannot login with a valid username and blank password

When verify if a user cannot login with an invalid and valid "<username>" and blank password
Then verify user able to see validation if user not enter of password "<Emailmessage>"

#*TC-05 & 06
Examples:
     
     | username | Emailmessage |
     | admin1@gmail.com | password is not allowed to be empty |
     | admin@gmail.com | password is not allowed to be empty |
     

#*TC-07 & 08
Scenario Outline: User cannot login with a blank username and invalid password

When Verify if a user cannot login with a blank username and invalid valid and valid "<password>"

Examples:
     
     | password |
     | test@123 | 
     | test | 
     | test1234 |
     | 123456 |
     
 
 #*TC-09-013
 
 Scenario Outline: User cannot login with a invalid credentials  
 
 When verify if a user cannot login with a valid "<username>" and an invalid "<password>"
 Then verify the "<invalidmessages>" for invalid login
 
 Examples:
 
     | username | password | invalidmessages |
     | admin@gmail.com | 12345 | User not Found |
     | admin1@gmail.com | 123456 | User not Found |
     | admin1@gmail.com | 12345 | User not Found |
     
     
Scenario Outline: User login with a valid credentials 
     
Then Verify if a user will be able to login with a valid "<username>" and valid "<password>"
 
Examples:
     | username | password |
     | admin@gmail.com | 123456 |       
 
 
 

#* Scenario Outline: User cannot login with a valid credentials 
     
#*Then User will be able to login with a valid "<username>" and valid "<password>"
#*Then verify if a user is able to login with a new "<password>" only after he or she has changed 
#*When verify after changing the password user able to see validation "<successmessage>"  

#*Examples:
   #*  | username | password | newpassword | successmessage |
  #*  | admin@gmail.com | 123456 | 123456 | Password update Sucessfull |  


Scenario Outline: User cannot login with a valid credentials

Then User will be able to login with a valid "<username>" and valid "<password>"
When verify if a user is able to login with a new "<password>" only after he or she has changed able to received "<successmessage>"

Examples:

    | username | password | successmessage |
    | admin@gmail.com | 123456 | Password update Sucessfull | 
    

    
Scenario Outline: User can verify the Remember Me functionality


Then First user will be able to login with a valid "<username>" and valid "<password>"
And verify the Remember Me functionality


Examples:

    | username | password | 
    | admin@gmail.com | 123456 |   
     
Scenario Outline: User can verify enter key on the login page


When Verify if the Enter key of the keyboard is working correctly on the login page with "<username>" and valid "<password>"
 

Examples:

    | username | password | 
    | admin@gmail.com | 123456 | 
    
    
Scenario Outline: User at the home page by pressing Back button of the browser It should not allow you to enter into the system once you log out

When verify the home page by pressing Back button of the browser It should not allow you to enter into the system once you log out with "<username>" and valid "<password>"

Examples:

    | username | password | 
    | admin@gmail.com | 123456 | 
    
    
Scenario Outline:  Verify if password change in chrome after when old credentials use in other browser 

When verify if password change in chrome after when old credentials use in other browser  with "<username>" and valid "<password>" and "<newpassword>"

Examples:

    | username | password | newpassword |
    | admin@gmail.com | 123456 | 1234567 |
    
    
 Scenario: verify if there is a checkbox with the label remember password on the login page
 
 When Verify if there is a checkbox with the label remember password on the login page

Scenario Outline: verify when page refresh after all credentials is present or not at text box

When page refresh after all credentials is "<username>" and "<password>" present or not at text box

Examples:
    | username | password | 
    | admin@gmail.com | 123456 |
    
Scenario Outline: verify that clicking the back button does not logout the user once is user is logged in

When verify that clicking the back button does not logout the user once is user is logged in is "<username>" and "<password>"
Then The application will logout

Examples:
    | username | password | 
    | admin@gmail.com | 123456 |
    
Scenario: User the Lost Password functionality  


And verify the Lost Password functionality

Scenario Outline: Verify once login then pressing back button  

When Verify once login then pressing back button after login  "<username>" and "<password>"

Examples:
    | username | password | 
    | admin@gmail.com | 123456 |


Scenario Outline: Verify if admin logout the application after when open URL new tab with the other page that time should be landing the login page if redirect the parent window 

When Verify once login the page with  "<username>" and "<password>"
Then Verify if admin logout the application after when open URL new tab with the other page that time should be landing the login page if redirect the parent window

Examples:
    | username | password | 
    | admin@gmail.com | 123456 |


Scenario Outline: Verify if admin logout the application after when open URL new tab with the other page that time should be landing the login page if redirect the parent window 

When Verify once login the page with valid "<username>" and "<password>"
Then Verify if admin logout the application after when open URL new tab with the other page that time should be landing the logout the parent page if referesh after iterate

Examples:
    | username | password | 
    | admin@gmail.com | 123456 |
   
   