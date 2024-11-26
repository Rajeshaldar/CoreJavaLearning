package logical.swaping.With3rdVariable;

public class SwapNumber {
	public void Calculator(int num1, int num2) {
		System.out.println("Before swping");
		System.out.println("num1 "+ num1);
		System.out.println("num2 "+num2);
		
		int temp=num1;
		num1=num2;
		num2=temp;
		
		System.out.println("After swping");
		System.out.println("num1 "+num1);
		System.out.println("num2 "+num2);
	}
}
