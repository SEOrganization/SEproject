package mypackage;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

import mypackage.database;

public class user {
	public String address;
	public String email;
	public String name;
	public String id;
	public String password;
	public String phone;
	public float point=0;
	
	
	
	
	
	
	
	//public boolean paid ;
	user u1;
	 public static ArrayList <user> user_array=new ArrayList <user> ();
	 public boolean log=false;
		public static database db=new database();
		
	 
	 public user()
	 {
		 this.initial_user();
	 }
	 
	 
	 
	/* 
	public  static boolean check_email(String email)
	{  for (int i=0 ;i < user_array.size();i++)
		{
			if (user_array.get(i).email.equals(email))
		{return true;}
		}
	return false;
		
	}
	
	
	
	public  static boolean check_pass(String pass)
	{  for (int i=0 ;i < user_array.size();i++)
		{
			if (user_array.get(i).password.equals(pass))
		{return true;
		
		}
		}
	return false;
		
	}*/
	
	
	public  void initial_user() {
		this.address="nablus";
		this.email="ahmad@gmail.com";
		this.id="1";// befor 2 
		this.password="1";
		this.phone="056998521";
		this.name="ahmadjabe";
	
		user_array.add(this);
			}
	

	
	public static int checkuser(String string1, String string2) {
		if((string1.equals("minna@gmail.com") && string2.equals("minna67")) )
				{
					return 1;
				}
		return 0;
	}
	
	
}