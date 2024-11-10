package inheritance.Multilevel.Bike;

public class G310R extends BMW{
	int mileage = 30;
	int transmission = 6;
	int fuelCapacity = 11;
	String color = "Cosmic Black";

	public void info()
	{
		System.out.println("Model: " + model);
		System.out.println("Wheel: " + wheel);
		System.out.println("Color: " + color);
		System.out.println("Mileage: " + mileage +" kmpl");
		System.out.println("Transmission : "+ transmission +" Speed Manual");
		System.out.println("Fuel Tank Capacity: " + fuelCapacity +" litres");
	}
}
