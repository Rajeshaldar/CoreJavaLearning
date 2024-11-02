package multiMethodsInSingleClass.CallingMethod.Addition;

public class Main {
	void Add1 ()
	{
		int a = 5;
		int b = 9;
		int res = a+b;
		System.out.println(res);
	}
	void Add2()
	{
		int c = 10;
		int d = 5;
		int res = c+d;
		System.out.println (res);
	}
	public static void main(String[] args) 
	{
		new Main().Add1();
		new Main().Add2();
	}
}
