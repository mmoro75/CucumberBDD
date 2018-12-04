Feature: Application Login 


Scenario: Home page default login 

Given user is on banking landing page
When user login into application with username and password 
Then home page is populated 
And cards are displayed 


Given user is on banking landing page
When user login into application with "mmoro" and "1234" 
Then home page is populated 
And cards are displayed 


Given user is on banking landing page
When user login into application with "gino" and "5678" 
Then home page is populated 
And cards not displayed 




Scenario Outline: Positive test validating login   
Given user is on banking landing page
When user login into application with <username> and <password>  
Then home page is populated 
And cards are displayed 

Examples:
|username       |password |
|test@gmail,com |MM345    |
|aloah@gmail.com|LL345    |




