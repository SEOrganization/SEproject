package mypackage;

public class admin {
	public String address;
	public String email;
	public String name;
	public String id;
	public String password;
	public String phone;

	public static int check(String string1, String string2) {
		
		if((string1.equals("hala@gmail.com") && string2.equals("hala12")) ||
				(string1.equals("marah@gmail.com") && string2.equals("marah34")) )
				{
					return 1;
				}
		return 0;
	}






}
	

/*
	public int checkpass(String string) {

		if(string.equals("adminadmin")) {
			return 1;
		}
		
		return 0;
	}
}*/
//&& string2.equals("hala12")) ||
//(string1.equals("marah@gmail.com") && string2.equals("marah34")) )