package methodWithReturnType.Rectangle;

public class Main {
	public static int area()
	{
		int width = 12;
		int height = 13;
		int result = width*height;
		return result;
	}
	public static void main(String[] args) 
	{
		int x = area();
		System.out.println("Area of Rectangle: "+x);
	}

}
