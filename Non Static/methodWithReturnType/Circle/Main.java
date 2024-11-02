package methodWithReturnType.Circle;

public class Main {
	float Area ()
	{
		float pi = 3.142f;
		float radius = 24.04f;
		float result = pi * radius * radius;
		return result;
	}
	public static void main(String[] args) 
	{
		float temp = new Main().Area();
		System.out.println("Area of circle: "+temp);
	}
}
