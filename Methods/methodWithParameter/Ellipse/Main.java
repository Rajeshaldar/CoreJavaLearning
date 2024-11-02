package methodWithParameter.Ellipse;

public class Main {
	public static void area(float a, float b)
	{
		float pi = 3.14f;
		float area = pi*a*b;
		System.out.println("The area of Ellipse is: "+area);
	}
	public static void main(String[] args) 
	{
		area(36.598f, 76.36f);
	}
}
