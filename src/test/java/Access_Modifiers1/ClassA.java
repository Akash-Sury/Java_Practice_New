package Access_Modifiers1;

public class ClassA {
	
	private int privateModifier=1;
	int defaultmodifier=2;
	protected int protectedModifier=3;
	public int publicmodifier=4;

	public static void main(String[] args) {
		
		ClassA a = new ClassA();
		

	}

	public void public_method() {
		
		System.out.println("public Method");
		
	}
	 void defaultMethod() {
		
		System.out.println("Default Method");
		
	}
	protected void protectedMethod() {
		
		System.out.println("Protected Method");
		
	}
	private void privatemethod() {
		
		System.out.println("Private Method");
		
	}
}
