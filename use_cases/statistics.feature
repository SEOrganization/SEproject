Feature: Statistics about work 
	Description: Examining the status of orders, the company's income, 
	the debts paid as a result of the customer's receipt of his order, the accrued debts of the customer, the profit.
 Actor: Admin

   
	
Scenario: Income to the company 
	Given that the administrator with email "marah@gmail.com" and password "marah34" wants to know the income of the company 
	When the administrator asks for the company's income 
	Then to obtain the information he wanted 
	
	
	
Scenario: view all order 
	Given that the administrator with email "marah@gmail.com" and password "marah34" wants to view all orders for the company 
	When he presses the display button 
	Then obtain all information related to the order and its status
	
	
	
Scenario: view unpaid orders 
	Given that the administrator with email "marah@gmail.com" and password "marah34" asks for debts that have not yet been paid
	When it examines orders that have not been received and therefore have not been paid for 
	Then get the required information 

Scenario: view paid orders 
	Given that the administrator with email "marah@gmail.com" and password "marah34" asks for debts that have been paid
	When examines the orders received and pay their cost 
	Then view information for paid orders
	
	Scenario: view paid an orders 
	Given that an administrator with email "marah@gmail.com" and password "marah4" asks for debts that have been paid
	When examines orders received and pay their cost 
	Then view info. for paid orders