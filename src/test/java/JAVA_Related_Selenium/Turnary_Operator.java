package JAVA_Related_Selenium;

public class Turnary_Operator {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=20;
		
		//  basic Method
		
		if(num1>num2) {
			
			System.out.println("num1>num2");
			
		}
		else
		{
			
		System.out.println("num1<num2");	
		}
		
		
		// ternary operators
		
		//syntax     variable=(condition)? True Expression:False Expression
		
		String result=(num1>num2)? "num1>num2":"num1<num2";
		System.out.println(result);
		
		int result1= (num1>num2)? 1:2;
		System.out.println(result1);
		
		boolean result2=(num1>num2)? false:true;
		System.out.println(result2);
		
		
		

	}

}
