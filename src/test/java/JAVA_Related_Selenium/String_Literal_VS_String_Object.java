package JAVA_Related_Selenium;

public class String_Literal_VS_String_Object {

	public static void main(String[] args) {
		
		String str1="Akash";
		
		String str2 = new String("Akash");
		
		String str3="Akash";
		
		String str4="AKASH";
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1==str3);
		System.out.println(str1.equals(str3));
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
		
		
		

	}

}
