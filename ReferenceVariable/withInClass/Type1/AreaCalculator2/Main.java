package withInClass.Type1.AreaCalculator2;

public class Main {
	void Parallelogram()
	{
		int b = 12;
		int h = 28;
		int res = b*h;
		System.out.println("Area of parallelogram is "+res);
	}
	void Triangle()
	{
		int b = 12;
		int h = 12;
		float res = 0.5f*b*h;
		System.out.println("Area of triangle is "+res);
	}
	public static void Calculator(Main M)
	{
		M.Parallelogram();
		M.Triangle();
	}

	public static void main(String[] args) 
	{
		Main M = new Main();
		Calculator(M);
	}

}
