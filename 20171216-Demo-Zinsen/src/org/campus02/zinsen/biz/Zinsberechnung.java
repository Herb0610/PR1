package org.campus02.zinsen.biz;

public class Zinsberechnung {

	public double berechnen(double kapital, 
			int tage, double zinssatz)
	{
		return kapital * zinssatz * tage / 36000;
	}
}
