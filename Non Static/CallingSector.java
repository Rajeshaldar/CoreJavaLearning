class CallingSector 
{
	void Sector ()
	{
		float radius = 5.2f;
		int angle = 60;
		float result = 3.142f * radius * radius * (angle/360);
		System.out.println(result);
	}
	public static void main(String[] args) 
	{
		new CallingSector().Sector();
	}
}
