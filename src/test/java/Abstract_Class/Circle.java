package Abstract_Class;

public class Circle implements Shape {

	public static void main(String[] args) {
		
      Circle c = new Circle();
      c.colorShape();
      c.drawShape();
      c.MoveShape();
      
		
		
		
	}

	public void colorShape() {
		System.out.println("colorshape");
		
	}

	public void drawShape() {
		System.out.println("moveshape");
		
	}

	public void MoveShape() {
		System.out.println("drwashape");
		
	}

	

}
