package Access_Modifiers2;

import Access_Modifiers1.ClassA;

public class ClassB extends ClassA {

	public static void main(String[] args) {
		
		
		// We can call default method or variable bet two pkgs but we need parent and child relationship
		ClassA ca= new ClassA();
		ClassB ba= new ClassB();
		ba.protectedMethod();
		System.out.println(ba.protectedModifier);
		
		
		

	}

}
