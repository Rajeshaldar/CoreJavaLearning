class Calculate
{
	static int Area ()
	{
		int base = 7;
		int height = 12;
		int temp = base * height;
		return temp;
	}
}
class MethodWReturnTypPall 
{
	public static void main(String[] args) 
	{
		int res = Calculate.Area();
		System.out.println(res);
	}
}
