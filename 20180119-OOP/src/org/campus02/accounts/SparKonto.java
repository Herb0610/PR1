package org.campus02.accounts;

public class SparKonto extends Konto {

	public SparKonto(String inhaber) {
		super(inhaber);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void auszahlen(double wert)
	{
		if (wert > getKontostand())
		{
			System.out.println("Auszahlung nicht erlaubt!");
			return;
		}
		super.auszahlen(wert);
	}

}
