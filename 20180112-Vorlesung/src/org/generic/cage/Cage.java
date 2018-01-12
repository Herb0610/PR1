package org.generic.cage;


public class Cage <T> {

	private T animal;

	public Cage(T animal) {
		super();
		this.animal = animal;
	}

	public T getAnimal() {
		return animal;
	}

	public void setAnimal(T animal) {
		this.animal = animal;
	}
	
	
	
}
