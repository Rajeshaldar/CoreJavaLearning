class Calculate
{
	static void Area ()
	{
		int base = 12;
		int height = 8;
		float temp = 0.5f * base * height;
		System.out.println(temp);
	}
}
class CallingMethodTri
{
	public static void main(String[] args) 
	{
		Calculate.Area();
	}
}
