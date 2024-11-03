package withInClass.Type1.AreaCalculator1;

public class Main {
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
	static void Calculator(Main M)
	{
		M.Square();
		M.Rectangle();
	}

	public static void main(String[] args) 
	{
		Main M = new Main();
		Calculator (M);
	}

}
