package org.campus02.hasen;

public class DemoApp {

	public static void main(String[] args) {

		OsterHase oh = new OsterHase("felix der osterhase");
		oh.fressen();
		oh.versteckeOstereier();
		
		WeihnachtsHase wh = new WeihnachtsHase("weihnachtshasen");
		wh.schlafen();
		wh.fressen();
		wh.verteileGeschenke();
		
		System.out.println("--------------");
		
		Hasenstall sommerWiese = new Hasenstall();
		sommerWiese.add(oh);
		sommerWiese.add(wh);
		sommerWiese.fressen();
		sommerWiese.schlafen();

		Hase neuOH = oh;
		Hase neuWh = wh;
		neuOH.fressen();
		
		System.out.println("down-casting");
		OsterHase neuerOsterhase = (OsterHase) neuOH;
		neuerOsterhase.versteckeOstereier();
		System.out.println("down-casting - fehler");
		WeihnachtsHase neuerWH = (WeihnachtsHase) neuOH;
		neuerWH.verteileGeschenke();
		
		
		Object obj = wh;
		System.out.println("toString");
		System.out.println(wh);
		System.out.println(oh);
	}

}
