package hala;
import java.lang.System.Logger.Level;
import java.util.Scanner;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class MAIN {
	
	
	
	
	

		private static final Logger logger = Logger.getLogger(MAIN.class.getName());
		  static Scanner s=new Scanner(System.in);
		  static	USER testu=new USER();
		  static	Scanner scan = new Scanner(System.in);
		  static	DATABASE db=new DATABASE();
		  static USER u=new USER();
		  static ORDER o=new ORDER();
		  static STATES sta=new STATES ();
		  static WORK wok =new WORK ();
		  static	int m;
		  static String id1;
		 static String phone1;
		  static String name1;
		  static String address1;
		  static String  idorder;
				static String type;
		  static int count;
		  static boolean fill=false;
		  static boolean exist=false;
		  static boolean info=false;
		  static String email;
		  static String  password;
		  static int num;
		  static int num1;
			
		  static USER d=new USER();
		  static boolean userlog = false;
		  static	boolean adm;
		  static String sn ;
		  static String category ;
		  static  String name ;
		  static String picture ;
		  static String description;
		  
		  static boolean worlogin =false;
		  static  int ch2;
		  static int numw ;
		  static String idw;
		  static  String houres="0";
		  static String ew;
		  static String pw;
		  static void els() {
			  logger.info("welcome.\n");
			    
				
				while(true) {
					
					menuworker();
					
					numw=s.nextInt();
					
					switch(numw)
					{
					case 1:
					{
						
						logger.info("please enter number of houres :\n");
						houres=s.nextLine();
						houres=s.nextLine();
						logger.info("regested number of houres  succissfly.\n");
						
						
						
						
						
						
						
						
						break;
					}
					
					case 2:
					{
						
						
						idw=db.returnid(ew,pw);
						logger.info("The Balance of worker with email ");
						logger.info(ew);
						logger.info("\t is:");
						String isd=db.clacbalace(idw, houres);
						logger.info(isd);
						break;
					}
					
					case 3:
					{
						
						String ido;
						String eo;
						String idu;
						boolean f;
						EMAIL e=new EMAIL();
						logger.info("enter the id order :");
						ido=scan.nextLine();
						eo=db.reid(ido);
						idu=db.reiduser(ido);
						f=db.iscomplete(idu, ido);
						if (f) {
							logger.info("wait to send email........");
						e.sendemail(eo,ido);
						String as= eo+ido;
						logger.log(null,as);
						}
						
						break;
					}
					case 4:
					{
						ca1();
						break ;
					}
					case 5:
					{
					 worker();
					 break;
					}
					default :
					{
						logger.info("The enteryis not correct!.");
					}
					
					
					}
					
				
					
						
					}
		  }
		  static void ca1() {
				while (true)
				{
					
						
						logger.info("\n Your email::");
					 ew=s.next();
					
					 logger.info("\n Your Password::");
					pw=s.next();
					
					
					worlogin=	db.checkifexi8(ew,pw);
				
					
					
					if (!worlogin)
						logger.info("\n Your email or password is incorrect, please check it .");
				    else 
				    {
				    	 els() ;	
		}
			
		
			

					
				
				
				
				
				
				
				
				}
		  }
		  
		  
		  static void worker() {

			   
			   while(true)
				{
				   
					account2();
					ch2=s.nextInt();
					
					switch(ch2)
					{
					case 1:
					{
						ca1();
						break;
					}
					
					 
					case 2:
					{
						logger.info("\n Exiting the program.");
					      return;
					     
						
					}
					
					default :{
						logger.info("\n you have entered a wrong number!");
					}
					
				
					}
				
			
			
			
				}
			  
		  }
		
	static void menuuser()
	{ 
		logger.info("*   press 1 if you want to modify your information in the cleaning Application.               * \n");
		logger.info("|   press 2 if you want to delete your account from the cleaning Application.                 | \n");
		logger.info("|   press 3 if you want to create new order.                                                  | \n");
		logger.info("|   press 4 if you want to delete order.                                                      | \n");
		logger.info("|   press 5 if you want to order status request.                                              | \n");
		logger.info("|   press 6 if you want to show specific order information.                                   | \n");
		logger.info("|   press 7 if you want to get the invoice.                                                   | \n");
		logger.info("|   press 8 if you want to log out                                                            | \n");
		logger.info("|   press 9 if you want to go to main page                                                    | \n");

		
		
		
		
	}
	static void menuadmin()
	{
		
		logger.info("|   press 1 if you want to create new product in the cleaning Application.                    | \n");
		logger.info("*   press 2 if you want to update your information about product in the cleaning Application. * \n");
		logger.info("|   press 3 if you want to delete your product from the cleaning Application.                 | \n");
		logger.info("|   press 4 if you want to show report.                                                       | \n");
		logger.info("|   press 5 if you want to request the company's income.                                      | \n");
		logger.info("|   press 6 if you want to show all orders in the company.                                    | \n");
		logger.info("|   press 7 if you want to view unpaid orderes.                                               | \n");
		logger.info("|   press 8 if you want to search for user.                                                   | \n");
		logger.info("|   press 9 if you want to search for product.                                                | \n");
		logger.info("|   press 10 if you want to log out                                                           | \n");
		logger.info("|   press 11 if you want to go to main page                                                   | \n");

	}


	static void cas1()
	{
		
	int  adlogin =0;
		
		int adnum;
		
		
		Scanner s1=new Scanner(System.in);
		while(true) {
			three:{
		
		
				logger.info("\n Your email:::");
		email=s1.next();
		
		logger.info("\n Your Password:::");
		password=s1.next();
		
		
		adlogin=	ADMIN.check(email,password);

		
		
		if (adlogin ==0)
			logger.info("\n Your email or password is incorrect, please check it.. ");
	    else 
	    {
	    	logger.info("welcome..\n");
	    
		
	while(true) {

	menuadmin();
	adnum=s1.nextInt();







	switch(adnum)
	{


	case 1:
	{


	logger.info("please enter the information about your product:\n");

	logger.info("Category: ");
	category=s1.next();
	logger.info("name: ");
	name=s1.next();
	logger.info("picture: ");
	picture=s1.next();
	logger.info("description: ");
	description=s1.next();


String spa="  ";
	logger.info("Product created successfully, if you want to check it enter 1  ");
	if (s1.nextInt()==1)
	{db.createprod( category, name, picture, description,10);
	for (int i=0 ;i < db.dbproduct.size();i++)
	{
logger.info(spa);
	logger.info(db.dbproduct.get(i).sn);
		logger.info(spa);
	logger.info(db.dbproduct.get(i).name);
		logger.info(spa);
	logger.info(db.dbproduct.get(i).category);
		logger.info(spa);
	logger.info(db.dbproduct.get(i).description);
	logger.info(spa);
	logger.info(db.dbproduct.get(i).picture);
	logger.info("\n");
	}
	}
	break;
	}



	case 2:
	{



	logger.info("please enter the  new information about your product\n");
	logger.info("SN of your product:\n");
	sn=s1.next();
	logger.info("new Category:\\n");
	category=s1.next();
	logger.info("new name:\n");
	name=s1.next();
	logger.info("new picture:\n");
	picture=s1.next();
	logger.info("new pdescription:\n");
	description=s1.next();

	db.updateprod(sn, category, name, picture, description);
	for (int i=0 ;i < db.dbproduct.size();i++)
	{

	logger.info(db.dbproduct.get(i).sn);
	logger.info(db.dbproduct.get(i).category);
	logger.info(db.dbproduct.get(i).description);
		logger.info(db.dbproduct.get(i).name);
		logger.info("\n");
		
	}
	break;

	}

	case 3:
	{
	logger.info("please enter the SN of your product\n");
	logger.info("SN\n");
	sn=s1.next();

	db.deleteprod(sn);
	for (int i=0 ;i <db.dbproduct.size();i++)
	{

		logger.info(db.dbproduct.get(i).sn);
		logger.info(db.dbproduct.get(i).category);
		logger.info(db.dbproduct.get(i).description);
		logger.info(db.dbproduct.get(i).name);
		logger.info(db.dbproduct.get(i).picture);
		logger.info("\n");
	}
	break;


	}

	case 4:
	{

	REPORT.showall();


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

	String namuser;
	logger.info("enter the name of the user you want to search for:\n");

	namuser=	s8.nextLine ();

	db.searchuser(namuser);
	break;

	}
	case 9:
	{
	Scanner s9=new Scanner(System.in);
	String namPRO;

	logger.info("enter the name of the product you want to search for:\n");

	namPRO=	s9.nextLine ();

	db.searchproduct(namPRO);
	break;

	}

	case 10:
	{
	break three;
	}


	case 11:
	{
		admin();
	break ;
	}
	default :{
	logger.info("the enter is wrong!");
	}

	}

	}
	} 
			}}	

	}
	static void admin() {

		int ch ;
		
		
		
		Scanner s1=new Scanner(System.in);
		while(true) {
			
		account2();
			ch=s1.nextInt();
			
			switch(ch)
		
			{
			case 1:
			{	
				
				cas1();
				break;
			
	}
			
			case 2:
			{
				logger.info("\n Exiting the program..");
			      return;
			}
			default : {
				logger.info("the enter is wrong!.");
			}
				
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			}
		}
	}

	static void menuworker()
	{
		logger.info("|   press 1 if you want to enter the number of hours.                                             | \n");
		logger.info("|   press 2 if you want to know your balance.                                                     | \n");
		logger.info("|   press 3 if you have finished working on a specific order and want to send an email to the user| \n");
		logger.info("|   press 4 if you want to log out                                                                | \n");
		logger.info("|   press 5 if you want to go to main page                                                        | \n");


		
	}
	static void choice()
	{
		logger.info("|   press 1 if you are user                                                                    | \n");
		logger.info("*   press 2 if you are worker                                                                  * \n");
		logger.info("|   press 3 if you are admin                                                                   | \n");
	}


	static void account()
	{
		logger.info("|   press 1 if you have an account                                                            | \n");
		logger.info("*   press 2 if you want to creat account                                                       * \n");
		logger.info("|   press 3 if you want to exite from app                                                     | \n");
		
	}

	static void account2()
	{
		logger.info("|   press 1 if you have an account                                                            | \n");
		logger.info("|   press 2 if you want to exite from app                                                     | \n");
		
	}



	static void user ()
	{
		while(true)
		{
		one2:
		{
	account ();
		 
		 
		 
		 
		 
		num=s.nextInt();
		
		switch (num)
		{

		case 1: 
		{
		while(true) {
			one:
			{
				
				logger.info("\n Your email::::");
		email=s.next();
		
		logger.info("\n Your Password::::");
		password=s.next();
		userlog=db.checkemail(email)&&db.checkpass(password);
		String iduser=db.returnid2(email,password);
		
		
		if (!userlog )
			logger.info("\n Your email or password is incorrect, please check it..... ");
	    else 
	    {
	    	logger.info("welcome...\n");
	    
	   
	    while(true) {
	    	menuuser();
	        num1=s.nextInt();	
	    switch (num1)
	    {
	    
	    
	    
	 
	    
	    
	  

		
		case 1:
		{boolean existing=false;
		logger.info(" \n enter your id:");
		
		id1=scan.nextLine();
		
		
		existing=db.checkifexist(id1);
		if(!existing) {
			
			
			
			logger.info(" enter your new information: \n");
			logger.info(" enter new name: ");	
	    	name1=scan.nextLine();
	    	  scan.nextLine();
	    	  logger.info(" enter new address: ");
	    	address1=scan.nextLine();		
	    	logger.info(" enter new phone: ");	
	    	phone1=scan.nextLine();
	    	logger.info(" enter new email: ");	
	        email=scan.nextLine();	
	        logger.info("  enter new password:");	
	    	password=scan.nextLine();
	    	fill=db.checkfillfields(id1, phone1, name1, email, address1, password);
			if(!fill) {
				logger.info("All fields are required! Please re_enter your information ");
				menuuser();		continue;
			}
			info=db.checkinfoTrue(2,id1,phone1,email,password);	
			if(!info) {
				menuuser();	continue;
			}
		
			db.modifyinformation(id1, phone1, name1, email, address1, password);
			
			
			
		}

		

			
			
			break;
		}
		case 2:
		{
			
			
			
			
			boolean logout=false ;
			logout=db.logoutcompletely(iduser);	
			logger.info("id_user:");
			logger.info(iduser);
	    		
	    	
	     if(logout)logger.info("Your account has been cancelled");
	     
	     for (int i=0 ;i <db.dbuser.size();i++)
		 	{
		 		
	    	 logger.info(db.dbuser.get(i).name);
	    	 logger.info("\n");
		 	}
			break ;
		}
		
		
		
		case 3:
		{
			logger.info(" enter your information about order:");
			String sas1=" enter your id of order:";
			logger.info(sas1);
		       	
	        idorder=scan.nextLine();
	          scan.nextLine();
	        
	          logger.info(" enter your type: "); 
	    		 type=scan.nextLine();
	    		 logger.info(" enter your count: ");
	    		 count=scan.nextInt();
	    		 
	    		 db.createNewOrder(idorder, iduser, count, type);
	    		 logger.info(" your order is created  ");
	    		 
	    		 for(int i=0;i<db.dborder.size();i++) {
	    			 if ( db.dborder.get(i).id.equals(iduser)&&db.dborder.get(i).idorder.equals(idorder))
	    				{
					 logger.info("id= ");
	    				
				 logger.info(db.dborder.get(i).idorder);
				 logger.info(" , id user= ");
				 logger.info(db.dborder.get(i).id);
				 logger.info(" , type of order= ");
				 logger.info(db.dborder.get(i).name);
				 logger.info(" , discount= "); 
				 String s0 ="" +db.dborder.get(i).discount;
				 logger.info(s0); 
				 logger.info(" , price= ");
				 String h0=""+db.dborder.get(i).price;
				 logger.info(h0);
				 logger.info(" , received date= "); 
				 String p0=""+db.dborder.get(i).lateDate;
				 logger.info(p0);
				 logger.info(" , days left= ");
				 String f0=""+db.dborder.get(i).timeReceipt;
				 logger.info(f0);
				 String r0=db.dborder.get(i).count+"";
				 logger.info(" , count= ");
				 logger.info(r0);
					 }
			 
			 }
	    		 
			
			break;
			
			
			
			
			
			
		}
		
		
		
		case 4:
			
		{
			Scanner san=new Scanner(System.in);
			
			logger.info(" enter your id of order :");
			idorder=san.nextLine();
	         
			
			db.cancleorder(iduser,idorder);
			
			
			
			
			
			
			break;
			
			
			
			
			
		}
		
		case 5 :
		{
			String df=" enter id of order:";
			logger.info(df);
				idorder=scan.nextLine();
		          scan.nextLine();
			db.requeststatus(iduser, idorder);
			
			for(int i=0;i<db.dborder.size();i++) {
				 
				logger.info("id= ");
			logger.info(db.dborder.get(i).idorder);
				logger.info(" , id user= ");
			logger.info(db.dborder.get(i).id);
			logger.info(" , type of order= ");
			logger.info(db.dborder.get(i).name);
			logger.info(" , discount= ");
				String dis3=""+db.dborder.get(i).discount;
			logger.info(dis3);
			logger.info(" , price= ");
				String pr3=db.dborder.get(i).price+"";
			logger.info(pr3);
			logger.info(" , received date= ");
				String h3=""+db.dborder.get(i).lateDate;
			logger.info(h3);	
				logger.info(" , days left= ");	
				String t3=""+db.dborder.get(i).timeReceipt;
				logger.info(t3);
				String co3=""+db.dborder.get(i).count;
				logger.info(" , count= ");
				logger.info(co3);
			}
			break;
		}
		
		
		
		case 6:
		{
			Scanner sca = new Scanner(System.in);

			logger.info(" enter your id of order. : ");
			
			idorder=sca.nextLine();
	         
			db.infoorder(iduser,idorder );
			
			break;
		}
	    
		
		
		
		
		case 7:
		{String nuser="";
		String addres="";
		 String hgf=" enter your id order:";
			boolean  com;
			logger.info(hgf);
			idorder=scan.nextLine();
	          scan.nextLine();

			com=db.iscomplete(iduser, idorder);
			
			if (!com)
			{
				logger.info("The order is'n completed ,I can'n to view the invoce");	
			}
			if(com) 
			{
			o=db.ret(iduser, idorder);
			
			for(int i=0;i<db.dbuser.size();i++) {
				if(db.dbuser.get(i).id.equals(iduser)) {
					nuser=db.dbuser.get(i).name;
					addres=db.dbuser.get(i).address;
				}
			}
			logger.info("wait for the invoice to be ready...... ");	
			JOptionPane.showMessageDialog(null,"The user name: "+ nuser+"\nThe user address: "+addres +"\n The id user:"
			        +o.id+"\n The id order:"+o.idorder+"\n The type "
			        +o.name+"\n The price: "+o.price+
			         "\n The price after discount: "+o.discount+"\n The count :"
					+o.count+" \n delvery= 15 "+"\n The total price"+o.totalprice1,"Invoice",JOptionPane.INFORMATION_MESSAGE);
			
			}
			break;
		}
		case 8:
		{
			
			break one;
		}
		case 9:
		{
			break one2;
		}
		default :
			logger.info("The enter is wrong!");
		
	    }
	    
	   
	    
	    }
	    }
		
		break;
		
		
		
		
			}
			}
		break;
		}
		
		case 2: 
		{
			
			logger.info(" enter your id:");
		       	
	        	id1=scan.nextLine();
	          scan.nextLine();
	          logger.info("enter your name: ");
	        	name1=scan.nextLine();
	        	logger.info(" enter your address: "); 
	    		 address1=scan.nextLine();
	    		 logger.info(" enter your phone: ");
	    		 phone1=scan.nextLine();
	    		 logger.info(" enter your email: ");
	    		 email=scan.nextLine();
	    		 logger.info(" enter your password:");
	    		 password=scan.nextLine();
	    		
	    	
	   
		
		
	    		 fill=db.checkfillfields(id1, phone1, name1, email, address1, password);
		if(!fill) {
			logger.info("All fields are required! Please re_enter your information ");
			menuuser(); continue;
		} 
		exist=db.checkifexist(id1);
		if(!exist) {
			logger.info("You already have an account.Please re_enter your information 1010 ");
			menuuser();continue;
		}
		
		 
		info=db.checkinfoTrue(1,id1,phone1,email,password);	
		
		if(!info) {
			menuuser();		continue;
		}
		
		 db.creatNewUser( id1, phone1, name1, email,  address1,  password);
		 logger.info("An account has been created successfully ");
		 
		 for (int i=0 ;i <db.dbuser.size();i++)
	 	{
	 		
			 logger.info(db.dbuser.get(i).name);
			 logger.info("\n");
	 	}
			
			break;
		}
		
		case 3:
			{
				
				logger.info("\n Exiting the program...");
				      return;
				  
			}
		
		default :
			logger.info("your entery is wrong!");
		
		
	}
	}
		}
	}









	static void test(int ch8)
	{
		 
		switch(ch8)
		{
		case 1:
		{
			 user ();
			 break;
		
		}
		
		
		
		
		
		case 2:
		{
			worker();
			break;
		}
				
		
		
		
		case 3:
		{
			admin();
			break;
		
		}
		
		default :{
			logger.info("the number of enter is wrong!");
		}
		
		
		
		
		
		
		
		
		
		}
		
	}








		public static void main(String[] args) 
		{	
			
			
			 int choice1;
			
				 choice();
			 
			 
			 
			 
			 
			while(true) {
				
			Scanner sh=new Scanner(System.in);
			choice1=sh.nextInt();
			
			test(choice1);
			
				
			
			
			
			
			}
			
		
		
		
		
		
		}
	}

