
public class Car {

	private String colour;
	public int currentSpeed;
	public String manufacturer;
	public int horsePower;
	public String type;
	public int currentGear;
	
	public Car(String colour, String manufacturer)
	{
		this.colour = colour;
		this.manufacturer = manufacturer;
	}
	
	public void accelerate(int newSpeed)
	{
	/*	if (newSpeed < 220)
			currentSpeed = newSpeed;
		else
			currentSpeed = 220;*/
		
		currentSpeed = newSpeed < 220 ? newSpeed : 220;
		
		showSpeed();
	}
	
	private void showSpeed()
	{
		String info;
		info = "Current Speed: " + currentSpeed;
		if (currentSpeed == 220)
		{
			info += " - maximum erreicht";
		}
		System.out.println(info);
	}
	
	public void setColour(String colour)
	{
		this.colour = colour;
	}
	
	private void methodX()
	{
		System.out.println("do something X");
	}
	
	public void methodY()
	{
		System.out.println("do something Y");
	}
	
	
	public void nextGear()
	{
		if (currentGear <= 6)
			currentGear++;
	}
	
	
	
	
}
