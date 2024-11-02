package methodCalling.Ellipse;

public class Main {
	public static void area()
	{
		float pi = 3.14f;
		float a = 9.2f;
		float b = 14.0f;

		float area = pi*a*b;

		System.out.println("The area of Ellipse is: "+area);
	}
	public static void main(String[] args) 
	{
		area();
	}
}
