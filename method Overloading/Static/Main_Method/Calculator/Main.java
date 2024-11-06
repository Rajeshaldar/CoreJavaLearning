package Static.Main_Method.Calculator;

public class Main {
	static void main (int a)
	{
		System.out.println ("Result of addition: "+a+a);
	}
	static void main (int a, int b)
	{
		int product = a * b;
		System.out.println ("Result of product: " + product);
	}
	static void main (double d, int a)
	{
		double temp = d/a;
		System.out.println ("Result of divison: " + temp);
	}
	public static void main(String[] args) 
	{
		main (52.7, 2);
		main (12);
		main (12, 4);
	}

}
