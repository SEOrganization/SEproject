package mypackage;
import mypackage.*;
import java.util.Scanner;


import javax.swing.JOptionPane;


public class Cleaningsrc_main {

	

	
	
	
static void menu_user()
{ 
	//System.out.print("\n*-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**\n");
    System.out.print("*   press 1 if you want to modify your information in the cleaning Application.               * \n");
	System.out.print("|   press 2 if you want to delete your account from the cleaning Application.                 | \n");
	System.out.print("|   press 3 if you want to create new order.                                                  | \n");
	System.out.print("|   press 4 if you want to delete order.                                                      | \n");
	System.out.print("|   press 5 if you want to order status request.                                              | \n");
	System.out.print("|   press 6 if you want to show specific order information.                                   | \n");
	System.out.print("|   press 7 if you want to get the invoice.                                                   | \n");
	System.out.print("|   press 8 if you want to log out                                                            | \n");
	System.out.print("|   press 9 if you want to go to main page                                                    | \n");

	System.out.print("**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-** \n");
	System.out.print("\n choose one of the options: ");	
	
	
	
	
}
static void menu_admin()
{
	
	System.out.print("\n*-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**\n");
	System.out.print("|   press 1 if you want to create new product in the cleaning Application.                    | \n");
	System.out.print("*   press 2 if you want to update your information about product in the cleaning Application. * \n");
	System.out.print("|   press 3 if you want to delete your product from the cleaning Application.                 | \n");
	System.out.print("|   press 4 if you want to show report.                                                       | \n");
	System.out.print("|   press 5 if you want to request the company's income.                                      | \n");
	System.out.print("|   press 6 if you want to show all orders in the company.                                    | \n");
    System.out.print("|   press 7 if you want to view unpaid orderes.                                               | \n");
    System.out.print("|   press 8 if you want to search for user.                                                   | \n");
    System.out.print("|   press 9 if you want to search for product.                                                | \n");
	System.out.print("|   press 10 if you want to log out                                                           | \n");
	System.out.print("|   press 11 if you want to go to main page                                                   | \n");

    System.out.print("**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-** \n");
	System.out.print("\n choose one of the options: ");	
}

static void menu_worker()
{
	System.out.print("\n*-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**\n");
	System.out.print("|   press 1 if you want to enter the number of hours.                                             | \n");
	System.out.print("|   press 2 if you want to know your balance.                                                     | \n");
	System.out.print("|   press 3 if you have finished working on a specific order and want to send an email to the user| \n");
	System.out.print("|   press 4 if you want to log out                                                                | \n");
	System.out.print("|   press 5 if you want to go to main page                                                        | \n");

    System.out.print("**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-** \n");
    System.out.print("\n choose one of the options: ");

	
}
static void choice()
{System.out.print("\n*-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**\n");
 System.out.print("|   press 1 if you are user                                                                    | \n");
 System.out.print("*   press 2 if you are worker                                                                  * \n");
 System.out.print("|   press 3 if you are admin                                                                   | \n");
 System.out.print("**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-** \n");
 System.out.print("\n choose one of the options: ");	
}

static void account()
{
	System.out.print("\n*-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**\n");
	 System.out.print("|   press 1 if you have an account                                                            | \n");
	 System.out.print("*   press 2 if you want to creat account                                                       * \n");
	 System.out.print("|   press 3 if you want to exite from app                                                     | \n");
	 System.out.print("**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-** \n");
	 System.out.print("\n choose one of the options: ");	
	
}

static void account2()
{
	System.out.print("\n*-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**\n");
	 System.out.print("|   press 1 if you have an account                                                            | \n");
	 //System.out.print("*   press 2 if you want to creat account                                                       * \n");
	 System.out.print("|   press 2 if you want to exite from app                                                     | \n");
	 System.out.print("**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-** \n");
	 System.out.print("\n choose one of the options: ");	
	
}



	public static void main(String[] args) 
	{	
		
		
		user testu=new user();
		Scanner scan = new Scanner(System.in);
		database db=new database();
		 user u=new user();
		order o=new order();
		states sta=new states ();
		work wok =new work ();
		int m;
		String id1="",phone1="",name1="",address1="";
		String  id_order="",type="";
		int count;
		boolean fill=false,exist=false,info=false;
		String email,password;
		int num;
		int num1;
		int choice1;
		user d=new user();
		boolean user_log = false;
		boolean adm;
	//	admin admn=new admin();
		String SN = "";
		 String Category = null;
		 String name = null;
		 String picture = null;
		 String description = null;
		// product pro=new product();
		
			 choice();
		 
		 
		 
		 
		 
		while(true) {
			
		Scanner s=new Scanner(System.in);
		choice1=s.nextInt();
		switch(choice1)
		{
		case 1:
		{

		while(true)
			{
			one2:
			{
		account ();
			 
			 
			 
			 
			 
			num=s.nextInt();
			
			switch (num)
			{
		
			case 1://user 
			{
			while(true) {
				one:
				{
					
			System.out.println("\n Your email:");
			email=s.next();
			
			System.out.print("\n Your Password:");
			password=s.next();
			user_log=db.check_email(email)&&db.check_pass(password);
			String id_user=db.return_id2(email,password);
			
			
			if (user_log ==false)
			System.out.print("\n Your email or password is incorrect, please check it ");
		    else 
		    {
	        System.out.print("welcome\n");
	        
	       
	        while(true) {
	        	menu_user();
	            num1=s.nextInt();	
	        switch (num1)
	        {
	        
	        
	        
	     
	        
	        
	      
	 
			
			case 1:
			{boolean existing=false;
				System.out.print(" \n enter your id:");
	    	
	    	id1=scan.nextLine();
	    	//scan.nextLine();
	    	
	    	existing=db.check_if_exist(id1);
	    	if(!existing) {
	    		
	    		
	    		
	    		/////////////////////////
	    		System.out.print(" enter your new information: \n");
	    		//System.out.print(" enter new id:");id=scan.nextLine();
	        	System.out.print(" enter new name: ");	
	        	name1=scan.nextLine();
	        	  scan.nextLine();
	        	System.out.print(" enter new address: ");
	        	address1=scan.nextLine();		
	        	System.out.print(" enter new phone: ");	
	        	phone1=scan.nextLine();
	            System.out.print(" enter new email: ");	
	            email=scan.nextLine();	
	        	System.out.print("  enter new password:");	
	        	password=scan.nextLine();
	        	fill=db.check_fill_fields(id1, phone1, name1, email, address1, password);
	    		if(!fill) {
	    			System.out.println("All fields are required! Please re_enter your information ");
	    			menu_user();		continue;
	    		}
	    		info=db.check_info_True(2,id1,phone1,email,password);	
	    		if(!info) {
	    		//	System.out.println("You already have an account.Please re_enter your information ");
	    			menu_user();	continue;
	    		}
	    	
	    		db.modify_information(id1, phone1, name1, email, address1, password);
	    		
	    		
	    		
	    	}
	    
	    	
	    
				
				
				break;
			}
			case 2:
			{
				
				
				boolean e=false,log=false,debt=true,logout=false ;
				logout=db.logout_completely(id_user);	
				System.out.print("id_user:"+id_user);
		    	//	logout=db.logout_completely(email);
		    		
		    	
		     if(logout)System.out.print("Your account has been cancelled");
		     
		     for (int i=0 ;i <db.dbuser.size();i++)
			 	{
			 		
			 			System.out.println(db.dbuser.get(i).name);
			 			 			System.out.print("\n");
			 	}
				break ;
			}
			
			
			
			case 3:
			{
				 System.out.print(" enter your information about order:");
				
				 System.out.print(" enter your id of order:");
			       	
		        id_order=scan.nextLine();
		          scan.nextLine();
		        
		    		 System.out.print(" enter your type: "); 
		    		 type=scan.nextLine();
		    		 System.out.print(" enter your count: ");
		    		 count=scan.nextInt();
		    		 
		    		 db.createNewOrder(id_order, id_user, count, type);
		    		 System.out.print(" your order is created  ");
		    		 
		    		 for(int i=0;i<db.dborder.size();i++) {
		    			 if ( db.dborder.get(i).id.equals(id_user)&&db.dborder.get(i).idorder.equals(id_order))
		    				{System.out.println("id= "+db.dborder.get(i).idorder+" , id user= "+db.dborder.get(i).id+" , type of order= "+db.dborder.get(i).name+" , discount= "+db.dborder.get(i).discount
		    						+" , price= "+db.dborder.get(i).price+" , received date= "+db.dborder.get(i).lateDate+" , days left= "+db.dborder.get(i).timeReceipt+" , count= "+db.dborder.get(i).count);}
		    				}
		    		 
				
				break;
				
				
	//id_user2 must be the same id when login the app			
				
				
				
				
			}//case 3 creat order 
			
			
			
			case 4:
				
			{
				Scanner san=new Scanner(System.in);
				
				 System.out.print(" enter your id of order:");
				id_order=san.nextLine();
		         
				
				db.cancleorder(id_user,id_order);
				
				
				
				
				
				
				break;
				
				
				
				
				
			}
			
			case 5 :
			{
				 System.out.print(" enter your id of order:");
					id_order=scan.nextLine();
			          scan.nextLine();
				db.request_status(id_user, id_order);
				System.out.println();
				for(int i=0;i<db.dborder.size();i++) {
	    			 
    				System.out.println("id= "+db.dborder.get(i).idorder+" , id user= "+db.dborder.get(i).id+" , type of order= "+db.dborder.get(i).name+" , discount= "+db.dborder.get(i).discount
    						+" , price= "+db.dborder.get(i).price+" , received date= "+db.dborder.get(i).lateDate+" , days left= "+db.dborder.get(i).timeReceipt+" , count= "+db.dborder.get(i).count);
    				}
				break;
			}
			
			
			
			case 6:
			{
				Scanner sca = new Scanner(System.in);

				System.out.print(" enter your id of order:");
				//sca.nextLine();
				id_order=sca.nextLine();
		         
				db.info_order(id_user,id_order );
				//System.out.println(id_user+id_order);
				break;
			}
	        
			
			
			
			
			case 7:
			{String nuser="";
			String addres="";
				boolean  com;
				System.out.print(" enter your id of order:");
				id_order=scan.nextLine();
		          scan.nextLine();

				com=db.is_complete(id_user, id_order);
				
				if (!com)
				{
					System.out.print("The order is'n completed ,I can'n to view the invoce");	
				}
				if(com) 
				{
				o=db.ret(id_user, id_order);
				
				for(int i=0;i<db.dbuser.size();i++) {
					if(db.dbuser.get(i).id.equals(id_user)) {
						nuser=db.dbuser.get(i).name;
						addres=db.dbuser.get(i).address;
					}
				}
				System.out.print("wait for the invoice to be ready...... ");	
				JOptionPane.showMessageDialog(null,"The user name: "+ nuser+"\nThe user address: "+addres +"\n The id user:"
				        +o.id+"\n The id order:"+o.idorder+"\n The type "
				        +o.name+"\n The price: "+o.price+
				         "\n The price after discount: "+o.discount+"\n The count :"
						+o.count+" \n delvery= 15 "+"\n The total price"+o.total_price1,"Invoice",JOptionPane.INFORMATION_MESSAGE);
				
				}
				break;
			}
			case 8://logout
			{
				
				break one;
			}
			case 9:
			{
				break one2;
			}
			
	        }//swithc2
	        
	       
	        
	        }//while2
		    }//else
			
			break;
			
			
			
			
				}//while at one
				}//one
			}///if have account
			
			case 2://i am here 
			{
				
				 System.out.print(" enter your id:");
			       	
		        	id1=scan.nextLine();
		          scan.nextLine();
		        	System.out.print("enter your name: ");
		        	name1=scan.nextLine();
		    		 System.out.print(" enter your address: "); 
		    		 address1=scan.nextLine();
		    		 System.out.print(" enter your phone: ");
		    		 phone1=scan.nextLine();
		    		 System.out.print(" enter your email: ");
		    		 email=scan.nextLine();
		    		 System.out.print(" enter your password:");
		    		 password=scan.nextLine();
		    		
		    	
		   
			
		    		// System.out.print("id="+id+"   phone="+phone+"   name="+name+"   email="+email+"   password="+password+"   address="+address);
			
		    		 fill=db.check_fill_fields(id1, phone1, name1, email, address1, password);
			if(!fill) {
				System.out.print("All fields are required! Please re_enter your information ");
				menu_user(); continue;
			} 
			exist=db.check_if_exist(id1);
			if(!exist) {
				System.out.print("You already have an account.Please re_enter your information 1010 ");
				menu_user();continue;
			}
			
			 
			info=db.check_info_True(1,id1,phone1,email,password);	
			
			if(!info) {
				//System.out.print("You already have an account.Please re_enter your information ");
				menu_user();		continue;
			}
			
			 db.creatNewUser( id1, phone1, name1, email,  address1,  password);
			 System.out.print("An account has been created successfully ");
			 
			 for (int i=0 ;i <db.dbuser.size();i++)
		 	{
		 		
		 			System.out.print(db.dbuser.get(i).name);
		 			 			System.out.print("\n");
		 	}
				
				break;
			}
			
			case 3:
				{
					
					      System.out.println("\n Exiting the program");
					      return;
					  
				}
			
			
			
			
		}
		}
			}
		}//case1 in choice
		
		
		
		
		case 2:
		{
		   boolean wor_login =false;
		   int ch2;
		   int numw ;
		   String id_w;
		  String houres="0";
		  String e_w,p_w;
		   while(true)
			{
			   two2:{
				//menu_worker();
				account2();
				ch2=s.nextInt();
				
				switch(ch2)
				{
				case 1:
				{	while (true)
				{
					two:
					{
						
					System.out.println("\n Your email:");
					 e_w=s.next();
					
					System.out.print("\n Your Password:");
					p_w=s.next();
					
					
					wor_login=	db.check_if_exi8(e_w,p_w);
				
					
					
					if (wor_login ==false)
					System.out.print("\n Your email or password is incorrect, please check it ");
				    else 
				    {
			        System.out.print("welcome\n");
				    
					
			while(true) {
				
				menu_worker();
				
				numw=s.nextInt();
				
				switch(numw)
				{
				case 1:
				{
					
					 System.out.print("please enter number of houres :\n");
					houres=s.nextLine();
					houres=s.nextLine();
					 System.out.print("regested number of houres  succissfly.\n");
					
					
					
					
					
					
					
					
					break;
				}
				
				case 2:
				{
					
					
					id_w=db.return_id(e_w,p_w);
					System.out.print("The Balance of worker with email "+e_w+"\t is:"+db.clac_balace(id_w, houres));
					
					
					break;
				}
				
				case 3:
				{
					
					String id_o;
					String e_o;
					String id_u;
					boolean f;
					email_new e=new email_new();
					//Scanner scan10 = new Scanner(System.in);
					System.out.print("enter the id order :");
					id_o=scan.nextLine();
					e_o=db.re_id(id_o);
					id_u=db.re_id_user(id_o);
					f=db.is_complete(id_u, id_o);
					if (f) {
					System.out.print("wait to send email........");
					e.send_email(e_o,id_o);
					System.out.print(e_o+id_o);
					}
					
					break;
				}
				case 4:
				{
					break two;
				}
				case 5:
				{
					break two2;
				}
				
				
				}
				
			
				
					
				}
				
				
				
			}
			
		
			
		}}}//two,while,case
				
				//hala come here 
				case 2:
				{
					 System.out.println("\n Exiting the program");
				      return;
				     
					
				}
				
				
				
			
				}}
			
		
		
		
			}
		}//case2
				
		
		
		//amdin
		case 3:
		{
			
		int  ad_login =0;
			
			int ad_num;
			int ch ;
			
			Scanner s1=new Scanner(System.in);
			while(true) {
				three2:{
			account2();
				ch=s1.nextInt();
				
				switch(ch)
			
				{
				case 1:
				{	
					while(true) {
						three:{
					
					
					System.out.println("\n Your email:");
					email=s1.next();
					
					System.out.print("\n Your Password:");
					password=s1.next();
					
					
					ad_login=	admin.check(email,password);
				
					
					
					if (ad_login ==0)
					System.out.print("\n Your email or password is incorrect, please check it ");
				    else 
				    {
			        System.out.print("welcome\n");
				    
					
			while(true) {
				
				menu_admin();
				ad_num=s1.nextInt();
				
				
				
				
				
				
				
		switch(ad_num)
		{
		
		
		case 1:
		{
			

        	System.out.print("please enter the information about your product:\n");
        	//System.out.print("SN");
        //	SN=s.next();
        	product p=new product();
        	System.out.print("Category: ");
        	Category=s1.next();
        	System.out.print("name: ");
        	name=s1.next();
        	System.out.print("picture: ");
        	picture=s1.next();
        	System.out.print("description: ");
        	description=s1.next();
        	
   		// product p1=new product();

        	System.out.print("Product created successfully, if you want to check it enter 1  ");
        	if (s1.nextInt()==1)
        	{db.create_prod( Category, name, picture, description,10);
        	for (int i=0 ;i < db.dbproduct.size();i++)
        	{
        		
        			System.out.print("  "+db.dbproduct.get(i).SN);
        			System.out.print("  "+db.dbproduct.get(i).name);
        			System.out.print("  "+db.dbproduct.get(i).Category);
        			System.out.print("  "+db.dbproduct.get(i).description);
        			
        			System.out.print("  "+db.dbproduct.get(i).picture);
        			System.out.print("\n");
        	}
        	}
        	break;
		}//create
		
		
		
		case 2:
		{
			
			

        	System.out.print("please enter the  new information about your product\n");
        	System.out.print("SN of your product:\n");
        	SN=s1.next();
        	System.out.print("new Category:\\n");
        	Category=s1.next();
        	System.out.print("new name:\n");
        	name=s1.next();
        	System.out.print("new picture:\n");
        	picture=s1.next();
        	System.out.print("new pdescription:\n");
        	description=s1.next();
        	//product p3=new product();
        	db.update_prod(SN, Category, name, picture, description);
        	for (int i=0 ;i < db.dbproduct.size();i++)
        	{
        		
        			System.out.print(db.dbproduct.get(i).SN);
        			System.out.print(db.dbproduct.get(i).Category);
        			System.out.print(db.dbproduct.get(i).description);
        			System.out.print(db.dbproduct.get(i).name);
        			System.out.print(db.dbproduct.get(i).picture);
        			System.out.println("\n");
        			
        	}
        	break;
        	
		}
		
		case 3:
		{
			System.out.print("please enter the SN of your product\n");
        	System.out.print("SN\n");
        	SN=s1.next();
        	product p2=new product();
        	db.delete_prod(SN);
          	for (int i=0 ;i <db.dbproduct.size();i++)
        	{
        		
        			System.out.print(db.dbproduct.get(i).SN);
        			System.out.print(db.dbproduct.get(i).Category);
        			System.out.print(db.dbproduct.get(i).description);
        			System.out.print(db.dbproduct.get(i).name);
        			System.out.print(db.dbproduct.get(i).picture);
        			System.out.print("\n");
        	}
        	break;
        	
			
		}
		
		case 4:
		{
			
			report.showall();
			
			
			break;
			
			
			
			
		}
		
		
		case 5:
		{
			db.encome();
			break;
			
			
			
		}
		case 6:
		{
			
			
			db.showAllOrder();
			break;
		}
		 
		
		case 7:
		{
			db.dept();
			break;
		}
		
		
		
		case 8:
		{Scanner s8=new Scanner(System.in);
			
			String nam_user;
			System.out.print("enter the name of the user you want to search for:\n");
			//s.nextLine ();
		 nam_user=	s8.nextLine ();
			
		db.search_user(nam_user);
		break;
			
		}
		case 9:
		{
			Scanner s9=new Scanner(System.in);
			String nam_PRO;
			
			System.out.print("enter the name of the product you want to search for:\n");
		//	s.nextLine ();
		nam_PRO=	s9.nextLine ();
		
		db.search_product(nam_PRO);
		break;
			
		}
		
		case 10:
		{
			break three;
		}
		
		
		case 11:
		{
			break three2;
		}
		
		}
		
		}
				}//else 
						}}	//while and three
				
		}
				
				case 2:
				{
					 System.out.println("\n Exiting the program");
				      return;
				}
					
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				}
			}}
		}//case 3 admain
		
		
		
		
		
		
		
		
		
		
		
		}//switch
			
		
		
		
		
		}//while big
		
	
	
	
	
	
	}
}
	

	


	

	

	

