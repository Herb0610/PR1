package org.campus02.personbsp;

public class Person {
	protected String firstName;
	protected String lastName;
	
	public Person(String lastname)
	{
		this.lastName = lastname;
	}

	public Person(String fn, String ln)
	{
		firstName = fn;
		lastName = ln;
	}
	
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
