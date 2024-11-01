class Calculate
{
	static void Area ()
	{
		float radius = 5.79f;
		float result = 3.142f * radius * radius;
		System.out.println(result);
	}
}
class MethodCallingCir 
{
	public static void main(String[] args) 
	{
		Calculate.Area();
	}
}
