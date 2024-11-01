class CallingTriangle 
{
	void Area ()
	{
		float base = 121.26f;
		float height = 124.72f;
		float result = 0.5f * base * height;
		System.out.println (result);
	}
	public static void main(String[] args) 
	{
		new CallingTriangle().Area();
	}
}
