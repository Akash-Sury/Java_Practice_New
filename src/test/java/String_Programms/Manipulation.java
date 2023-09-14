package String_Programms;

public class Manipulation {

	public static void main(String[] args) {
		
		String s="Java is good java";
		
		System.out.println(s.length());
		
		System.out.println(s.charAt(5));
		
		System.out.println(s.indexOf('v'));  // First occurance of v
		
		System.out.println(s.indexOf('v', s.indexOf('v')+1));  // Second occurance of String
		
		System.out.println(s.indexOf("Akash"));   // if string not available returns -1
		
		//String comparison
		
		String s1="Akash";
		String s2="akash";
		
		System.out.println(s1==s2);//Read carefully
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.contains(s2));
		
		System.out.println(s.substring(5, 6));
		
		//Relpace method
		
		String str="    Akash     Automation";
		
		System.out.println(str.trim());         // trim removes spaces start and end of the strings only
		
		System.out.println(str.replace(" ", ""));
		
		//split
		
		String s4="Akash_Jalidar_suryawanshi";
		
		String [] a=s4.split("_");
		
		for(int i=0;i<a.length;i++) {
			
			System.out.println(a[i]);
		}
		
		String s5="Akash";
		StringBuffer bf = new StringBuffer(s5);
		System.out.println(bf.reverse());
		
		String s7="Akash";
		String s8="Surywanshi";
		
		System.out.println(s7.toLowerCase());
		System.out.println(s7.toUpperCase());
		
		System.out.println(s7.concat("_Aks"));
		
		System.out.println(s7.concat(s8));
		
		String x="Hello";
		String y="World";
		
		int b=10;
		int c=20;
		
		System.out.println(x+y+b+c);
		System.out.println(x+y+(b+c));
		System.out.println(b+c+x+y);
		System.out.println(x+b+c+y);
		
		
		
		

	}

}
