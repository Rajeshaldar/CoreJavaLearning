class Calculate
{
	static void Area ()
	{
		float base = 4.8f;
		float height = 5.33f;
		float result = base * height;
		System.out.println (result);
	}
}
class MethodCallingPall 
{
	public static void main(String[] args) 
	{
		Calculate.Area();
	}
}
