class Calculate
{
	static void Area (int b, int h)
	{
		int temp = b * h;
		System.out.println(temp);
	}
}
class MethodWParameterPall
{
	public static void main(String[] args) 
	{
		Calculate.Area (5, 7);
	}
}
