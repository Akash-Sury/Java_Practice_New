package This_Keyword;

public class Demo {
	
	int x=10;
	int y=20;
	String s="Akash";
	
	
	public static void main(String[] args) {
		
		Demo d = new Demo();
		d.getData();
		
		
	}

	public void getData() {
		
		
		int x=20;
		int y=30;

		System.out.println(this.x+this.y);
		System.out.println(x+y);
		
	}
}
