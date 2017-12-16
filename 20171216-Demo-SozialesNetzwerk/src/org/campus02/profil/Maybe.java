package org.campus02.profil;

public class Maybe<T> {

	private T value; ;
	private int status; 
	/*
	 * 0 ... nicht anzeigen
	 * 1 ... anzeigen
	 * 3 ... nicht gesetzt
	 */
	public Maybe(T value) {
		this.value = value;
		status = 1;
	}
	
	public void setStatus(int status)
	{
		if (status >= 0 && status <= 1)
			this.status = status;
		else
			System.out.println("falscher status");
	}
	
	
	public void print()
	{
		switch (status) {
		case 0:
			System.out.println("-");
			break;
		case 1:
			System.out.println(value);
			break;
		case 2:
			System.out.println("nicht gesetzt");
			break;			
		default:
			System.out.println("Fehler");;
		}
	}
	
}
