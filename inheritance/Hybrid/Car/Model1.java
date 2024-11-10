package inheritance.Hybrid.Car;

public class Model1 extends Brand{
	String model = "i5 M60";
	String color = "Red";
	String fuel = "Electric";
	double acceleration = 3.8;
	int topSpeed = 230;

	void ModelInfo1()
	{
		System.out.println("Model 1");
		System.out.println("Model: " + model);
		System.out.println("Brand: " + brand);
		System.out.println("Car type: " + type);
		System.out.println("Fuel type: " + fuel);
		System.out.println("Acceleration: " + acceleration +" seconds");
		System.out.println("Top Speed: " + topSpeed + " kmph");
	}
}
