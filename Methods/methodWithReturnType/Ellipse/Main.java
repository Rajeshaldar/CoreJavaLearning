package methodWithReturnType.Ellipse;

public class Main {
	public static float area()
	{
		float pi = 3.14f;
		int a = 3;
		int b = 6;
		float res = pi * a * b;

		return res;
	}
	public static void main(String[] args) 
	{
		float x = area();
		System.out.println("Area of Ellipse: "+x);
	}
}
