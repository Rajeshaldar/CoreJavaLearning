class ReturnTriangle 
{
	float Triangle ()
	{
		float base = 71.292f;
		float height = 82.50f;
		float constant = 0.5f;
		float temp = constant * base * height;
		return temp;
	}
	public static void main(String[] args) 
	{
		float result = new ReturnTriangle().Triangle();
		System.out.println (result);
	}
}
