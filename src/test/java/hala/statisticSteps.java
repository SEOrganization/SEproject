package hala;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertTrue;

import hala.ADMIN;
import hala.DATABASE;
import hala.STATES;



public class statisticSteps {

	STATES stat=new STATES();
	int log =0;
	ADMIN adm=new ADMIN();
 boolean encom=false;
 DATABASE db= new DATABASE();
@Given("that the administrator with email {string} and password {string} wants to know the income of the company")
public void that_the_administrator_with_email_and_password_wants_to_know_the_income_of_the_company(String string, String string2) {
	 log=adm.check(string, string2);
}


@When("the administrator asks for the company's income")
public void the_administrator_asks_for_the_company_s_income() {
	if(log==1) {
	encom=db.encome();	
	}
}

@Then("to obtain the information he wanted")
public void to_obtain_the_information_he_wanted() {

assertTrue(encom);
}


boolean show=false;
@Given("that the administrator with email {string} and password {string} wants to view all orders for the company")
public void that_the_administrator_with_email_and_password_wants_to_view_all_orders_for_the_company(String string, String string2) {
	 log=adm.check(string, string2);
}

@When("he presses the display button")
public void he_presses_the_display_button() {
	if(log==1) {
		show=db.showAllOrder();	
	}
}

@Then("obtain all information related to the order and its status")
public void obtain_all_information_related_to_the_order_and_its_status() {
   assertTrue(show);
}


@Given("that the administrator with email {string} and password {string} asks for debts that have not yet been paid")
public void that_the_administrator_with_email_and_password_asks_for_debts_that_have_not_yet_been_paid(String string, String string2) {
	 log=adm.check(string, string2);
}

boolean dept=false;
@When("it examines orders that have not been received and therefore have not been paid for")
public void it_examines_orders_that_have_not_been_received_and_therefore_have_not_been_paid_for() {
	if(log==1) {
		dept=db.dept();	
	}
}

@Then("get the required information")
public void get_the_required_information() {
	assertTrue(dept); 
}
boolean pay=false;
@Given("that the administrator with email {string} and password {string} asks for debts that have been paid")
public void that_the_administrator_with_email_and_password_asks_for_debts_that_have_been_paid(String string, String string2) {
	log=adm.check(string, string2); 
}

@When("examines the orders received and pay their cost")
public void examines_the_orders_received_and_pay_their_cost() {
	if(log==1) {
		pay=stat.Pay();	
	}  
}


@Then("view information for paid orders")
public void view_information_for_paid_orders() {
	assertTrue(pay); 
}	
	
	

	
	
}
