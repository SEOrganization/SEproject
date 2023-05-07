package cleanSEjava;

public class report {
	 static boolean encom=false,dep=false,paay=false;
	 static states stat=new states();
	static database db4=new database();
	
	
	public static  boolean showall() {
	//hello	
		//h
		  System.out.println("encome of the company: ");
		   encom=db4.encome();
		   System.out.println();
		   System.out.println("show all orders in the company: ");
		   db4.showAllOrder();
		   dep= db4.dept();
		   if(!dep) {
			//   System.out.println("There is no dept to the users.");
		   }
		   paay=stat.Pay();
		   if(!paay) {
			//   System.out.println("There are no orders delivered and depts paid by users.");
		   }
		return true;
	}
	
}

