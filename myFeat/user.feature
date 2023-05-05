Feature: user requests
Description:The user modifies his personal information
 Actor: user
 

    	
Scenario: modify user information
    Given that the user with id "2" is logged in 
    When the user wants to modify his phone to "0599874647" , name to "Ahmad" ,email to "Rami@gmail.com" ,adderss to "naqura" and password to "Ahmad14"
    And the user modified his information without enter wrong or similar information another user 
    Then The modification was completed successfully 
    