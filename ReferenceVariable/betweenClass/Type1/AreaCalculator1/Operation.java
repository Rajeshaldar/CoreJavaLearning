package betweenClass.Type1.AreaCalculator1;

public class Operation {
	void Rectangle()
	{
		int w = 5;
		int h = 5;
		int res = w*h;
		System.out.println("Area of rectangle is "+ res);
	}
	void Square()
	{
		int a = 10;
		int temp = a*a;
		System.out.println("Area of square is "+temp);
	}
	static void Calculator(Operation O)
	{
		O.Square();
		O.Rectangle();
	}

}
