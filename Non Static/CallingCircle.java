class CallingCircle 
{
	void Area ()
	{
		float pi = 3.142f;
		float radius = 17.79f;
		float result = pi * radius *radius;
		System.out.println (result);
	}
	public static void main(String[] args) 
	{
		new CallingCircle().Area();
	}
}
