package withInClass.Type2.Multiplecation;

public class Main {
	void Mul2()
	{
		int a = 12;
		a=12*a;
		System.out.println("Result of Multiplecation 2 is: "+a);
	}
	void Mul1()
	{
		int A = 122;
		A = 12*A;
		System.out.println("Result of Multiplecation 1 is: "+A);
	}
	public static void main(String[] args) 
	{
		Main M = new Main();
		M.Mul2();
		M.Mul1();
	}

}
