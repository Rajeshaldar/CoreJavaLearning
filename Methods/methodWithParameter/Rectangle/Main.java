package methodWithParameter.Rectangle;

public class Main {
	public static void area(int width, int height)
	{ 
		int area = width * height;
		System.out.println("The area of Rectangle is: "+area);
	}
	public static void main(String[] args) 
	{
		area(32, 23);
	}
}
