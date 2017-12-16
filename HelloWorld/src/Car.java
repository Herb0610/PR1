public class Car {
 
  private int currentSpeed;
 
  public void accelerate(int newSpeed)  {
	  currentSpeed = newSpeed < 220 ? newSpeed : 220;
	  showSpeed();
  }
  
  private void showSpeed()
  {
	  String info;
	  info = "Current Speed: " + currentSpeed;
	  if (currentSpeed == 220)
		  info += " - maximim reached";
	  System.out.println(info);
  }
  
  private int currentGear;
  
  public void nextGear()
	{
		if (currentGear <= 6)
			currentGear++;
	}
  
 }
