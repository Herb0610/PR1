package org.campus02.generics;

public class Stack<T>  {
	
	private T[] elements;
	private int counter;
	
	public Stack(T[] elements) {
		this.elements = elements;
		counter = -1;
	}
	
	public T pop() {
		if (counter >= 0) {
			T value = elements[counter];
			counter--;
			return value;
		}
		return null;
	}
	
	public void push(T value)	{
		counter++;
		elements[counter] = value;
	}
	
	public void print()	{
		System.out.println("stack:");
		for (int i = counter; i >= 0; i--) {
			System.out.println(elements[i]);
		}
	}
	
	public T pop2()
	{
		if (counter >= 0)
		{
			counter--;
			return elements[counter + 1];
		}
		return null;
	}
	

}
