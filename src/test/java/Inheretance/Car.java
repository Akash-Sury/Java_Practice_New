package Inheretance;

import org.apache.hc.core5.reactor.Command;

public class Car extends VehicleCommon{

public static void main(String[] args) {
	
	//Single ------- CommonVehicle------>>>>Truck
	//Multilevel-----we have base class CommonVehicle---->>Truck----->>>Brand
	//Hierarchiel---- CommonVehicle---->>>>Truck     CommonVehicle------>>>>> Car
	
	Car car = new Car();
	
	car.start();
	car.Stop();
	car.Type();    // we can call both parent and child class methods
	
	VehicleCommon v = new VehicleCommon();
	v.start();
	v.Stop();
	//v.type(); cannot call child class method
	
	VehicleCommon cm = new Car();
	cm.start();
	cm.Stop();
	//cm.ty     cannot call child class method
	
	
	
	
}	
	public void Type() {
		
		System.out.println("Type is Sedan");
		
	}
	
}
