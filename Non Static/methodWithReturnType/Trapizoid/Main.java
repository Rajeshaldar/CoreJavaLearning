package methodWithReturnType.Trapizoid;

public class Main {
	float Trapizoid()
	{
		int a = 12;
		int b = 22;
		int height = 28;
		float temp = 0.5f * (a*b) * height;
		return temp;
	}
	public static void main(String[] args) 
	{
		float result = new Main().Trapizoid();
		System.out.println("Area of Trapizoid: "+ result);
	}

}
