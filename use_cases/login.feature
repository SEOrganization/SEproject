Feature: login and logout 
 Description: The admin and user login and logout  to the system
 #login
@testlogin_admin  

  Scenario Outline: Login admin 
    Given that the admin is not logged in
    And I check for the email  and pass <email><pass>
    Then the admin login is  <status> 




    Examples: 
      | email             | pass        |status |
      | "hala@gmail.com"  | "hala12"    |success|
      | "marah@gmail.com" | "marah34"   |Fail   |
@testlogin_user      
Scenario: user can login
Given that the user is not logged in
And I chek for email and   password is "minna@gmail.com" "minna67"
Then the user log in succeeds





Scenario: user  cannot login
Given that the user is not logged in
And I chek for email and   password is "wrong" "wrong"
Then the user log in fails


#logout 
Scenario: Admin log out
	Given that the admin is logged in
	When the admin logs out
	Then the admin is logged out

	Scenario: user log out
	Given that the user is logged in
	When the user logs out
	Then the user is logged out