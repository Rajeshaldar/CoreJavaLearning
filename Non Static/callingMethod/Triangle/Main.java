package callingMethod.Triangle;

public class Main {
	void Area ()
	{
		float base = 121.26f;
		float height = 124.72f;
		float result = 0.5f * base * height;
		System.out.println ("Area of Triangle: "+result);
	}
	public static void main(String[] args) 
	{
		new Main().Area();
	}

}
