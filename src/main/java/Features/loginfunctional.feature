Feature: Feature to test login functionality


Scenario Outline: Login of scenario


Given open the browser
When verify login page title




Examples:

    | username | password |
    | admin@gmail.com | ab123456 |
    | admininvalid@gmail.com | 123456 |
    | admininvalid@gmail.com | ab123456 |
    | admin@gmail.com | 123456 |
    


    