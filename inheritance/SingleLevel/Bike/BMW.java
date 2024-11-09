package inheritance.SingleLevel.Bike;

public class BMW extends Bike{
	String color = "Black";
	String name = "BMW G 310 R";

	public void info ()
	{
		System.out.println("Name: "+name);
		System.out.println("Color: "+color);
		System.out.println("Fuel type: "+fuel);
		System.out.println("wheel: "+wheel);
	}

}
