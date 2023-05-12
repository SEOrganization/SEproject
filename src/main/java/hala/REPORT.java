package hala;

import java.util.logging.Logger;

public class REPORT {
	
	 private static final Logger logger = Logger.getLogger(REPORT.class.getName());
		 static boolean encom=false;
		 static boolean dep=false;
		 static	 boolean	 paay=false;
		 static STATES stat=new STATES();
		static DATABASE db4=new DATABASE();
		
		 REPORT() {}
		public static  boolean showall() {
			
			logger.info("encome of the company: ");
			   encom=db4.encome();
			 
			   logger.info("show all orders in the company: ");
			   db4.showAllOrder();
			   dep= db4.dept();
			   if(!dep) {
				   logger.info("There is no dept to the users.");
			   }
			   paay=stat.pay();
			   if(!paay) {
				   logger.info("There are no orders delivered and depts paid by users.");
			   }
			return true;
		}

	}


