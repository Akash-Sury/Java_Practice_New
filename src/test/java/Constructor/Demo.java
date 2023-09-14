package Constructor;

public class Demo {


	public static void main(String[] args) {

    Demo d =new Demo(5);
    
    Demo d1 =new Demo(10,45);
    
    

	}
	
	//Default constructor
	public Demo() {

		System.out.println("No argument Constructor");

	}


	public Demo(int i) {

		System.out.println("1 argument Constructor");

	}
	public Demo(int i,int j) {

		System.out.println("2 argument Constructor");

	}
	


}
