package org.campus02.oop1;

import java.util.ArrayList;

public class Person {

	private String firstname;
	private String lastname;
	
	private ArrayList<Address> addresses;

	public Person(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.addresses = new ArrayList<>();
	}
	
	public void addAddress(Address a)
	{
		addresses.add(a);
	}
	
	
	
}
