package org.campus02.accounts;

public class JugendGiroKonto extends GiroKonto {

	private double buchungslimit;
	public JugendGiroKonto(String inhaber, double limit
			, double buchungslimit
			) {
		super(inhaber, limit);
		this.buchungslimit = buchungslimit;
		
		System.out.println("JugendGiroKonto erstellt!");
	}
	
	public void auszahlen(double wert)
	{
		if (wert > buchungslimit)
		{
			System.out.println("so viel darf nicht abgehoben werden");
			return;
		}
		// hier rufen wir die Methoden auszahlen()
		// der Basisklasse auf
		super.auszahlen(wert);
	}

}
