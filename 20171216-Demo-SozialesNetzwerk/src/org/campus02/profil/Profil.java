package org.campus02.profil;

import java.util.GregorianCalendar;

public class Profil {

	private String name;
	private String address;
	private int age;
	private Maybe<String> email;
	private char gender; // F, M
	private Maybe<GregorianCalendar> dateOfBirth; //YYYMMDD
	private Maybe<Integer> salary;
	

	public Profil(String name, String address, 
			int age, String email, char gender,
			GregorianCalendar dateOfBirth, int salary) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
		this.email = new Maybe<String>(email);
		this.gender = gender;
		this.dateOfBirth = new Maybe<GregorianCalendar>(dateOfBirth);
		this.salary = new Maybe<Integer>(salary);
	}
	
	public void setSalaryStatus(int status)
	{
		salary.setStatus(status);
	}
	
	public void print()
	{
		System.out.println( "Profil [name=" + name + ", address=" + address + ", age=" + age + ", gender="
				+ gender  );
		salary.print();
		email.print();
		dateOfBirth.print();

	}


	
}
