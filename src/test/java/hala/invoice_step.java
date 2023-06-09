package hala;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import hala.DATABASE;
import hala.ORDER;
import io.cucumber.java.en.*;

public class invoice_step {

	
	ORDER o_obj1=new ORDER();
	boolean flag_completed=false ;
	boolean flag_completed2=false ;

	int toloal_price=0;
	int totoal_price_act ;
	float order_price;
	boolean flag_pric=false ;
	String  id;
	
	String  id_user;
	DATABASE db=new DATABASE();
	@Given("order with id {string} for the user's id {string} has been completed")
	public void order_with_id_for_the_user_s_id_has_been_completed(String string, String string2) {
		flag_completed=	db.iscomplete(string2,string);
		id_user=string;
		id=string2; 
	}

	@When("the price of the order  {string}")
	public void the_price_of_the_order(String string) {
		toloal_price=Integer.parseInt(string);
		order_price= Float.parseFloat(string);
		if (o_obj1.isprice(order_price,id_user,id) )
		{flag_pric=true;

		}

	}

@When("the price for delivery  {string}")
public void the_price_for_delivery(String string) {
	toloal_price+=Integer.parseInt(string);
}

@When("the toltal price  {string}")
public void the_toltal_price(String string) {
	totoal_price_act=Integer.parseInt(string);
}

	@Then("create an invoice success")
	public void create_an_invoice_success() {
		assertTrue(flag_completed);
		assertNotEquals(totoal_price_act,toloal_price );
		assertFalse(flag_pric);
	}
	@Given("order with id {string} for the user with id {string} has been completed")
	public void order_with_id_for_the_user_with_id_has_been_completed(String string, String string2) {
		flag_completed=	db.iscomplete(string2,string);
	id_user=string;
	id=string2;
		
	}

	@When("the price of the order is {string}")
	public void the_price_of_the_order_is(String string) {
		toloal_price=Integer.parseInt(string);
		order_price= Float.parseFloat(string);
		if (o_obj1.isprice(order_price,id_user,id) )
		{flag_pric=true;
			
		}
		
	}


	@When("the price for delivery is {string}")
	public void the_price_for_delivery_is(String string) {
	
		toloal_price+=Integer.parseInt(string);
		
	}

	@When("the toltal price is {string}")
	public void the_toltal_price_is(String string) {
		totoal_price_act=Integer.parseInt(string);

	}
	
	@Then("create invoice success")
	public void create_invoice_success() {
		
	assertTrue(flag_completed);
	assertEquals(totoal_price_act,toloal_price );
	assertTrue(flag_pric);
	
	}

	
	
	
	
	
	@Given("rder with id {string} for the user with id {string} has been completed")
	public void rder_with_id_for_the_user_with_id_has_been_completed(String string, String string2) {
		flag_completed2=	db.iscomplete(string2,string);

	}



	@Given("the order is in state clean or wating")
	public void the_order_is_in_state_clean_or_wating() {
	    
	}

	@Then("create invoice  not success")
	public void create_invoice_not_success() {
		assertTrue(!flag_completed2);

	}
	
	
	
	
}
