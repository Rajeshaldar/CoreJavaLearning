class Demo
{
	static int Sum ()
	{
		int a = 3;
		int b = 6;
		int temp = a+b;
		return temp;
	}
}
class Main 
{
	public static void main(String[] args) 
	{
		int res = Demo.Sum();
		System.out.println(res);
	}
}
