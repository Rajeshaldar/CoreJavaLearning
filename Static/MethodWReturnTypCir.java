class Calculate
{
	static float Area ()
	{
		float pi = 3.142f;
		float radius = 9.28f;
		float result = pi * radius * radius;
		return result;
	}
}
class MethodWReturnTypCir 
{
	public static void main(String[] args) 
	{
		float temp = Calculate.Area();
		System.out.println(temp);
	}
}
