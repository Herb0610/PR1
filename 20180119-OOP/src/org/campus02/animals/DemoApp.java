package org.campus02.animals;

public class DemoApp {

	public static void main(String[] args) {

		Beagle b = new Beagle();
		b.name = "happy";
		b.eyeColour = "braun";
		b.weight = 15000;
		b.lovedFood = "steak";
		
		System.out.println(b.toString());
		
		b.changeName("happy 2");
		System.out.println(b.toString());

		b.makeNoise();
		
		Cat cat = new Cat("shorty", "kurzhaar-katze");
		cat.makeNoise();
		
		Animal a = new Animal();
		a.name = "allgemeines Tier";
		a.makeNoise();
		a.move();
		cat.move();
		b.move();
	}

}
