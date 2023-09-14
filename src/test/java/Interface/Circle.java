package Interface;

public class Circle implements Shape {
	
	public static void main(String[] args) {
		Circle c = new Circle();
		c.colorBody();
		
	}

	public void drawShape() {
		System.out.println("Draw Circle");
		
	}

	public void colorBody() {
		System.out.println("Color Body");
		
	}

	public void Moveshape() {
		
		System.out.println("Move Shape");
		
	}
	
	
	
	
	
	

}
