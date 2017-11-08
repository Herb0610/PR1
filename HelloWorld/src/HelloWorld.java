
public class HelloWorld {

	public static void main(String[] args) 
	{
		System.out.println("Hello World");

		long zahl = 201710;

		System.out.println(zahl);

		zahl = zahl * 2;
		System.out.println(zahl);

		if (zahl > 100) {
			System.out.println("Lieber Benutzer, die Zahl ist größer 100!");
		}
		
		zahl = 201710;
		// Counter definieren
		int counter = 2;
		while (counter <= 9) // Counter bis 9 laufen lassen
		{
			zahl = zahl * counter;
			System.out.println(zahl);
			counter++;
		}
		
		// counter reseten
		counter = 2;
		while (counter <= 9)
		{
			zahl = zahl / counter;
			System.out.println(zahl);
			counter++;
		}

	}

}
