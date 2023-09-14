package OverRiding;

public class Cat extends Animal {

	public static void main(String[] args) {

		Animal c = new Animal();
		c.MakeNoise();

	}

	public void MakeNoise() {

		System.out.println("Cat maues");

	}

}
