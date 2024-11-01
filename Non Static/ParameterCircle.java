class ParameterCircle 
{
	void Area (float pi, float radius)
	{
		float result =  pi * radius;
		System.out.println (result);
	}
	public static void main(String[] args) 
	{
		new ParameterCircle().Area(3.142f, 32.55f);
	}
}
