package org.campus02.hasen;

import java.util.ArrayList;

public class Hasenstall {

	private ArrayList<Hase> hasen;
	
	public Hasenstall()
	{
		hasen = new ArrayList<>();
	}
	
	public void add(Hase h)
	{
		hasen.add(h);
	}
	
	public void fressen()
	{
		for (Hase hase : hasen) {
			hase.fressen();
		}
	}
	
	public void schlafen()
	{
		for (Hase hase : hasen) {
			hase.schlafen();
		}
	}
}
