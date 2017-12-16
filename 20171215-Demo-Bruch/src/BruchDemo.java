
public class BruchDemo {

	public static void main(String[] args) {
		Bruch b1 = new Bruch(5, 7);
		
		b1.print();
		
		Bruch b2 = new Bruch(1, 2);
		b2.print();
		
		Bruch b3 = b1.multiplicate(b2);
		b3.print();
		
		Bruch b4 = b3.multiplicate(b2);
		b4.print();
		

	}

}
