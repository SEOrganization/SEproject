package clean2;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;
public class USER {
	




	
		public String address;
		public String email;
		public String name;
		public String id;
		public String password;
		public String phone;
		public float point=0;
		
		
		
		
		
		
		
		
		

		USER u1;
		 public static ArrayList <USER> user_array=new ArrayList <USER> ();
		 public boolean log=false;
			public static DATABASE db=new DATABASE();
			
		 
		 public USER()
		 {
			 this.initial_user();
		 }
		 
		 
		
		
		
		public  void initial_user() {
			this.address="nablus";
			this.email="ahmad@gmail.com";
			this.id="1";
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


