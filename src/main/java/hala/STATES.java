package hala;

import java.util.logging.Logger;

public class STATES {
	  private static final Logger logger = Logger.getLogger(STATES.class.getName());

		float encom;
		 DATABASE db=new DATABASE();
	 static  float deptamount;
		
		



	boolean flag=false;

		public boolean pay() {
			for (int i=0;i<db.dborder.size();i++) {
				if(db.dborder.get(i).timeReceipt==0) {
logger.info("order received and paid for: order number= "+db.dborder.get(i).idorder+"order price= "+db.dborder.get(i).price);
					flag=true;  
				}
			}	 
			if(flag) {
				return true;	
			}
			return false;
		}


	}


