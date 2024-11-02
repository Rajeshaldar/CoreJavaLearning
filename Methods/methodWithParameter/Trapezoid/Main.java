package methodWithParameter.Trapezoid;

public class Main {
	public static void area(int a, int b, int height)
	{
		float area = 0.5f*(a+b)*height;
		System.out.println("The area of Trapezoid is: "+area);
	}
	public static void main(String[] args) 
	{
		area(7, 13, 32);
	}
}
