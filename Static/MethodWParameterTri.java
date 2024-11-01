class Calculate
{
	static void Area (float base, float height)
	{
		float result = 0.5f * base * height;
		System.out.println (result);
	}
}
class MethodWParameterTri 
{
	public static void main(String[] args) 
	{
		Calculate.Area (9.56f, 8.94f);
	}
}
