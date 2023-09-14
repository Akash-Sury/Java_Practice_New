package Exception_Handling;

public class Demo {

	public static void main(String[] args) {
		int i=10;
		
		
		try {
		
		System.out.println(i/0);
		System.out.println("After Division");

		}
		catch(Exception e) {
			
			System.out.println("Exception Handeled Successfuly");
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
			e.getStackTrace();
			
			
		}
		finally {
			
			System.out.println("This is finally block");
			
		}
	}

}
