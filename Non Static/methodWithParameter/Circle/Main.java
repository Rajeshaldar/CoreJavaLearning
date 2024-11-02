package methodWithParameter.Circle;

public class Main {
	void Area (float pi, float radius)
	{
		float result =  pi * radius;
		System.out.println ("Area of circle: "+result);
	}
	public static void main(String[] args) 
	{
		new Main().Area(3.142f, 32.55f);
	}

}
