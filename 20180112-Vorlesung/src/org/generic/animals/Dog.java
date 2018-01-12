package org.generic.animals;

public class Dog {
	private String name;
	private int weight;
	public Dog(String name, int weight) {
		super();
		this.name = name;
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + ", weight=" + weight + "]";
	}
	
	
}
