package org.campus02.hasen;

public class OsterHase extends Hase {

	public OsterHase(String name) {
		super(name);
	}
	
	public void versteckeOstereier()
	{
		System.out.println(name + " versteckt die Ostereier");
	}
	
	@Override
	public void fressen()
	{
		System.out.println(name 
				+ " hat am liebsten rote Eier!");
	}
	
	@Override
	public void schlafen()
	{
		System.out.println(name 
				+ " schläft von 17 bis 9 Uhr!");
	}
}
