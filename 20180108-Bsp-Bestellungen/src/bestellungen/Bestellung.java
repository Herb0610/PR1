package bestellungen;

public class Bestellung {

	private String nummer;
	private Bestellzeile[] bestellzeilen;
	private String countryID;
	
	
	public Bestellung(String nummer, String countryID, Bestellzeile[] bestellzeilen) {
		this.nummer = nummer;
		this.bestellzeilen = bestellzeilen;
		this.countryID = countryID;
	}
	public String getCountryID()
	{
		return countryID;
	}
	
	public void printBestellung()
	{
		System.out.println("Bestellnummer: " + nummer);
		
		for (int i = 0; i < bestellzeilen.length; i++) {
			Bestellzeile oneRow = bestellzeilen[i];
			
			System.out.println("Zeile " + i +
					oneRow.getName() + " - Kosten: " +
					oneRow.getKosten()
						);
		}
	}
	
	public double getKosten()
	{
		double kosten = 0;
		for (int i = 0; i < bestellzeilen.length; i++) {
			Bestellzeile oneRow = bestellzeilen[i];
			
			kosten += oneRow.getKosten();
		}
		
		return kosten;
	}
	
	
}
