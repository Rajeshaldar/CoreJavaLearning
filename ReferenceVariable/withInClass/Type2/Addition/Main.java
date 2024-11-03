package withInClass.Type2.Addition;

public class Main {
	void Add2()
	{
		int a = 5;
		int b = 6;
		int res = a+b;
		System.out.println("Result of addition 2 is: "+res);
	}
	void Add1()
	{
		int A = 10;
		int B = 10;
		int res = A+B;
		System.out.println("Result of addition 1 is: "+res);
	}
	public static void main(String[] args) 
	{
		Main A = new Main();
		A.Add1();
		A.Add2();
	}

}
