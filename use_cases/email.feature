Feature: Send an email to the user
	Description: Sending an email to the user that his order is ready and under delivery.
 Actor: company

   
	
Scenario: Send an email to the user.
	Given that order No. "3" of user No. "3" is ready
	When order No. "3" is ready and under delivery, an email is sent to the user with hi email address "tahasoftware080@gmail.com" 
	Then The email was sent successfully