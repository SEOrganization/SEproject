package mypackage;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import javax.swing.JOptionPane;
import javax.swing.border.CompoundBorder;

import io.cucumber.java.it.Date;

public class order {
	 public  String idorder;//order 
	        public  String SN;//product
			public  String name;
			public  String id;//user
			public  int count;
			public  float price;
			//public  String status;
			public  float discount=0;
			//public  boolean recrive;  //yes or no
			public  long timeReceipt;
			//after add days 
			public  LocalDate lateDate;
			public  LocalDate StartDate;
			//public static String work_man; 
			public static database db=new database();
		//public static product prod=new product();
		//	static int equ=0;
		//	worker wok=new worker();
			public float total_price1;
			//int del_1=0;
			public  String name_worker ;
			public   String id_worker;
			public boolean paid=false;
			public order() {
				
			}
			
			
			
			/*
			
			
			public static boolean createNewOrder(String idord,String iduser, Integer quantity, String type) {
				order obj=new order();
				obj.id=iduser;
				obj.count=quantity;
				obj.name=type;
				obj.idorder=idord;
				
				for(int i=0;i<db.dbproduct.size();i++) {
					if(db.dbproduct.get(i).name.equals(type)) {
						equ=db.dbproduct.get(i).price;
					}
				}
				
				
				for(int i=0;i<db.dbuser.size();i++) {
					if(db.dbuser.get(i).point>=400) {
						obj.discount=(float) (0.1*obj.price);
					}else obj.discount=0;
				}
				obj.price=(quantity*equ)-obj.discount;
				//day
				LocalDate currentDate  = LocalDate.now();
	        // Get day from date when he request the order 
	      //  int day = currentDate.getDayOfMonth();
	        
	   
	    	long days=0;
	        for(int j=0;j<db.dborder.size();j++) {
	        	//if(db.dborder.get(j).id.equals(iduser)) {
	        	days+=db.dborder.get(j).timeReceipt;
	        //
	        }
	        //the date when add no. days of progress 
	     	LocalDate date2=currentDate.plusDays(days+2);
	     	long daysDiff = 0;
	     	 try {
	     	 LocalDate dateBefore = currentDate;
	            LocalDate dateAfter =date2 ;
	             daysDiff = ChronoUnit.DAYS.between(dateBefore, dateAfter);
	            
	     	   }catch(Exception e){
		            e.printStackTrace();
		        }
				//this is the number of date
	     	obj.timeReceipt=daysDiff;
	        
	     /*   for(int i=0;i<db.dbworker.size();i++) {
	        	if(db.dbworker.get(i).available) {
	        		obj.work_man=db.dbworker.get(i).id;
	        		db.dbworker.get(i).available=false;
	        		break;
	        	}
	        }			
					
	     
				
				
				
	     	obj.lateDate=date2;
		
				
			
					db.dborder.add(obj);
				return true;
				
			
			}*/
			
			
			
			
			
			
			
			
			/*public boolean cancleorder(String iduser, String idord) {
				 for(int i=0;i<db.dborder.size();i++) {
					 if(db.dborder.get(i).id.equals(iduser)&&db.dborder.get(i).idorder.equals(idord)) {
						if(db.dborder.get(i).timeReceipt>2) {
						db.dborder.remove(i);
						 return true;
						}
					//	JOptionPane.showMessageDialog(null,"you cannot cancel the order because it is in progress","Error",JOptionPane.ERROR_MESSAGE);
					 }
				 }
				// JOptionPane.showMessageDialog(null,"There is no order with this number to be cancelled","Error",JOptionPane.ERROR_MESSAGE);
				return false;
			}*/
			
			/*
			public boolean request_status(String iduser, String idord) {
			for(int i=0;i<db.dborder.size();i++) {
				if(db.dborder.get(i).id.equals(iduser)&&db.dborder.get(i).idorder.equals(idord)) {
					if(db.dborder.get(i).timeReceipt>2) {
						System.out.println("The order is currently pending.");
						return true;
					}else if(db.dborder.get(i).timeReceipt==0) {
						System.out.println("The order is ready for pickup.");
						return true;
					}else if(db.dborder.get(i).timeReceipt<=2) {
						System.out.println("The order is in progress and soon it will be ready for delivery.");
						return true;
					}
					
					
				}
			}
				System.out.println("There is no order with this number to request its status.");
			//	 JOptionPane.showMessageDialog(null,"There is no order with this number to request its status.","Error",JOptionPane.ERROR_MESSAGE);
					
			
				return false;
			}*/
			
		
			public boolean is_price(float order_price,String iduser, String id) {
				for(int i=0;i<db.dborder.size();i++) {
					if(db.dborder.get(i).price== (order_price) && db.dborder.get(i).id.equals(iduser)&&db.dborder.get(i).idorder.equals(id)) 
						return true;
				}
				
							return false;
						
					
					
			}
			/*void price_1( int total_price,int del)
			{
				del_1=del;
				total_price1=total_price;
			}*/
			
			
			
			
			
			
			
}