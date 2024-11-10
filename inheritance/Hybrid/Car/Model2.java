package inheritance.Hybrid.Car;

public class Model2 extends Brand{
	String model = "i7 M70";
	String color = "Blue";
	String fuel = "Electric";
	double acceleration = 3.2;
	int topSpeed = 250;

	void ModelInfo2()
	{
		System.out.println();
		System.out.println("Model 2");
		System.out.println("Model: " + model);
		System.out.println("Brand: " + brand);
		System.out.println("Car type: " + type);
		System.out.println("Fuel type: " + fuel);
		System.out.println("Acceleration: " + acceleration +" seconds");
		System.out.println("Top Speed: " + topSpeed + " kmph");
	}
}
