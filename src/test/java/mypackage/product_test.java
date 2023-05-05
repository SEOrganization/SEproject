package mypackage;
import mypackage.user;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.*;
import mypackage.login_logout_test;
public class product_test {
    product pro;
	user u1;
	database db= new database();
	
	 public product_test () {
		 u1=new user();
		 pro=new product();
		 
		 
	 }
	

	boolean flag_created;
	
	boolean flag_email;
	boolean delete;
	//create
	@Given("that the user with email {string} is log in")
	public void that_the_user_with_email_is_log_in(String email) {
		 flag_created=false;
		// u1.email=email;
		 
		flag_email=db.check_email(email);
		 

	}

	@And("there is a prodect  with Category {string} ,name {string},picture {string}, description {string}")
	public void there_is_a_prodect_with_category_name_picture_description( String string2, String string3, String string4, String string5) {
		db.create_prod( string2, string3, string4, string5,10);
		flag_created=true;
	}

	@Then("the  prodect  with Category {string} ,name {string},picture {string}, description {string} is created successfully")
	public void the_prodect_with_category_name_picture_description_is_created_successfully(String string, String string2, String string3, String string4) {
	  assertTrue(flag_created);
	  assertTrue(flag_email);
	}

	
	//delete
	@Given("that the user with email {string} want to delete product")
	public void that_the_user_with_email_want_to_delete_product(String email2) {
		delete =false;

		 flag_email=db.check_email(email2);
	   
	   
	   
	}

	@Given("the producte with SN {string}")
	public void the_producte_with_sn(String id) {
	db.delete_prod(id);
	delete =true;
	}

	@Then("the prodect with SN {string} is actually deleted")
	public void the_prodect_with_sn_is_actually_deleted(String string) {
		assertTrue(delete);
		assertTrue(flag_email);
		}
	
	boolean update;
	
	//update
	
	@Given("that the user is created product with SN {string} successfully")
	public void that_the_user_is_created_product_with_sn_successfully(String string) {
		update=false;
		flag_created=db.check_SN(string);
	}

	@Given("the product with SN {string} , Category {string} ,name {string},picture {string}, description {string}")
	public void the_product_with_sn_category_name_picture_description(String string, String string2, String string3, String string4, String string5) {
		db.update_prod(string, string2, string3, string4,string5);
		update=true;
	}

	@Then("the prodect with SN {string} is update")
	public void the_prodect_with_sn_is_update(String string) {
		assertTrue(flag_created);
		assertTrue(update);

	}
	
	
	
}
