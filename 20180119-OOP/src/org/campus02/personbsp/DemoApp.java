package org.campus02.personbsp;

import org.campus02.personbsp.Customer;

public class DemoApp {

	public static void main(String[] args) {

		Customer c = new Customer("Max", "Muster", "1234");
		
		System.out.println(c.toString());

	}

}
