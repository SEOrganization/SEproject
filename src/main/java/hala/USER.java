package hala;
import java.util.ArrayList;
import java.util.List;
public class USER {
	




	
		 String address;
		 String email;
	 String name;
		 String id;
	 String password;
		 String phone;
		 float point=0;
		
		
		
		
		
		
		
		
		

		USER u1;
		 public static List <USER> userarray=new  ArrayList <USER> ();
		 boolean log=false;
			 static DATABASE db=new DATABASE();
			
		 
		 public USER()
		 {
			 this.initialuser();
		 }
		 
		 
		
		
		
		public  void initialuser() {
			this.address="nablus";
			this.email="ahmad@gmail.com";
			this.id="1";
			this.password="1";
			this.phone="056998521";
			this.name="ahmadjabe";
		
			userarray.add(this);
				}
		

		
		public static int checkuser(String string1, String string2) {
			if((string1.equals("minna@gmail.com") && string2.equals("minna67")) )
					{
						return 1;
					}
			return 0;
		}
		
	}

