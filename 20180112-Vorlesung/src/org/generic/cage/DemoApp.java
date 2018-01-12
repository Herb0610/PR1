package org.generic.cage;

import org.generic.animals.Cat;
import org.generic.animals.Dog;

public class DemoApp {

	public static void main(String[] args) {

		Cat schnurli = new Cat("schnurli");
		Dog bello = new Dog("bello", 5000);
		
		Cage<Dog> cageDog = new Cage<Dog>(bello);
		Cage<Cat> cageCat = new Cage<Cat>(schnurli);
		

	}

}
