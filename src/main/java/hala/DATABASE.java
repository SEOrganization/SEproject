package hala;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
public class DATABASE {
	


	
	

		 List <USER> dbuser=new ArrayList <USER> ();
		 List <ORDER> dborder=new ArrayList <ORDER> ();
		 List <PRODUCT> dbproduct=new ArrayList <PRODUCT> ();
		  List <WORK> dbworker=new ArrayList <WORK> ();
		  private static final Logger logger = Logger.getLogger(DATABASE.class.getName());
			 USER obj1=new USER();
			 USER obj2=new USER();
			 PRODUCT obj3=new PRODUCT();
			 PRODUCT obj4=new PRODUCT();
			 PRODUCT obj5=new PRODUCT();
			 ORDER obj6=new ORDER();
			 ORDER obj7=new ORDER();
			 int equ=0;
				 WORK obj8=new WORK();
				 WORK obj9=new WORK();
				 WORK obj10=new WORK();
				 USER obj51=new USER();
				 ORDER obj71=new ORDER();
			


			public DATABASE() {
				f();
				
			}

			
			public  boolean createNewOrder(String idord,String iduser, Integer quantity, String type) {
				ORDER obj=new ORDER();
				obj.id=iduser;
				obj.count=quantity;
				obj.name=type;
				obj.idorder=idord;
				float pnt=0;
				float dis = 0;
				for(int i=0;i<dbproduct.size();i++) {
					if(dbproduct.get(i).name.equals(type)) {
						equ=dbproduct.get(i).price;
					}
				}
				for(int i=0;i<dbuser.size();i++) {
					if(dbuser.get(i).id.equals(iduser)) {
						dbuser.get(i).point+=(quantity*equ);
						pnt=dbuser.get(i).point;
					
					}
				}
				obj.price=(quantity*equ);
				
				for(int i=0;i<dbuser.size();i++) {
				
					if(dbuser.get(i).id.equals(iduser) && pnt>=400) {
					
					
						dis=(float)(0.1*obj.price);
					}
					else dis=0;
					}
				
				
				obj.discount=(quantity*equ)-dis;
				
				LocalDate currentDate  = LocalDate.now();
		   
		obj.startdate=currentDate;
			long days=0;
		    for(int j=0;j<dborder.size();j++) {
		    	
		    	days=days+dborder.get(j).timeReceipt;
		    
		    }
		    
		 	LocalDate date2=currentDate.plusDays(days+2);
		 	long daysDiff = 0;
		 	
		 	 LocalDate dateBefore = currentDate;
		        LocalDate dateAfter =date2 ;
		         daysDiff = ChronoUnit.DAYS.between(dateBefore, dateAfter);
		        
		 	   
				
		 	obj.timeReceipt=daysDiff;
		    obj.paid=false;
			
					
		 for(int i=0;i<dbworker.size();i++) {
			 if(dbworker.get(i).available) {
				obj.idworker= dbworker.get(i).id;
				obj.nameworker= dbworker.get(i).name;
				 dbworker.get(i).idorder=idord;
				 dbworker.get(i).available=false;
			 }
		 }
				
				
		 	obj.lateDate=date2;

			obj.totalprice1= (obj.discount+15);

			
					dborder.add(obj);
				return true;
				
			
			}
			
		public ORDER ret(String iduser,String idorder) {
			for(int i=0;i<dborder.size();i++) {
				if(dborder.get(i).id.equals(iduser)&& dborder.get(i).idorder.equals(idorder)) {
					return dborder.get(i);
				}
			}
		return	 null;
		}
			public boolean cancleorder(String iduser, String idord) {
				
				 for(int k=0;k<dborder.size();k++) {
					 if(dborder.isEmpty())break;
					 else if( dborder.get(k).id.equals(iduser)&&dborder.get(k).idorder.equals(idord) && dborder.get(k).timeReceipt>2) {
						
					
						dborder.remove(k);
						
						for(int i=0;i<dborder.size();i++) {
			    			 
							logger.info("id= ");
							logger.info(dborder.get(i).idorder);
						logger.info(" , id user= ");
							logger.info(dborder.get(i).id);
							logger.info(" , type of order= ");
								logger.info(dborder.get(i).name);
							logger.info(" , discount= ");
							String n=dborder.get(i).discount+"";
							logger.info(n);
							logger.info(" , price= ");
							String h=dborder.get(i).price+"";
							logger.info(h);
										logger.info(" , received date= ");
										String  o=dborder.get(i).lateDate+"";
										logger.info(o);
										logger.info(" , days left= ");
										String l=dborder.get(i).timeReceipt+"";
										logger.info(l);
										logger.info(" , count= ");
										String p=dborder.get(i).count+"";
										logger.info(p);
										
							
																																								
						}
						
					
						 return true;
						
					 }
				 }
				return false;
			
			}
			void f(){
			String encryptedpassword = null; 
			String password="Taha45";
	        try   
	        {  
	            /* MessageDigest instance for MD5. */  
	            MessageDigest m = MessageDigest.getInstance("MD5");  
	              
	            /* Add plain-text password bytes to digest using MD5 update() method. */  
	            m.update(password.getBytes());  
	              
	            /* Convert the hash value into bytes */   
	            byte[] bytes = m.digest();  
	              
	            /* The bytes array has bytes in decimal form. Converting it into hexadecimal format. */  
	            StringBuilder s = new StringBuilder();  
	            for(int i=0; i< bytes.length ;i++)  
	            {  
	                s.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));  
	            }  
	              
	            /* Complete hashed password in hexadecimal format */  
	            encryptedpassword = s.toString();  
	        }   
	        catch (NoSuchAlgorithmException e)   
	        {  
	            e.printStackTrace();  
	        }
			
			
				obj1.id="3";
				obj1.address="zawata";
				obj1.name="Taha";
				obj1.phone="0599874634";
				obj1.email="tahasoftware080@gmail.com";
				obj1.password=encryptedpassword;
				obj1.log=true;
				obj1.point=60;
				dbuser.add(obj1);
				

				obj2.id="2";
				obj2.address="zawata..";
				obj2.name="Rami";
				obj2.phone="0597124134";
				obj2.email="Rami@gmail.com";
				obj2.password="Rami15";
				obj2.log=true;
				obj2.point=100;

				dbuser.add(obj2);
				
				obj3.category="carpet";
				obj3.name="carpet saxony";
				obj3.picture="c2";
				obj3.sn="1";
				obj3.description="wool";
				obj3.price=20;
				
				dbproduct.add(obj3);

				obj4.category="covers";
				obj4.name="covers saxony";
				obj4.picture="c1";
				obj4.sn="2";
				obj4.description="wool";
				obj4.price=15;
				
				dbproduct.add(obj4);

				 
				obj5.category="callten";
				obj5.name="curtains saxony";
				obj5.picture="c3";
				obj5.sn="3";
				obj5.description="fabric";
				obj5.price=10;
				
				dbproduct.add(obj5);
				  
				
				obj6.idorder="3";
				obj6.id="3";
				obj6.count=2;
				obj6.name="caler";
			    obj6.lateDate=LocalDate.of(2023,4,19);
				obj6.timeReceipt=0;
				obj6.paid=false;
				obj6.price=20;
				obj6.nameworker="farahjabe";
				obj6.idworker="4";
				obj6.totalprice1=35;
				
				dborder.add(obj6);
				
		 
				
				obj7.idorder="4";
				obj7.id="3";
				obj7.count=4;
				obj7.lateDate=LocalDate.of(2023,4,20);
				obj7.name="curtains";
				obj7.timeReceipt=3;
				obj7.price=40;
				obj7.paid=false;
				obj7.totalprice1=55;
				obj7.nameworker="salehaqad";
				dborder.add(obj7);
				
				obj8.address="jenen";
				obj8.email="farah@gmail.com";
				obj8.id="4";
				obj8.password="farah1112";
				obj8.phone="056928521";
				obj8.name="farahjabe";
				obj8.balance="0";
				obj8.wageforhoure="50";
				obj8.workhouers="0";
				obj8.available=false;
				
				dbworker.add(obj8);
			
				obj9.address="nablus";
				obj9.email="saleh@gmail.com";
				obj9.id="5";
				obj9.password="saleh1112";
				obj9.phone="056928522";
				obj9.name="salehshakhshir";
				obj9.balance="2500";
				obj9.wageforhoure="50";
				obj9.workhouers="50";
				obj9.available=false;
				dbworker.add(obj9);
				
				
				obj10.address="nablus";
				obj10.email="noor@gmail.com";
				obj10.id="6";
				obj10.password="noor1112";
				obj10.phone="056935522";
				obj10.name="noorjabe";
				obj10.balance="5000";
				obj10.wageforhoure="50";
				obj10.workhouers="100";
				obj10.available=true;
				dbworker.add(obj10);
				
				
			
				obj51.id="5";
				obj51.address="zawata...";
				obj51.name="Rami";
				obj51.phone="0597124134";
				obj51.email="Rami@gmail.com";
				obj51.password="Rami15";
				obj51.log=true;
				obj51.point=500;

				dbuser.add(obj51);
				
				obj71.idorder="6";
				obj71.id="5";
				obj71.count=1;
				obj71.lateDate=LocalDate.of(2023,4,30);
				obj71.name="curtains";
				obj71.timeReceipt=1;
				obj71.price=40;
				obj71.paid=false;
				obj71.totalprice1=40;
				obj71.nameworker="salehshakhshir";
				dborder.add(obj71);
				
				
				

			
				
			}
			
			public boolean iscomplete(String iduser, String id) {
				for(int i=0;i<dborder.size();i++) {
					if(dborder.get(i).id.equals(iduser)&&dborder.get(i).idorder.equals(id)) {
						if(dborder.get(i).timeReceipt==0) {
							logger.info("The order is ready for pickup.cash payment upon receipt of the order");
							dborder.get(i).paid=true;
								return true;
						}else {
							logger.info("The order is not ready for pickup.");
								
							return false;
						}
					}
					
					
				}
				logger.info("There is no order with this number to request its information.");
			
				return false;
			}
			
			public boolean requeststatus(String iduser, String idord) {
				for(int i=0;i<dborder.size();i++) {
					if(dborder.get(i).id.equals(iduser)&&dborder.get(i).idorder.equals(idord)) {
						if(dborder.get(i).timeReceipt>2) {
							logger.info("The order is currently pending.");
							return true;
						}else if(dborder.get(i).timeReceipt==0) {
							logger.info("The order is ready for pickup.");
							return true;
						}else if(dborder.get(i).timeReceipt<=2) {
							logger.info("The order is in progress and soon it will be ready for delivery.");
							return true;
						}
						
						
					}
				}
				logger.info("There is no order with this number to request its status.");
						
				
					return false;
				}
			
			public boolean infoorder(String iduser, String id) {
				for(int i=0;i<dborder.size();i++) {
					if(dborder.get(i).id.equals(iduser)&&dborder.get(i).idorder.equals(id)) {
					
						logger.info("id= ");
						logger.info(dborder.get(i).idorder);
						logger.info(" , id user= ");
						logger.info(dborder.get(i).id);
						logger.info(" , type of order= ");
						logger.info(dborder.get(i).name);
						logger.info(" , discount= ");
						String a=dborder.get(i).discount+"";
						String b=dborder.get(i).price+"";
						logger.info(a);
						logger.info(" , price= ");
						logger.info(b);
						logger.info(" , received date= ");
						String c=dborder.get(i).lateDate+"";
						logger.info(c);
						logger.info(" , days left= ");
						String d=dborder.get(i).timeReceipt+"";
						logger.info(d);
						logger.info(" , count= ");
						String e=dborder.get(i).count+"";
						logger.info(e);
						return true;
					}
					
				}
				logger.info("There is no order with this number to request its information.");
				return false;
			}
			public void creatNewUser(String id,String phone,String name,String email, String address, String password ) {
				USER obj17=new USER();
				obj17.id=id;
				obj17.address=address;
				obj17.name=name;
				obj17.phone=phone;
				obj17.email=email;
				obj17.password=password;
				dbuser.add(obj17);
			}
			public  void createprod(String category1,String name1,String picture1,String description1,int price1)
			{ PRODUCT obj16=new PRODUCT();
				
				
					obj16.sn=Integer.toString(1+dbproduct.size());

				
				
				obj16.category=category1;
				obj16.name=name1;
				obj16.picture=picture1;
				obj16.description=description1;
				obj16.price=price1;

			if (!dbproduct.contains(obj16))
					dbproduct.add(obj16);
					
					
				
				
				
			}
			public void modifyinformation(String id2, String phone, String name, String email, String adders,
					String password) {
				for(int i=0;i< dbuser.size();i++ ) {
					if(dbuser.get(i).id.equals(id2)){
						dbuser.get(i).phone=phone;
						dbuser.get(i).name=name;
						dbuser.get(i).email=email;
						dbuser.get(i).address=adders;
						dbuser.get(i).password=password;
						dbuser.get(i).log=true;
					}}	
				logger.info("Your information has been modified ,this is your new information:");
				for(int i=0;i< dbuser.size();i++ ) {
					if(dbuser.get(i).id.equals(id2)){
						logger.info("name: ");
						logger.info(dbuser.get(i).name);
						logger.info(" phone:");
						logger.info(dbuser.get(i).phone);
						logger.info(" email:");
						logger.info(dbuser.get(i).email);
						logger.info(" address:");
						logger.info(dbuser.get(i).address);
						logger.info(" password:");
						logger.info(dbuser.get(i).password);
						
					}}	 
				
			}
			
			
			
			public boolean logoutcompletely(String id3) {
				
				for(int i=0;i< dbuser.size();i++ ) {
					 if(dbuser.isEmpty())break;
					 
					 else if(dbuser.get(i).id.equals(id3)) {
						dbuser.remove(i);

						for (int j=0 ;j <dbuser.size();j++)
						{
							logger.info(dbuser.get(j).name);
							logger.info("  ");
						}
						return true;
					}
				
					}
				
				return false;
			}
			
			public  void updateprod(String sn1,String category,String name1,String picture1,String description1) {
				
				PRODUCT obj18=new PRODUCT();
				obj18.sn=sn1;
				obj18.category=category;
				obj18.name=name1;
				obj18.picture=picture1;
				obj18.description=description1;
				for (int i=0 ;i <dbproduct.size();i++)
				{
				if (dbproduct.get(i).sn.equals(sn1))
					dbproduct.set(i,obj18);
				}
				
			}
			public  void deleteprod(String id) {
				for (int i=0 ;i < dbproduct.size();i++)
				{
					if(dbproduct.isEmpty())break;
					else if (dbproduct.get(i).sn.equals(id))
				{
						dbproduct.remove(i);
					
				}
					
			}}

			public boolean encome() {
				float en=0;
				 int count=0;
				 float finalInc;
				 for(int i=0;i<dborder.size();i++) {
					 count+=dborder.get(i).count;
				 }
				 count*=3;
				for(int i=0;i<dbuser.size();i++) {
					en+=dbuser.get(i).point;
				}
				finalInc=en-count;
				logger.info("Final Inceam :");
				String j=finalInc+"";
				logger.info(j);
				logger.info("$");
				return true;
			}
			 
			
			public boolean showAllOrder() {
				for(int i=0;i<dborder.size();i++) {
			 
					logger.info("id= ");
					logger.info(dborder.get(i).idorder);
					logger.info(" | id user= ");
					logger.info(dborder.get(i).id);
					logger.info(" | type of order= ");
					logger.info(dborder.get(i).name);
					logger.info(" | discount= ");
					String a=""+dborder.get(i).discount;
					String b=""+dborder.get(i).price;
					String c=""+dborder.get(i).lateDate;
					String d=""+dborder.get(i).timeReceipt;
					String e=""+dborder.get(i).count;			
					logger.info(a);
					logger.info(" | price= ");
					logger.info(b);
					logger.info(" | received date= ");
					logger.info(c);
					logger.info(" | days left= ");
					logger.info(d);
					logger.info(" | count= ");
				
					logger.info(e);
					logger.info(" | name worker= ");
					logger.info(dborder.get(i).nameworker);
					
					logger.info("\n");
				}
				return true;
			}
			
			public boolean dept() {
				for (int i=0;i<dborder.size();i++) {
					if(dborder.get(i).timeReceipt<=2&&!dborder.get(i).paid) {
						logger.info("The amount of dept owed by users: ");
						String hh=""+dborder.get(i).price;
						logger.info(hh);
						STATES.deptamount=dborder.get(i).price;
						
					}
				}
						return true;
					}

			
		public boolean checkifexi8(String string, String string2) {
				
				for(int i=0;i<dbworker.size();i++) {
					if( dbworker.get(i).email.equals(string) &&  dbworker.get(i).password.equals(string2)) {
				
					dbworker.get(i).logworker=true;
						return true;}
				
				}
				return false;
			}
		public String clacbalace(String id,String hourse)
		{String ret="";
		int v=0;
		if(hourse.equals("")||hourse.equals(null)) {
			hourse="0";	
		}
		 for(int i=0;i<dbworker.size();i++) {
				if( dbworker.get(i).id.equals(id) ){
					
					v=Integer.parseInt(hourse)+Integer.parseInt(dbworker.get(i).workhouers);
				int x=(v*Integer.parseInt( dbworker.get(i).wageforhoure));
		dbworker.get(i).balance= Integer.toString(x);

		ret=dbworker.get(i).balance;
		int str6=Integer.parseInt(dbworker.get(i).workhouers);
		str6=str6	+Integer.parseInt(hourse);
		dbworker.get(i).workhouers=str6+"";
		dbworker.get(i).balance=ret;

				}
				
				
			}
		 
			
			return ret;
				
			}






		public boolean searchuser(String nameuser)
		{
			for(int i=0;i<dbuser.size();i++ ) {
				if(dbuser.get(i).name.equals(nameuser)) {
					logger.info("user's id: ");
					logger.info(dbuser.get(i).id);
					logger.info("user's Name: ");
					logger.info(dbuser.get(i).name);
					logger.info("user's Address: ");
					logger.info(dbuser.get(i).address);
					logger.info("user's Email: ");
					logger.info(dbuser.get(i).email);
					logger.info("user's Phone: ");
					logger.info(dbuser.get(i).phone);
					logger.info("user's Point: ");
					String oo=dbuser.get(i).point+"";
					logger.info(oo);
				 
					return true;
				}
			}
			logger.info("there is in user with this name.");
			return false;
			
		}

		public boolean searchproduct(String name)
		{

			for(int i=0;i<dbproduct.size();i++ ) {
				if(dbproduct.get(i).name.equals(name)) {
					logger.info("product's SN: ");
					logger.info(dbproduct.get(i).sn);
					logger.info("product's Name: ");
					logger.info(dbproduct.get(i).name);
					logger.info("product's description: ");
					logger.info(dbproduct.get(i).description);
					logger.info("product's price: ");
					String jj=""+dbproduct.get(i).price;
					logger.info(jj);
					logger.info("product's Category: ");
					logger.info(dbproduct.get(i).category);
					 
				 
					return true;
				}
			}
			logger.info("there is in product with this name.");
			return false;
			
		}


		public void makepaidtrue(String id) {
			for(int i=0;i<dborder.size();i++)
			{
				if(dborder.get(i).idorder.equals(id)) {
					dborder.get(i).paid=true;
				}
			}
		}


		public String reid(String ido) {
			String idu="";
					String	email10 ="";
			for(int i=0;i<dborder.size();i++)
			{
				if(dborder.get(i).idorder.equals(ido)) {
					idu=dborder.get(i).id;
				}
			}
			for(int i=0;i<dbuser.size();i++)
			{
				if(dbuser.get(i).id.equals(idu)) {
					email10=dbuser.get(i).email;
				}
			}
			return email10 ;
			
			
		}

		public String reiduser(String ido) {
			String idu="";
			for(int i=0;i<dborder.size();i++)
			{
				if(dborder.get(i).idorder.equals(ido)) {
					idu=dborder.get(i).id;
				}
			}
			
			return idu ;
			
			
		}
		public String returnid(String email,String pass) {
			for(int i=0;i<dbworker.size();i++) {
				
				if(dbworker.get(i).email.equals(email)&&dbworker.get(i).password.equals(pass)) {
					return dbworker.get(i).id;
				}
			}
			
			return null;
		}

		public   boolean checkemail(String email,String pass)
		{  for (int i=0 ;i < dbworker.size();i++)
			{
				if (dbworker.get(i).email.equals(email) && (dbworker.get(i).password.equals(pass))){
			return true;
			}
			}
		return false;
			
		}






		public   boolean checkemail(String email)
		{  for (int i=0 ;i < dbuser.size();i++)
			{
				if (dbuser.get(i).email.equals(email))
			{return true;}
			}
		return false;
			
		}



		public  boolean checkpass(String pass)
		{  for (int i=0 ;i < dbuser.size();i++)
			{
				if (dbuser.get(i).password.equals(pass))
			{return true;
			
			}
			}
		return false;
			
		}



		public boolean logApp(String iduser) {

			for(int i=0;i< dbuser.size();i++ ) {
			if(dbuser.get(i).id.equals(iduser)) {
				return dbuser.get(i).log;
			}
			}
			return false;

			
		}



			public  boolean checkifexist(String id){
				
				for(int i=0;i< dbuser.size();i++ ) {
				if(dbuser.get(i).id.equals(id)) {
					return false; 
				}
				}
			
				return true;
			}
			
			
			public boolean checkfillfields(String string, String string2, String string3, String string4, String string5,
					String string6) {
				boolean fill=true;
				if(string.equals("")||string2.equals("")||string3.equals("")||string4.equals("")||string5.equals("")||string6.equals("")) {
					fill=false;
				}
				
					 
				
				return fill;
			}
		

			public boolean checkifdebt(String id3) {
				for(int i=0;i< dbuser.size();i++ ) {
					if(dbuser.get(i).id.equals(id3)) {
					
						return true;
					}}
				return false;
				
			}
			


			public boolean checkinfoTrue(int num,String id,String phon, String mail, String passwor) {
				boolean f=false;
				boolean f1=false;
				boolean f2=false;
				boolean f4=false;
	
		if(dbuser.isEmpty())return false;
	

				if(phon.equals("")||mail.equals("")||passwor.equals("")){return false;}
				else {
					for(int i=0;i< dbuser.size();i++ ) {
						
						if(!id.equals(dbuser.get(i).id)) {
					
						 if(dbuser.get(i).phone.equals(phon)){
						
							f=true;
						}
						 if(dbuser.get(i).email.equals(mail)) {
							
							f1=true;
						}
						 if(dbuser.get(i).password.equals(passwor)) {
							
		                	f2=true;
						}
						}
						
						} 
						
						 if(!(mail.contains("@"))) {
							f4=true;
							logger.info("The email you entered is wrong");
						} if(!(phon.length()==10 || phon.length()>10)) {
							logger.info("The phone number you entered is incorrect");
							f4=true;
						}
						 if(!(passwor.length()>6 || passwor.length()==6)) {
							 logger.info("The password you entered is weak");
							f4=true;
						}
						
				
				

			
				if(f || (f1&&f2) ||f4) {
					if(f ||(f1&&f2)) {
						if(num==1)
							logger.info("You already have an account.Please re_enter your information ");
						else if(num==2)	logger.info("The email and password are not valid. Please enter another ");
					}
					return false; 
				}
				return true;
				}
			}
			
			public boolean logout(String id3) {
				
				for(int i=0;i< dbuser.size();i++ ) {
					if(dbuser.get(i).id.equals(id3)) {
						dbuser.get(i).log=false;
						return true;
					}
					
					}
				
				return false;
			}
			
			
			public String returnid2(String email,String pass) {
				for(int i=0;i<dbuser.size();i++) {
					
					if(dbuser.get(i).email.equals(email)&&dbuser.get(i).password.equals(pass)) {
						return dbuser.get(i).id;
					}
					
				}
				
				return null;
			}
			 public  boolean checkSN(String sn) {
					

					for (int i=0 ;i < dbproduct.size();i++)
					{
						if (dbproduct.get(i).sn.equals(sn))
						{
							return true;
						}
					
					}
					
					
					return false;
					}

			
			
		}

