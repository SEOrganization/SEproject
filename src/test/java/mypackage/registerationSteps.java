package mypackage;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import static org.junit.Assert.assertFalse;

import mypackage.database;
import mypackage.user;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class registerationSteps {
	user u;
	database dbu;
	boolean login;
	boolean register;
	public registerationSteps(user b,database a) { 
		u=b;
		dbu=a;
		}
	  



	@Given("that the user is not logged")
	public void that_the_user_is_not_logged() {
		login=false;
	}
	@When("the user with id {string}   register in the App")
	public void the_user_with_id_register_in_the_app(String string) {
		 register=dbu.check_if_exist(string);
	}
	  
	 
	  
	  
	  //if satament then is logg -> }
	@When("there is a user with id {string} phone {string} , name {string},email {string} ,address {string} , and password {string}")
	public void there_is_a_user_with_id_phone_name_email_address_and_password(String string, String string2, String string3, String string4, String string5, String string6) {
		 if(register) {
			 dbu.creatNewUser(string,string2,string3,string4,string5,string6);
		  login=true;
	}
	}

	@Then("the user with id {string}  phone {string} , name {string},email {string} ,address {string} , and password {string} is registered in the Application")
	public void the_user_with_id_phone_name_email_address_and_password_is_registered_in_the_application(String string, String string2, String string3, String string4, String string5, String string6) {
		assertTrue(login);
	}
	  
	/////////scenario no 2
	
	public boolean signup;
	public boolean register2;
	public boolean fill;
	public boolean ass2;

@Given("that the user opened sign up page")
public void that_the_user_opened_sign_up_page() {
	signup=true; ///how i can make function in this step
	
}
@When("the user with id {string} , phone {string} , name {string},email {string} ,address {string} , and password {string} is register")
public void the_user_with_id_phone_name_email_address_and_password_is_register(String string, String string2, String string3, String string4, String string5, String string6) {
	register2=dbu.check_if_exist(string);
	fill=dbu.check_fill_fields(string,string2,string3,string4,string5,string6);
	
}

@When("one or more fields are not filled")
public void one_or_more_fields_are_not_filled() {
  if(register2 && fill&&signup)ass2=false;
  else if(!(register2 && fill)){ ass2=true;
	dbu.message_for_user();
  }
}

@Then("error message {string} is given")
public void error_message_is_given(String string) {

	assertTrue(ass2);
}

	///////scenario no 3


public boolean logApp=false; 
public boolean ass3=false;
public boolean register3=false;
@Given("that the user is trying to log into the application")
public void that_the_user_is_trying_to_log_into_the_application() {

}

@When("the user with  id {string} is already registered")
public void the_user_with_id_is_already_registered(String string) {
	   logApp=dbu.logApp(string);
   if(logApp) {
	   register3=dbu.check_if_exist(string);
	   if(!register3) {ass3=true;
		dbu.message_for_user1();
	   }
   }
}

@Then("error message {string} appears to the user")
public void error_message_appears_to_the_user(String string) {
    assertTrue(ass3);
}
	


//////scenario no 4
public boolean logApp1; 
String id3;
boolean f;
boolean removu,debt;
@Given("that the user with id {string} register")
public void that_the_user_with_id_register(String string) {
   logApp1=dbu.logApp(string);
   f=dbu.check_if_exist(string);
   id3=string;
}
// we must make this step to be correct 
@When("the user has no dabts to the company")
public void the_user_has_no_dabts_to_the_company() {
   debt=dbu.check_if_debt(id3);
}

@When("the user try to log out from the Application")
public void the_user_try_to_log_out_from_the_application() {
    if(!f && logApp1) {
    	removu= dbu.logout_completely(id3);
    }
}

@Then("the user is out of the Application")
public void the_user_is_out_of_the_application() {
   assertTrue(removu);
}


	
	
	
	
	
	
	
	
}



