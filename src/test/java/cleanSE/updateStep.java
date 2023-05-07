package cleanSE;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import cleanSEjava.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class updateStep {

	order o=new order();
	database db=new database();
	boolean flag=false;
	@Given("that we want to return the order information through the user's order number {string} the order number {string}")
	public void that_we_want_to_return_the_order_information_through_the_user_s_order_number_the_order_number(String string, String string2) {
	o=db.ret(string, string2);
		if(o!=null) {
			flag=true;
		}
		 
	}

	

	
	@Then("Then the requested order will be returned")
	public void then_the_requested_order_will_be_returned() {
	  assertTrue(flag);   

}

@Given("that we want to return order information through the user's order number {string} the order number {string}")
public void that_we_want_to_return_order_information_through_the_user_s_order_number_the_order_number(String string, String string2) {
	o=db.ret(string, string2);
	if(o==null) {
		flag=true;
	} 
}

@Then("the requested order will be returned")
public void the_requested_order_will_be_returned() {
	assertTrue(flag);   
}

	boolean stat=false;
	boolean asser=false;
	boolean stat1=false;
	boolean asser11=false;			
	boolean stat2=false;
	boolean asser22=false;				
		
	
@Given("that we want to know status for order with  number {string} belonging to user number {string}")
public void that_we_want_to_know_status_for_order_with_number_belonging_to_user_number(String string, String string2) {
     stat=db.request_status(string2, string);
}

@When("the user request status of order with no. {string}")
public void the_user_request_status_of_order_with_no(String string) {
  if(stat)  {
	  asser=true;
  }
}

@Then("Gets the status of the order")
public void gets_the_status_of_the_order() {
   assertTrue(asser); 
}	
	


@Given("that we want to know status order with no. {string} belonging to user number {string}")
public void that_we_want_to_know_status_order_with_no_belonging_to_user_number(String string, String string2) {
    stat1=db.request_status(string2, string);
}

@When("user request status of order with no. {string}")
public void user_request_status_of_order_with_no(String string) {
	if(stat1)  {
		  asser11=true;
	  }   
}

@Then("Gets the statu of the order")
public void gets_the_statu_of_the_order() {
	   assertTrue(asser11);
}

@Given("that we want to know status for order  number {string} belonging to user number {string}")
public void that_we_want_to_know_status_for_order_number_belonging_to_user_number(String string, String string2) {
	 stat2=db.request_status(string2, string);
}

@When("the user request status order with no. {string}")
public void the_user_request_status_order_with_no(String string) {
	if(stat2)  {
		  asser22=true;
	  }
}

@Then("Get the status of the order")
public void get_the_status_of_the_order() {
	 assertTrue(asser22);
}
boolean  stat3=false;
boolean  asser23=false;
@Given("that we  know status for order with  number {string} belonging to user number {string}")
public void that_we_know_status_for_order_with_number_belonging_to_user_number(String string, String string2) {
	stat3=db.request_status(string2, string);
}

@When("the user request status of order with num. {string}")
public void the_user_request_status_of_order_with_num(String string) {
	if(stat3)  {
		  asser23=true;
	  } 
}

@Then("Gets the status of the order with num1")
public void gets_the_status_of_the_order_with_num1() {
	 assertFalse(asser23);
}

//////
	boolean serch=false;
	boolean asser1=false;
	
	
@Given("that we want to search about user by using his name like {string}")
public void that_we_want_to_search_about_user_by_using_his_name_like(String string) {
	serch=db.search_user(string);   
}

@When("we search for the user's name")
public void we_search_for_the_user_s_name() {
  if(serch) {
	  asser1=true;
  }
}

@Then("the user information is returned")
public void the_user_information_is_returned() {
	  assertTrue(asser1);   
}

boolean pro=false;
boolean ass2=false;
@Given("that we want to search about product by using its name like {string}")
public void that_we_want_to_search_about_product_by_using_its_name_like(String string) {
  pro=db.search_product(string) ;  
}

@When("we search for the product's name")
public void we_search_for_the_product_s_name() {
   if(pro) {
	   ass2=true;
   }
}

@Then("the product information is returned")
public void the_product_information_is_returned() {
     assertTrue(ass2);
}

String email="";
boolean ass3=false;

@Given("that we want to return email of user from order with no. {string}")
public void that_we_want_to_return_email_of_user_from_order_with_no(String string) {
	  email=db.re_id(string);
}

@When("we ask for the user's email for the order")
public void we_ask_for_the_user_s_email_for_the_order() {
 if(!email.equals(""))ass3=true;
}

@Then("the user's email is returned")
public void the_user_s_email_is_returned() {
 assertTrue(ass3);  
}
String idu="";
@Given("that we want to return id of user from order with no. {string}")
public void that_we_want_to_return_id_of_user_from_order_with_no(String string) {
    idu=db.re_id_user(string);
}
boolean ass4=false;
@When("we ask for the user's id for the order")
public void we_ask_for_the_user_s_id_for_the_order() {
	if(!idu.equals(""))ass4=true; 
}

@Then("the user's id is returned")
public void the_user_s_id_is_returned() {
	 assertTrue(ass4);   
}
boolean ass5=false;
String use="";
@Given("that we want to return id of worker from his email {string} and password {string}")
public void that_we_want_to_return_id_of_worker_from_his_email_and_password(String string, String string2) {
	use=db.return_id(string, string2);
}

@When("we ask for the worker's id for the his information")
public void we_ask_for_the_worker_s_id_for_the_his_information() {
	if(!use.equals(""))ass5=true;   
}

@Then("the worker's id is returned")
public void the_worker_s_id_is_returned() {
	 assertTrue(ass5); 
}
boolean ass6=false;
boolean eml=false;
@Given("that the user with pasword {string} want to enter the system")
public void that_the_user_with_pasword_want_to_enter_the_system(String string) {
     eml=db.check_pass(string);
}

@When("the user enter the system with his password")
public void the_user_enter_the_system_with_his_password() {
   if(eml)ass6=true;  
}

@Then("the user is enter the system")
public void the_user_is_enter_the_system() {
	 assertTrue(ass6); 
}

boolean ass7=false;
boolean log=false;
@Given("that we want to cheak if the user with id {string} is logout from system")
public void that_we_want_to_cheak_if_the_user_with_id_is_logout_from_system(String string) {
   log=db.logout(string);
}

@When("the user logged out from system")
public void the_user_logged_out_from_system() {
   if(log)ass7=true;
}

@Then("the user logs out of the system")
public void the_user_logs_out_of_the_system() {
	assertTrue(ass7); 
}
boolean ass8=false;
String chid="";
@Given("that we want to return id of user from his email {string} and password  {string}")
public void that_we_want_to_return_id_of_user_from_his_email_and_password(String string, String string2) {
	chid=db.return_id2(string,string2);
}

@When("we ask for the user's id")
public void we_ask_for_the_user_s_id() {
    if(!chid.equals(""))ass8=true;
}

@Then("the id for user is returned")
public void the_id_for_user_is_returned() {
	assertTrue(ass8);  
}
boolean  ass9=false;
boolean  ass9a=false;
boolean  ass9b=false;
boolean  ass9c=false;
boolean chin=false;
@Given("that we want to cheak from information about user with id {string} phone {string} email {string}  and password {string}")
public void that_we_want_to_cheak_from_information_about_user_with_id_phone_email_and_password(String string, String string2, String string3, String string4) {
  chin =db.check_info_True(0, string, string2, string3, string4) ; 
}



@When("we want to cheak the info. with wrong email {string}")
public void we_want_to_cheak_the_info_with_wrong_email(String string) {
	if(chin)ass9=true; 
}
@Then("the check email is completed successfully")
public void the_check_email_is_completed_successfully() {
 assertFalse(chin); 
}


boolean assa1=false;
boolean assa2=false;
boolean chphone=false;
boolean chpass=false;


@Given("that we want to cheak from information about user with idd {string} phone {string} e_mail= {string}  and password {string}")
public void that_we_want_to_cheak_from_information_about_user_with_idd_phone_e_mail_and_password(String string, String string2, String string3, String string4) {
	 chphone =db.check_info_True(0, string, string2, string3, string4) ; 
}



@When("we want to cheak the info. with wrong phone {string}")
public void we_want_to_cheak_the_info_with_wrong_phone(String string) {
 if(chphone)assa1=true;
}

@Then("the check phone is completed successfully")
public void the_check_phone_is_completed_successfully() {
	 assertFalse(assa1);  
}

@Given("that we want to cheak from information about user with id= {string} phone {string} email {string}  and pass {string}")
public void that_we_want_to_cheak_from_information_about_user_with_id_phone_email_and_pass(String string, String string2, String string3, String string4) {
	chpass =db.check_info_True(0, string, string2, string3, string4) ; 
}

@When("we want to cheak the info. with wrong pass {string}")
public void we_want_to_cheak_the_info_with_wrong_pass(String string) {
    if(chpass)assa2=true;
}

@Then("the check pass is completed successfully")
public void the_check_pass_is_completed_successfully() {
   assertFalse(assa2);
}

}