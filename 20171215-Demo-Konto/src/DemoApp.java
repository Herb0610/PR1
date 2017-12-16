
public class DemoApp {

	public static void main(String[] args) {

		Konto k2 = new Konto();
		k2.setInhaber("Susi Sorglos");
		k2.aufbuchen(500);
		System.out.println("Kontostand von Susi: " + k2.kontostand);
		
		Konto k = new Konto();
		k.setInhaber("Max Mustermann");
		System.out.println("Kontostand: " + k.kontostand);
		
		k.aufbuchen(100);
		System.out.println("Kontostand: " + k.kontostand);

		k.abbuchen(120);
		System.out.println("Kontostand: " + k.kontostand);

		k.abbuchen(90);
		System.out.println("Kontostand: " + k.kontostand);

		System.out.println("Kontostand von Susi: " + k2.kontostand);
		
	}

}
