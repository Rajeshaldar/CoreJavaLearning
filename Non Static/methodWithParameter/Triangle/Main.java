package methodWithParameter.Triangle;

public class Main {
	void Triangle( float base, float height)
	{
		float result = 0.5f * base * height;
		System.out.println ("Area of Triangle: "+result);
	}
	public static void main(String[] args) 
	{
		new Main().Triangle(29.2f, 53.3f);
	}

}
