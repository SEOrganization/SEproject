Feature: reports about business
	Description: generate customized reports about business
 Actor: company

   
	
Scenario: 
	Given that the admin with an email "marah@gmail.com" and password "marah34" want to make a report for the company 
	 When the admin with an email "marah@gmail.com" and password "marah34" want to display all information about the company in a report
	Then  The report is displayed successfully 
	
	