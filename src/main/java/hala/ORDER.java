package hala;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import javax.swing.JOptionPane;
import javax.swing.border.CompoundBorder;

import io.cucumber.java.it.Date;
public class ORDER {
	

	
	  String idorder;
	     String sn;
			  String name;
		 String id;
			 int count;
			  float price;
			
		 float discount=0;
			
		 long timeReceipt;
		
		  LocalDate lateDate;
			  LocalDate startdate;
		
			 static DATABASE db=new DATABASE();
		
			 float totalprice1;
		
			  String nameworker ;
		   String idworker;
			 boolean paid=false;
		
			
			
			
			
			
			
			
		
			public boolean isprice(float orderprice,String iduser, String id) {
				for(int i=0;i<db.dborder.size();i++) {
					if(db.dborder.get(i).price== (orderprice) && db.dborder.get(i).id.equals(iduser)&&db.dborder.get(i).idorder.equals(id)) 
						return true;
				}
				
							return false;
						
					
					
			}
			
			
			
			
			
	}


