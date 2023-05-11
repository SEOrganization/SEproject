package CLEANTWO;
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
		  private static final Logger logger = Logger.getLogger(MAIN.class.getName());
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
		   
		obj.StartDate=currentDate;
			long days=0;
		    for(int j=0;j<dborder.size();j++) {
		    	
		    	days+=dborder.get(j).timeReceipt;
		    
		    }
		    
		 	LocalDate date2=currentDate.plusDays(days+2);
		 	long daysDiff = 0;
		 	 try {
		 	 LocalDate dateBefore = currentDate;
		        LocalDate dateAfter =date2 ;
		         daysDiff = ChronoUnit.DAYS.between(dateBefore, dateAfter);
		        
		 	   }catch(Exception e){
		            e.printStackTrace();
		        }
				
		 	obj.timeReceipt=daysDiff;
		    obj.paid=false;
			
					
		 for(int i=0;i<dbworker.size();i++) {
			 if(dbworker.get(i).available) {
				obj.id_worker= dbworker.get(i).id;
				obj.name_worker= dbworker.get(i).name;
				 dbworker.get(i).idorder=idord;
				 dbworker.get(i).available=false;
			 }
		 }
				
				
		 	obj.lateDate=date2;

			obj.total_price1= (obj.discount+15);

			
					dborder.add(obj);
				return true;
				
			
			}
			
		public ORDER ret(String IDUSER,String IDORDER) {
			for(int i=0;i<dborder.size();i++) {
				if(dborder.get(i).id.equals(IDUSER)&& dborder.get(i).idorder.equals(IDORDER)) {
					return dborder.get(i);
				}
			}
		return	 null;
		}
			public boolean cancleorder(String iduser, String idord) {
				 for(int k=0;k<dborder.size();k++) {
					
					 if(dborder.get(k).id.equals(iduser)&&dborder.get(k).idorder.equals(idord) && dborder.get(k).timeReceipt>2) {
						
						
						dborder.remove(k);
						
						for(int i=0;i<dborder.size();i++) {
			    			 
							logger.info("id= "+dborder.get(i).idorder+" , id user= "+dborder.get(i).id+" , type of order= "+dborder.get(i).name+" , discount= "+dborder.get(i).discount
		    						+" , price= "+dborder.get(i).price+" , received date= "+dborder.get(i).lateDate+" , days left= "+dborder.get(i).timeReceipt+" , count= "+dborder.get(i).count);
		    				}
						
					
						 return true;
						
					 }
				 }
				return false;
			}
			
			
			void f(){
				obj1.id="3";
				obj1.address="zawata";
				obj1.name="Taha";
				obj1.phone="0599874634";
				obj1.email="tahasoftware080@gmail.com";
				obj1.password="Taha45";
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
				
				obj3.Category="carpet";
				obj3.name="carpet saxony";
				obj3.picture="c2";
				obj3.SN="1";
				obj3.description="wool";
				obj3.price=20;
				
				dbproduct.add(obj3);

				obj4.Category="covers";
				obj4.name="covers saxony";
				obj4.picture="c1";
				obj4.SN="2";
				obj4.description="wool";
				obj4.price=15;
				
				dbproduct.add(obj4);

				 
				obj5.Category="curtains";
				obj5.name="curtains saxony";
				obj5.picture="c3";
				obj5.SN="3";
				obj5.description="fabric";
				obj5.price=10;
				
				dbproduct.add(obj5);
				  
				
				obj6.idorder="3";
				obj6.id="3";
				obj6.count=2;
				obj6.name="curtains";
			    obj6.lateDate=LocalDate.of(2023,4,19);
				obj6.timeReceipt=0;
				obj6.paid=false;
				obj6.price=20;
				obj6.name_worker="farahjabe";
				obj6.id_worker="4";
				obj6.total_price1=35;
				
				dborder.add(obj6);
				
		 
				
				obj7.idorder="4";
				obj7.id="3";
				obj7.count=4;
				obj7.lateDate=LocalDate.of(2023,4,20);
				obj7.name="curtains";
				obj7.timeReceipt=3;
				obj7.price=40;
				obj7.paid=false;
				obj7.total_price1=55;
				obj7.name_worker="salehshakhshir";
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
				//obj9.available=true;
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
				obj71.total_price1=40;
				obj71.name_worker="salehshakhshir";
				dborder.add(obj71);
				
				
				

			
				
			}
			
			public boolean is_complete(String iduser, String id) {
				for(int i=0;i<dborder.size();i++) {
					if(dborder.get(i).id.equals(iduser)&&dborder.get(i).idorder.equals(id)) {
						if(dborder.get(i).timeReceipt==0) {
							System.out.println("The order is ready for pickup.cash payment upon receipt of the order");
							dborder.get(i).paid=true;
								return true;
						}else {
							System.out.println("The order is not ready for pickup.");
								
							return false;
						}
					}
					
					
				}
				System.out.println("There is no order with this number to request its information.");
			
				return false;
			}
			
			public boolean request_status(String iduser, String idord) {
				for(int i=0;i<dborder.size();i++) {
					if(dborder.get(i).id.equals(iduser)&&dborder.get(i).idorder.equals(idord)) {
						if(dborder.get(i).timeReceipt>2) {
							System.out.println("The order is currently pending.");
							return true;
						}else if(dborder.get(i).timeReceipt==0) {
							System.out.println("The order is ready for pickup.");
							return true;
						}else if(dborder.get(i).timeReceipt<=2) {
							System.out.println("The order is in progress and soon it will be ready for delivery.");
							return true;
						}
						
						
					}
				}
					System.out.println("There is no order with this number to request its status.");
						
				
					return false;
				}
			
			public boolean info_order(String iduser, String id) {
				for(int i=0;i<dborder.size();i++) {
					if(dborder.get(i).id.equals(iduser)&&dborder.get(i).idorder.equals(id)) {
						System.out.println("id= "+dborder.get(i).idorder+" , id user= "+dborder.get(i).id+" , type of order= "+dborder.get(i).name+" , discount= "+dborder.get(i).discount
								+" , price= "+dborder.get(i).price+" , received date= "+dborder.get(i).lateDate+" , days left= "+dborder.get(i).timeReceipt+" , count= "+dborder.get(i).count);
					return true;
					}
					
				}
				System.out.println("There is no order with this number to request its information.");
				return false;
			}
			public void creatNewUser(String id,String phone,String name,String email, String address, String password ) {
				USER obj1=new USER();
				obj1.id=id;
				obj1.address=address;
				obj1.name=name;
				obj1.phone=phone;
				obj1.email=email;
				obj1.password=password;
				dbuser.add(obj1);
			}
			public  void create_prod(String Category1,String name1,String picture1,String description1,int price1)
			{ PRODUCT obj1=new PRODUCT();
				
				
					obj1.SN=Integer.toString(1+dbproduct.size());

				
				
				obj1.Category=Category1;
				obj1.name=name1;
				obj1.picture=picture1;
				obj1.description=description1;
				obj1.price=price1;

			if (!dbproduct.contains(obj1))
					dbproduct.add(obj1);
					
					
				
				
				
			}
			public void modify_information(String id2, String phone, String name, String email, String adders,
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
				System.out.print("Your information has been modified ,this is your new information:");
				for(int i=0;i< dbuser.size();i++ ) {
					if(dbuser.get(i).id.equals(id2)){
						System.out.print("name: "+dbuser.get(i).name);
						System.out.print(" phone:"+dbuser.get(i).phone);
						
						System.out.print(" email:"+dbuser.get(i).email);
						System.out.print(" address:"+dbuser.get(i).address);
						System.out.println(" password:"+dbuser.get(i).password);
						
					}}	 
				
			}
			
			
			
			public boolean logout_completely(String id3) {
				
				for(int i=0;i< dbuser.size();i++ ) {
					if(dbuser.get(i).id.equals(id3)) {
						dbuser.remove(i);

						for (int j=0 ;j <dbuser.size();j++)
						{
						System.out.print(dbuser.get(j).name+"  ");
						}
						return true;
					}
				
					}
				
				return false;
			}
			
			public  void update_prod(String SN1,String Category1,String name1,String picture1,String description1) {
				
				PRODUCT obj1=new PRODUCT();
				obj1.SN=SN1;
				obj1.Category=Category1;
				obj1.name=name1;
				obj1.picture=picture1;
				obj1.description=description1;
				for (int i=0 ;i <dbproduct.size();i++)
				{
				if (dbproduct.get(i).SN.equals(SN1))
					dbproduct.set(i,obj1);
				}
				
			}
			public  void delete_prod(String id) {
				for (int i=0 ;i < dbproduct.size();i++)
				{
					if (dbproduct.get(i).SN.equals(id))
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
				System.out.println("Final Inceam :"+finalInc+"$");
				return true;
			}
			 
			
			public boolean showAllOrder() {
				for(int i=0;i<dborder.size();i++) {
			 
					
				System.out.print("id= "+dborder.get(i).idorder);
				System.out.print(" | id user= "+dborder.get(i).id);
				System.out.print(" | type of order= "+dborder.get(i).name);
				System.out.print(" | discount= "+dborder.get(i).discount);
				System.out.print(" | price= "+dborder.get(i).price);
				System.out.print(" | received date= "+dborder.get(i).lateDate);
				System.out.print(" | days left= "+dborder.get(i).timeReceipt);
				
				System.out.print(" | count= "+dborder.get(i).count);
				System.out.print(" | name worker= "+dborder.get(i).name_worker);
				System.out.println();
				}
				return true;
			}
			
			public boolean dept() {
				for (int i=0;i<dborder.size();i++) {
					if(dborder.get(i).timeReceipt<=2&&!dborder.get(i).paid) {
						System.out.println("The amount of dept owed by users: "+dborder.get(i).price);
						STATES.dept_amount=dborder.get(i).price;
						
					}
				}
						return true;
					}

			
		public boolean check_if_exi8(String string, String string2) {
				
				for(int i=0;i<dbworker.size();i++) {
					if( dbworker.get(i).email.equals(string) &&  dbworker.get(i).password.equals(string2)) {
				
					dbworker.get(i).logworker=true;
						return true;}
				
				}
				return false;
			}
		public String clac_balace(String id,String hourse)
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
		dbworker.get(i).workhouers+=Integer.parseInt(hourse);
		dbworker.get(i).balance=ret;

				}
				
				
			}
		 
			
			return ret;
				
			}






		public boolean search_user(String nameuser)
		{
			for(int i=0;i<dbuser.size();i++ ) {
				if(dbuser.get(i).name.equals(nameuser)) {
					System.out.println("user's id: "+dbuser.get(i).id);
					System.out.println("user's Name: "+dbuser.get(i).name);
					System.out.println("user's Address: "+dbuser.get(i).address);
					System.out.println("user's Email: "+dbuser.get(i).email);
				    System.out.println("user's Phone: "+dbuser.get(i).phone);
					System.out.println("user's Point: "+dbuser.get(i).point);
				 
					return true;
				}
			}
			System.out.println("there is in user with this name.");
			return false;
			
		}

		public boolean search_product(String name)
		{

			for(int i=0;i<dbproduct.size();i++ ) {
				if(dbproduct.get(i).name.equals(name)) {
				
					System.out.println("product's SN: "+dbproduct.get(i).SN);
					System.out.println("product's Name: "+dbproduct.get(i).name);
					System.out.println("product's description: "+dbproduct.get(i).description);
					System.out.println("product's price: "+dbproduct.get(i).price);
				    System.out.println("product's Category: "+dbproduct.get(i).Category);
					 
				 
					return true;
				}
			}
			 System.out.println("there is in product with this name.");
			return false;
			
		}


		public void make_paid_true(String id) {
			for(int i=0;i<dborder.size();i++)
			{
				if(dborder.get(i).idorder.equals(id)) {
					dborder.get(i).paid=true;
				}
			}
		}


		public String re_id(String id_o) {
			String idu="",email="";
			for(int i=0;i<dborder.size();i++)
			{
				if(dborder.get(i).idorder.equals(id_o)) {
					idu=dborder.get(i).id;
				}
			}
			for(int i=0;i<dbuser.size();i++)
			{
				if(dbuser.get(i).id.equals(idu)) {
					email=dbuser.get(i).email;
				}
			}
			return email ;
			
			
		}

		public String re_id_user(String id_o) {
			String idu="";
			for(int i=0;i<dborder.size();i++)
			{
				if(dborder.get(i).idorder.equals(id_o)) {
					idu=dborder.get(i).id;
				}
			}
			
			return idu ;
			
			
		}
		public String return_id(String email,String pass) {
			for(int i=0;i<dbworker.size();i++) {
				
				if(dbworker.get(i).email.equals(email)&&dbworker.get(i).password.equals(pass)) {
					return dbworker.get(i).id;
				}
			}
			
			return null;
		}

		public   boolean check_email(String email,String pass)
		{  for (int i=0 ;i < dbworker.size();i++)
			{
				if (dbworker.get(i).email.equals(email) && (dbworker.get(i).password.equals(pass))){
			return true;
			}
			}
		return false;
			
		}






		public   boolean check_email(String email)
		{  for (int i=0 ;i < dbuser.size();i++)
			{
				if (dbuser.get(i).email.equals(email))
			{return true;}
			}
		return false;
			
		}



		public  boolean check_pass(String pass)
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



			public  boolean check_if_exist(String id){
				
				for(int i=0;i< dbuser.size();i++ ) {
				if(dbuser.get(i).id.equals(id)) {
					return false; 
				}
				}
			
				return true;
			}
			
			
			public boolean check_fill_fields(String string, String string2, String string3, String string4, String string5,
					String string6) {
				boolean fill=true;
				if(string.equals("")||string2.equals("")||string3.equals("")||string4.equals("")||string5.equals("")||string6.equals("")) {
					fill=false;
				}
				
					 
				
				return fill;
			}
			public void message_for_user() {
				
			}
			
			public void message_for_user1() {
				
				
			}

			public boolean check_if_debt(String id3) {
				for(int i=0;i< dbuser.size();i++ ) {
					if(dbuser.get(i).id.equals(id3)) {
					
						return true;
					}}
				return false;
				
			}
			public void message_to_fail_logout() {
				
			}


			public boolean check_info_True(int num,String id,String phon, String mail, String passwor) {
				boolean f=false,f1=false,f2=false,f4=false;
		String a="";
		if(dbuser.size()==0)return false;
		for(int i=0;i< dbuser.size();i++ ) {
			
			if(dbuser.get(i).id.equals(id)) {
				a=id;
			
			}
		}

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
							System.out.println("The email you entered is wrong");
						} if(!(phon.length()>=10)) {
							System.out.println("The phone number you entered is incorrect");
							f4=true;
						}
						 if(!(passwor.length()>=6)) {
								System.out.println("The password you entered is weak");
							f4=true;
						}
						
				
				

			
				if(f || (f1&&f2) ||f4) {
					if(f ||(f1&&f2)) {
						if(num==1)
						System.out.println("You already have an account.Please re_enter your information ");
						else if(num==2)	System.out.println("The email and password are not valid. Please enter another ");
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
			
			
			public String return_id2(String email,String pass) {
				for(int i=0;i<dbuser.size();i++) {
					
					if(dbuser.get(i).email.equals(email)&&dbuser.get(i).password.equals(pass)) {
						return dbuser.get(i).id;
					}
					
				}
				
				return null;
			}
			 public  boolean check_SN(String sn) {
					

					for (int i=0 ;i < dbproduct.size();i++)
					{
						if (dbproduct.get(i).SN.equals(sn))
						{
							return true;
						}
					
					}
					
					
					return false;
					}

			
			
		}


