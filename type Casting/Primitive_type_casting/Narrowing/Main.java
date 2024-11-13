package typeCasting.Primitive_type_casting.Narrowing;

public class Main {
	public static void main(String[] args) 
	{	
	float f = 66563.1642f;

	double d = (double) f; // Widening casting from float to double
	int i = (int) f; // Widening casting from float to int

	System.out.println("Narrowing primitive type casting");
	System.out.println("float to double "+d);
	System.out.println("float to int "+i);
	
	}
}
