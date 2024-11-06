package Static.Laptop;

public class Main {
	static void Laptop (String a)
	{
		System.out.println("Company is "+a);
	}
	static void Laptop (String a, int b)
	{
		System.out.println("Model name is "+a+ b);
	}
	static void Laptop (int p)
	{
		System.out.println("Price is Rs "+p);
	}
	static void Laptop (int a, int b)
	{
		System.out.println("Storage: SSD "+a+"GB"+" HDD "+b+"TB");
	}
	static void Laptop (String a, String b)
	{
		System.out.println("Processor is: "+a + b);
	}
	public static void main(String[] args) 
	{
		Laptop("ASUS");
		Laptop("TUF Gamming f",15);
		Laptop(56000);
		Laptop(512, 1);
		Laptop("Intel", "Core i5");
	}
}
