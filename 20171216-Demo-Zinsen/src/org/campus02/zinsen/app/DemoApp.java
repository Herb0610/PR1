package org.campus02.zinsen.app;

import org.campus02.zinsen.biz.Zinsberechnung;

public class DemoApp {

	public static void main(String[] args) {

		Zinsberechnung zb = new Zinsberechnung();
		System.out.println(zb.berechnen(1000, 365, 2));

	}

}
