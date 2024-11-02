package methodWithParameter.Triangle;

public class Main {
	public static void area(float base, float height)
	{
		float area = 0.5f*base*height;
		System.out.println("The area of Triangle is: "+area);
	}
	public static void main(String[] args) 
	{
		area(13.36f, 36.36f);
	}
}
