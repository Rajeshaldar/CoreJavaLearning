class Sample
{
	static float Trangle ()
	{
		float base = 3.6f;
		float height = 4.3f;

		float temp = 0.5f * base * height;
		return temp;
	}
}
class AreaOfTrangle 
{
	public static void main(String[] args) 
	{
		float res = Sample.Trangle();
		System.out.println(res);
	}
}
