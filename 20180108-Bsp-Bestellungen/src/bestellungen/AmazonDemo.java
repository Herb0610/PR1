package bestellungen;

import java.util.ArrayList;
import java.util.HashMap;

public class AmazonDemo {

	public static void main(String[] args) {
		
		Bestellzeile[] zeilen = new Bestellzeile[3];
		zeilen[0] = new Bestellzeile("Asus", 1, 1000);
		zeilen[1] = new Bestellzeile("Maus", 1, 29);
		zeilen[2] = new Bestellzeile("Bildschirm", 1, 300);
		
		Bestellung bestellung = new Bestellung("AT15-123456", "AT", zeilen);
		Bestellung bestellung1 = new Bestellung("AT15-123456", "DE", zeilen);
		Bestellung bestellung2 = new Bestellung("AT15-123456", "AT", zeilen);
		
		ArrayList<Bestellung> bestellungen = new ArrayList<>();
		bestellungen.add(bestellung);
		bestellungen.add(bestellung1);
		bestellungen.add(bestellung2);
		
		for (int i = 0; i < bestellungen.size(); i++)
		{
			Bestellung b = bestellungen.get(i);
			b.getKosten();
		}
		
		for (Bestellung x : bestellungen) {
			x.getKosten();
		}
		
		
		
		
		// Bestellungen je Land
		HashMap<String, Integer> bestellungenJeLand = new HashMap<>();
		for (Bestellung b : bestellungen) {
			if (bestellungenJeLand.containsKey(b.getCountryID()))
			{
				// ist für das aktuelle Land <b.getCountryID()> schon etwas in der Map
				int value = bestellungenJeLand.get(b.getCountryID());
				value++;
				bestellungenJeLand.put(b.getCountryID(), value);
			}
			else
			{
				bestellungenJeLand.put(b.getCountryID(), 1);
			}
		}
		System.out.println("Bestellungen je Land");
		System.out.println(bestellungenJeLand);
		
		// Umsatz je Land
		HashMap<String, Double> umsatzJeLand = new HashMap<>();
		for (Bestellung b : bestellungen) 
		{
			if (umsatzJeLand.containsKey(b.getCountryID()))
			{
				// ist für das aktuelle Land <b.getCountryID()> schon etwas in der Map
				Double value = umsatzJeLand.get(b.getCountryID());
				value += b.getKosten();
				umsatzJeLand.put(b.getCountryID(), value);
			}
			else
			{
				umsatzJeLand.put(b.getCountryID(), b.getKosten());
			}
		}
		System.out.println("Umsatz je Land");
		System.out.println(umsatzJeLand);
				
		System.out.println(umsatzJeLand.get("CZ"));
		
		for(String s : umsatzJeLand.keySet())
		{
			System.out.println(s + " " + umsatzJeLand.get(s));
			System.out.println(s + " " + bestellungenJeLand.get(s));
		}
		
		bestellung.printBestellung();
		
		System.out.println("Gesamtkosten: " + bestellung.getKosten());
		

	}

}
