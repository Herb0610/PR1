package org.campus02.demosn;

import java.util.GregorianCalendar;

public class DemoApp {

	public static void main(String[] args) {
		Profil p = new Profil("Max", new GregorianCalendar(1990, 6, 5), 27);
		p.print();
		
		p.name.setStatus(2);
		p.print();

		int alter = 25;
		Integer alterI = alter;
		alter = alterI;
	}

}
