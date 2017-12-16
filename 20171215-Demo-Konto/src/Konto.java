
public class Konto 
{
	// Attribute
	public String inhaber;
	public double kontostand;
	
	public void setInhaber(String inhaber)	
	{
		this.inhaber = inhaber;
		this.kontostand = 0;
	}
	
	public void setInhaber()	
	{
		this.kontostand = 0;
	}
	
	public void aufbuchen(double betrag)
	{
		kontostand += betrag;
	}
	
	public void abbuchen(double betrag)
	{
		if (kontostand - betrag > 0)
			kontostand -= betrag;
		else
			System.out.println("Betrag ist zu groß, aktuelles Guthaben: " + kontostand);

	}
	
}
