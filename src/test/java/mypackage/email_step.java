package mypackage;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.*;

public class email_step {
boolean fl=false,eml=false;
database db=new database();
email_new e=new email_new();
	@Given("that order No. {string} of user No. {string} is ready")
	public void that_order_no_of_user_no_is_ready(String string, String string2) {
	   fl= db.is_complete(string2, string);
	}

	
	
	
	
	
	
	@When("order No. {string} is ready and under delivery, an email is sent to the user with hi email address {string}")
	public void order_no_is_ready_and_under_delivery_an_email_is_sent_to_the_user_with_hi_email_address(String string, String string2) {
	  if(fl) {
		  eml=e.send_email(string2,string);
	  }
	}

	@Then("The email was sent successfully")
	public void the_email_was_sent_successfully() {
		
	    assertTrue(eml);
	}	
	
	
	
	
	
}
