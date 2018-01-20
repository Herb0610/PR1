package org.campus02.accounts;

public class DemoApp {

	public static void main(String[] args) {
		
		Konto k = new Konto("Max");
		k.einzahlen(1000);
		k.auszahlen(800);
		System.out.println(k.getKontostand());
		
		System.out.println("Test von Girokonto");
		GiroKonto g = new GiroKonto("Susi", 1000);
		g.auszahlen(250);
		System.out.println("Giro:" + g.getKontostand());
		g.auszahlen(800);
		System.out.println("Giro:" + g.getKontostand());

		System.out.println("Test von Jugendkonto");
		Konto jk = new JugendGiroKonto("junger max", 1000, 50);
		jk.auszahlen(40);
		jk.auszahlen(200);
		System.out.println("JK: " + jk.getKontostand());
	
		System.out.println("Sparkonto");
		Konto sparKonto = new SparKonto("fleiﬂiger max");
		sparKonto.einzahlen(1000);
		sparKonto.auszahlen(1001);
		System.out.println(sparKonto.getKontostand());
	}

}
