package org.campus02.generics;

public class DemoApp {

	public static void main(String[] args) {

		Integer[] arr = new Integer[5];
		Stack<Integer> stack = new Stack<Integer>(arr);
		
		stack.push(5);
		stack.push(4);
		stack.push(3);
		stack.push(2);
		stack.print();
		
		System.out.println("Ergebnis von pop: " + stack.pop());
		
		stack.print();
		
		System.out.println("Ergebnis von pop: " + stack.pop());
		
		stack.print();
		
		stack.push(8);
		stack.print();
		
		Stack<String> names = new Stack<String>(new String[5]);
		names.push("John");
		names.push("Max");
		names.push("Susi");
		names.print();
	}

}
