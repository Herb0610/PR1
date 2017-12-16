
public class BankApp {

	public static void main(String[] args) {
	
		Gehaltskonto[] konten = new Gehaltskonto[3];
		konten[0] = new Gehaltskonto("Susi Sorglos", "AT03...", "RZST");
		konten[1] = new Gehaltskonto("Max Mustermann", "AT03...", "RZST");
		konten[2] = new Gehaltskonto("John", "AT03...", "RZST");

		konten[0].aufbuchen(100);
		konten[0].abbuchen(19);
		konten[1].aufbuchen(150);
		konten[2].aufbuchen(500);
		
		for (int i = 0; i < konten.length; i++) {
			konten[i].print();
		}
		
	}

}
