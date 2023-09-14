package JAVA_Related_Selenium;

public class MethodS_Parameters {
	
	
	public static void main(String[] args) {
		
		MethodS_Parameters m = new MethodS_Parameters();
		System.out.println(m.AddNumbers(10, 10));
		m.diffParamates(5, "Akash",23);
	}
	
	public int AddNumbers(int x,int y) {
		
		int z=x+y;
		return z;
		
	}
	
	public void diffParamates(int i,String s,float f) {
		System.out.println(i);
		System.out.println(s);
		System.out.println(f);
	}

}
