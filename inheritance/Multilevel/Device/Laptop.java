package inheritance.Multilevel.Device;

public class Laptop extends Computer{
	int battery_Life = 10;
	String model = "XPS 15";
	public void Spec()
	{
		System.out.println("Brand name: " + brand);
		System.out.println("Model name: " + model);
		System.out.println("Processor: " + processor);
		System.out.println("Battery life: " + battery_Life);
	}
}
