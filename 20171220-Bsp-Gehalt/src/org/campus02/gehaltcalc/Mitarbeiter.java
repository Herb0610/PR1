package org.campus02.gehaltcalc;

public class Mitarbeiter {

	private String Vorname;
	private String Nachname;
	private int Mitarbeiternummer;
	private double Gehalt;
	private int alter;
	private static int nextID;
	
	public Mitarbeiter(String vorname, 
			String nachname, double gehalt) {
		Vorname = vorname;
		Nachname = nachname;
		Gehalt = gehalt;
		
		Mitarbeiternummer = ++nextID;
	}
	
	public double monatsAbrechnung()
	{
		double jahresGehalt = Gehalt * 12;
		jahresGehalt = jahresGehalt * 0.8; // - SV
		double steuer = 0;
		
		if (jahresGehalt <= 10_000)
		{
			steuer = jahresGehalt * 0.1;
		}
		else if (jahresGehalt <= 20_000)
		{
			steuer = (10_000) * 0.1 + 
					(jahresGehalt - 10_000) * 0.2;
		}
		else if (jahresGehalt <= 30_000)
		{
			steuer = 3000 + 
					(jahresGehalt - 20_000) * 0.32;
		}
		else if (jahresGehalt <= 50_000)
		{
			steuer = 1000 + 2000 + (30_000) * 0.32+ 
					(jahresGehalt - 30_000) * 0.45;
		}	
		else 
		{
			steuer = 1000 + 2000 + (30_000) * 0.32+ 
					+ (50_000) * 0.45+
					(jahresGehalt - 50_000) * 0.60; 
		}
		return (jahresGehalt - steuer) / 12;
	}
	
	public double monatsAbrechnung_Variante2()
	{
		double jahresGehalt = Gehalt * 12;
		jahresGehalt = jahresGehalt * 0.8; // - SV
		double steuer = 0;
		
		// 50_000 erledigt
		steuer += jahresGehalt > 50_000 ? (jahresGehalt - 50_000) * 0.60 : 0;
		jahresGehalt = jahresGehalt > 50_000 ? 50_000 : jahresGehalt;
		// 30_000 erledigt
		steuer += jahresGehalt > 30_000 ? (jahresGehalt - 30_000) * 0.45 : 0;
		jahresGehalt = jahresGehalt > 30_000 ? 30_000 : jahresGehalt;
		// 20_000 erledigt
		steuer += jahresGehalt > 20_000 ? (jahresGehalt - 20_000) * 0.32 : 0;
		jahresGehalt = jahresGehalt > 20_000 ? 20_000 : jahresGehalt;
		// 10_000 erledigt
		steuer += jahresGehalt > 10_000 ? (jahresGehalt - 10_000) * 0.20 : 0;
		jahresGehalt = jahresGehalt > 10_000 ? 10_000 : jahresGehalt;
		// 0 erledigt
		steuer += jahresGehalt * 0.1;		
		return ((Gehalt * 12 *0.8) - steuer) / 12;
	}
	
	
	public double JahresBerechnung()
	{
		return JahresBerechnung(12);
	}
	
	public double JahresBerechnung(int monate)
	{
		return monatsAbrechnung() * monate;
	}
	
	public String toString() {
		return "Mitarbeiter [Vorname=" + Vorname + ", Nachname=" + Nachname + ", Mitarbeiternummer=" + Mitarbeiternummer
				+ ", Gehalt=" + Gehalt + ", alter=" + alter + "]";
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public String getVorname() {
		return Vorname;
	}

	public String getNachname() {
		return Nachname;
	}

	public int getMitarbeiternummer() {
		return Mitarbeiternummer;
	}

	public double getGehalt() {
		return Gehalt;
	}

	public static int getNextID() {
		return nextID;
	}
	
	
	
	
}
