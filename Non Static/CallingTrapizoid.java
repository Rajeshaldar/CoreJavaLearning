class CallingTrapizoid 
{
	void Trapizoid ()
	{
		int a = 7;
		int b = 12;
		int height = 18;
		float result = 0.5f * (a*b) * height;
		System.out.println (result);
	}
	public static void main(String[] args) 
	{
		new CallingTrapizoid().Trapizoid();
	}
}
