package mypackage;

public class states {

	public float encom;
	public database db=new database();
	 public static  float dept_amount;
	
	
	
	/*public boolean encome() {
		float en=0;
		 int count=0;
		 float finalInc;
		 for(int i=0;i<db.dborder.size();i++) {
			 count+=db.dborder.get(i).count;
		 }
		 count*=3;
		for(int i=0;i<db.dbuser.size();i++) {
			en+=db.dbuser.get(i).point;
		}
		finalInc=en-count;
		return true;
	}

*/


	/*public boolean showAllOrder() {
		for(int i=0;i<db.dborder.size();i++) {
		System.out.println("id= "+db.dborder.get(i).idorder+" , id user= "+db.dborder.get(i).id+" , type of order= "+db.dborder.get(i).name+" , discount= "+db.dborder.get(i).discount
				+" , price= "+db.dborder.get(i).price+" , received date= "+db.dborder.get(i).lateDate+" , days left= "+db.dborder.get(i).timeReceipt+" , count= "+db.dborder.get(i).count);
		}
		return true;
	}*/




/*	public boolean dept() {
for (int i=0;i<db.dborder.size();i++) {
	if(db.dborder.get(i).timeReceipt<=2) {
		System.out.println("The amount of dept owed by users: "+db.dborder.get(i).price);
		dept_amount=db.dborder.get(i).price;
	}
}
		return true;
	}*/


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


