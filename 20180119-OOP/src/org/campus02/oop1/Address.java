package org.campus02.oop1;

public class Address {

	private String street;
	private String zip;
	private String city;
	
	private String type; /* haupt, rechnung, liefer-adresse */

	public Address(String street, String zip, String city, String type) {
		super();
		this.street = street;
		this.zip = zip;
		this.city = city;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", zip=" + zip + ", city=" + city + ", type=" + type + "]";
	}
	
	
}
