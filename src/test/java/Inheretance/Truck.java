package Inheretance;

public class Truck extends VehicleCommon {

	public static void main(String[] args) {
		
		VehicleCommon v = new VehicleCommon();
		v.start();
		v.Stop();
		
		
		
		
		

	}
	
	public void colour() {
		
		System.out.println("Colour is Red");
		
	}
	
	public void Price() {
		
		System.out.println("Price is 10 Lakhs");
		
	}

}
