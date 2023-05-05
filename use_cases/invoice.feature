
Feature: invoice for customer

Scenario: create invice for customer successful
    Given order with id "3" for the user with id "3" has been completed 
    When the price of the order is "20"
    And the price for delivery is "15"
    And the toltal price is "35"
    Then create invoice success
     
     
     
     

 Scenario: create invice for customer not successful
    Given rder with id "4" for the user with id "3" has been completed 
    And the order is in state clean or wating 
 Then create invoice  not success
 
 