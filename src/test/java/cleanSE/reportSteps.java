package cleanSE;

 
import static org.junit.Assert.assertTrue;

import cleanSEjava.admin;
import cleanSEjava.report;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class reportSteps {
	int log=0;
	 
	report rep=new report();
	admin adm=new admin(); 
	boolean report=false;
	
	@Given("that the admin with an email {string} and password {string} want to make a report for the company")
	public void that_the_admin_with_an_email_and_password_want_to_make_a_report_for_the_company(String string, String string2) {
		 log=adm.check(string,string2);
	}

	@When("the admin with an email {string} and password {string} want to display all information about the company in a report")
	public void the_admin_with_an_email_and_password_want_to_display_all_information_about_the_company_in_a_report(String string, String string2) {
		  if(log==1) {
			   report= rep.showall();		 
			   
		   }
	}

	@Then("The report is displayed successfully")
	public void the_report_is_displayed_successfully() {
		 assertTrue(report); 
	}
}
 