package methodWithReturnType.Triangle;

public class Main {
	public static float area()
	{
		int base = 23;
		int height = 12;
		float c = 0.5f * base * height;
		return c;
	}
	public static void main(String[] args) 
	{
		float x = area();
		System.out.println("Area of Triangle: "+x);
	}
}
