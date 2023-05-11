package hala;

import static org.junit.Assert.assertTrue;

import hala.DATABASE;
import hala.USER;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class userSteps {
USER u;
DATABASE db;
	public userSteps(DATABASE b,USER s) {
		u=s;
		db=b;
	}

	
boolean log=false,modify=false,fd=false;
String id,phone,name,email,address,password;
@Given("that the user with id {string} is logged in")
public void that_the_user_with_id_is_logged_in(String string) {
   log=db.logApp(string); 
   id=string;
}

@When("the user wants to modify his phone to {string} , name to {string} ,email to {string} ,adderss to {string} and password to {string}")
public void the_user_wants_to_modify_his_phone_to_name_to_email_to_adderss_to_and_password_to(String string, String string2, String string3, String string4, String string5) {
	phone=string;
	name=string2;
	email=string3;
	address=string4;
	password=string5;
	if(log) {
		modify=db.check_info_True(0,id,string,string3,string5);	//i don't think is needed
		
		
	} 
	
}

@When("the user modified his information without enter wrong or similar information another user")
public void the_user_modified_his_information_without_enter_wrong_or_similar_information_another_user() {
if(modify) {
		
    	db.modify_information(id,phone,name,email,address,password);
    	
    }
}




@Then("The modification was completed successfully")
public void the_modification_was_completed_successfully() {
   assertTrue(modify);
}
}
