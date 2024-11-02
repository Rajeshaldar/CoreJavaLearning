package methodWithReturnType.Trapezoid;

public class Main {
	public static float area()
	{
		int a = 3;
		int b = 6;
		int h = 12;
		float res = 0.5f*(a+b)*h;

		return res;
	}
	public static void main(String[] args) 
	{
		float x = area();
		System.out.println("Area of Trapezoid: "+x);
	}

}
