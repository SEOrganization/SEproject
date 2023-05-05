Feature: user order
	Description: The user submits an order to the company, amends the order,
	 cancels his order if it has not been started, requests the current stage of his order, and receives the order
 Actor: user






Scenario: Create a new order
 Given that The user submits a new order and  he is already registered in the application
 When  the user with number "2" enters the information of order which the number "3" quantity 3 and type is "carpet saxony"
Then  the request is registered successfully


# not pass cause its in progress cause 5 day (this is the first order)
Scenario: Cancellation of an order by the user
Given that the user with the number "3" requests to cancel an order with number "3" before starting work on it
When  the user with number "3" cancels his order with number "3"
Then  the order was canceled successfully



Scenario: Order status
Given that the user with the number "3" requests the status of his request
When  the user with number "3" requests the status of order number "3"
Then  your order status will be displayed



Scenario: specific order information
Given that the user with number "3" requests specific order information
When  the user with number "3" requests information about his order number "3"
Then  display the required order informatio



Scenario: Receipt of the order and payment of the amount
Given that the user with number "2" wants to receive his order with No. "3" was in a state of completion.
When   the user with number "2" requests to receive his order number "3" and pay his debt
Then the application was received and the debt was paid


