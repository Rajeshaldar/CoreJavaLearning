class Calculate
{
	static float Area ()
	{
		float base = 9.87f;
		float height = 12.09f;
		float result = 0.5f * base * height;
		return result;
	}
}
class MethodWReturnTypTri 
{
	public static void main(String[] args) 
	{
		float temp = Calculate.Area();
		System.out.println(temp);
	}
}
