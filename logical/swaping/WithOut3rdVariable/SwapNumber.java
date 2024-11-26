package logical.swaping.WithOut3rdVariable;

public class SwapNumber {
	public void Calculate(int num1, int num2) {
		System.out.println("Before swping");
		System.out.println("num1 "+ num1);
		System.out.println("num2 "+num2);
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("After swping");
		System.out.println("num1 "+num1);
		System.out.println("num2 "+num2);
	}

}
