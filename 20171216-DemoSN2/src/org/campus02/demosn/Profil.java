package org.campus02.demosn;

import java.util.GregorianCalendar;

public class Profil {

	public SecureValue<String> name;
	public SecureValue<GregorianCalendar> dateOfBirth;
	public SecureValue<Integer> alter;
	
	public Profil(String name, GregorianCalendar dateOfBirth, int alter)
	{
		this.name = new SecureValue<String>(name,0);
		this.dateOfBirth = 
			new SecureValue<GregorianCalendar>(dateOfBirth, 1);
		
		this.alter = new SecureValue<Integer>(alter, 1);
	}
	
	public void print()
	{
		name.print();
		dateOfBirth.print();
		alter.print();
	}
	
}
