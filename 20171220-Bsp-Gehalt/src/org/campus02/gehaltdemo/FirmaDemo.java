package org.campus02.gehaltdemo;

import org.campus02.gehaltcalc.Mitarbeiter;

public class FirmaDemo {

	public static void main(String[] args) {
		Mitarbeiter mitarbeiter = new Mitarbeiter("Max", "Muster", 2333.333);
		System.out.println(mitarbeiter.toString());

		System.out.println(mitarbeiter.monatsAbrechnung());
		System.out.println(mitarbeiter.monatsAbrechnung_Variante2());
		
		
		
		System.out.println(mitarbeiter.JahresBerechnung());
		System.out.println(mitarbeiter.JahresBerechnung(6));
		
		Mitarbeiter mitarbeiter2 = new Mitarbeiter("Susi", "Sorglos", 2500.0);
		System.out.println(mitarbeiter2);
		
		System.out.println(mitarbeiter2.monatsAbrechnung());
	}

}
