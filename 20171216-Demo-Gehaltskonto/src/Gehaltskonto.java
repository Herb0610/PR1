
public class Gehaltskonto {

	private String Inhaber;
	private String IBAN;
	private String BIC;
	private double Kontostand;

	private static int nextID;
	private int GehaltsKontoID;
	
	
	public Gehaltskonto(String inhaber, String iBAN, String bIC) {
		Inhaber = inhaber;
		IBAN = iBAN;
		BIC = bIC;
		Kontostand = 0.0;
		
		GehaltsKontoID = ++nextID;
	}

	public double getKontostand() {
		return Kontostand;
	}
	
	
	public void print()
	{
		System.out.println("Nr: " + GehaltsKontoID + " - Inhaber: " + Inhaber + "\nIBAN: " + IBAN + "\nBIC: " + BIC + "\nKontostand: " + Kontostand);
	}
	
	public void aufbuchen (double wert)
	{
		Kontostand += wert;
	}
	
	public void abbuchen(double wert)
	{
		if (Kontostand - wert > 0)
			Kontostand -= wert;
	}
	
	
}
