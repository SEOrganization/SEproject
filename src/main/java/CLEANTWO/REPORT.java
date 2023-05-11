package CLEANTWO;

public class REPORT {
	
	
		 static boolean encom=false,dep=false,paay=false;
		 static STATES stat=new STATES();
		static DATABASE db4=new DATABASE();
		
		
		public static  boolean showall() {
			
			  System.out.println("encome of the company: ");
			   encom=db4.encome();
			   System.out.println();
			   System.out.println("show all orders in the company: ");
			   db4.showAllOrder();
			   dep= db4.dept();
			   if(!dep) {
				   System.out.println("There is no dept to the users.");
			   }
			   paay=stat.Pay();
			   if(!paay) {
				   System.out.println("There are no orders delivered and depts paid by users.");
			   }
			return true;
		}

	}


