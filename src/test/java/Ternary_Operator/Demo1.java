package Ternary_Operator;

public class Demo1 {
	
	public static void main(String[] args) {
		
		int a=2,b=20,c=30;
		
		int max=(a>b)?a:b;   // finding max bet two number
		
		System.out.println(max);
		
		int max1=(a>b)?(a>c?a:c):(b>c?b:c);
		
		System.out.println(max1);
		
		
		
	}

}
