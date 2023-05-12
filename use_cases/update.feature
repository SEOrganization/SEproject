Feature: coverage of code
Description:we want to cover all the code 
 Actor: application
 

    	
Scenario:  return information about order

    Given that we want to return the order information through the user's order number "3" the order number "3"
    Then Then the requested order will be returned 
    
     Given that we want to return order information through the user's order number "5" the order number "3"
    Then the requested order will be returned 
    
     Scenario: request status of order
  Given  that we want to know status for order with  number "3" belonging to user number "3"
  When the user request status of order with no. "3"
  Then Gets the status of the order 
  
     Scenario: request status  
  Given  that we  know status for order with  number "1" belonging to user number "3"
  When the user request status of order with num. "1"
  Then Gets the status of the order with num1
  
   Scenario: request status of order with no. "4"
  Given  that we want to know status order with no. "4" belonging to user number "3"
  When user request status of order with no. "3"
  Then Gets the statu of the order 
  
  
  
  Scenario: request status of order No. "6" 
  Given  that we want to know status for order  number "6" belonging to user number "5"
  When the user request status order with no. "6"
  Then Get the status of the order 
  
 
    
    Scenario: search user 
  Given that we want to search about user by using his name like "Taha"  
  When  we search for the user's name
  Then the user information is returned
  
  
Scenario:  search product 
Given  that we want to search about product by using its name like "carpet saxony"  
When   we search for the product's name
Then the product information is returned

Scenario: return email of user 
Given  that we want to return email of user from order with no. "3" 
When   we ask for the user's email for the order
Then the user's email is returned

Scenario: return id of user 
Given  that we want to return id of user from order with no. "3" 
When   we ask for the user's id for the order
Then the user's id is returned

Scenario: return id of worker 
Given  that we want to return id of worker from his email "farah@gmail.com" and password "farah1112"  
When   we ask for the worker's id for the his information
Then the worker's id is returned

Scenario: cheak if user pass in system
Given that the user with pasword "Taha45" want to enter the system 
When the user enter the system with his password 
Then the user is enter the system  

Scenario: cheack if user logout the system 
Given that we want to cheak if the user with id "3" is logout from system 
When the user logged out from system 
Then the user logs out of the system 

Scenario: return id user 
Given  that we want to return id of user from his email "tahasoftware080@gmail.com" and password  "Taha45"
When  we ask for the user's id
Then the id for user is returned

Scenario: check if email is True 

Given that we want to cheak from information about user with id "3" phone "0599874634" email "tahasoftware080gmail.com"  and password "Taha45"
When  we want to cheak the info. with wrong email "tahasoftware080gmail.com"
Then the check email is completed successfully

Scenario: check if phone is True 
Given that we want to cheak from information about user with idd "3" phone "05484" e_mail= "tahasoftware080@gmail.com"  and password "Taha45"
When  we want to cheak the info. with wrong phone "05484"
Then the check phone is completed successfully

Scenario: check if pass is True 
Given that we want to cheak from information about user with id= "3" phone "0599874634" email "tahasoftware080@gmail.com"  and pass "125"
When  we want to cheak the info. with wrong pass "125"
Then the check pass is completed successfully


 
