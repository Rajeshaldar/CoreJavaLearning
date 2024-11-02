package methodWithParameter.Trapizoid;

public class Main {
	void Trapizoid (int a, int b, int height)
	{
		float result = 0.5f * (a*b) * height;
		System.out.println (result);
	}
	public static void main(String[] args) 
	{
		new Main().Trapizoid(5, 10, 20);
	}
}
