package methodCalling.Trapezoid;

public class Main {
	public static void area()
	{
		float a = 9.2f;
		float b = 13.4f;
		float height = 6.9f;

		float area = 0.5f*(a+b)*height;

		System.out.println("The area of Trapezoid is: "+area);
	}
	public static void main(String[] args) 
	{
		area();
	}
}
