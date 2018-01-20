package org.campus02.hasen;

public class WeihnachtsHase extends Hase {

	public String ruckSack;
	public WeihnachtsHase(String name) {
		super(name);
		ruckSack = "viele Geschenke";
	}
	
	public void verteileGeschenke()
	{
		System.out.println(name + " verteilt Geschenke");
	}
	
	@Override
	public void fressen()
	{
		System.out.println(name 
				+ " frisst Weihnachtskugeln im Schnee!");
	}

	@Override
	public String toString() {
		return "WeihnachtsHase [name=" + name + "]";
	}
	
	

}
