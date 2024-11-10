package inheritance.Multilevel.Car;

public class Model extends BMW{
	String Price = "Rs. 72.90 Lakh";
	double Mileage = 13.02;
	int Engine = 2998;

	public void info()
	{
		System.out.println ("Car model: " + Model);
		System.out.println("Car type: " + type);
		System.out.println("Fuel type: " + fuel);
		System.out.println("Price: " + Price);
		System.out.println("Milage: " + Mileage + " kmpl");
		System.out.println("Engine: " + Engine + " CC");
		System.out.println("Sefety: " + Safety + " Star (Euro NCAP)");

	}
}
