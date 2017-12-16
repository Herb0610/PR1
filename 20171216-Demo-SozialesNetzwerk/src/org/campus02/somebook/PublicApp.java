package org.campus02.somebook;

import java.util.GregorianCalendar;

import org.campus02.profil.Profil;

public class PublicApp {

	public static void main(String[] args) {

		Profil pSusi = new Profil("Susi", "Graz", 27, "susi@gmail.com",
						'F', new GregorianCalendar(1990, 01, 15), 2000);
		Profil pMax = new Profil("Max", "Wien", 37, "max@gmail.com",
				'M', new GregorianCalendar(1980, 01, 15), 2500);
		Profil pJohn = new Profil("John", "Wien", 17, "john@gmail.com",
				'M', new GregorianCalendar(2000, 01, 15), 1900);

		Profil[] alleProfile = new Profil[3];
		alleProfile[0] = pSusi;
		alleProfile[1] = pMax;
		alleProfile[2] = pJohn;
		
		
		// Print all
		for (int i = 0; i < alleProfile.length; i++) {
			alleProfile[i].print();
		}
		
		System.out.println(" ------------- nun geändert");
		System.out.println();
		pSusi.setSalaryStatus(0);
		pMax.setSalaryStatus(1);
		pJohn.setSalaryStatus(1);
		// Print all
		for (int i = 0; i < alleProfile.length; i++) {
			alleProfile[i].print();
		}
		
	}

}
