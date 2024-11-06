package Static.Calculator;

public class Main {
	static void Area (int a)
	{
		int square = a*a;
		System.out.println("The area of circle is " + square);
	}
	static void Area (int b, int h)
	{
		int parallelogram = b*h;
		System.out.println("The area of parallelogram is "+ parallelogram);
	}
	static void Area (double pi, int r)
	{
		double circle = pi*r*r;
		System.out.println("The area of circle is " + circle);
	}
	static void Area (double pi, int a, int b)
	{
		double Ellips = pi*a*b;
		System.out.println("The area of ellips " + Ellips);
	}
	public static void main(String[] args) 
	{
		Area(5);
		Area(12,20);
		Area(3.142,11);
		Area(3.142,5,11);
	}

}
