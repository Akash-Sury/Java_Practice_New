package Collection;

public class Wrapping_Demo {
	
	public static void main(String[] args) {
		
	int i=10;
	
	Integer int1= new Integer(i);  // Wrapping----AutoBoxing
	
	System.out.println(i);
	
	int j=int1;  // UnWrapping---- AutoUnboxing
	System.out.println(j);

	}
}
