class ParameterTriangle 
{
	void Triangle( float base, float height)
	{
		float result = 0.5f * base * height;
		System.out.println (result);
	}
	public static void main(String[] args) 
	{
		new ParameterTriangle().Triangle(29.2f, 53.3f);
	}
}
