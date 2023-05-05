package mypackage;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import javax.swing.JOptionPane;
import javax.swing.border.CompoundBorder;

import io.cucumber.java.it.Date;

public class order {
	 public  String idorder;
	        public  String SN;
			public  String name;
			public  String id;
			public  int count;
			public  float price;
			
			public  float discount=0;
			
			public  long timeReceipt;
		
			public  LocalDate lateDate;
			public  LocalDate StartDate;
		
			public static database db=new database();
		
			public float total_price1;
		
			public  String name_worker ;
			public   String id_worker;
			public boolean paid=false;
			public order() {
				
			}
			
			
			
			
			
			
			
		
			public boolean is_price(float order_price,String iduser, String id) {
				for(int i=0;i<db.dborder.size();i++) {
					if(db.dborder.get(i).price== (order_price) && db.dborder.get(i).id.equals(iduser)&&db.dborder.get(i).idorder.equals(id)) 
						return true;
				}
				
							return false;
						
					
					
			}
			
			
			
			
			
			
			
}