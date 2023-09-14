package JAVA_Related_Selenium;

public class Opreator {

	public static void main(String[] args) {
		
		//Unary Operator
		
		int number=10;
		int number2=20;
		
		System.out.println(number);
		
		number++;
		number++;
		System.out.println(number);
		number--;
		System.out.println(number);
		
		
		boolean b=false;
		System.out.println(b);
		
		if(number!=number2) {
			
			System.out.println("Numbers are equal");
		}
		else
		{
			
			System.out.println("Numbers not equal");
		}
		//conditional operator   &&   ||
		if((number==10)||(number2==20)){
			
			System.out.println("This is Conditioner");
		}
		else
		{
			
			System.out.println("This is not conditioner");
		}

	}

}
