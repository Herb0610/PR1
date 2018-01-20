package org.campus02.animals;

public class Beagle extends Dog {

	public String lovedFood;


	public String toString() {
		return "Beagle [lovedFood=" + lovedFood + ", eyeColour=" + eyeColour + ", weight=" + weight + ", name=" + name
				+ "]";
	}
	
	@Override
	public void makeNoise(){
		System.out.println("wuff beagle");
	}
	
	
	
}
