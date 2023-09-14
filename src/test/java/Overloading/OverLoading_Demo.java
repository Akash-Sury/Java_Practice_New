package Overloading;

public class OverLoading_Demo {

	public static void main(String[] args) {
		
		OverLoading_Demo o = new  OverLoading_Demo();
		o.Login("Akash", "Akash@12345");
		o.Login(8990989, 78767899,"Akash");
		o.Login(456879097, "Akash@678909");
		
		

	}

	public void Login(String S,String p) {

		System.out.println("Login using username and password");		
	}

	public void Login(int i,String p) {

		System.out.println("Login using PhoneNumber and password");		


	}
	public void Login(int i,int p,String s) {
		
		System.out.println("Login using PhoneNumber and PhoneNumber");		

	}

}