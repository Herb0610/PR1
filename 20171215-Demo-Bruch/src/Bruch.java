
public class Bruch {

	private int zaehler;
	private int nenner;
	
	public Bruch(int zaehler, int nenner)
	{
		this.zaehler = zaehler;
		this.nenner = nenner;
	}
	
	public int getZaehler()
	{
		return zaehler;
	}
	
	public int getNenner()
	{
		return nenner;
	}
	
	public double toDecimal()
	{
		return zaehler * 1.0 / nenner;
	}
	
	public void print()
	{
		System.out.println(zaehler + " / " + nenner + " = " + toDecimal());
	}
	
	public Bruch multiplicate(Bruch b2)
	{
		return new Bruch
				(this.zaehler * b2.getZaehler(), 
				this.nenner * b2.getNenner());
	}
	
}
