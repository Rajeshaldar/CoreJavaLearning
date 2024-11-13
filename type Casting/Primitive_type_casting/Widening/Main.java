package typeCasting.Primitive_type_casting.Widening;

public class Main {
	public static void main(String[] args) 
	{
	int a=10;	// Declare an int variable
	double d = a; // Widening casting from int to double
	float f = (float) a; // Widening casting from int to float

	System.out.println("Widening primitive type casting");
	System.out.println("int to double "+d);
	System.out.println("int to float "+f);
	}
}
