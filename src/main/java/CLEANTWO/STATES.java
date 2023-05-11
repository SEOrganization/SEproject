package CLEANTWO;

public class STATES {
	

		public float encom;
		public DATABASE db=new DATABASE();
		 public static  float dept_amount;
		
		



	boolean flag=false;

		public boolean Pay() {
			for (int i=0;i<db.dborder.size();i++) {
				if(db.dborder.get(i).timeReceipt==0) {
					System.out.println("order received and paid for: order number= "+db.dborder.get(i).idorder+"order price= "+db.dborder.get(i).price);
					flag=true;  
				}
			}	 
			if(flag) {
				return true;	
			}
			return false;
		}


	}


