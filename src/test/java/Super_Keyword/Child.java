package Super_Keyword;

public class Child extends Parent {
	
	String empName ="Matt";
	int empNo= 4567;
	
	public Child() {
		
		super();
		
	}
	
	
	public static void main(String[] args) {
		
		Child c = new Child();
		c.getData();
		
		
	}
	
	public void getData() {
		
		// Use of Super Keyword direct on method
		//super.getData();
		 
		//super keywod on variable
		System.out.println(super.empName);
		System.out.println(super.empNo);
		
	}
		

}
