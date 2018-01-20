package org.campus02.personbsp;

public class Customer extends Person {

	public String customerNumber;

	public Customer(String firstname, String lastname,
			String customerNumber) {
		super(firstname, lastname);
		this.customerNumber = customerNumber;
	}

	public String toString() {
		return "Customer [customerNumber=" + customerNumber + ", firstName=" + firstName + ", lastName=" + lastName
				+ "]";
	}
	
	
	
}
