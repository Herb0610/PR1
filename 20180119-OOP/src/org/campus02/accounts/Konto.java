package org.campus02.accounts;

public class Konto {

	private String inhaber;
	private double kontostand;
	
	public Konto (String inhaber)
	{
		this.inhaber = inhaber;
		this.kontostand = 0;
		System.out.println("Konstruktor von Konto aufgerufen");
	}
	
	public void einzahlen(double wert)
	{
		kontostand += wert;
	}
	
	public void auszahlen(double wert)
	{
		kontostand -= wert;
	}
	
	protected void setKontostand(double kontostand) {
		this.kontostand = kontostand;
	}

	public double getKontostand() {
		return kontostand;
	}


	
	
}
