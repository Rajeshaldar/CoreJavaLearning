class Calculate
{
	static void Area (float radius)
	{
		float result = 3.142f * radius *radius;
		System.out.println (result);
	}
}
class MethodWParameterCir 
{
	public static void main(String[] args) 
	{
		Calculate.Area (9.27f);
	}
}
