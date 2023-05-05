Feature: Register user to the Application 
	Description: a user regester by id, phone ,name ,email,address and password
 Actor:user


Scenario: register user when the user is not logged in 
	Given that the user is not logged in 
	When the user with id "1"   register in the App
	And there is a user with id "1" phone "0599516698" , name "Naser shakhshir",email "Naser@gmail.com" ,address "Zawata" , and password "Naser12" 
	Then the user with id "1"  phone "0599516698" , name "Naser shakhshir",email "Naser@gmail.com" ,address "Zawata" , and password "Naser12" is registered in the Application 
	
Scenario: user registration failed 
	Given that the user opened sign up page
	When the user with id "1" , phone "0599516698" , name "Naser shakhshir",email "Naser@gmail.com" ,address "" , and password "Naser12" is register 
	And one or more fields are not filled 
	Then error message "There are required fields that you did not fill out " is given

Scenario: register users when this user is already registered 
    Given that the user is trying to log into the application 
	When the user with  id "3" is already registered 
	#And the user tries to register for the second time 
	Then error message " This user is already registered" appears to the user
	
	
Scenario: log off user
     Given that the user with id "3" register
     When  the user has no dabts to the company
     And  the user try to log out from the Application
	Then the user is out of the Application
	
#this scenario i do not make it yet	
#Scenario: Fail Unregister a user 
#	Given  that the user with id "2" is logged into the application
#	When the user try to unregister from Application without pay what he owed 
#	Then the user is not out of Application
#	Then the error massege "you have an order ready and have not received and paid for it" is given 
	
	