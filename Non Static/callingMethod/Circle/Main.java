package callingMethod.Circle;

public class Main {
	void Area ()
	{
		float pi = 3.142f;
		float radius = 17.79f;
		float result = pi * radius *radius;
		System.out.println ("Area of circle is: "+result);
	}
	public static void main(String[] args) 
	{
		new Main().Area();
	}
}
