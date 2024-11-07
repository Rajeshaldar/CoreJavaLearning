package betweenClass.Type1.AreaCalculator2;

public class Operation {
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
	public static void Calculator(Operation O)
	{
		O.Parallelogram();
		O.Triangle();
	}

}
