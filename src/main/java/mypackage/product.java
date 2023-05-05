package mypackage;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class product {

	    public String SN;
		public String Category;
		public String name;
		public String picture;
		public String description;
		public int  price;

	 //public static	ArrayList<product> product_array = new ArrayList<product>(); 
	public static database db=new database();
	
/*void f()
{	 product p = null;
	p.create_prod("carpet","carpet saxony","c2.jpg","wool");
	 product_array.add(p);
}
*/
	
	/*public product() {
		//this.initial_prod();
	}
	 
	
	public product(
	 String Category,
	String name,
	 String picture,
	 String description,
	 int  price)
 {
		
		create_prod(Category,name,picture, description,price);
		
	}
	
	
	 
	
	
	
	 public  void initial_prod() {
			
			this.create_prod("carpet","carpet saxony","c2.jpg","wool",4);
			

			//product_array.add(this);
			
			
	 }

	 */
	 
	/* public  boolean check_SN(String sn) {
			

			for (int i=0 ;i < db.dbproduct.size();i++)
			{
				if (db.dbproduct.get(i).SN.equals(sn))
				{
					return true;
				}
			
			}
			
			
			return false;
			}

	 
/*	 
public  void create_prod(String Category1,String name1,String picture1,String description1,int price1)
{
	//this.SN=SN1;
	for (int i=1;i <(db.dbproduct.size()+1);i++)
	{
		SN=Integer.toString(i);

	}
	
	this.Category=Category1;
	this.name=name1;
	this.picture=picture1;
	this.description=description1;
	this.price=price1;

//	if (!db.dbproduct.contains(this))
		db.dbproduct.add(this);
		
		
	
	
	
}*/






/*public  void update_prod(String SN1,String Category1,String name1,String picture1,String description1) {
	this.SN=SN1;
	this.Category=Category1;
	this.name=name1;
	this.picture=picture1;
	this.description=description1;
	for (int i=0 ;i < db.dbproduct.size();i++)
	{
	if (db.dbproduct.get(i).SN.equals(SN1))
		db.dbproduct.set(i,this);
	}
	
}
public  void delete_prod(String id) {
	for (int i=0 ;i < db.dbproduct.size();i++)
	{
		if (db.dbproduct.get(i).SN.equals(id))
	{
			db.dbproduct.remove(i);
		
	}
		
}}

  */

}
		
		

