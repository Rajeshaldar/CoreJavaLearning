package withInClass.Type2.Subtraction;

public class Main {
	void Sub2()
	{
		int a = 10;
		int b = 5;
		int res = a-b;
		System.out.println("Result of Subtraction 2 is: "+res);
	}
	void Sub1()
	{
		int A = 5;
		int B = 2;
		int res = A-B;
		System.out.println("Result of Subtraction 1 is: "+res);
	}
	public static void main(String[] args) 
	{
		Main S = new Main();
		S.Sub1();
		S.Sub2();
	}

}
