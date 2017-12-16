
public class DemoApp {

	public static void main(String[] args) {
		Person max = new Person();
		max.vorname = "Max";
		max.nachname = "Muster";
		max.alter = 39;
		
		Person susi = new Person();
		susi.vorname = "Susi";
		susi.nachname = "Sorglos";
		susi.alter = 28;
		
		max.print();
		susi.print();
	}

}
