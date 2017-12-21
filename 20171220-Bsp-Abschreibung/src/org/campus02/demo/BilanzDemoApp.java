package org.campus02.demo;

import org.campus02.afa.Anlage;

public class BilanzDemoApp {

	public static void main(String[] args) {
		Anlage a = new Anlage("Tisch", 500, 8);
		
		System.out.println(a.toString());
		
		a.abschreiben();
		
		System.out.println(a.toString());
		
		System.out.println("---");
		
		a.simulate(5, 300);
		
		// NEUE Anlage erstellen
		Anlage neu = a.renew(400, 5);
		System.out.println(neu.toString());
	}

}
