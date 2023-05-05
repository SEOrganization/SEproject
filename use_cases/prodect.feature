Feature: prodect
@testcreate
Scenario: Create_Product successfully
Given  that the user with email "Rami@gmail.com" is log in 
And there is a prodect  with Category "carpet" ,name "carpet saxony",picture "car1.jpg", description "silk" 
Then the  prodect  with Category "carpet" ,name "carpet saxony",picture "car1.jpg", description "silk" is created successfully 


@testdelete
Scenario: delete product by Serial Number 
Given that the user with email "Rami@gmail.com" want to delete product 
And the producte with SN "1"
Then the prodect with SN "1" is actually deleted


@testupdate 

Scenario: update product successfully 
Given that the user is created product with SN "2" successfully 
And  the product with SN "2" , Category "carpet" ,name "carpet saxony",picture "c2.jpg", description "wool"
Then the prodect with SN "2" is update 
