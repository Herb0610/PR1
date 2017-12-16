package org.campus02.demosn;

public class SecureValue<T> {

	private T value;
	private int status;
	
	public SecureValue(T value, int status) {
		super();
		this.value = value;
		this.status = status;
	}
	
	public void print()
	{
		switch (status) {
		case 0:
			System.out.println("secured");
			break;
		case 1:
			System.out.println(value);
			break;
		case 2:
			System.out.println("not set");
			break;

		default:
			System.out.println("ungültiger status");
		}
	}
	
	public void setStatus(int status)
	{
		switch (status) {
			case 0:
			case 1:
			case 2:
				this.status = status;
				break;
			default:
				System.out.println("ungültiger wert");
		}
	}
	
	
	
	
	
}
