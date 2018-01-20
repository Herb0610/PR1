package org.campus02.accounts;

public class GiroKonto extends Konto {

	private double limit; /* �berziehungsrahmen */
	
	public GiroKonto(String inhaber, double limit) {
		super(inhaber);

		this.limit = limit;
		
		System.out.println("Konstruktor von GiroKonto aufgerufen");
	}
	
	@Override
	public void auszahlen(double wert)
	{
		if ((getKontostand() + limit) - wert >= 0)
		{
			setKontostand(getKontostand() - wert); 
		}
		else
		{
			System.out.println("Auszahlung verhindert, �berziehungsrahmen nicht gro� genug");
		}
	}
	
	protected double getLimit()
	{
		return limit;
	}
	
	

}
