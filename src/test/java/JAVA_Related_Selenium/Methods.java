package JAVA_Related_Selenium;

public class Methods {

	public static void main(String[] args) {

		doLOgin();
		
		Methods m = new Methods();
		m.doLogout();

	}

	public static void doLOgin() {

		System.out.println("Login method");

	}

	public String doLogout() {

		System.out.println("Logout methiod");
		return "abc";

	}

	public int doLogoutagain() {

		return 10;

	}


}
