package org.campus02.animals;

public class Cat extends Animal {

	public String rasse;

	
	
	public Cat(String name, String rasse) {
		super();
		this.name = name;
		this.rasse = rasse;
	}



	@Override
	public void makeNoise() {
		System.out.println("miau miau");
	}
	
	public void move()
	{
		System.out.println("anschmiegsames schleichen");
	}
	
	
}
