
public class DemoApp {

	public static void main(String[] args) {
		
		long wertLong = 12456;
		
	
		Car porsche911 = new Car("black", "Porsche");
		//porsche911.col = "black";
		porsche911.currentSpeed = 0;
		porsche911.horsePower = 350;
		porsche911.type = "Porsche 911";
		porsche911.methodY();
		
		porsche911.accelerate(230);


		//System.out.println("Farbe von Auto: " + porsche911.colour);
		
		Car golf4 = new Car("mint-green", "VW");
		golf4.currentSpeed = 0;
		golf4.horsePower = 68;
		golf4.type = "VW Golf 4";
		
		System.out.println("Porsche911" + porsche911.horsePower);
		System.out.println("Golf" + golf4.horsePower);
	}


}
