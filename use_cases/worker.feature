Feature: worker's fees
	Description: The worker logs in to the application, records the number of hours he worked, and requests an advance (a sum of money).
 Actor: worker


Scenario: Worker login to the application
Given that the worker  with email "farah@gmail.com" and pass "farah1112" want to log in to the application
When  the worker with email "farah@gmail.com" and pass "farah1112" logs in to the application
Then The worker is logged in successfully
  


Scenario: The worker enters the number of hours he works per day
Given that the worker  with email "farah@gmail.com" and pass "farah1112" want to enter the houres 
When   the worker records the number of hours worked per day "10"  and worker with id "4"
Then the registration process for the hours was complte
 
 
 

 