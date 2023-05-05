package cleanSE;


	import static org.junit.Assert.assertEquals;
	import static org.junit.Assert.assertTrue;

	import javax.swing.JOptionPane;

import cleanSEjava.database;
import cleanSEjava.work;
import io.cucumber.java.en.*;

	public class worker_steps {
		database db =new database ();
		work wo=new work();
		boolean log_wo;
@Given("that the worker  with email {string} and pass {string} want to log in to the application")
public void that_the_worker_with_email_and_pass_want_to_log_in_to_the_application(String string, String string2) {
	db.check_if_exi8( string,  string2);
}

@When("the worker with email {string} and pass {string} logs in to the application")
public void the_worker_with_email_and_pass_logs_in_to_the_application(String string, String string2) {
	if (work.log_worker==true)
	   {
		   log_wo=true;
	   }
}

@Then("The worker is logged in successfully")
public void the_worker_is_logged_in_successfully() {
	 assertTrue(log_wo);
}
String balance;
String act= "500";
String tem;

String bala;
boolean pas=false;
@Given("that the worker  with email {string} and pass {string} want to enter the houres")
public void that_the_worker_with_email_and_pass_want_to_enter_the_houres(String string, String string2) {
	pas=db.check_email(string, string2);
	if(pas)
	log_wo=true;
}

@When("the worker records the number of hours worked per day {string}  and worker with id {string}")
public void the_worker_records_the_number_of_hours_worked_per_day_and_worker_with_id(String string, String string2) {
	bala=db.clac_balace(string2, string); 
}

@Then("the registration process for the hours was complte")
public void the_registration_process_for_the_hours_was_complte() {
	 assertTrue(log_wo);
     
	  assertEquals(bala, act);
}

	} 