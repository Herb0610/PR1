package org.campus02.animals;

public class Dog extends Animal {

	public String eyeColour;
	public int weight;
	
	public void changeName(String name)
	{
		this.name = name;
	}
	
	@Override
	public void makeNoise()
	{
		System.out.println("wuff - wuff");
	}
}
