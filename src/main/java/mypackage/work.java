package mypackage;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class work {
	public String address;
	public String work_houers;
	public String name;
	public String id;
	public String email;
public boolean available=true;
public String id_order;
	public String password;
	public String phone;
	public String wage_for_houre;
	public String balance ;
	static boolean log_worker=false;
	public static database db =new database ();
	//public static ArrayList <work> worker_array=new ArrayList <work> ();
//	public work obj9=new work();
	// dbwork db=new dbwork();
	 public work()
	 {
	// this.initial_work();
	 }
	 
	 
		/*public   boolean check_email(String email,String pass)
		{  for (int i=0 ;i < db.dbworker.size();i++)
			{
				if (db.dbworker.get(i).email.equals(email) && (db.dbworker.get(i).password.equals(pass))){
			return true;
			}
			}
		return false;
			
		}*/
		
		
		
	
		
	

	/*	public String return_id(String email,String pass) {
			for(int i=0;i<db.dbworker.size();i++) {
				
				if(db.dbworker.get(i).email.equals(email)&&db.dbworker.get(i).password.equals(pass)) {
					return db.dbworker.get(i).id;
				}
			}
			
			return null;
		}*/

/*	public void check_if_exi(String string, String string2) {
		// TODO Auto-generated method stub
		if((string.equals("farah@gmail.com") && string2.equals("farah1112")))
				{
			log_worker=true;
			//return true;
				//}
		//return false;
	}*/
/*	
	public boolean check_if_exi8(String string, String string2) {
		
		for(int i=0;i<worker_array.size();i++) {
			if( worker_array.get(i).email.equals(string) &&  worker_array.get(i).password.equals(string2))
		if((string.equals("farah@gmail.com") && string2.equals("farah1112")))
				{
			worker_array.get(i).log_worker=true;
				return true;
				}
		}
		return false;
	}
public String clac_balace(String id,String hourse)
	{for(int i=0;i<worker_array.size();i++) {
		if( worker_array.get(i).id.equals(id) ){
		int x=(Integer.parseInt(hourse)*Integer.parseInt( worker_array.get(i).wage_for_houre));
balance= Integer.toString(x);
//JOptionPane.showMessageDialog(null,balance,"Error",JOptionPane.ERROR_MESSAGE);


		}
		
	}
	//JOptionPane.showMessageDialog(null,balance,"Error",JOptionPane.ERROR_MESSAGE);
	return balance;
		
	}



	public String  get_balace()
	{
		for(int i=0;i<worker_array.size();i++) {
			if( worker_array.get(i).id.equals(id)) {
		return  worker_array.get(i).balance;
		}}
		//default value 
		return "0";
		
	}
*/
}
